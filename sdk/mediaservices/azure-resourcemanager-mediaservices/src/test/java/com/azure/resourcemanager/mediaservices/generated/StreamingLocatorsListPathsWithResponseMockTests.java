// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.EncryptionScheme;
import com.azure.resourcemanager.mediaservices.models.ListPathsResponse;
import com.azure.resourcemanager.mediaservices.models.StreamingPolicyStreamingProtocol;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StreamingLocatorsListPathsWithResponseMockTests {
    @Test
    public void testListPathsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"streamingPaths\":[{\"streamingProtocol\":\"Dash\",\"encryptionScheme\":\"NoEncryption\",\"paths\":[\"cb\"]},{\"streamingProtocol\":\"Hls\",\"encryptionScheme\":\"NoEncryption\",\"paths\":[\"uwc\",\"b\",\"egstmninwjizci\",\"nghgshej\"]}],\"downloadPaths\":[\"xqmul\",\"xlxqzvn\"]}";

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

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ListPathsResponse response =
            manager
                .streamingLocators()
                .listPathsWithResponse("xokffqyin", "jqepqwhi", "monstshiyxgve", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions
            .assertEquals(StreamingPolicyStreamingProtocol.DASH, response.streamingPaths().get(0).streamingProtocol());
        Assertions.assertEquals(EncryptionScheme.NO_ENCRYPTION, response.streamingPaths().get(0).encryptionScheme());
        Assertions.assertEquals("cb", response.streamingPaths().get(0).paths().get(0));
        Assertions.assertEquals("xqmul", response.downloadPaths().get(0));
    }
}