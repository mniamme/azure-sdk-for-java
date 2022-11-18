// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for Pools ListByProject. */
public final class PoolsListByProjectSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-10-12-preview/examples/Pools_List.json
     */
    /**
     * Sample code: Pools_ListByProject.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void poolsListByProject(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.pools().listByProject("rg1", "{projectName}", null, Context.NONE);
    }
}
