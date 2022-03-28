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
import com.openshift.cloud.api.connector.models.ConnectorNamespaceMetaAllOf;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceQuota;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceRequestMeta;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceRequestMetaAnnotations;
import com.openshift.cloud.api.connector.models.ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConnectorNamespaceMeta
 */
@JsonPropertyOrder({
  ConnectorNamespaceMeta.JSON_PROPERTY_OWNER,
  ConnectorNamespaceMeta.JSON_PROPERTY_CREATED_AT,
  ConnectorNamespaceMeta.JSON_PROPERTY_MODIFIED_AT,
  ConnectorNamespaceMeta.JSON_PROPERTY_NAME,
  ConnectorNamespaceMeta.JSON_PROPERTY_ANNOTATIONS,
  ConnectorNamespaceMeta.JSON_PROPERTY_RESOURCE_VERSION,
  ConnectorNamespaceMeta.JSON_PROPERTY_QUOTA
})
@JsonTypeName("ConnectorNamespaceMeta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorNamespaceMeta {
  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<ConnectorNamespaceRequestMetaAnnotations> annotations = null;

  public static final String JSON_PROPERTY_RESOURCE_VERSION = "resource_version";
  private Long resourceVersion;

  public static final String JSON_PROPERTY_QUOTA = "quota";
  private ConnectorNamespaceQuota quota;

  public ConnectorNamespaceMeta() { 
  }

  public ConnectorNamespaceMeta owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public ConnectorNamespaceMeta createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ConnectorNamespaceMeta modifiedAt(OffsetDateTime modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public ConnectorNamespaceMeta name(String name) {
    
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


  public ConnectorNamespaceMeta annotations(List<ConnectorNamespaceRequestMetaAnnotations> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public ConnectorNamespaceMeta addAnnotationsItem(ConnectorNamespaceRequestMetaAnnotations annotationsItem) {
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


  public ConnectorNamespaceMeta resourceVersion(Long resourceVersion) {
    
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Get resourceVersion
   * @return resourceVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResourceVersion() {
    return resourceVersion;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceVersion(Long resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public ConnectorNamespaceMeta quota(ConnectorNamespaceQuota quota) {
    
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectorNamespaceQuota getQuota() {
    return quota;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuota(ConnectorNamespaceQuota quota) {
    this.quota = quota;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorNamespaceMeta connectorNamespaceMeta = (ConnectorNamespaceMeta) o;
    return Objects.equals(this.owner, connectorNamespaceMeta.owner) &&
        Objects.equals(this.createdAt, connectorNamespaceMeta.createdAt) &&
        Objects.equals(this.modifiedAt, connectorNamespaceMeta.modifiedAt) &&
        Objects.equals(this.name, connectorNamespaceMeta.name) &&
        Objects.equals(this.annotations, connectorNamespaceMeta.annotations) &&
        Objects.equals(this.resourceVersion, connectorNamespaceMeta.resourceVersion) &&
        Objects.equals(this.quota, connectorNamespaceMeta.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, createdAt, modifiedAt, name, annotations, resourceVersion, quota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorNamespaceMeta {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
