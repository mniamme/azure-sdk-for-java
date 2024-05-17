// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.FleetMember;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FleetMembersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"clusterResourceId\":\"ayqigynduhav\",\"group\":\"lkthu\",\"provisioningState\":\"Leaving\"},\"eTag\":\"lbg\",\"id\":\"duiertgcc\",\"name\":\"mvaolps\",\"type\":\"lqlfm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerServiceFleetManager manager = ContainerServiceFleetManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FleetMember response = manager.fleetMembers()
            .getWithResponse("eh", "ndoygmifthnzdnd", "l", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ayqigynduhav", response.clusterResourceId());
        Assertions.assertEquals("lkthu", response.group());
    }
}
