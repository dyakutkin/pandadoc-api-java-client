# The Official PandaDoc Java client SDK
PandaDoc SDK spans a broad range of functionality to help you build incredible documents automation experiences inside your product.

## Docs
- [Official public API documentation](https://developers.pandadoc.com/reference/about)

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
  <groupId>com.pandadoc</groupId>
  <artifactId>pandadoc-java-client</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.pandadoc:pandadoc-java-client:2.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/pandadoc-java-client-2.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pandadoc.com");

        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "API-Key" (defaults to null)
        //apiKey.setApiKeyPrefix("API-Key");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        // Boolean | Optional. Returns only not deleted templates.
        Boolean deleted = false;
        // Integer | Optionally, specify how many templates to return.
        // Default is 50 templates, maximum is 100 templates.
        Integer count = 10;
        try {
            TemplateListResponse result = apiInstance.listTemplates(null, null, deleted, count);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#listTemplates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## Examples

- [Create and send document from a template](https://github.com/PandaDoc/pandadoc-api-java-client/blob/develop/examples/CreateFromTemplateAndSend.java)
- [Create and send document from the pdf url](https://github.com/PandaDoc/pandadoc-api-java-client/blob/develop/examples/CreateFromPdfByUrlAndSend.java)

## Documentation for API Endpoints

All URIs are relative to *https://api.pandadoc.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiLogsApi* | [**detailsLog**](docs/ApiLogsApi.md#detailsLog) | **GET** /public/v1/logs/{id} | Details API Log
*ApiLogsApi* | [**listLogs**](docs/ApiLogsApi.md#listLogs) | **GET** /public/v1/logs | List API Log
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /public/v1/contacts | Create contact
*ContactsApi* | [**deleteContact**](docs/ContactsApi.md#deleteContact) | **DELETE** /public/v1/contacts/{id} | Delete contact by id
*ContactsApi* | [**detailsContact**](docs/ContactsApi.md#detailsContact) | **GET** /public/v1/contacts/{id} | Get contact details by id
*ContactsApi* | [**listContacts**](docs/ContactsApi.md#listContacts) | **GET** /public/v1/contacts | List contacts
*ContactsApi* | [**updateContact**](docs/ContactsApi.md#updateContact) | **PATCH** /public/v1/contacts/{id} | Update contact by id
*ContentLibraryItemsApi* | [**detailsContentLibraryItem**](docs/ContentLibraryItemsApi.md#detailsContentLibraryItem) | **GET** /public/v1/content-library-items/{id}/details | Details Content Library Item
*ContentLibraryItemsApi* | [**listContentLibraryItems**](docs/ContentLibraryItemsApi.md#listContentLibraryItems) | **GET** /public/v1/content-library-items | List Content Library Item
*DocumentAttachmentsApi* | [**createDocumentAttachment**](docs/DocumentAttachmentsApi.md#createDocumentAttachment) | **POST** /public/v1/documents/{id}/attachments | Document Attachment Create
*DocumentAttachmentsApi* | [**deleteDocumentAttachment**](docs/DocumentAttachmentsApi.md#deleteDocumentAttachment) | **DELETE** /public/v1/documents/{id}/attachments/{attachment_id} | Document Attachment Delete
*DocumentAttachmentsApi* | [**detailsDocumentAttachment**](docs/DocumentAttachmentsApi.md#detailsDocumentAttachment) | **GET** /public/v1/documents/{id}/attachments/{attachment_id} | Document Attachment Details
*DocumentAttachmentsApi* | [**downloadDocumentAttachment**](docs/DocumentAttachmentsApi.md#downloadDocumentAttachment) | **GET** /public/v1/documents/{id}/attachments/{attachment_id}/download | Document Attachment Download
*DocumentAttachmentsApi* | [**listDocumentAttachments**](docs/DocumentAttachmentsApi.md#listDocumentAttachments) | **GET** /public/v1/documents/{id}/attachments | Document Attachment List
*DocumentsApi* | [**changeDocumentStatus**](docs/DocumentsApi.md#changeDocumentStatus) | **PATCH** /public/v1/documents/{id}/status | Document status change
*DocumentsApi* | [**createDocument**](docs/DocumentsApi.md#createDocument) | **POST** /public/v1/documents | Create document
*DocumentsApi* | [**createDocumentLink**](docs/DocumentsApi.md#createDocumentLink) | **POST** /public/v1/documents/{id}/session | Create a Document Link
*DocumentsApi* | [**createLinkedObject**](docs/DocumentsApi.md#createLinkedObject) | **POST** /public/v1/documents/{id}/linked-objects | Create Linked Object
*DocumentsApi* | [**deleteDocument**](docs/DocumentsApi.md#deleteDocument) | **DELETE** /public/v1/documents/{id} | Delete document by id
*DocumentsApi* | [**deleteLinkedObject**](docs/DocumentsApi.md#deleteLinkedObject) | **DELETE** /public/v1/documents/{id}/linked-objects/{linked_object_id} | Delete Linked Object
*DocumentsApi* | [**detailsDocument**](docs/DocumentsApi.md#detailsDocument) | **GET** /public/v1/documents/{id}/details | Document details
*DocumentsApi* | [**downloadDocument**](docs/DocumentsApi.md#downloadDocument) | **GET** /public/v1/documents/{id}/download | Document download
*DocumentsApi* | [**downloadProtectedDocument**](docs/DocumentsApi.md#downloadProtectedDocument) | **GET** /public/v1/documents/{id}/download-protected | Download document protected
*DocumentsApi* | [**listDocuments**](docs/DocumentsApi.md#listDocuments) | **GET** /public/v1/documents | List documents
*DocumentsApi* | [**listLinkedObjects**](docs/DocumentsApi.md#listLinkedObjects) | **GET** /public/v1/documents/{id}/linked-objects | List Linked Objects
*DocumentsApi* | [**sendDocument**](docs/DocumentsApi.md#sendDocument) | **POST** /public/v1/documents/{id}/send | Send Document
*DocumentsApi* | [**statusDocument**](docs/DocumentsApi.md#statusDocument) | **GET** /public/v1/documents/{id} | Document status
*DocumentsApi* | [**transferAllDocumentsOwnership**](docs/DocumentsApi.md#transferAllDocumentsOwnership) | **PATCH** /public/v1/documents/ownership | Transfer all documents ownership
*DocumentsApi* | [**transferDocumentOwnership**](docs/DocumentsApi.md#transferDocumentOwnership) | **PATCH** /public/v1/documents/{id}/ownership | Update document ownership
*FoldersApiApi* | [**createDocumentFolder**](docs/FoldersApiApi.md#createDocumentFolder) | **POST** /public/v1/documents/folders | Create Documents Folder
*FoldersApiApi* | [**createTemplateFolder**](docs/FoldersApiApi.md#createTemplateFolder) | **POST** /public/v1/templates/folders | Create Templates Folder
*FoldersApiApi* | [**listDocumentFolders**](docs/FoldersApiApi.md#listDocumentFolders) | **GET** /public/v1/documents/folders | List Documents Folders
*FoldersApiApi* | [**listTemplateFolders**](docs/FoldersApiApi.md#listTemplateFolders) | **GET** /public/v1/templates/folders | List Templates Folders
*FoldersApiApi* | [**renameDocumentFolder**](docs/FoldersApiApi.md#renameDocumentFolder) | **PUT** /public/v1/documents/folders/{id} | Rename Documents Folder
*FoldersApiApi* | [**renameTemplateFolder**](docs/FoldersApiApi.md#renameTemplateFolder) | **PUT** /public/v1/templates/folders/{id} | Rename Templates Folder
*FormsApi* | [**listForm**](docs/FormsApi.md#listForm) | **GET** /public/v1/forms | Forms
*MembersApi* | [**detailsCurrentMember**](docs/MembersApi.md#detailsCurrentMember) | **GET** /public/v1/members/current | Current member details
*MembersApi* | [**detailsMember**](docs/MembersApi.md#detailsMember) | **GET** /public/v1/members/{id} | Member details
*MembersApi* | [**listMembers**](docs/MembersApi.md#listMembers) | **GET** /public/v1/members | List members
*OAuth20AuthenticationApi* | [**accessToken**](docs/OAuth20AuthenticationApi.md#accessToken) | **POST** /oauth2/access_token | Create/Refresh Access Token
*TemplatesApi* | [**deleteTemplate**](docs/TemplatesApi.md#deleteTemplate) | **DELETE** /public/v1/templates/{id} | Delete Template
*TemplatesApi* | [**detailsTemplate**](docs/TemplatesApi.md#detailsTemplate) | **GET** /public/v1/templates/{id}/details | Details Template
*TemplatesApi* | [**listTemplates**](docs/TemplatesApi.md#listTemplates) | **GET** /public/v1/templates | List Templates

## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey
- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### oauth2
- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://app.pandadoc.com/oauth2/authorize
- **Scopes**: 
  - read+write: Use &#x60;read+write&#x60; to create, send, delete, and download documents, and &#x60;read&#x60; to view templates and document details.


## License

SDK is licensed under the following [License](LICENSE).