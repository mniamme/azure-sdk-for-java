// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.core.util.Context;

/** Samples for Applications Delete. */
public final class ApplicationsDeleteSamples {
    /*
     * operationId: Applications_Delete
     * api-version: 2021-06-01
     * x-ms-examples: Delete an application
     */
    /**
     * Sample code: Delete an application.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void deleteAnApplication(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.applications().delete("resRg", "myCluster", "myApp", Context.NONE);
    }
}
