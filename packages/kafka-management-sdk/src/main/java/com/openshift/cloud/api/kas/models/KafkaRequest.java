/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.models.KafkaRequestAllOf;
import com.openshift.cloud.api.kas.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * KafkaRequest
 */
@JsonPropertyOrder({
  KafkaRequest.JSON_PROPERTY_ID,
  KafkaRequest.JSON_PROPERTY_KIND,
  KafkaRequest.JSON_PROPERTY_HREF,
  KafkaRequest.JSON_PROPERTY_STATUS,
  KafkaRequest.JSON_PROPERTY_CLOUD_PROVIDER,
  KafkaRequest.JSON_PROPERTY_MULTI_AZ,
  KafkaRequest.JSON_PROPERTY_REGION,
  KafkaRequest.JSON_PROPERTY_OWNER,
  KafkaRequest.JSON_PROPERTY_NAME,
  KafkaRequest.JSON_PROPERTY_BOOTSTRAP_SERVER_HOST,
  KafkaRequest.JSON_PROPERTY_CREATED_AT,
  KafkaRequest.JSON_PROPERTY_UPDATED_AT,
  KafkaRequest.JSON_PROPERTY_FAILED_REASON,
  KafkaRequest.JSON_PROPERTY_VERSION,
  KafkaRequest.JSON_PROPERTY_INSTANCE_TYPE
})
@JsonTypeName("KafkaRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_MULTI_AZ = "multi_az";
  private Boolean multiAz;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BOOTSTRAP_SERVER_HOST = "bootstrap_server_host";
  private String bootstrapServerHost;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_FAILED_REASON = "failed_reason";
  private String failedReason;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance_type";
  private String instanceType;


  public KafkaRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public KafkaRequest kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public KafkaRequest href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public KafkaRequest status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting] 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting] ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public KafkaRequest cloudProvider(String cloudProvider) {
    
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Name of Cloud used to deploy. For example AWS
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of Cloud used to deploy. For example AWS")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudProvider() {
    return cloudProvider;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public KafkaRequest multiAz(Boolean multiAz) {
    
    this.multiAz = multiAz;
    return this;
  }

   /**
   * Get multiAz
   * @return multiAz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MULTI_AZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiAz() {
    return multiAz;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_AZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }


  public KafkaRequest region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Values will be regions of specific cloud provider. For example: us-east-1 for AWS
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values will be regions of specific cloud provider. For example: us-east-1 for AWS")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public KafkaRequest owner(String owner) {
    
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


  public KafkaRequest name(String name) {
    
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


  public KafkaRequest bootstrapServerHost(String bootstrapServerHost) {
    
    this.bootstrapServerHost = bootstrapServerHost;
    return this;
  }

   /**
   * Get bootstrapServerHost
   * @return bootstrapServerHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOOTSTRAP_SERVER_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBootstrapServerHost() {
    return bootstrapServerHost;
  }


  @JsonProperty(JSON_PROPERTY_BOOTSTRAP_SERVER_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBootstrapServerHost(String bootstrapServerHost) {
    this.bootstrapServerHost = bootstrapServerHost;
  }


  public KafkaRequest createdAt(OffsetDateTime createdAt) {
    
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


  public KafkaRequest updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public KafkaRequest failedReason(String failedReason) {
    
    this.failedReason = failedReason;
    return this;
  }

   /**
   * Get failedReason
   * @return failedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAILED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedReason() {
    return failedReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }


  public KafkaRequest version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public KafkaRequest instanceType(String instanceType) {
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstanceType() {
    return instanceType;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaRequest kafkaRequest = (KafkaRequest) o;
    return Objects.equals(this.id, kafkaRequest.id) &&
        Objects.equals(this.kind, kafkaRequest.kind) &&
        Objects.equals(this.href, kafkaRequest.href) &&
        Objects.equals(this.status, kafkaRequest.status) &&
        Objects.equals(this.cloudProvider, kafkaRequest.cloudProvider) &&
        Objects.equals(this.multiAz, kafkaRequest.multiAz) &&
        Objects.equals(this.region, kafkaRequest.region) &&
        Objects.equals(this.owner, kafkaRequest.owner) &&
        Objects.equals(this.name, kafkaRequest.name) &&
        Objects.equals(this.bootstrapServerHost, kafkaRequest.bootstrapServerHost) &&
        Objects.equals(this.createdAt, kafkaRequest.createdAt) &&
        Objects.equals(this.updatedAt, kafkaRequest.updatedAt) &&
        Objects.equals(this.failedReason, kafkaRequest.failedReason) &&
        Objects.equals(this.version, kafkaRequest.version) &&
        Objects.equals(this.instanceType, kafkaRequest.instanceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, status, cloudProvider, multiAz, region, owner, name, bootstrapServerHost, createdAt, updatedAt, failedReason, version, instanceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bootstrapServerHost: ").append(toIndentedString(bootstrapServerHost)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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

