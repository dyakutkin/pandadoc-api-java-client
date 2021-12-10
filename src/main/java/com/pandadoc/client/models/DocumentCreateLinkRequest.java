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
import java.math.BigDecimal;

/**
 * DocumentCreateLinkRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentCreateLinkRequest {
  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_LIFETIME = "lifetime";
  @SerializedName(SERIALIZED_NAME_LIFETIME)
  private BigDecimal lifetime;


  public DocumentCreateLinkRequest recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * The email address for the recipient you&#39;re creating a document link for.
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "josh@example.com", required = true, value = "The email address for the recipient you're creating a document link for.")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public DocumentCreateLinkRequest lifetime(BigDecimal lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Provide the number of seconds that a document link should be valid for. Default is 3600 seconds.
   * @return lifetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Provide the number of seconds that a document link should be valid for. Default is 3600 seconds.")

  public BigDecimal getLifetime() {
    return lifetime;
  }


  public void setLifetime(BigDecimal lifetime) {
    this.lifetime = lifetime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCreateLinkRequest documentCreateLinkRequest = (DocumentCreateLinkRequest) o;
    return Objects.equals(this.recipient, documentCreateLinkRequest.recipient) &&
        Objects.equals(this.lifetime, documentCreateLinkRequest.lifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, lifetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreateLinkRequest {\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
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

