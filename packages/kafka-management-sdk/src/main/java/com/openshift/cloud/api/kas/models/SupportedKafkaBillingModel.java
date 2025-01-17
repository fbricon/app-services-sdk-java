/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.15.0
 * Contact: rhosak-support@redhat.com
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Supported Kafka Billing Model
 */
@ApiModel(description = "Supported Kafka Billing Model")
@JsonPropertyOrder({
  SupportedKafkaBillingModel.JSON_PROPERTY_ID,
  SupportedKafkaBillingModel.JSON_PROPERTY_AMS_RESOURCE,
  SupportedKafkaBillingModel.JSON_PROPERTY_AMS_PRODUCT,
  SupportedKafkaBillingModel.JSON_PROPERTY_AMS_BILLING_MODELS
})
@JsonTypeName("SupportedKafkaBillingModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SupportedKafkaBillingModel {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_AMS_RESOURCE = "ams_resource";
  private String amsResource;

  public static final String JSON_PROPERTY_AMS_PRODUCT = "ams_product";
  private String amsProduct;

  public static final String JSON_PROPERTY_AMS_BILLING_MODELS = "ams_billing_models";
  private List<String> amsBillingModels = new ArrayList<>();

  public SupportedKafkaBillingModel() { 
  }

  public SupportedKafkaBillingModel id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier for the Kafka billing model
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier for the Kafka billing model")
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


  public SupportedKafkaBillingModel amsResource(String amsResource) {
    
    this.amsResource = amsResource;
    return this;
  }

   /**
   * AMS resource to be used. Accepted values: [&#39;rhosak&#39;]
   * @return amsResource
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "AMS resource to be used. Accepted values: ['rhosak']")
  @JsonProperty(JSON_PROPERTY_AMS_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmsResource() {
    return amsResource;
  }


  @JsonProperty(JSON_PROPERTY_AMS_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmsResource(String amsResource) {
    this.amsResource = amsResource;
  }


  public SupportedKafkaBillingModel amsProduct(String amsProduct) {
    
    this.amsProduct = amsProduct;
    return this;
  }

   /**
   * AMS product to be used. Accepted values: [&#39;RHOSAK&#39;, &#39;RHOSAKTrial&#39;, &#39;RHOSAKEval&#39;, &#39;RHOSAKCC&#39;]
   * @return amsProduct
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "AMS product to be used. Accepted values: ['RHOSAK', 'RHOSAKTrial', 'RHOSAKEval', 'RHOSAKCC']")
  @JsonProperty(JSON_PROPERTY_AMS_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmsProduct() {
    return amsProduct;
  }


  @JsonProperty(JSON_PROPERTY_AMS_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmsProduct(String amsProduct) {
    this.amsProduct = amsProduct;
  }


  public SupportedKafkaBillingModel amsBillingModels(List<String> amsBillingModels) {
    
    this.amsBillingModels = amsBillingModels;
    return this;
  }

  public SupportedKafkaBillingModel addAmsBillingModelsItem(String amsBillingModelsItem) {
    this.amsBillingModels.add(amsBillingModelsItem);
    return this;
  }

   /**
   * List of AMS available billing models: Accepted values: [&#39;marketplace&#39;, &#39;marketplace-rhm&#39;, &#39;marketplace-aws&#39;]
   * @return amsBillingModels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of AMS available billing models: Accepted values: ['marketplace', 'marketplace-rhm', 'marketplace-aws']")
  @JsonProperty(JSON_PROPERTY_AMS_BILLING_MODELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAmsBillingModels() {
    return amsBillingModels;
  }


  @JsonProperty(JSON_PROPERTY_AMS_BILLING_MODELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmsBillingModels(List<String> amsBillingModels) {
    this.amsBillingModels = amsBillingModels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedKafkaBillingModel supportedKafkaBillingModel = (SupportedKafkaBillingModel) o;
    return Objects.equals(this.id, supportedKafkaBillingModel.id) &&
        Objects.equals(this.amsResource, supportedKafkaBillingModel.amsResource) &&
        Objects.equals(this.amsProduct, supportedKafkaBillingModel.amsProduct) &&
        Objects.equals(this.amsBillingModels, supportedKafkaBillingModel.amsBillingModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amsResource, amsProduct, amsBillingModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedKafkaBillingModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amsResource: ").append(toIndentedString(amsResource)).append("\n");
    sb.append("    amsProduct: ").append(toIndentedString(amsProduct)).append("\n");
    sb.append("    amsBillingModels: ").append(toIndentedString(amsBillingModels)).append("\n");
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

