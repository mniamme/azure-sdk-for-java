// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.resourcemanager.datalakestore.models.VirtualNetworkRule;

/** Samples for VirtualNetworkRules Update. */
public final class VirtualNetworkRulesUpdateSamples {
    /*
     * x-ms-original-file: specification/datalake-store/resource-manager/Microsoft.DataLakeStore/stable/2016-11-01/examples/VirtualNetworkRules_Update.json
     */
    /**
     * Sample code: Updates the specified virtual network rule.
     *
     * @param manager Entry point to DataLakeStoreManager.
     */
    public static void updatesTheSpecifiedVirtualNetworkRule(
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager) {
        VirtualNetworkRule resource =
            manager
                .virtualNetworkRules()
                .getWithResponse(
                    "contosorg", "contosoadla", "test_virtual_network_rules_name", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withSubnetId("test_subnetId").apply();
    }
}