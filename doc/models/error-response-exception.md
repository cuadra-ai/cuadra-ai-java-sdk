
# Error Response Exception

Standard error response format for Cuadra AI

*This model accepts additional fields of type Object.*

## Structure

`ErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Optional | A message describing the error | String getMessageField() | setMessageField(String messageField) |
| `Status` | `Integer` | Optional | HTTP status code | Integer getStatus() | setStatus(Integer status) |
| `FieldErrors` | `Map<String, String>` | Optional | Optional: Field-specific validation errors | Map<String, String> getFieldErrors() | setFieldErrors(Map<String, String> fieldErrors) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "message": "Incorrect request",
  "status": 400,
  "field_errors": {
    "model": "model cannot be null",
    "user_id": "must not be blank"
  },
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

