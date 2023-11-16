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
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PartnerDestinationsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"3cf6e9d2-3410-4139-be48-85e3c369b1bf\",\"endpointServiceContext\":\"dkluwzxeygzvt\",\"expirationTimeIfNotActivatedUtc\":\"2021-06-29T02:44:14Z\",\"provisioningState\":\"Updating\",\"activationState\":\"NeverActivated\",\"endpointBaseUrl\":\"obguqisqsqk\",\"messageForActivation\":\"mioyjpn\"},\"location\":\"viqcpszp\",\"tags\":{\"vqojbxaotcgbz\":\"qdvrdmvxyrxdh\",\"oioyidoxznvgvd\":\"mbtple\",\"awsxmrszbknimxlp\":\"muuv\",\"mnb\":\"erxrzutylcurza\"},\"id\":\"qaeht\",\"name\":\"bjmbnvynfaooeac\",\"type\":\"edcgl\"}";

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

        PartnerDestination response = manager.partnerDestinations()
            .getByResourceGroupWithResponse("cjfwblqhxk", "smcolmugpy", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("viqcpszp", response.location());
        Assertions.assertEquals("qdvrdmvxyrxdh", response.tags().get("vqojbxaotcgbz"));
        Assertions.assertEquals(UUID.fromString("3cf6e9d2-3410-4139-be48-85e3c369b1bf"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("dkluwzxeygzvt", response.endpointServiceContext());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-29T02:44:14Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerDestinationActivationState.NEVER_ACTIVATED, response.activationState());
        Assertions.assertEquals("obguqisqsqk", response.endpointBaseUrl());
        Assertions.assertEquals("mioyjpn", response.messageForActivation());
    }
}
