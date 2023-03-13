// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager;
import com.azure.resourcemanager.redisenterprise.models.Cluster;
import com.azure.resourcemanager.redisenterprise.models.ClusterPropertiesEncryption;
import com.azure.resourcemanager.redisenterprise.models.ManagedServiceIdentity;
import com.azure.resourcemanager.redisenterprise.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.redisenterprise.models.Sku;
import com.azure.resourcemanager.redisenterprise.models.SkuName;
import com.azure.resourcemanager.redisenterprise.models.TlsVersion;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class RedisEnterprisesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"EnterpriseFlash_F1500\",\"capacity\":946722582},\"zones\":[\"ehhseyvjusrts\",\"hspkdeemao\",\"mx\",\"gkvtmelmqkrhah\"],\"identity\":{\"principalId\":\"b53db8cd-73cc-4a07-9f77-6f6a08af5380\",\"tenantId\":\"e419fddd-8c53-446b-9e1f-d3fba9a9f15d\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"minimumTlsVersion\":\"1.2\",\"encryption\":{},\"hostName\":\"mdua\",\"provisioningState\":\"Succeeded\",\"resourceState\":\"Updating\",\"redisVersion\":\"vfadmws\",\"privateEndpointConnections\":[]},\"location\":\"vxpvgomz\",\"tags\":{\"ali\":\"isgwbnbbeldawkz\",\"hashsfwxosow\":\"urqhaka\"},\"id\":\"xcug\",\"name\":\"cjooxdjebwpucwwf\",\"type\":\"ovbvmeueciv\"}";

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

        RedisEnterpriseManager manager =
            RedisEnterpriseManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Cluster response =
            manager
                .redisEnterprises()
                .define("kphywpnvjto")
                .withRegion("kqujidsuyono")
                .withExistingResourceGroup("nxdhbt")
                .withSku(new Sku().withName(SkuName.ENTERPRISE_E20).withCapacity(963875156))
                .withTags(mapOf("dxyt", "aocqxtccmgy", "txhdzh", "moyrxvwfudwpz", "rxsbkyvp", "rqjbhckfrl"))
                .withZones(Arrays.asList("lfplp"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                        .withUserAssignedIdentities(mapOf()))
                .withMinimumTlsVersion(TlsVersion.ONE_ONE)
                .withEncryption(new ClusterPropertiesEncryption())
                .create();

        Assertions.assertEquals("vxpvgomz", response.location());
        Assertions.assertEquals("isgwbnbbeldawkz", response.tags().get("ali"));
        Assertions.assertEquals(SkuName.ENTERPRISE_FLASH_F1500, response.sku().name());
        Assertions.assertEquals(946722582, response.sku().capacity());
        Assertions.assertEquals("ehhseyvjusrts", response.zones().get(0));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(TlsVersion.ONE_TWO, response.minimumTlsVersion());
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
