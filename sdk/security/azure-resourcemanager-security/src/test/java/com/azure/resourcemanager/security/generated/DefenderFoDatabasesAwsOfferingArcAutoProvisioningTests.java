// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderFoDatabasesAwsOfferingArcAutoProvisioning;
import org.junit.jupiter.api.Assertions;

public final class DefenderFoDatabasesAwsOfferingArcAutoProvisioningTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderFoDatabasesAwsOfferingArcAutoProvisioning model =
            BinaryData
                .fromString("{\"enabled\":true,\"cloudRoleArn\":\"slxlhu\"}")
                .toObject(DefenderFoDatabasesAwsOfferingArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("slxlhu", model.cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderFoDatabasesAwsOfferingArcAutoProvisioning model =
            new DefenderFoDatabasesAwsOfferingArcAutoProvisioning().withEnabled(true).withCloudRoleArn("slxlhu");
        model = BinaryData.fromObject(model).toObject(DefenderFoDatabasesAwsOfferingArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("slxlhu", model.cloudRoleArn());
    }
}
