# SchemaCatalogApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaAPIGetActionProcessorSchema**](SchemaCatalogApi.md#schemaAPIGetActionProcessorSchema) | **GET** /api/v1/schemas/actions/{id} | Get action processor schema
[**schemaAPIGetActionProcessorSchemaWithHttpInfo**](SchemaCatalogApi.md#schemaAPIGetActionProcessorSchemaWithHttpInfo) | **GET** /api/v1/schemas/actions/{id} | Get action processor schema
[**schemaAPIGetCatalog**](SchemaCatalogApi.md#schemaAPIGetCatalog) | **GET** /api/v1/schemas | Get processor catalog
[**schemaAPIGetCatalogWithHttpInfo**](SchemaCatalogApi.md#schemaAPIGetCatalogWithHttpInfo) | **GET** /api/v1/schemas | Get processor catalog
[**schemaAPIGetSourceProcessorSchema**](SchemaCatalogApi.md#schemaAPIGetSourceProcessorSchema) | **GET** /api/v1/schemas/sources/{id} | Get source processor schema
[**schemaAPIGetSourceProcessorSchemaWithHttpInfo**](SchemaCatalogApi.md#schemaAPIGetSourceProcessorSchemaWithHttpInfo) | **GET** /api/v1/schemas/sources/{id} | Get source processor schema



## schemaAPIGetActionProcessorSchema

> Object schemaAPIGetActionProcessorSchema(id)

Get action processor schema

Get the action processor JSON schema.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Object result = apiInstance.schemaAPIGetActionProcessorSchema(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetActionProcessorSchema");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Object**


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal error. |  -  |

## schemaAPIGetActionProcessorSchemaWithHttpInfo

> ApiResponse<Object> schemaAPIGetActionProcessorSchema schemaAPIGetActionProcessorSchemaWithHttpInfo(id)

Get action processor schema

Get the action processor JSON schema.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<Object> response = apiInstance.schemaAPIGetActionProcessorSchemaWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetActionProcessorSchema");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

ApiResponse<**Object**>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal error. |  -  |


## schemaAPIGetCatalog

> ProcessorCatalogResponse schemaAPIGetCatalog()

Get processor catalog

Get the processor catalog with all the available sources and actions.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        try {
            ProcessorCatalogResponse result = apiInstance.schemaAPIGetCatalog();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetCatalog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ProcessorCatalogResponse**](ProcessorCatalogResponse.md)


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal error. |  -  |

## schemaAPIGetCatalogWithHttpInfo

> ApiResponse<ProcessorCatalogResponse> schemaAPIGetCatalog schemaAPIGetCatalogWithHttpInfo()

Get processor catalog

Get the processor catalog with all the available sources and actions.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        try {
            ApiResponse<ProcessorCatalogResponse> response = apiInstance.schemaAPIGetCatalogWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetCatalog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ProcessorCatalogResponse**](ProcessorCatalogResponse.md)>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal error. |  -  |


## schemaAPIGetSourceProcessorSchema

> Object schemaAPIGetSourceProcessorSchema(id)

Get source processor schema

Get the source processor JSON schema.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Object result = apiInstance.schemaAPIGetSourceProcessorSchema(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetSourceProcessorSchema");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Object**


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal error. |  -  |

## schemaAPIGetSourceProcessorSchemaWithHttpInfo

> ApiResponse<Object> schemaAPIGetSourceProcessorSchema schemaAPIGetSourceProcessorSchemaWithHttpInfo(id)

Get source processor schema

Get the source processor JSON schema.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<Object> response = apiInstance.schemaAPIGetSourceProcessorSchemaWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetSourceProcessorSchema");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

ApiResponse<**Object**>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal error. |  -  |

