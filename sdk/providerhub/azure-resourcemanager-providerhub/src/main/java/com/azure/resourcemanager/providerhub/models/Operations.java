// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of Operations. */
public interface Operations {
    /**
     * Lists all the operations supported by Microsoft.ProviderHub.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<OperationsDefinition> list();

    /**
     * Lists all the operations supported by Microsoft.ProviderHub.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<OperationsDefinition> list(Context context);

    /**
     * Gets the operations supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operations supported by the given provider along with {@link Response}.
     */
    Response<List<OperationsDefinition>> listByProviderRegistrationWithResponse(
        String providerNamespace, Context context);

    /**
     * Gets the operations supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operations supported by the given provider.
     */
    List<OperationsDefinition> listByProviderRegistration(String providerNamespace);

    /**
     * Creates or updates the operation supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param operationsPutContent The operations content properties supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<OperationsContent> createOrUpdateWithResponse(
        String providerNamespace, OperationsPutContent operationsPutContent, Context context);

    /**
     * Creates or updates the operation supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param operationsPutContent The operations content properties supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    OperationsContent createOrUpdate(String providerNamespace, OperationsPutContent operationsPutContent);

    /**
     * Deletes an operation.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String providerNamespace, Context context);

    /**
     * Deletes an operation.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String providerNamespace);
}