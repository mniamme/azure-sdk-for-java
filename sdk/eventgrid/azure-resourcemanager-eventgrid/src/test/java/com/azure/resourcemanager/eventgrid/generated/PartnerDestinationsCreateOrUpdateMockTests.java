// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.PartnerDestination;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationActivationState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PartnerDestinationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"9f6948ba-f2c5-40ef-ad04-aefd6a2e2ac4\",\"endpointServiceContext\":\"hzrtd\",\"expirationTimeIfNotActivatedUtc\":\"2021-09-01T09:28:44Z\",\"provisioningState\":\"Succeeded\",\"activationState\":\"NeverActivated\",\"endpointBaseUrl\":\"fvppkeqsifj\",\"messageForActivation\":\"lng\"},\"location\":\"nhr\",\"tags\":{\"ggorwjoqt\":\"bcdtajdo\",\"fyrlmwkptskwxj\":\"otpvclp\",\"bputmgvmuyakml\":\"vhxccbmkakmkoo\",\"flzqjimejtgzjxx\":\"ktfowzkroyrdur\"},\"id\":\"fejlzuqloiw\",\"name\":\"ayyzivrmitc\",\"type\":\"qlhchwhrktjle\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        EventGridManager manager = EventGridManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PartnerDestination response = manager.partnerDestinations().define("bgmusaictd").withRegion("me")
            .withExistingResourceGroup("uymvecvzts").withTags(mapOf("s", "abcreuwz"))
            .withPartnerRegistrationImmutableId(UUID.fromString("423faf33-810b-42a7-9e8d-b19133fc967b"))
            .withEndpointServiceContext("zzohn")
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-04-25T16:30:59Z"))
            .withActivationState(PartnerDestinationActivationState.ACTIVATED).withEndpointBaseUrl("ozrehlbzqixbnjrq")
            .withMessageForActivation("yuexozonyn").create();

        Assertions.assertEquals("nhr", response.location());
        Assertions.assertEquals("bcdtajdo", response.tags().get("ggorwjoqt"));
        Assertions.assertEquals(UUID.fromString("9f6948ba-f2c5-40ef-ad04-aefd6a2e2ac4"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("hzrtd", response.endpointServiceContext());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-01T09:28:44Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerDestinationActivationState.NEVER_ACTIVATED, response.activationState());
        Assertions.assertEquals("fvppkeqsifj", response.endpointBaseUrl());
        Assertions.assertEquals("lng", response.messageForActivation());
    }

    // Use "Map.of" if available
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
