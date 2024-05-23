// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devopsinfrastructure.fluent.models.QuotaInner;
import com.azure.resourcemanager.devopsinfrastructure.models.Quota;
import com.azure.resourcemanager.devopsinfrastructure.models.QuotaProperties;

public final class QuotaImpl implements Quota {
    private QuotaInner innerObject;

    private final com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager serviceManager;

    QuotaImpl(QuotaInner innerObject,
        com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public QuotaProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public QuotaInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager manager() {
        return this.serviceManager;
    }
}
