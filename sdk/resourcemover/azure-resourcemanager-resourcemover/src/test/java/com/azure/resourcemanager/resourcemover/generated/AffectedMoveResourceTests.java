// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.AffectedMoveResource;

public final class AffectedMoveResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AffectedMoveResource model =
            BinaryData
                .fromString(
                    "{\"id\":\"wyahuxinpmqnja\",\"sourceId\":\"ixjsprozvcputeg\",\"moveResources\":[{\"id\":\"fdatsc\",\"sourceId\":\"vpjhulsuuv\",\"moveResources\":[]},{\"id\":\"zkrwfn\",\"sourceId\":\"odjpslwejd\",\"moveResources\":[]},{\"id\":\"yoqpsoaccta\",\"sourceId\":\"kljla\",\"moveResources\":[]},{\"id\":\"yffdfdos\",\"sourceId\":\"expa\",\"moveResources\":[]}]}")
                .toObject(AffectedMoveResource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AffectedMoveResource model = new AffectedMoveResource();
        model = BinaryData.fromObject(model).toObject(AffectedMoveResource.class);
    }
}