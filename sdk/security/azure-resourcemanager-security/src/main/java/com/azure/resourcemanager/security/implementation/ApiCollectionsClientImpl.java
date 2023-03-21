// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.security.fluent.ApiCollectionsClient;
import com.azure.resourcemanager.security.fluent.models.ApiCollectionResponseInner;
import com.azure.resourcemanager.security.models.ApiCollectionResponseList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ApiCollectionsClient. */
public final class ApiCollectionsClientImpl implements ApiCollectionsClient {
    /** The proxy service used to perform REST calls. */
    private final ApiCollectionsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of ApiCollectionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ApiCollectionsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy.create(ApiCollectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterApiCollections to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterApiCol")
    public interface ApiCollectionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/providers/Microsoft.Security/apiCollections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApiCollectionResponseList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/providers/Microsoft.Security/apiCollections/{apiCollectionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApiCollectionResponseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("apiCollectionId") String apiCollectionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApiCollectionResponseList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs
     *
     * <p>Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs. If an Azure API
     * Management API is onboarded to Defender for APIs, the system will monitor the operations within the Azure API
     * Management API for intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure API Management APIs that have been onboarded to Defender for APIs along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApiCollectionResponseInner>> listSinglePageAsync(
        String resourceGroupName, String serviceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String apiVersion = "2022-11-20-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serviceName,
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<ApiCollectionResponseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs
     *
     * <p>Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs. If an Azure API
     * Management API is onboarded to Defender for APIs, the system will monitor the operations within the Azure API
     * Management API for intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure API Management APIs that have been onboarded to Defender for APIs along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApiCollectionResponseInner>> listSinglePageAsync(
        String resourceGroupName, String serviceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String apiVersion = "2022-11-20-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serviceName,
                apiVersion,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs
     *
     * <p>Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs. If an Azure API
     * Management API is onboarded to Defender for APIs, the system will monitor the operations within the Azure API
     * Management API for intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure API Management APIs that have been onboarded to Defender for APIs as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ApiCollectionResponseInner> listAsync(String resourceGroupName, String serviceName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, serviceName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs
     *
     * <p>Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs. If an Azure API
     * Management API is onboarded to Defender for APIs, the system will monitor the operations within the Azure API
     * Management API for intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure API Management APIs that have been onboarded to Defender for APIs as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ApiCollectionResponseInner> listAsync(
        String resourceGroupName, String serviceName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, serviceName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs
     *
     * <p>Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs. If an Azure API
     * Management API is onboarded to Defender for APIs, the system will monitor the operations within the Azure API
     * Management API for intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure API Management APIs that have been onboarded to Defender for APIs as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApiCollectionResponseInner> list(String resourceGroupName, String serviceName) {
        return new PagedIterable<>(listAsync(resourceGroupName, serviceName));
    }

    /**
     * Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs
     *
     * <p>Gets a list of Azure API Management APIs that have been onboarded to Defender for APIs. If an Azure API
     * Management API is onboarded to Defender for APIs, the system will monitor the operations within the Azure API
     * Management API for intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure API Management APIs that have been onboarded to Defender for APIs as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApiCollectionResponseInner> list(
        String resourceGroupName, String serviceName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, serviceName, context));
    }

    /**
     * Gets an Azure API Management API if it has been onboarded to Defender for APIs
     *
     * <p>Gets an Azure API Management API if it has been onboarded to Defender for APIs. If an Azure API Management API
     * is onboarded to Defender for APIs, the system will monitor the operations within the Azure API Management API for
     * intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure API Management API if it has been onboarded to Defender for APIs along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApiCollectionResponseInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String apiCollectionId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (apiCollectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter apiCollectionId is required and cannot be null."));
        }
        final String apiVersion = "2022-11-20-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serviceName,
                            apiCollectionId,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets an Azure API Management API if it has been onboarded to Defender for APIs
     *
     * <p>Gets an Azure API Management API if it has been onboarded to Defender for APIs. If an Azure API Management API
     * is onboarded to Defender for APIs, the system will monitor the operations within the Azure API Management API for
     * intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure API Management API if it has been onboarded to Defender for APIs along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApiCollectionResponseInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String apiCollectionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (apiCollectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter apiCollectionId is required and cannot be null."));
        }
        final String apiVersion = "2022-11-20-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serviceName,
                apiCollectionId,
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets an Azure API Management API if it has been onboarded to Defender for APIs
     *
     * <p>Gets an Azure API Management API if it has been onboarded to Defender for APIs. If an Azure API Management API
     * is onboarded to Defender for APIs, the system will monitor the operations within the Azure API Management API for
     * intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure API Management API if it has been onboarded to Defender for APIs on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApiCollectionResponseInner> getAsync(
        String resourceGroupName, String serviceName, String apiCollectionId) {
        return getWithResponseAsync(resourceGroupName, serviceName, apiCollectionId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets an Azure API Management API if it has been onboarded to Defender for APIs
     *
     * <p>Gets an Azure API Management API if it has been onboarded to Defender for APIs. If an Azure API Management API
     * is onboarded to Defender for APIs, the system will monitor the operations within the Azure API Management API for
     * intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure API Management API if it has been onboarded to Defender for APIs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiCollectionResponseInner> getWithResponse(
        String resourceGroupName, String serviceName, String apiCollectionId, Context context) {
        return getWithResponseAsync(resourceGroupName, serviceName, apiCollectionId, context).block();
    }

    /**
     * Gets an Azure API Management API if it has been onboarded to Defender for APIs
     *
     * <p>Gets an Azure API Management API if it has been onboarded to Defender for APIs. If an Azure API Management API
     * is onboarded to Defender for APIs, the system will monitor the operations within the Azure API Management API for
     * intrusive behaviors and provide alerts for attacks that have been detected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure API Management API if it has been onboarded to Defender for APIs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiCollectionResponseInner get(String resourceGroupName, String serviceName, String apiCollectionId) {
        return getWithResponse(resourceGroupName, serviceName, apiCollectionId, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return page of a list of API collections as represented by Defender for APIs along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApiCollectionResponseInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ApiCollectionResponseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return page of a list of API collections as represented by Defender for APIs along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApiCollectionResponseInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
