// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.AzureResourceSku;
import com.azure.resourcemanager.synapse.models.AzureScaleType;
import com.azure.resourcemanager.synapse.models.SkuName;
import com.azure.resourcemanager.synapse.models.SkuSize;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class KustoPoolsListSkusByResourceMockTests {
    @Test
    public void testListSkusByResource() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"resourceType\":\"dxdyyrudma\",\"sku\":{\"name\":\"Compute"
                + " optimized\",\"capacity\":1725220315,\"size\":\"Small\"},\"capacity\":{\"scaleType\":\"automatic\",\"minimum\":1881904123,\"maximum\":561042330,\"default\":1978635992}}]}";

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

        SynapseManager manager =
            SynapseManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AzureResourceSku> response =
            manager
                .kustoPools()
                .listSkusByResource("crtfodqhuauzm", "iv", "trfzhhezvh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dxdyyrudma", response.iterator().next().resourceType());
        Assertions.assertEquals(SkuName.COMPUTE_OPTIMIZED, response.iterator().next().sku().name());
        Assertions.assertEquals(1725220315, response.iterator().next().sku().capacity());
        Assertions.assertEquals(SkuSize.SMALL, response.iterator().next().sku().size());
        Assertions.assertEquals(AzureScaleType.AUTOMATIC, response.iterator().next().capacity().scaleType());
        Assertions.assertEquals(1881904123, response.iterator().next().capacity().minimum());
        Assertions.assertEquals(561042330, response.iterator().next().capacity().maximum());
        Assertions.assertEquals(1978635992, response.iterator().next().capacity().defaultProperty());
    }
}