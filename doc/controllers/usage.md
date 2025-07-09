# Usage

Estimate you're request usage, and access to your current usage data.

```java
UsageController usageController = client.getUsageController();
```

## Class Name

`UsageController`

## Methods

* [Calculate Tokens](../../doc/controllers/usage.md#calculate-tokens)
* [Total Usage](../../doc/controllers/usage.md#total-usage)


# Calculate Tokens

This endpoint allows you to calculate the usage, so you get an idea of the amount of tokens that will be consumed.

```java
CompletableFuture<ApiResponse<UsageCalculationEx>> calculateTokensAsync(
    final Chat body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Chat`](../../doc/models/chat.md) | Body, Required | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`UsageCalculationEx`](../../doc/models/usage-calculation-ex.md).

## Example Usage

```java
Chat body = new Chat.Builder(
    "ive.legal.1.1.0",
    Arrays.asList(
        new ContentEx.Builder(
            "Guide me on creating a legal document for x."
        )
        .build()
    )
)
.build();

usageController.calculateTokensAsync(body).thenAccept(result -> {
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


# Total Usage

This endpoint calculates the amount of tokens used by the user in the given month.

```java
CompletableFuture<ApiResponse<TotalUsageEx>> totalUsageAsync()
```

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`TotalUsageEx`](../../doc/models/total-usage-ex.md).

## Example Usage

```java
usageController.totalUsageAsync().thenAccept(result -> {
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

