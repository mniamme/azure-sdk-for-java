// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationInfo;
import com.azure.resourcemanager.eventgrid.models.ResourceMoveChangeHistory;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PartnerDestinationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerDestinationInfo model = BinaryData.fromString(
            "{\"endpointType\":\"PartnerDestinationInfo\",\"azureSubscriptionId\":\"ejk\",\"resourceGroupName\":\"ynqgoulzndlikwyq\",\"name\":\"fgibmadgakeq\",\"endpointServiceContext\":\"xybz\",\"resourceMoveChangeHistory\":[{\"azureSubscriptionId\":\"qytbciq\",\"resourceGroupName\":\"uflmm\",\"changedTimeUtc\":\"2021-12-07T12:50:46Z\"}]}")
            .toObject(PartnerDestinationInfo.class);
        Assertions.assertEquals("ejk", model.azureSubscriptionId());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.resourceGroupName());
        Assertions.assertEquals("fgibmadgakeq", model.name());
        Assertions.assertEquals("xybz", model.endpointServiceContext());
        Assertions.assertEquals("qytbciq", model.resourceMoveChangeHistory().get(0).azureSubscriptionId());
        Assertions.assertEquals("uflmm", model.resourceMoveChangeHistory().get(0).resourceGroupName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-07T12:50:46Z"),
            model.resourceMoveChangeHistory().get(0).changedTimeUtc());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerDestinationInfo model
            = new PartnerDestinationInfo().withAzureSubscriptionId("ejk").withResourceGroupName("ynqgoulzndlikwyq")
                .withName("fgibmadgakeq").withEndpointServiceContext("xybz")
                .withResourceMoveChangeHistory(Arrays.asList(
                    new ResourceMoveChangeHistory().withAzureSubscriptionId("qytbciq").withResourceGroupName("uflmm")
                        .withChangedTimeUtc(OffsetDateTime.parse("2021-12-07T12:50:46Z"))));
        model = BinaryData.fromObject(model).toObject(PartnerDestinationInfo.class);
        Assertions.assertEquals("ejk", model.azureSubscriptionId());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.resourceGroupName());
        Assertions.assertEquals("fgibmadgakeq", model.name());
        Assertions.assertEquals("xybz", model.endpointServiceContext());
        Assertions.assertEquals("qytbciq", model.resourceMoveChangeHistory().get(0).azureSubscriptionId());
        Assertions.assertEquals("uflmm", model.resourceMoveChangeHistory().get(0).resourceGroupName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-07T12:50:46Z"),
            model.resourceMoveChangeHistory().get(0).changedTimeUtc());
    }
}
