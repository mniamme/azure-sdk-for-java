// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for DaprComponents ListSecrets.
 */
public final class DaprComponentsListSecretsSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/DaprComponents_ListSecrets.
     * json
     */
    /**
     * Sample code: List Container Apps Secrets.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        listContainerAppsSecrets(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprComponents()
            .listSecretsWithResponse("examplerg", "myenvironment", "reddog", com.azure.core.util.Context.NONE);
    }
}
