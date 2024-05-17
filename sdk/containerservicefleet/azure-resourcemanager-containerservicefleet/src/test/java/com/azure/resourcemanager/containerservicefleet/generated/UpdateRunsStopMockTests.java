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
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRun;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UpdateRunsStopMockTests {
    @Test
    public void testStop() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"updateStrategyId\":\"fcktqumiekke\",\"strategy\":{\"stages\":[{\"name\":\"khly\",\"groups\":[{\"name\":\"dgqggebdu\"},{\"name\":\"ygaeqidbqfatpxl\"}],\"afterStageWaitInSeconds\":1652546958}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"Full\",\"kubernetesVersion\":\"jmoadsuv\"},\"nodeImageSelection\":{\"type\":\"Latest\"}},\"status\":{\"status\":{\"startTime\":\"2021-07-15T10:08:59Z\",\"completedTime\":\"2021-10-21T22:30:59Z\",\"state\":\"Stopped\"},\"stages\":[{\"status\":{},\"name\":\"x\",\"groups\":[{},{},{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"oduhp\",\"groups\":[{},{},{},{}],\"afterStageWaitStatus\":{}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{}]}}},\"eTag\":\"eqnajxqugjhkycu\",\"id\":\"ddg\",\"name\":\"sofwqmzqalkrmnji\",\"type\":\"pxacqqudfn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerServiceFleetManager manager = ContainerServiceFleetManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        UpdateRun response
            = manager.updateRuns().stop("sphyoulpjrvxa", "l", "vimjwos", "tx", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fcktqumiekke", response.updateStrategyId());
        Assertions.assertEquals("khly", response.strategy().stages().get(0).name());
        Assertions.assertEquals("dgqggebdu", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(1652546958, response.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions.assertEquals(ManagedClusterUpgradeType.FULL, response.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("jmoadsuv", response.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions.assertEquals(NodeImageSelectionType.LATEST,
            response.managedClusterUpdate().nodeImageSelection().type());
    }
}
