// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for Clients Delete.
 */
public final class ClientsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/Clients_Delete.
     * json
     */
    /**
     * Sample code: Clients_Delete.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void clientsDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.clients().delete("examplerg", "exampleNamespaceName1", "exampleClientName1",
            com.azure.core.util.Context.NONE);
    }
}
