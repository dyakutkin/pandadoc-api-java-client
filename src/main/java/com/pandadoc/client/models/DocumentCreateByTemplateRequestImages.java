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
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentCreateByTemplateRequestImages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentCreateByTemplateRequestImages {
  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public DocumentCreateByTemplateRequestImages urls(List<String> urls) {
    
    this.urls = urls;
    return this;
  }

  public DocumentCreateByTemplateRequestImages addUrlsItem(String urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"https://s3.amazonaws.com/pd-static-content/public-docs/pandadoc-panda-bear.png\"]", required = true, value = "")

  public List<String> getUrls() {
    return urls;
  }


  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  public DocumentCreateByTemplateRequestImages name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Image 1", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCreateByTemplateRequestImages documentCreateByTemplateRequestImages = (DocumentCreateByTemplateRequestImages) o;
    return Objects.equals(this.urls, documentCreateByTemplateRequestImages.urls) &&
        Objects.equals(this.name, documentCreateByTemplateRequestImages.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urls, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreateByTemplateRequestImages {\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

