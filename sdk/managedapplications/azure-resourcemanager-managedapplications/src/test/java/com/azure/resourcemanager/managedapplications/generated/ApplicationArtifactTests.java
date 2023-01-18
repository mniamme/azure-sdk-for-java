// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifact;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifactType;
import org.junit.jupiter.api.Assertions;

public final class ApplicationArtifactTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationArtifact model =
            BinaryData
                .fromString("{\"name\":\"snb\",\"uri\":\"qabnmoc\",\"type\":\"Template\"}")
                .toObject(ApplicationArtifact.class);
        Assertions.assertEquals("snb", model.name());
        Assertions.assertEquals("qabnmoc", model.uri());
        Assertions.assertEquals(ApplicationArtifactType.TEMPLATE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationArtifact model =
            new ApplicationArtifact().withName("snb").withUri("qabnmoc").withType(ApplicationArtifactType.TEMPLATE);
        model = BinaryData.fromObject(model).toObject(ApplicationArtifact.class);
        Assertions.assertEquals("snb", model.name());
        Assertions.assertEquals("qabnmoc", model.uri());
        Assertions.assertEquals(ApplicationArtifactType.TEMPLATE, model.type());
    }
}