// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.DataSource;
import com.azure.resourcemanager.security.models.ExportData;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionModel;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IotSecuritySolutionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"location\":\"ljuxl\",\"properties\":{\"workspace\":\"ctvtf\",\"displayName\":\"mskdch\",\"status\":\"Disabled\",\"export\":[\"RawEvents\",\"RawEvents\",\"RawEvents\",\"RawEvents\"],\"disabledDataSources\":[\"TwinData\",\"TwinData\"],\"iotHubs\":[\"falkzazm\",\"oke\",\"gjqafkmkrokzr\"],\"userDefinedResources\":{\"query\":\"qetwpqrtvaozn\",\"querySubscriptions\":[]},\"autoDiscoveredResources\":[\"xiezeagmceit\",\"ugedh\"],\"recommendationsConfiguration\":[],\"unmaskedIpLoggingStatus\":\"Disabled\",\"additionalWorkspaces\":[]},\"tags\":{\"fsyrledjc\":\"syjdeolctae\"},\"id\":\"stbvtqig\",\"name\":\"xzvsgeafgf\",\"type\":\"sehxlzsxezp\"}]}";

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

        SecurityManager manager =
            SecurityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<IoTSecuritySolutionModel> response =
            manager.iotSecuritySolutions().list("wakwseivmakxhys", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ljuxl", response.iterator().next().location());
        Assertions.assertEquals("syjdeolctae", response.iterator().next().tags().get("fsyrledjc"));
        Assertions.assertEquals("ctvtf", response.iterator().next().workspace());
        Assertions.assertEquals("mskdch", response.iterator().next().displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, response.iterator().next().status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, response.iterator().next().export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, response.iterator().next().disabledDataSources().get(0));
        Assertions.assertEquals("falkzazm", response.iterator().next().iotHubs().get(0));
        Assertions.assertEquals("qetwpqrtvaozn", response.iterator().next().userDefinedResources().query());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.DISABLED, response.iterator().next().unmaskedIpLoggingStatus());
    }
}
