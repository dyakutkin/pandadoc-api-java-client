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
 * TemplatesFolderCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplatesFolderCreateResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;


  public TemplatesFolderCreateResponse uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nq8htXxFssmhRxAPSP4SBP", value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public TemplatesFolderCreateResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A new template folder", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplatesFolderCreateResponse dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T10:43:04.103331Z", value = "")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatesFolderCreateResponse templatesFolderCreateResponse = (TemplatesFolderCreateResponse) o;
    return Objects.equals(this.uuid, templatesFolderCreateResponse.uuid) &&
        Objects.equals(this.name, templatesFolderCreateResponse.name) &&
        Objects.equals(this.dateCreated, templatesFolderCreateResponse.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatesFolderCreateResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

