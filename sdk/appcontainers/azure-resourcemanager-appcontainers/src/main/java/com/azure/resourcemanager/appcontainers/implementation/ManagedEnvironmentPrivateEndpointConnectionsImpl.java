// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ManagedEnvironmentPrivateEndpointConnectionsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentPrivateEndpointConnections;
import com.azure.resourcemanager.appcontainers.models.PrivateEndpointConnection;

public final class ManagedEnvironmentPrivateEndpointConnectionsImpl
    implements ManagedEnvironmentPrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedEnvironmentPrivateEndpointConnectionsImpl.class);

    private final ManagedEnvironmentPrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ManagedEnvironmentPrivateEndpointConnectionsImpl(
        ManagedEnvironmentPrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String environmentName) {
        PagedIterable<PrivateEndpointConnectionInner> inner
            = this.serviceClient().list(resourceGroupName, environmentName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String environmentName,
        Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner
            = this.serviceClient().list(resourceGroupName, environmentName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public Response<PrivateEndpointConnection> getWithResponse(String resourceGroupName, String environmentName,
        String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, environmentName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection get(String resourceGroupName, String environmentName,
        String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner
            = this.serviceClient().get(resourceGroupName, environmentName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String environmentName, String privateEndpointConnectionName) {
        this.serviceClient().delete(resourceGroupName, environmentName, privateEndpointConnectionName);
    }

    public void delete(String resourceGroupName, String environmentName, String privateEndpointConnectionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, environmentName, privateEndpointConnectionName, context);
    }

    public PrivateEndpointConnection getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, environmentName, privateEndpointConnectionName, Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, environmentName, privateEndpointConnectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        this.delete(resourceGroupName, environmentName, privateEndpointConnectionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        this.delete(resourceGroupName, environmentName, privateEndpointConnectionName, context);
    }

    private ManagedEnvironmentPrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
