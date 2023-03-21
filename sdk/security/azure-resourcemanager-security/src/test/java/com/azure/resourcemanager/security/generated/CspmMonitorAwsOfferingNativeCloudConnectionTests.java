// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.CspmMonitorAwsOfferingNativeCloudConnection;
import org.junit.jupiter.api.Assertions;

public final class CspmMonitorAwsOfferingNativeCloudConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CspmMonitorAwsOfferingNativeCloudConnection model =
            BinaryData
                .fromString("{\"cloudRoleArn\":\"absol\"}")
                .toObject(CspmMonitorAwsOfferingNativeCloudConnection.class);
        Assertions.assertEquals("absol", model.cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CspmMonitorAwsOfferingNativeCloudConnection model =
            new CspmMonitorAwsOfferingNativeCloudConnection().withCloudRoleArn("absol");
        model = BinaryData.fromObject(model).toObject(CspmMonitorAwsOfferingNativeCloudConnection.class);
        Assertions.assertEquals("absol", model.cloudRoleArn());
    }
}
