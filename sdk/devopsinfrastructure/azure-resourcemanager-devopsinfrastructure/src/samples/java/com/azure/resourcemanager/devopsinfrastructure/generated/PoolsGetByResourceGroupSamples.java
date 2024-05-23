// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

/**
 * Samples for Pools GetByResourceGroup.
 */
public final class PoolsGetByResourceGroupSamples {
    /**
     * Sample code: Pools_Get.
     * 
     * @param manager Entry point to DevOpsInfrastructureManager.
     */
    public static void poolsGet(com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager manager) {
        manager.pools().getByResourceGroupWithResponse("rg", "pool", com.azure.core.util.Context.NONE);
    }
}
