
# Model Ex

*This model accepts additional fields of type Object.*

## Structure

`ModelEx`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Model Id | String getId() | setId(String id) |
| `Name` | `String` | Required | Model name | String getName() | setName(String name) |
| `Type` | `String` | Required | Model type of content generation and processing | String getType() | setType(String type) |
| `Description` | `String` | Required | Brief description of the model | String getDescription() | setDescription(String description) |
| `Proprietary` | `Boolean` | Optional | Indicates whether is a custom model created by you or not | Boolean getProprietary() | setProprietary(Boolean proprietary) |
| `BaseModel` | `String` | Optional | Base model name, if it was created from another model | String getBaseModel() | setBaseModel(String baseModel) |
| `BaseModelId` | `String` | Optional | Base model id, if it was created from another model | String getBaseModelId() | setBaseModelId(String baseModelId) |
| `CreatedAt` | `LocalDateTime` | Optional | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | Last time it was updated | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example (as JSON)

```json
{
  "id": "72dfb4f5-27dc-40e2-9278-b0de30e8b131",
  "name": "ive.legal.1.1.0",
  "type": "multimedia",
  "description": "Oura-Legal is our next-generation AI model designed for powerful, intelligent, and adaptable legal purposes.",
  "proprietary": false,
  "baseModel": "ive.legal.1.1.0",
  "baseModelId": "baseModelId8",
  "createdAt": "2016-03-13T12:52:32.123Z",
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

