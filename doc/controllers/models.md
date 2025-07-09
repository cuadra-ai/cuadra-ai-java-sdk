# Models

Create your own custom model, train it and use it!

```java
ModelsController modelsController = client.getModelsController();
```

## Class Name

`ModelsController`

## Methods

* [Get Models](../../doc/controllers/models.md#get-models)
* [Create Model](../../doc/controllers/models.md#create-model)
* [Get Model](../../doc/controllers/models.md#get-model)
* [Remove Model](../../doc/controllers/models.md#remove-model)
* [Update Model](../../doc/controllers/models.md#update-model)


# Get Models

This endpoint display all of our AI models.

```java
CompletableFuture<ApiResponse<PaginatedResponseExListModelEx>> getModelsAsync(
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | - |
| `size` | `Integer` | Query, Optional | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`PaginatedResponseExListModelEx`](../../doc/models/paginated-response-ex-list-model-ex.md).

## Example Usage

```java
modelsController.getModelsAsync(null, null).thenAccept(result -> {
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


# Create Model

This endpoint creates a new custom Model for you to train and use.

```java
CompletableFuture<ApiResponse<ModelEx>> createModelAsync(
    final ModelEx body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ModelEx`](../../doc/models/model-ex.md) | Body, Required | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ModelEx`](../../doc/models/model-ex.md).

## Example Usage

```java
ModelEx body = new ModelEx.Builder(
    "ive.legal.1.1.0",
    "multimedia",
    "Oura-Legal is our next-generation AI model designed for powerful, intelligent, and adaptable legal purposes."
)
.id("72dfb4f5-27dc-40e2-9278-b0de30e8b131")
.proprietary(false)
.baseModel("ive.legal.1.1.0")
.build();

modelsController.createModelAsync(body).thenAccept(result -> {
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


# Get Model

This endpoint shows you information about a particular model given an id.

```java
CompletableFuture<ApiResponse<ModelEx>> getModelAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ModelEx`](../../doc/models/model-ex.md).

## Example Usage

```java
String id = "id0";

modelsController.getModelAsync(id).thenAccept(result -> {
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


# Remove Model

This endpoint removes a custom model you created.

```java
CompletableFuture<ApiResponse<ModelEx>> removeModelAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ModelEx`](../../doc/models/model-ex.md).

## Example Usage

```java
String id = "id0";

modelsController.removeModelAsync(id).thenAccept(result -> {
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


# Update Model

This endpoint updates a custom model you created.

```java
CompletableFuture<ApiResponse<ModelEx>> updateModelAsync(
    final String id,
    final ModelEx body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |
| `body` | [`ModelEx`](../../doc/models/model-ex.md) | Body, Required | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ModelEx`](../../doc/models/model-ex.md).

## Example Usage

```java
String id = "id0";
ModelEx body = new ModelEx.Builder(
    "ive.legal.1.1.0",
    "multimedia",
    "Oura-Legal is our next-generation AI model designed for powerful, intelligent, and adaptable legal purposes."
)
.id("72dfb4f5-27dc-40e2-9278-b0de30e8b131")
.proprietary(false)
.baseModel("ive.legal.1.1.0")
.build();

modelsController.updateModelAsync(id, body).thenAccept(result -> {
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

