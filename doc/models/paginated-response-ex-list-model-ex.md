
# Paginated Response Ex List Model Ex

*This model accepts additional fields of type Object.*

## Structure

`PaginatedResponseExListModelEx`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Page` | `Integer` | Optional | - | Integer getPage() | setPage(Integer page) |
| `Size` | `Integer` | Optional | - | Integer getSize() | setSize(Integer size) |
| `Data` | [`List<ModelEx>`](../../doc/models/model-ex.md) | Optional | - | List<ModelEx> getData() | setData(List<ModelEx> data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "page": 180,
  "size": 168,
  "data": [
    {
      "id": "id0",
      "name": "name0",
      "type": "type0",
      "description": "description0",
      "proprietary": false,
      "baseModel": "baseModel8",
      "baseModelId": "baseModelId4",
      "createdAt": "2016-03-13T12:52:32.123Z",
      "exampleAdditionalProperty": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "id": "id0",
      "name": "name0",
      "type": "type0",
      "description": "description0",
      "proprietary": false,
      "baseModel": "baseModel8",
      "baseModelId": "baseModelId4",
      "createdAt": "2016-03-13T12:52:32.123Z",
      "exampleAdditionalProperty": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

