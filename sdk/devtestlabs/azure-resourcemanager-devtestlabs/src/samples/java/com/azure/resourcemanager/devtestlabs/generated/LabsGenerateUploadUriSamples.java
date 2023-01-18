// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.resourcemanager.devtestlabs.models.GenerateUploadUriParameter;

/** Samples for Labs GenerateUploadUri. */
public final class LabsGenerateUploadUriSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/Labs_GenerateUploadUri.json
     */
    /**
     * Sample code: Labs_GenerateUploadUri.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void labsGenerateUploadUri(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .labs()
            .generateUploadUriWithResponse(
                "resourceGroupName",
                "{labName}",
                new GenerateUploadUriParameter().withBlobName("{blob-name}"),
                com.azure.core.util.Context.NONE);
    }
}