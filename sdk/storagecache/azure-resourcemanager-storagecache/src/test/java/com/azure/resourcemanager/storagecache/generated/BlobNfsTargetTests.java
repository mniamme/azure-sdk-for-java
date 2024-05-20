// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.BlobNfsTarget;
import org.junit.jupiter.api.Assertions;

public final class BlobNfsTargetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobNfsTarget model = BinaryData.fromString(
            "{\"target\":\"mctlpdngitv\",\"usageModel\":\"mhrixkwmyijejve\",\"verificationTimer\":1196101983,\"writeBackTimer\":662218702}")
            .toObject(BlobNfsTarget.class);
        Assertions.assertEquals("mctlpdngitv", model.target());
        Assertions.assertEquals("mhrixkwmyijejve", model.usageModel());
        Assertions.assertEquals(1196101983, model.verificationTimer());
        Assertions.assertEquals(662218702, model.writeBackTimer());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobNfsTarget model = new BlobNfsTarget().withTarget("mctlpdngitv")
            .withUsageModel("mhrixkwmyijejve")
            .withVerificationTimer(1196101983)
            .withWriteBackTimer(662218702);
        model = BinaryData.fromObject(model).toObject(BlobNfsTarget.class);
        Assertions.assertEquals("mctlpdngitv", model.target());
        Assertions.assertEquals("mhrixkwmyijejve", model.usageModel());
        Assertions.assertEquals(1196101983, model.verificationTimer());
        Assertions.assertEquals(662218702, model.writeBackTimer());
    }
}
