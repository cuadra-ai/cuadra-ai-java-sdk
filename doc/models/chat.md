
# Chat

*This model accepts additional fields of type Object.*

## Structure

`Chat`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Model` | `String` | Required | Model name<br><br>**Constraints**: *Maximum Length*: `50` | String getModel() | setModel(String model) |
| `Content` | [`List<ContentEx>`](../../doc/models/content-ex.md) | Required | Request content | List<ContentEx> getContent() | setContent(List<ContentEx> content) |
| `ChatId` | `String` | Optional | If you want to keep context between request, otherwise leave it empty, you get one with every chat you create. | String getChatId() | setChatId(String chatId) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "model": "ive.legal.1.1.0",
  "content": [
    {
      "text": "Guide me on creating a legal document for x.",
      "inlineData": {
        "mimeType": "mimeType8",
        "data": "data6",
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
  ],
  "chatId": "chatId2",
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

