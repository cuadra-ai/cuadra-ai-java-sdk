
# Getting Started with Cuadra AI

## Introduction

API Documentation

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>ai.cuadra</groupId>
  <artifactId>cuadra-ai-sdk</artifactId>
  <version>1.0.3</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/ai.cuadra/cuadra-ai-sdk/1.0.3

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| loggingConfig | [`Consumer<ApiLoggingConfiguration.Builder>`](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| authorizationCodeAuth | [`AuthorizationCodeAuth`](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/auth/oauth-2-authorization-code-grant.md) | The Credentials Setter for OAuth 2 Authorization Code Grant |

The API client can be initialized as follows:

```java
CuadraAiClient client = new CuadraAiClient.Builder()
    .loggingConfig(builder -> builder
            .level(Level.DEBUG)
            .requestConfig(logConfigBuilder -> logConfigBuilder.body(true))
            .responseConfig(logConfigBuilder -> logConfigBuilder.headers(true)))
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .authorizationCodeAuth(new AuthorizationCodeAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret",
            "OAuthRedirectUri"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Authorization

This API uses the following authentication schemes.

* [`OAuth2 (OAuth 2 Authorization Code Grant)`](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/auth/oauth-2-authorization-code-grant.md)

## List of APIs

* [Chat](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/controllers/chat.md)
* [Models](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/controllers/models.md)
* [Embeds](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/controllers/embeds.md)
* [Usage](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/controllers/usage.md)

## SDK Infrastructure

### Configuration

* [ApiLoggingConfiguration](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-logging-configuration.md)
* [ApiLoggingConfiguration.Builder](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-logging-configuration-builder.md)
* [ApiRequestLoggingConfiguration.Builder](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-request-logging-configuration-builder.md)
* [ApiResponseLoggingConfiguration.Builder](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-response-logging-configuration-builder.md)
* [Configuration Interface](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-client-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-request.md)
* [HttpResponse](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-exception.md)
* [ApiResponse](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-response.md)
* [ApiHelper](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/api-helper.md)
* [FileWrapper](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/file-wrapper.md)
* [DateTimeHelper](https://www.github.com/cuadra-ai/cuadra-ai-java-sdk/tree/1.0.3/doc/date-time-helper.md)

