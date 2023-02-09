// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.EnqueueServerProperties;

public final class EnqueueServerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnqueueServerProperties model =
            BinaryData
                .fromString(
                    "{\"hostname\":\"kexxppof\",\"ipAddress\":\"axcfjpgddtocjjx\",\"port\":1101586984084483374,\"health\":\"Healthy\"}")
                .toObject(EnqueueServerProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnqueueServerProperties model = new EnqueueServerProperties();
        model = BinaryData.fromObject(model).toObject(EnqueueServerProperties.class);
    }
}