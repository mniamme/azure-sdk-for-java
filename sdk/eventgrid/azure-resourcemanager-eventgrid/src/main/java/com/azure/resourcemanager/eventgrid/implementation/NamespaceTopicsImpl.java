// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.NamespaceTopicsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.NamespaceTopicInner;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.models.NamespaceTopic;
import com.azure.resourcemanager.eventgrid.models.NamespaceTopics;
import com.azure.resourcemanager.eventgrid.models.TopicRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.models.TopicSharedAccessKeys;

public final class NamespaceTopicsImpl implements NamespaceTopics {
    private static final ClientLogger LOGGER = new ClientLogger(NamespaceTopicsImpl.class);

    private final NamespaceTopicsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public NamespaceTopicsImpl(NamespaceTopicsClient innerClient,
        com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NamespaceTopic> getWithResponse(String resourceGroupName, String namespaceName, String topicName,
        Context context) {
        Response<NamespaceTopicInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, namespaceName, topicName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NamespaceTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NamespaceTopic get(String resourceGroupName, String namespaceName, String topicName) {
        NamespaceTopicInner inner = this.serviceClient().get(resourceGroupName, namespaceName, topicName);
        if (inner != null) {
            return new NamespaceTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String namespaceName, String topicName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, topicName);
    }

    public void delete(String resourceGroupName, String namespaceName, String topicName, Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, topicName, context);
    }

    public PagedIterable<NamespaceTopic> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<NamespaceTopicInner> inner
            = this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new NamespaceTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<NamespaceTopic> listByNamespace(String resourceGroupName, String namespaceName, String filter,
        Integer top, Context context) {
        PagedIterable<NamespaceTopicInner> inner
            = this.serviceClient().listByNamespace(resourceGroupName, namespaceName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new NamespaceTopicImpl(inner1, this.manager()));
    }

    public Response<TopicSharedAccessKeys> listSharedAccessKeysWithResponse(String resourceGroupName,
        String namespaceName, String topicName, Context context) {
        Response<TopicSharedAccessKeysInner> inner = this.serviceClient()
            .listSharedAccessKeysWithResponse(resourceGroupName, namespaceName, topicName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new TopicSharedAccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TopicSharedAccessKeys listSharedAccessKeys(String resourceGroupName, String namespaceName,
        String topicName) {
        TopicSharedAccessKeysInner inner
            = this.serviceClient().listSharedAccessKeys(resourceGroupName, namespaceName, topicName);
        if (inner != null) {
            return new TopicSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TopicSharedAccessKeys regenerateKey(String resourceGroupName, String namespaceName, String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest) {
        TopicSharedAccessKeysInner inner
            = this.serviceClient().regenerateKey(resourceGroupName, namespaceName, topicName, regenerateKeyRequest);
        if (inner != null) {
            return new TopicSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TopicSharedAccessKeys regenerateKey(String resourceGroupName, String namespaceName, String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest, Context context) {
        TopicSharedAccessKeysInner inner = this.serviceClient().regenerateKey(resourceGroupName, namespaceName,
            topicName, regenerateKeyRequest, context);
        if (inner != null) {
            return new TopicSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NamespaceTopic getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, topicName, Context.NONE).getValue();
    }

    public Response<NamespaceTopic> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, topicName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, topicName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String topicName = Utils.getValueFromIdByName(id, "topics");
        if (topicName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topics'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, topicName, context);
    }

    private NamespaceTopicsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    public NamespaceTopicImpl define(String name) {
        return new NamespaceTopicImpl(name, this.manager());
    }
}
