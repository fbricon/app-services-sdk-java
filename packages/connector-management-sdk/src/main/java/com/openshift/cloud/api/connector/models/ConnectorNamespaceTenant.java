/*
 * Connector Management API
 * Connector Management API is a REST API to manage connectors.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.connector.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceTenantKind;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConnectorNamespaceTenant
 */
@JsonPropertyOrder({
  ConnectorNamespaceTenant.JSON_PROPERTY_KIND,
  ConnectorNamespaceTenant.JSON_PROPERTY_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorNamespaceTenant {
  public static final String JSON_PROPERTY_KIND = "kind";
  private ConnectorNamespaceTenantKind kind;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public ConnectorNamespaceTenant() { 
  }

  public ConnectorNamespaceTenant kind(ConnectorNamespaceTenantKind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorNamespaceTenantKind getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKind(ConnectorNamespaceTenantKind kind) {
    this.kind = kind;
  }


  public ConnectorNamespaceTenant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Either user or organisation id depending on the value of kind
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either user or organisation id depending on the value of kind")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Return true if this ConnectorNamespaceTenant object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorNamespaceTenant connectorNamespaceTenant = (ConnectorNamespaceTenant) o;
    return Objects.equals(this.kind, connectorNamespaceTenant.kind) &&
        Objects.equals(this.id, connectorNamespaceTenant.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorNamespaceTenant {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

