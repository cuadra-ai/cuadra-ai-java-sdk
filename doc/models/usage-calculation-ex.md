
# Usage Calculation Ex

*This model accepts additional fields of type Object.*

## Structure

`UsageCalculationEx`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EstimatedTokens` | `Integer` | Optional | Estimated tokens for your request | Integer getEstimatedTokens() | setEstimatedTokens(Integer estimatedTokens) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "estimatedTokens": 482,
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

