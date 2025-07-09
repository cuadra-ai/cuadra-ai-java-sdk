
# Total Usage Ex

*This model accepts additional fields of type Object.*

## Structure

`TotalUsageEx`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalInput` | `Long` | Optional | Total Input Tokens used for this month | Long getTotalInput() | setTotalInput(Long totalInput) |
| `TotalOutput` | `Long` | Optional | Total Ouput Tokens used for this month | Long getTotalOutput() | setTotalOutput(Long totalOutput) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "totalInput": 12492,
  "totalOutput": 24381,
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

