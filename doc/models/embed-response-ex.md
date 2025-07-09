
# Embed Response Ex

*This model accepts additional fields of type Object.*

## Structure

`EmbedResponseEx`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Embed id | String getId() | setId(String id) |
| `Usage` | [`UsageEx`](../../doc/models/usage-ex.md) | Optional | This is the token usage result of your request | UsageEx getUsage() | setUsage(UsageEx usage) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "id": "bd39e814-159d-4024-8e83-14025070ef77",
  "usage": {
    "billedTokens": {
      "inputTokens": 156,
      "outputTokens": 240,
      "exampleAdditionalProperty": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    "usedTokens": {
      "inputTokens": 58,
      "outputTokens": 142,
      "exampleAdditionalProperty": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    "exampleAdditionalProperty": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

