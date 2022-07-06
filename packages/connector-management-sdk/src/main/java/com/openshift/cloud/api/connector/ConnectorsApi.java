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

package com.openshift.cloud.api.connector;

import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
import com.openshift.cloud.api.connector.invoker.Pair;

import com.openshift.cloud.api.connector.models.Connector;
import com.openshift.cloud.api.connector.models.ConnectorList;
import com.openshift.cloud.api.connector.models.ConnectorRequest;
import com.openshift.cloud.api.connector.models.Error;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ConnectorsApi() {
    this(new ApiClient());
  }

  public ConnectorsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String> response) {
    String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
    return new ApiException(response.statusCode(), message, response.headers(), response.body());
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Create a new connector
   * Create a new connector
   * @param async Perform the action in an asynchronous manner (required)
   * @param connectorRequest Connector data (required)
   * @return CompletableFuture&lt;Connector&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Connector> createConnector(Boolean async, ConnectorRequest connectorRequest) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createConnectorRequestBuilder(async, connectorRequest);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Connector>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Create a new connector
   * Create a new connector
   * @param async Perform the action in an asynchronous manner (required)
   * @param connectorRequest Connector data (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Connector&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Connector>> createConnectorWithHttpInfo(Boolean async, ConnectorRequest connectorRequest) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createConnectorRequestBuilder(async, connectorRequest);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<Connector>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Connector>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder createConnectorRequestBuilder(Boolean async, ConnectorRequest connectorRequest) throws ApiException {
    // verify the required parameter 'async' is set
    if (async == null) {
      throw new ApiException(400, "Missing the required parameter 'async' when calling createConnector");
    }
    // verify the required parameter 'connectorRequest' is set
    if (connectorRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorRequest' when calling createConnector");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/connector_mgmt/v1/kafka_connectors";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("async", async));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(connectorRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Delete a connector
   * Delete a connector
   * @param id The ID of record (required)
   * @return CompletableFuture&lt;Error&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Error> deleteConnector(String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteConnectorRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Error>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Delete a connector
   * Delete a connector
   * @param id The ID of record (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Error&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Error>> deleteConnectorWithHttpInfo(String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteConnectorRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<Error>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Error>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder deleteConnectorRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteConnector");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/connector_mgmt/v1/kafka_connectors/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Get a connector
   * Get a connector
   * @param id The ID of record (required)
   * @return CompletableFuture&lt;Connector&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Connector> getConnector(String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getConnectorRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Connector>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Get a connector
   * Get a connector
   * @param id The ID of record (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Connector&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Connector>> getConnectorWithHttpInfo(String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getConnectorRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<Connector>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Connector>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getConnectorRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConnector");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/connector_mgmt/v1/kafka_connectors/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Returns a list of connector types
   * Returns a list of connector types
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @param orderBy Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the &#x60;ConnectorType&#x60; fields. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement. Allowed fields in the search are &#x60;name&#x60;, &#x60;description&#x60;, &#x60;version&#x60;, &#x60;label&#x60;, and &#x60;channel&#x60;. Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, or &#x60;LIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;[p-]  To return a Kafka instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  (optional)
   * @return CompletableFuture&lt;ConnectorList&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ConnectorList> listConnectors(String page, String size, String orderBy, String search) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listConnectorsRequestBuilder(page, size, orderBy, search);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listConnectors", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ConnectorList>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Returns a list of connector types
   * Returns a list of connector types
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @param orderBy Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the &#x60;ConnectorType&#x60; fields. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement. Allowed fields in the search are &#x60;name&#x60;, &#x60;description&#x60;, &#x60;version&#x60;, &#x60;label&#x60;, and &#x60;channel&#x60;. Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, or &#x60;LIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;[p-]  To return a Kafka instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ConnectorList&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ConnectorList>> listConnectorsWithHttpInfo(String page, String size, String orderBy, String search) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listConnectorsRequestBuilder(page, size, orderBy, search);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listConnectors", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ConnectorList>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ConnectorList>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder listConnectorsRequestBuilder(String page, String size, String orderBy, String search) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/connector_mgmt/v1/kafka_connectors";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page", page));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("size", size));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("orderBy", orderBy));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("search", search));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Patch a connector
   * Patch a connector
   * @param id The ID of record (required)
   * @param body Data to patch the connector with (required)
   * @return CompletableFuture&lt;Connector&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Connector> patchConnector(String id, Object body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = patchConnectorRequestBuilder(id, body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("patchConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Connector>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Patch a connector
   * Patch a connector
   * @param id The ID of record (required)
   * @param body Data to patch the connector with (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Connector&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Connector>> patchConnectorWithHttpInfo(String id, Object body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = patchConnectorRequestBuilder(id, body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("patchConnector", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<Connector>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Connector>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder patchConnectorRequestBuilder(String id, Object body) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchConnector");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConnector");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/connector_mgmt/v1/kafka_connectors/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/merge-patch+json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
