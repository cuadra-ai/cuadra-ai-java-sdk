
# Tokens Ex

Tokens used

*This model accepts additional fields of type Object.*

## Structure

`TokensEx`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InputTokens` | `Integer` | Optional | Number of tokens of the request input | Integer getInputTokens() | setInputTokens(Integer inputTokens) |
| `OutputTokens` | `Integer` | Optional | Number of tokens of the response output | Integer getOutputTokens() | setOutputTokens(Integer outputTokens) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "inputTokens": 320,
  "outputTokens": 490,
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

