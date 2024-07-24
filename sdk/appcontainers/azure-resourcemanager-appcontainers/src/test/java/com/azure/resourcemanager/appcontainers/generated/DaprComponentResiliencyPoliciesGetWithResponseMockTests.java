// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DaprComponentResiliencyPoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"inboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":278888971,\"retryBackOff\":{\"initialDelayInMilliseconds\":863933371,\"maxIntervalInMilliseconds\":1250001831}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":2107938838},\"circuitBreakerPolicy\":{\"consecutiveErrors\":1871826900,\"timeoutInSeconds\":1564471865,\"intervalInSeconds\":865409397}},\"outboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1472492637,\"retryBackOff\":{\"initialDelayInMilliseconds\":1283817854,\"maxIntervalInMilliseconds\":2094474212}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":409618096},\"circuitBreakerPolicy\":{\"consecutiveErrors\":193703110,\"timeoutInSeconds\":1105186931,\"intervalInSeconds\":1968692964}}},\"id\":\"nqhlbs\",\"name\":\"osnqliwkmzojfe\",\"type\":\"yalhtgm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DaprComponentResiliencyPolicy response = manager.daprComponentResiliencyPolicies()
            .getWithResponse("d", "gxwjwil", "qrslaate", "twujjzgx", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(278888971, response.inboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(863933371,
            response.inboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(1250001831,
            response.inboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(2107938838, response.inboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(1871826900, response.inboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1564471865, response.inboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(865409397, response.inboundPolicy().circuitBreakerPolicy().intervalInSeconds());
        Assertions.assertEquals(1472492637, response.outboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(1283817854,
            response.outboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(2094474212,
            response.outboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(409618096, response.outboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(193703110, response.outboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1105186931, response.outboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(1968692964, response.outboundPolicy().circuitBreakerPolicy().intervalInSeconds());
    }
}
