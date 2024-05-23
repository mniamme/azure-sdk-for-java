// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager;
import com.azure.resourcemanager.devopsinfrastructure.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devopsinfrastructure.models.Pool;
import com.azure.resourcemanager.devopsinfrastructure.models.ProvisioningState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PoolsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"maximumConcurrency\":1256948297,\"organizationProfile\":{\"kind\":\"OrganizationProfile\"},\"agentProfile\":{\"kind\":\"AgentProfile\",\"resourcePredictions\":\"datahnvpamqgxq\",\"resourcePredictionsProfile\":{\"kind\":\"ResourcePredictionsProfile\"}},\"fabricProfile\":{\"kind\":\"FabricProfile\"},\"devCenterProjectResourceId\":\"ezikywggxkal\"},\"identity\":{\"tenantId\":\"melwuipiccjz\",\"principalId\":\"ivgvvcna\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"tdaaygdvwvg\":{\"clientId\":\"nxxmueedndrdv\",\"principalId\":\"kwqqtchealmf\"},\"himdbl\":{\"clientId\":\"ohgwxrtfudxepxg\",\"principalId\":\"agvrvmnpkuk\"},\"xw\":{\"clientId\":\"wi\",\"principalId\":\"njhf\"}}},\"location\":\"zk\",\"tags\":{\"fjawneaivxwczel\":\"qreyfkzi\",\"r\":\"c\",\"xbjhwuaanozjosph\":\"lsfeaenwabfatkld\",\"ag\":\"oulpjrv\"},\"id\":\"rvimjwosytxitcsk\",\"name\":\"cktqumiekkezzi\",\"type\":\"hlyfjhdgqgg\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevOpsInfrastructureManager manager = DevOpsInfrastructureManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Pool> response = manager.pools().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zk", response.iterator().next().location());
        Assertions.assertEquals("qreyfkzi", response.iterator().next().tags().get("fjawneaivxwczel"));
        Assertions.assertEquals(ProvisioningState.SUCCEEDED,
            response.iterator().next().properties().provisioningState());
        Assertions.assertEquals(1256948297, response.iterator().next().properties().maximumConcurrency());
        Assertions.assertEquals("ezikywggxkal", response.iterator().next().properties().devCenterProjectResourceId());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("nxxmueedndrdv",
            response.iterator().next().identity().userAssignedIdentities().get("tdaaygdvwvg").clientId());
        Assertions.assertEquals("kwqqtchealmf",
            response.iterator().next().identity().userAssignedIdentities().get("tdaaygdvwvg").principalId());
    }
}
