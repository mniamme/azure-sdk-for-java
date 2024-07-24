// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for DaprSubscriptions Get.
 */
public final class DaprSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/
     * DaprSubscriptions_Get_DefaultRoute.json
     */
    /**
     * Sample code: Get Dapr subscription with bulk subscribe configuration and scopes.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getDaprSubscriptionWithBulkSubscribeConfigurationAndScopes(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprSubscriptions()
            .getWithResponse("examplerg", "myenvironment", "mypubsubcomponent", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/
     * DaprSubscriptions_Get_BulkSubscribeAndScopes.json
     */
    /**
     * Sample code: Get Dapr subscription with default route only.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getDaprSubscriptionWithDefaultRouteOnly(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprSubscriptions()
            .getWithResponse("examplerg", "myenvironment", "mypubsubcomponent", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/
     * DaprSubscriptions_Get_RouteRulesAndMetadata.json
     */
    /**
     * Sample code: GetDapr subscription with route rules and metadata.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getDaprSubscriptionWithRouteRulesAndMetadata(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprSubscriptions()
            .getWithResponse("examplerg", "myenvironment", "mypubsubcomponent", com.azure.core.util.Context.NONE);
    }
}
