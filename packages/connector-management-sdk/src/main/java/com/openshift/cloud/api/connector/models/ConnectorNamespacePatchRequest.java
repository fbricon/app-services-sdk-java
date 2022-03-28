/*
 * Connector Service Fleet Manager
 * Connector Service Fleet Manager is a Rest API to manage connectors.
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceRequestMeta;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceRequestMetaAnnotations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A connector namespace patch request
 */
@ApiModel(description = "A connector namespace patch request")
@JsonPropertyOrder({
  ConnectorNamespacePatchRequest.JSON_PROPERTY_NAME,
  ConnectorNamespacePatchRequest.JSON_PROPERTY_ANNOTATIONS
})
@JsonTypeName("ConnectorNamespacePatchRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorNamespacePatchRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<ConnectorNamespaceRequestMetaAnnotations> annotations = null;

  public ConnectorNamespacePatchRequest() { 
  }

  public ConnectorNamespacePatchRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ConnectorNamespacePatchRequest annotations(List<ConnectorNamespaceRequestMetaAnnotations> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public ConnectorNamespacePatchRequest addAnnotationsItem(ConnectorNamespaceRequestMetaAnnotations annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConnectorNamespaceRequestMetaAnnotations> getAnnotations() {
    return annotations;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotations(List<ConnectorNamespaceRequestMetaAnnotations> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorNamespacePatchRequest connectorNamespacePatchRequest = (ConnectorNamespacePatchRequest) o;
    return Objects.equals(this.name, connectorNamespacePatchRequest.name) &&
        Objects.equals(this.annotations, connectorNamespacePatchRequest.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorNamespacePatchRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
