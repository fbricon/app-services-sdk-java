# smartevents-management-sdk

Red Hat Openshift SmartEvents Fleet Manager

- API version: 0.0.2

The API exposed by the fleet manager of the SmartEvents service.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.redhat.cloud</groupId>
  <artifactId>smartevents-management-sdk</artifactId>
  <version>0.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'smartevents-management-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'smartevents-management-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.redhat.cloud:smartevents-management-sdk:0.0.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/smartevents-management-sdk-0.0.2.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.openshift.cloud.api.smartevents.invoker.*;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.models.*;
import com.openshift.cloud.api.smartevents.BridgesApi;

public class BridgesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        BridgesApi apiInstance = new BridgesApi(defaultClient);
        BridgeRequest bridgeRequest = new BridgeRequest(); // BridgeRequest | 
        try {
            BridgeResponse result = apiInstance.bridgesAPICreateBridge(bridgeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BridgesApi#bridgesAPICreateBridge");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BridgesApi* | [**bridgesAPICreateBridge**](docs/BridgesApi.md#bridgesAPICreateBridge) | **POST** /api/v1/bridges | Create a Bridge instance
*BridgesApi* | [**bridgesAPIDeleteBridge**](docs/BridgesApi.md#bridgesAPIDeleteBridge) | **DELETE** /api/v1/bridges/{bridgeId} | Delete a Bridge instance
*BridgesApi* | [**bridgesAPIGetBridge**](docs/BridgesApi.md#bridgesAPIGetBridge) | **GET** /api/v1/bridges/{bridgeId} | Get a Bridge instance
*BridgesApi* | [**bridgesAPIGetBridges**](docs/BridgesApi.md#bridgesAPIGetBridges) | **GET** /api/v1/bridges | Get the list of Bridge instances
*CloudProvidersApi* | [**cloudProviderAPIGetCloudProvider**](docs/CloudProvidersApi.md#cloudProviderAPIGetCloudProvider) | **GET** /api/v1/cloud_providers/{id} | Get Cloud Provider.
*CloudProvidersApi* | [**cloudProviderAPIListCloudProviderRegions**](docs/CloudProvidersApi.md#cloudProviderAPIListCloudProviderRegions) | **GET** /api/v1/cloud_providers/{id}/regions | List Supported Cloud Regions.
*CloudProvidersApi* | [**cloudProviderAPIListCloudProviders**](docs/CloudProvidersApi.md#cloudProviderAPIListCloudProviders) | **GET** /api/v1/cloud_providers | List Supported Cloud Providers.
*ErrorCatalogApi* | [**errorsAPIGetError**](docs/ErrorCatalogApi.md#errorsAPIGetError) | **GET** /api/v1/errors/{id} | Get an error from the error catalog.
*ErrorCatalogApi* | [**errorsAPIGetErrors**](docs/ErrorCatalogApi.md#errorsAPIGetErrors) | **GET** /api/v1/errors | Get the list of errors.
*ProcessorsApi* | [**processorsAPIAddProcessorToBridge**](docs/ProcessorsApi.md#processorsAPIAddProcessorToBridge) | **POST** /api/v1/bridges/{bridgeId}/processors | Create a Processor of a Bridge instance
*ProcessorsApi* | [**processorsAPIDeleteProcessor**](docs/ProcessorsApi.md#processorsAPIDeleteProcessor) | **DELETE** /api/v1/bridges/{bridgeId}/processors/{processorId} | Delete a Processor of a Bridge instance
*ProcessorsApi* | [**processorsAPIGetProcessor**](docs/ProcessorsApi.md#processorsAPIGetProcessor) | **GET** /api/v1/bridges/{bridgeId}/processors/{processorId} | Get a Processor of a Bridge instance
*ProcessorsApi* | [**processorsAPIListProcessors**](docs/ProcessorsApi.md#processorsAPIListProcessors) | **GET** /api/v1/bridges/{bridgeId}/processors | Get the list of Processors of a Bridge instance
*ProcessorsApi* | [**processorsAPIUpdateProcessor**](docs/ProcessorsApi.md#processorsAPIUpdateProcessor) | **PUT** /api/v1/bridges/{bridgeId}/processors/{processorId} | Update a Processor instance Filter definition or Transformation template.
*SchemaCatalogApi* | [**schemaAPIGetActionProcessorSchema**](docs/SchemaCatalogApi.md#schemaAPIGetActionProcessorSchema) | **GET** /api/v1/schemas/actions/{id} | Get action processor schema
*SchemaCatalogApi* | [**schemaAPIGetCatalog**](docs/SchemaCatalogApi.md#schemaAPIGetCatalog) | **GET** /api/v1/schemas | Get processor catalog
*SchemaCatalogApi* | [**schemaAPIGetSourceProcessorSchema**](docs/SchemaCatalogApi.md#schemaAPIGetSourceProcessorSchema) | **GET** /api/v1/schemas/sources/{id} | Get source processor schema


## Documentation for Models

 - [Action](docs/Action.md)
 - [BaseFilter](docs/BaseFilter.md)
 - [BridgeError](docs/BridgeError.md)
 - [BridgeErrorType](docs/BridgeErrorType.md)
 - [BridgeListResponse](docs/BridgeListResponse.md)
 - [BridgeRequest](docs/BridgeRequest.md)
 - [BridgeResponse](docs/BridgeResponse.md)
 - [CloudProviderListResponse](docs/CloudProviderListResponse.md)
 - [CloudProviderResponse](docs/CloudProviderResponse.md)
 - [CloudRegionListResponse](docs/CloudRegionListResponse.md)
 - [CloudRegionResponse](docs/CloudRegionResponse.md)
 - [ErrorListResponse](docs/ErrorListResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorsResponse](docs/ErrorsResponse.md)
 - [ManagedResourceStatus](docs/ManagedResourceStatus.md)
 - [ProcessorCatalogResponse](docs/ProcessorCatalogResponse.md)
 - [ProcessorListResponse](docs/ProcessorListResponse.md)
 - [ProcessorRequest](docs/ProcessorRequest.md)
 - [ProcessorResponse](docs/ProcessorResponse.md)
 - [ProcessorSchemaEntryResponse](docs/ProcessorSchemaEntryResponse.md)
 - [ProcessorType](docs/ProcessorType.md)
 - [Source](docs/Source.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearer


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

openbridge-dev@redhat.com
