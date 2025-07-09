
# OAuth 2 Authorization Code Grant



Documentation for accessing and setting credentials for OAuth2.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oauthClientId` | `getOauthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oauthClientSecret` | `getOauthClientSecret()` |
| OAuthRedirectUri | `String` | OAuth 2 Redirection endpoint or Callback Uri | `oauthRedirectUri` | `getOauthRedirectUri()` |
| OAuthToken | `OauthToken` | Object for storing information about the OAuth token | `oauthToken` | `getOauthToken()` |



**Note:** Auth credentials can be set using `authorizationCodeAuth` in the client builder and accessed through `getAuthorizationCodeAuth` method in the client instance.

## Usage Example

### 1\. Client Initialization

You must initialize the client with *OAuth 2.0 Authorization Code Grant* credentials as shown in the following code snippet.

```java
CuadraAiClient client = new CuadraAiClient.Builder()
    .authorizationCodeAuth(new AuthorizationCodeAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret",
            "OAuthRedirectUri"
        )
        .build())
    .build();
```



Your application must obtain user authorization before it can execute an endpoint call in case this SDK chooses to use *OAuth 2.0 Authorization Code Grant*. This authorization includes the following steps

### 2\. Obtain user consent

To obtain user's consent, you must redirect the user to the authorization page.The `buildAuthorizationUrl()` method creates the URL to the authorization page.

```java
String authUrl = client.getAuthorizationCodeAuth().buildAuthorizationUrl(); // build auth url
httpServletResponse.sendRedirect(authUrl); // show user the auth page in a browser or by redirection
```

### 3\. Handle the OAuth server response

Once the user responds to the consent request, the OAuth 2.0 server responds to your application's access request by redirecting the user to the redirect URI specified set in `Configuration`.

If the user approves the request, the authorization code will be sent as the `code` query string:

```
https://example.com/oauth/callback?code=XXXXXXXXXXXXXXXXXXXXXXXXX
```

If the user does not approve the request, the response contains an `error` query string:

```
https://example.com/oauth/callback?error=access_denied
```

### 4\. Authorize the client using the code

After the server receives the code, it can exchange this for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

```java
try {
    String authorizationCode = "Replace me with actual authorization code";
    OAuthToken token = client.getAuthorizationCodeAuth().fetchToken(authorizationCode);
    // re-instantiate the client with oauth token
    client = client.newBuilder()
            .authorizationCodeAuth(client.getAuthorizationCodeAuthModel().toBuilder()
                    .oauthToken(token)
                    .build())
            .build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

### Refreshing the token

An access token may expire after sometime. To extend its lifetime, you must refresh the token.

```java
if (client.getAuthorizationCodeAuth().isTokenExpired()) {
    try {
        OAuthToken token = client.getAuthorizationCodeAuth().refreshToken();
        // re-instantiate the client with oauth token
        client = client.newBuilder()
                .authorizationCodeAuth(client.getAuthorizationCodeAuthModel().toBuilder()
                        .oauthToken(token)
                        .build())
                .build();
    } catch (Throwable e) {
        // TODO Handle exception
    }
}
```

If a token expires, an exception will be thrown before the next endpoint call requiring authentication.

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
httpSession.setAttribute("access_token", client.getAuthorizationCodeAuth().getOauthToken());
```

### Creating a client from a stored token

To authorize a client using a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OauthToken token = (OauthToken) httpSession.getAttribute("access_token");

// re-instantiate the client with oauth token
client = client.newBuilder()
        .authorizationCodeAuth(client.getAuthorizationCodeAuthModel().toBuilder()
                .oauthToken(token)
                .build())
        .build();
```

### Complete example



In this example that uses the Spring framework and an application using spring framework can be easily set up through [`spring initializr`](https://start.spring.io/), the `/callapi` route will first check if an access token is available for the user. If one is not set,
it redirects the user to `/authcallback` route which will obtain an access token and redirect the user back to the `/callapi` route.
Now that an access token is set, `/callapi` route can use the client to make authorized calls to the server.

#### `MainController.java`

```java
package com.example;

import ai.cuadra.api.CuadraAiClient;
import ai.cuadra.api.authentication.AuthorizationCodeAuthModel;
import ai.cuadra.api.http.client.LoggingConfiguration.Level;
import ai.cuadra.api.models.OauthToken;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    private CuadraAiClient client;

    public MainController() {
        client = new CuadraAiClient.Builder()
            .authorizationCodeAuth(new AuthorizationCodeAuthModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret",
                    "OAuthRedirectUri"
                )
                .build())
            .build();
    }

    @RequestMapping(value = "/callapi", method = RequestMethod.GET, produces = "application/json")
    public String callApi(HttpSession session, HttpServletResponse response) throws Throwable {
        // redirect if access token is not set
        if (session.getAttribute("access_token") == null) {
            response.sendRedirect("authcallback");
            return null;
        }

        synchronized (client) {
            client = client.newBuilder()
                    .authorizationCodeAuth(client.getAuthorizationCodeAuthModel().toBuilder()
                            .oauthToken((OauthToken) session.getAttribute("access_token"))
                            .build())
                    .build();

            // refresh the token if it is expired
            if(client.getAuthorizationCodeAuth().isTokenExpired()) {
                try {
                    OauthToken token = client.getAuthorizationCodeAuth().refreshToken();
                    session.setAttribute("access_token", token);
                    // re-instantiate the client with oauth token
                    client = client.newBuilder()
                            .authorizationCodeAuth(client.getAuthorizationCodeAuthModel().toBuilder()
                                    .oauthToken(token)
                                    .build())
                            .build();
                } catch (Throwable e) {
                    // TODO Handle exception
                }
            }

            // now you can use client to make endpoint calls
            // client will automatically refresh the token when it expires
            return "someView";
        }
    }

    @RequestMapping(value = "/authcallback", method = RequestMethod.GET)
    public void authcallback(HttpSession session, @RequestParam(required = false) String code,
            HttpServletResponse response) throws Throwable {
        if (code == null) {
            String authUrl;
            
            synchronized (client) {
                authUrl = client.getAuthorizationCodeAuth().buildAuthorizationUrl();
            }
            
            // if authorization code is absent, redirect to authorization page
            response.sendRedirect(authUrl);
        } else {
            OauthToken token;
            
            synchronized (client) {
                token = client.getAuthorizationCodeAuth().fetchToken(code);
                // re-instantiate the client with oauth token
                client = client.newBuilder()
                        .authorizationCodeAuth(client.getAuthorizationCodeAuthModel().toBuilder()
                                .oauthToken(token)
                                .build())
                        .build();
            }
            
            session.setAttribute("access_token", token);
            response.sendRedirect("callapi");
        }
    }
}
```


