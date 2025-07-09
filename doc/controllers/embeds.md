# Embeds

Feed your custom models with relevant information.

```java
EmbedsController embedsController = client.getEmbedsController();
```

## Class Name

`EmbedsController`


# Embed

This endpoint creates a new embed for training your custom AI Models.

```java
CompletableFuture<ApiResponse<EmbedResponseEx>> embedAsync(
    final Embed body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Embed`](../../doc/models/embed.md) | Body, Required | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`EmbedResponseEx`](../../doc/models/embed-response-ex.md).

## Example Usage

```java
Embed body = new Embed.Builder(
    "ive.legal.1.1.0",
    Arrays.asList(
        new ContentEx.Builder(
            "Guide me on creating a legal document for x."
        )
        .build()
    ),
    "classification"
)
.build();

embedsController.embedAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request, read again our documentation or contact support for guidance. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 401 | Not authorized, check our OAuth2 doc. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal error, if this error persist, please contact support. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

