/*
 * PandaDoc Public API
 * PandaDoc Public API documentation
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pandadoc.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LinkedObjectCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkedObjectCreateRequest {
  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;


  public LinkedObjectCreateRequest provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * CRM name (lowercase). See the list above.
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pipedrive", required = true, value = "CRM name (lowercase). See the list above.")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public LinkedObjectCreateRequest entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Entity type. The system validates if the type is supported. See the list for each CRM above.
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "deal", required = true, value = "Entity type. The system validates if the type is supported. See the list for each CRM above.")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public LinkedObjectCreateRequest entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Entity unique identifier. The system validates if the entity exists.
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9372", required = true, value = "Entity unique identifier. The system validates if the entity exists.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedObjectCreateRequest linkedObjectCreateRequest = (LinkedObjectCreateRequest) o;
    return Objects.equals(this.provider, linkedObjectCreateRequest.provider) &&
        Objects.equals(this.entityType, linkedObjectCreateRequest.entityType) &&
        Objects.equals(this.entityId, linkedObjectCreateRequest.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, entityType, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedObjectCreateRequest {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

