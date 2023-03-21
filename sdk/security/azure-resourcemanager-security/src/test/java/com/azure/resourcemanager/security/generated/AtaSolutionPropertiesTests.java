// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AtaSolutionProperties;
import com.azure.resourcemanager.security.models.ConnectedWorkspace;
import org.junit.jupiter.api.Assertions;

public final class AtaSolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AtaSolutionProperties model =
            BinaryData
                .fromString(
                    "{\"lastEventReceived\":\"ijjcea\",\"deviceVendor\":\"ijjj\",\"deviceType\":\"va\",\"workspace\":{\"id\":\"szknxkvccxe\"},\"\":{\"nohikkgq\":\"datakunmi\",\"wpin\":\"datag\"}}")
                .toObject(AtaSolutionProperties.class);
        Assertions.assertEquals("ijjj", model.deviceVendor());
        Assertions.assertEquals("va", model.deviceType());
        Assertions.assertEquals("szknxkvccxe", model.workspace().id());
        Assertions.assertEquals("ijjcea", model.lastEventReceived());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AtaSolutionProperties model =
            new AtaSolutionProperties()
                .withDeviceVendor("ijjj")
                .withDeviceType("va")
                .withWorkspace(new ConnectedWorkspace().withId("szknxkvccxe"))
                .withLastEventReceived("ijjcea");
        model = BinaryData.fromObject(model).toObject(AtaSolutionProperties.class);
        Assertions.assertEquals("ijjj", model.deviceVendor());
        Assertions.assertEquals("va", model.deviceType());
        Assertions.assertEquals("szknxkvccxe", model.workspace().id());
        Assertions.assertEquals("ijjcea", model.lastEventReceived());
    }
}
