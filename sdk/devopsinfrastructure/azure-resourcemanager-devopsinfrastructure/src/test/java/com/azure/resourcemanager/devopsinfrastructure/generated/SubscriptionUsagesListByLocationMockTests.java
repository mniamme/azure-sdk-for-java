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
import com.azure.resourcemanager.devopsinfrastructure.models.Quota;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SubscriptionUsagesListByLocationMockTests {
    @Test
    public void testListByLocation() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"unit\":\"jzrwrdgrtw\",\"currentValue\":1523837111721006893,\"limit\":560219894776191821,\"name\":{\"value\":\"kopbminrf\",\"localizedValue\":\"oyuhhziui\"}},\"id\":\"ozbhdmsmlmzq\",\"name\":\"oftrmaequia\",\"type\":\"xicslfao\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevOpsInfrastructureManager manager = DevOpsInfrastructureManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Quota> response
            = manager.subscriptionUsages().listByLocation("ejdcngqqmoakuf", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jzrwrdgrtw", response.iterator().next().properties().unit());
        Assertions.assertEquals(1523837111721006893L, response.iterator().next().properties().currentValue());
        Assertions.assertEquals(560219894776191821L, response.iterator().next().properties().limit());
        Assertions.assertEquals("kopbminrf", response.iterator().next().properties().name().value());
        Assertions.assertEquals("oyuhhziui", response.iterator().next().properties().name().localizedValue());
    }
}
