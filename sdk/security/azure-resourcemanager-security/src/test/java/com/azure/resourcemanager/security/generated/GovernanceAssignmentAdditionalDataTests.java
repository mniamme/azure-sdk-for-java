// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceAssignmentAdditionalData;
import org.junit.jupiter.api.Assertions;

public final class GovernanceAssignmentAdditionalDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceAssignmentAdditionalData model =
            BinaryData
                .fromString(
                    "{\"ticketNumber\":465206787,\"ticketLink\":\"dkfnozoeoqbvj\",\"ticketStatus\":\"efgwbmqjc\"}")
                .toObject(GovernanceAssignmentAdditionalData.class);
        Assertions.assertEquals(465206787, model.ticketNumber());
        Assertions.assertEquals("dkfnozoeoqbvj", model.ticketLink());
        Assertions.assertEquals("efgwbmqjc", model.ticketStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceAssignmentAdditionalData model =
            new GovernanceAssignmentAdditionalData()
                .withTicketNumber(465206787)
                .withTicketLink("dkfnozoeoqbvj")
                .withTicketStatus("efgwbmqjc");
        model = BinaryData.fromObject(model).toObject(GovernanceAssignmentAdditionalData.class);
        Assertions.assertEquals(465206787, model.ticketNumber());
        Assertions.assertEquals("dkfnozoeoqbvj", model.ticketLink());
        Assertions.assertEquals("efgwbmqjc", model.ticketStatus());
    }
}
