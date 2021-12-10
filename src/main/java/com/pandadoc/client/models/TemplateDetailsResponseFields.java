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
import com.pandadoc.client.models.TemplateDetailsResponseAssignedTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TemplateDetailsResponseFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateDetailsResponseFields {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private String placeholder;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;

  public static final String SERIALIZED_NAME_ASSIGNED_TO = "assigned_to";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TO)
  private TemplateDetailsResponseAssignedTo assignedTo;

  public static final String SERIALIZED_NAME_MERGE_FIELD = "merge_field";
  @SerializedName(SERIALIZED_NAME_MERGE_FIELD)
  private String mergeField;


  public TemplateDetailsResponseFields uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "74bcb05d-e4cd-458d-bc1d-671c2be8b221", value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public TemplateDetailsResponseFields name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Favorite.Color", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateDetailsResponseFields title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TemplateDetailsResponseFields placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Favorite Color", value = "")

  public String getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  public TemplateDetailsResponseFields value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public TemplateDetailsResponseFields assignedTo(TemplateDetailsResponseAssignedTo assignedTo) {
    
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateDetailsResponseAssignedTo getAssignedTo() {
    return assignedTo;
  }


  public void setAssignedTo(TemplateDetailsResponseAssignedTo assignedTo) {
    this.assignedTo = assignedTo;
  }


  public TemplateDetailsResponseFields mergeField(String mergeField) {
    
    this.mergeField = mergeField;
    return this;
  }

   /**
   * Get mergeField
   * @return mergeField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Favorite.Color", value = "")

  public String getMergeField() {
    return mergeField;
  }


  public void setMergeField(String mergeField) {
    this.mergeField = mergeField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDetailsResponseFields templateDetailsResponseFields = (TemplateDetailsResponseFields) o;
    return Objects.equals(this.uuid, templateDetailsResponseFields.uuid) &&
        Objects.equals(this.name, templateDetailsResponseFields.name) &&
        Objects.equals(this.title, templateDetailsResponseFields.title) &&
        Objects.equals(this.placeholder, templateDetailsResponseFields.placeholder) &&
        Objects.equals(this.value, templateDetailsResponseFields.value) &&
        Objects.equals(this.assignedTo, templateDetailsResponseFields.assignedTo) &&
        Objects.equals(this.mergeField, templateDetailsResponseFields.mergeField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, title, placeholder, value, assignedTo, mergeField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDetailsResponseFields {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
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

