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
import com.pandadoc.client.models.PricingTableRequestRows;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PricingTableRequestSections
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingTableRequestSections {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_MULTICHOICE_ENABLED = "multichoice_enabled";
  @SerializedName(SERIALIZED_NAME_MULTICHOICE_ENABLED)
  private Boolean multichoiceEnabled = false;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<PricingTableRequestRows> rows = null;


  public PricingTableRequestSections title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sample Section", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PricingTableRequestSections _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public PricingTableRequestSections multichoiceEnabled(Boolean multichoiceEnabled) {
    
    this.multichoiceEnabled = multichoiceEnabled;
    return this;
  }

   /**
   * Get multichoiceEnabled
   * @return multichoiceEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMultichoiceEnabled() {
    return multichoiceEnabled;
  }


  public void setMultichoiceEnabled(Boolean multichoiceEnabled) {
    this.multichoiceEnabled = multichoiceEnabled;
  }


  public PricingTableRequestSections rows(List<PricingTableRequestRows> rows) {
    
    this.rows = rows;
    return this;
  }

  public PricingTableRequestSections addRowsItem(PricingTableRequestRows rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PricingTableRequestRows> getRows() {
    return rows;
  }


  public void setRows(List<PricingTableRequestRows> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingTableRequestSections pricingTableRequestSections = (PricingTableRequestSections) o;
    return Objects.equals(this.title, pricingTableRequestSections.title) &&
        Objects.equals(this._default, pricingTableRequestSections._default) &&
        Objects.equals(this.multichoiceEnabled, pricingTableRequestSections.multichoiceEnabled) &&
        Objects.equals(this.rows, pricingTableRequestSections.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, _default, multichoiceEnabled, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTableRequestSections {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    multichoiceEnabled: ").append(toIndentedString(multichoiceEnabled)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

