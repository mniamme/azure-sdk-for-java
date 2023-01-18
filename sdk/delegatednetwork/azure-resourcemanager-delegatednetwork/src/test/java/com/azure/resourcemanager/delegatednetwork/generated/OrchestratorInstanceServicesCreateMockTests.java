// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager;
import com.azure.resourcemanager.delegatednetwork.models.ControllerDetails;
import com.azure.resourcemanager.delegatednetwork.models.Orchestrator;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorIdentity;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorKind;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorResourceProperties;
import com.azure.resourcemanager.delegatednetwork.models.ResourceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OrchestratorInstanceServicesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"resourceGuid\":\"zvlvqhjkbegib\",\"provisioningState\":\"Succeeded\",\"orchestratorAppId\":\"iebwwaloayqcgwrt\",\"orchestratorTenantId\":\"uzgwyzmhtx\",\"clusterRootCA\":\"gmtsavjcbpwxqpsr\",\"apiServerEndpoint\":\"ftguv\",\"privateLinkResourceId\":\"uhprwmdyvxqt\",\"controllerDetails\":{\"id\":\"riwwroy\"}},\"kind\":\"Kubernetes\",\"identity\":{\"principalId\":\"rmcqiby\",\"tenantId\":\"ojvknmefqsgzvaha\",\"type\":\"SystemAssigned\"},\"location\":\"zhpvgqzcjrvxd\",\"tags\":{\"ug\":\"mwlxk\",\"nnprn\":\"hzovawjvzunlut\",\"eilpjzuaejxdu\":\"i\",\"pwo\":\"tskzbbtdzumveek\"},\"id\":\"uh\",\"name\":\"fpbsjyofdxl\",\"type\":\"us\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DelegatedNetworkManager manager =
            DelegatedNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Orchestrator response =
            manager
                .orchestratorInstanceServices()
                .define("xcug")
                .withRegion("veual")
                .withExistingResourceGroup("hashsfwxosow")
                .withKind(OrchestratorKind.KUBERNETES)
                .withTags(mapOf("xobbcswsrt", "mkh"))
                .withIdentity(new OrchestratorIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                .withProperties(
                    new OrchestratorResourceProperties()
                        .withOrchestratorAppId("ovbvmeueciv")
                        .withOrchestratorTenantId("zceuojgjrw")
                        .withClusterRootCA("eiotwmcdytdx")
                        .withApiServerEndpoint("txnrjaw")
                        .withPrivateLinkResourceId("wgxhn")
                        .withControllerDetails(new ControllerDetails().withId("kxfbkpycgklwndn")))
                .create();

        Assertions.assertEquals("zhpvgqzcjrvxd", response.location());
        Assertions.assertEquals("mwlxk", response.tags().get("ug"));
        Assertions.assertEquals(OrchestratorKind.KUBERNETES, response.kind());
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("iebwwaloayqcgwrt", response.properties().orchestratorAppId());
        Assertions.assertEquals("uzgwyzmhtx", response.properties().orchestratorTenantId());
        Assertions.assertEquals("gmtsavjcbpwxqpsr", response.properties().clusterRootCA());
        Assertions.assertEquals("ftguv", response.properties().apiServerEndpoint());
        Assertions.assertEquals("uhprwmdyvxqt", response.properties().privateLinkResourceId());
        Assertions.assertEquals("riwwroy", response.properties().controllerDetails().id());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}