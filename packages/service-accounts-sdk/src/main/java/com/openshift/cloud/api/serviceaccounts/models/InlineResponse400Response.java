/*
 * Service Accounts API Documentation
 * This is the API documentation for Service Accounts
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.serviceaccounts.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400ResponseCookies;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400ResponseEntityTag;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400ResponseLanguage;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400ResponseLinks;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400ResponseMediaType;
import com.openshift.cloud.api.serviceaccounts.models.InlineResponse400ResponseStatusInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InlineResponse400Response
 */
@JsonPropertyOrder({
  InlineResponse400Response.JSON_PROPERTY_METADATA,
  InlineResponse400Response.JSON_PROPERTY_ENTITY,
  InlineResponse400Response.JSON_PROPERTY_STATUS,
  InlineResponse400Response.JSON_PROPERTY_ENTITY_TAG,
  InlineResponse400Response.JSON_PROPERTY_COOKIES,
  InlineResponse400Response.JSON_PROPERTY_ALLOWED_METHODS,
  InlineResponse400Response.JSON_PROPERTY_MEDIA_TYPE,
  InlineResponse400Response.JSON_PROPERTY_STRING_HEADERS,
  InlineResponse400Response.JSON_PROPERTY_STATUS_INFO,
  InlineResponse400Response.JSON_PROPERTY_LINKS,
  InlineResponse400Response.JSON_PROPERTY_LENGTH,
  InlineResponse400Response.JSON_PROPERTY_LANGUAGE,
  InlineResponse400Response.JSON_PROPERTY_LOCATION,
  InlineResponse400Response.JSON_PROPERTY_LAST_MODIFIED,
  InlineResponse400Response.JSON_PROPERTY_DATE,
  InlineResponse400Response.JSON_PROPERTY_HEADERS
})
@JsonTypeName("inline_response_400_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse400Response {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, List<Object>> metadata = null;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private Object entity;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_ENTITY_TAG = "entityTag";
  private InlineResponse400ResponseEntityTag entityTag;

  public static final String JSON_PROPERTY_COOKIES = "cookies";
  private Map<String, InlineResponse400ResponseCookies> cookies = null;

  public static final String JSON_PROPERTY_ALLOWED_METHODS = "allowedMethods";
  private Set<String> allowedMethods = null;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  private InlineResponse400ResponseMediaType mediaType;

  public static final String JSON_PROPERTY_STRING_HEADERS = "stringHeaders";
  private Map<String, List<String>> stringHeaders = null;

  public static final String JSON_PROPERTY_STATUS_INFO = "statusInfo";
  private InlineResponse400ResponseStatusInfo statusInfo;

  public static final String JSON_PROPERTY_LINKS = "links";
  private Set<InlineResponse400ResponseLinks> links = null;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Integer length;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private InlineResponse400ResponseLanguage language;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private URI location;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, List<Object>> headers = null;

  public InlineResponse400Response() { 
  }

  public InlineResponse400Response metadata(Map<String, List<Object>> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public InlineResponse400Response putMetadataItem(String key, List<Object> metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<Object>> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, List<Object>> metadata) {
    this.metadata = metadata;
  }


  public InlineResponse400Response entity(Object entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(Object entity) {
    this.entity = entity;
  }


  public InlineResponse400Response status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public InlineResponse400Response entityTag(InlineResponse400ResponseEntityTag entityTag) {
    
    this.entityTag = entityTag;
    return this;
  }

   /**
   * Get entityTag
   * @return entityTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse400ResponseEntityTag getEntityTag() {
    return entityTag;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityTag(InlineResponse400ResponseEntityTag entityTag) {
    this.entityTag = entityTag;
  }


  public InlineResponse400Response cookies(Map<String, InlineResponse400ResponseCookies> cookies) {
    
    this.cookies = cookies;
    return this;
  }

  public InlineResponse400Response putCookiesItem(String key, InlineResponse400ResponseCookies cookiesItem) {
    if (this.cookies == null) {
      this.cookies = new HashMap<>();
    }
    this.cookies.put(key, cookiesItem);
    return this;
  }

   /**
   * Get cookies
   * @return cookies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COOKIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, InlineResponse400ResponseCookies> getCookies() {
    return cookies;
  }


  @JsonProperty(JSON_PROPERTY_COOKIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCookies(Map<String, InlineResponse400ResponseCookies> cookies) {
    this.cookies = cookies;
  }


  public InlineResponse400Response allowedMethods(Set<String> allowedMethods) {
    
    this.allowedMethods = allowedMethods;
    return this;
  }

  public InlineResponse400Response addAllowedMethodsItem(String allowedMethodsItem) {
    if (this.allowedMethods == null) {
      this.allowedMethods = new LinkedHashSet<>();
    }
    this.allowedMethods.add(allowedMethodsItem);
    return this;
  }

   /**
   * Get allowedMethods
   * @return allowedMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAllowedMethods() {
    return allowedMethods;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ALLOWED_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedMethods(Set<String> allowedMethods) {
    this.allowedMethods = allowedMethods;
  }


  public InlineResponse400Response mediaType(InlineResponse400ResponseMediaType mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse400ResponseMediaType getMediaType() {
    return mediaType;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaType(InlineResponse400ResponseMediaType mediaType) {
    this.mediaType = mediaType;
  }


  public InlineResponse400Response stringHeaders(Map<String, List<String>> stringHeaders) {
    
    this.stringHeaders = stringHeaders;
    return this;
  }

  public InlineResponse400Response putStringHeadersItem(String key, List<String> stringHeadersItem) {
    if (this.stringHeaders == null) {
      this.stringHeaders = new HashMap<>();
    }
    this.stringHeaders.put(key, stringHeadersItem);
    return this;
  }

   /**
   * Get stringHeaders
   * @return stringHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRING_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<String>> getStringHeaders() {
    return stringHeaders;
  }


  @JsonProperty(JSON_PROPERTY_STRING_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStringHeaders(Map<String, List<String>> stringHeaders) {
    this.stringHeaders = stringHeaders;
  }


  public InlineResponse400Response statusInfo(InlineResponse400ResponseStatusInfo statusInfo) {
    
    this.statusInfo = statusInfo;
    return this;
  }

   /**
   * Get statusInfo
   * @return statusInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse400ResponseStatusInfo getStatusInfo() {
    return statusInfo;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusInfo(InlineResponse400ResponseStatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }


  public InlineResponse400Response links(Set<InlineResponse400ResponseLinks> links) {
    
    this.links = links;
    return this;
  }

  public InlineResponse400Response addLinksItem(InlineResponse400ResponseLinks linksItem) {
    if (this.links == null) {
      this.links = new LinkedHashSet<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<InlineResponse400ResponseLinks> getLinks() {
    return links;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Set<InlineResponse400ResponseLinks> links) {
    this.links = links;
  }


  public InlineResponse400Response length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(Integer length) {
    this.length = length;
  }


  public InlineResponse400Response language(InlineResponse400ResponseLanguage language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse400ResponseLanguage getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(InlineResponse400ResponseLanguage language) {
    this.language = language;
  }


  public InlineResponse400Response location(URI location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(URI location) {
    this.location = location;
  }


  public InlineResponse400Response lastModified(OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  public InlineResponse400Response date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public InlineResponse400Response headers(Map<String, List<Object>> headers) {
    
    this.headers = headers;
    return this;
  }

  public InlineResponse400Response putHeadersItem(String key, List<Object> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<Object>> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(Map<String, List<Object>> headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400Response inlineResponse400Response = (InlineResponse400Response) o;
    return Objects.equals(this.metadata, inlineResponse400Response.metadata) &&
        Objects.equals(this.entity, inlineResponse400Response.entity) &&
        Objects.equals(this.status, inlineResponse400Response.status) &&
        Objects.equals(this.entityTag, inlineResponse400Response.entityTag) &&
        Objects.equals(this.cookies, inlineResponse400Response.cookies) &&
        Objects.equals(this.allowedMethods, inlineResponse400Response.allowedMethods) &&
        Objects.equals(this.mediaType, inlineResponse400Response.mediaType) &&
        Objects.equals(this.stringHeaders, inlineResponse400Response.stringHeaders) &&
        Objects.equals(this.statusInfo, inlineResponse400Response.statusInfo) &&
        Objects.equals(this.links, inlineResponse400Response.links) &&
        Objects.equals(this.length, inlineResponse400Response.length) &&
        Objects.equals(this.language, inlineResponse400Response.language) &&
        Objects.equals(this.location, inlineResponse400Response.location) &&
        Objects.equals(this.lastModified, inlineResponse400Response.lastModified) &&
        Objects.equals(this.date, inlineResponse400Response.date) &&
        Objects.equals(this.headers, inlineResponse400Response.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, entity, status, entityTag, cookies, allowedMethods, mediaType, stringHeaders, statusInfo, links, length, language, location, lastModified, date, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400Response {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    entityTag: ").append(toIndentedString(entityTag)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
    sb.append("    allowedMethods: ").append(toIndentedString(allowedMethods)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    stringHeaders: ").append(toIndentedString(stringHeaders)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

