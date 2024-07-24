// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.appcontainers.fluent.ContainerAppsRevisionReplicasClient;
import com.azure.resourcemanager.appcontainers.fluent.models.ReplicaCollectionInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ReplicaInner;
import com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ContainerAppsRevisionReplicasClient.
 */
public final class ContainerAppsRevisionReplicasClientImpl implements ContainerAppsRevisionReplicasClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ContainerAppsRevisionReplicasService service;

    /**
     * The service client containing this operation class.
     */
    private final ContainerAppsApiClientImpl client;

    /**
     * Initializes an instance of ContainerAppsRevisionReplicasClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ContainerAppsRevisionReplicasClientImpl(ContainerAppsApiClientImpl client) {
        this.service = RestProxy.create(ContainerAppsRevisionReplicasService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerAppsApiClientContainerAppsRevisionReplicas to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerAppsApiClie")
    public interface ContainerAppsRevisionReplicasService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.App/containerApps/{containerAppName}/revisions/{revisionName}/replicas/{replicaName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<ReplicaInner>> getReplica(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("containerAppName") String containerAppName, @PathParam("revisionName") String revisionName,
            @PathParam("replicaName") String replicaName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.App/containerApps/{containerAppName}/revisions/{revisionName}/replicas")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<ReplicaCollectionInner>> listReplicas(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("containerAppName") String containerAppName, @PathParam("revisionName") String revisionName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get a replica for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param replicaName Name of the Container App Revision Replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a replica for a Container App Revision along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicaInner>> getReplicaWithResponseAsync(String resourceGroupName, String containerAppName,
        String revisionName, String replicaName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (containerAppName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerAppName is required and cannot be null."));
        }
        if (revisionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter revisionName is required and cannot be null."));
        }
        if (replicaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter replicaName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getReplica(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, containerAppName, revisionName, replicaName, this.client.getApiVersion(), accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a replica for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param replicaName Name of the Container App Revision Replica.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a replica for a Container App Revision along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicaInner>> getReplicaWithResponseAsync(String resourceGroupName, String containerAppName,
        String revisionName, String replicaName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (containerAppName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerAppName is required and cannot be null."));
        }
        if (revisionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter revisionName is required and cannot be null."));
        }
        if (replicaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter replicaName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getReplica(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            containerAppName, revisionName, replicaName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Get a replica for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param replicaName Name of the Container App Revision Replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a replica for a Container App Revision on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReplicaInner> getReplicaAsync(String resourceGroupName, String containerAppName, String revisionName,
        String replicaName) {
        return getReplicaWithResponseAsync(resourceGroupName, containerAppName, revisionName, replicaName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a replica for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param replicaName Name of the Container App Revision Replica.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a replica for a Container App Revision along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReplicaInner> getReplicaWithResponse(String resourceGroupName, String containerAppName,
        String revisionName, String replicaName, Context context) {
        return getReplicaWithResponseAsync(resourceGroupName, containerAppName, revisionName, replicaName, context)
            .block();
    }

    /**
     * Get a replica for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param replicaName Name of the Container App Revision Replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a replica for a Container App Revision.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReplicaInner getReplica(String resourceGroupName, String containerAppName, String revisionName,
        String replicaName) {
        return getReplicaWithResponse(resourceGroupName, containerAppName, revisionName, replicaName, Context.NONE)
            .getValue();
    }

    /**
     * List replicas for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Revision Replicas collection ARM resource along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicaCollectionInner>> listReplicasWithResponseAsync(String resourceGroupName,
        String containerAppName, String revisionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (containerAppName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerAppName is required and cannot be null."));
        }
        if (revisionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter revisionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listReplicas(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, containerAppName, revisionName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List replicas for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Revision Replicas collection ARM resource along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicaCollectionInner>> listReplicasWithResponseAsync(String resourceGroupName,
        String containerAppName, String revisionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (containerAppName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerAppName is required and cannot be null."));
        }
        if (revisionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter revisionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listReplicas(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            containerAppName, revisionName, this.client.getApiVersion(), accept, context);
    }

    /**
     * List replicas for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Revision Replicas collection ARM resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReplicaCollectionInner> listReplicasAsync(String resourceGroupName, String containerAppName,
        String revisionName) {
        return listReplicasWithResponseAsync(resourceGroupName, containerAppName, revisionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List replicas for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Revision Replicas collection ARM resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReplicaCollectionInner> listReplicasWithResponse(String resourceGroupName, String containerAppName,
        String revisionName, Context context) {
        return listReplicasWithResponseAsync(resourceGroupName, containerAppName, revisionName, context).block();
    }

    /**
     * List replicas for a Container App Revision.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Revision Replicas collection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReplicaCollectionInner listReplicas(String resourceGroupName, String containerAppName, String revisionName) {
        return listReplicasWithResponse(resourceGroupName, containerAppName, revisionName, Context.NONE).getValue();
    }
}
