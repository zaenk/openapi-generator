/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
 * Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
 */
@ApiModel(description = "Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HealthCheckResult {
  public static final String SERIALIZED_NAME_NULLABLE_MESSAGE = "NullableMessage";
  @SerializedName(SERIALIZED_NAME_NULLABLE_MESSAGE)
  private String nullableMessage;


  public HealthCheckResult nullableMessage(String nullableMessage) {
    
    this.nullableMessage = nullableMessage;
    return this;
  }

   /**
   * Get nullableMessage
   * @return nullableMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNullableMessage() {
    return nullableMessage;
  }


  public void setNullableMessage(String nullableMessage) {
    this.nullableMessage = nullableMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    return Objects.equals(this.nullableMessage, healthCheckResult.nullableMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nullableMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    sb.append("    nullableMessage: ").append(toIndentedString(nullableMessage)).append("\n");
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
