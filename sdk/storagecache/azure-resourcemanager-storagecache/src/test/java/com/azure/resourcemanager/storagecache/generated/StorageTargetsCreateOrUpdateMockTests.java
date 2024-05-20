// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.storagecache.StorageCacheManager;
import com.azure.resourcemanager.storagecache.models.BlobNfsTarget;
import com.azure.resourcemanager.storagecache.models.ClfsTarget;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import com.azure.resourcemanager.storagecache.models.Nfs3Target;
import com.azure.resourcemanager.storagecache.models.OperationalStateType;
import com.azure.resourcemanager.storagecache.models.StorageTarget;
import com.azure.resourcemanager.storagecache.models.StorageTargetType;
import com.azure.resourcemanager.storagecache.models.UnknownTarget;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StorageTargetsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"junctions\":[{\"namespacePath\":\"fzzhmkdasv\",\"targetPath\":\"yhbxcudchxgs\",\"nfsExport\":\"oldforobw\",\"nfsAccessPolicy\":\"vizbfhfo\"},{\"namespacePath\":\"acqpbtuodxesza\",\"targetPath\":\"elawumu\",\"nfsExport\":\"lzkwrrwoy\",\"nfsAccessPolicy\":\"ucwyhahno\"}],\"targetType\":\"unknown\",\"provisioningState\":\"Succeeded\",\"state\":\"Suspended\",\"nfs3\":{\"target\":\"psvfuurutlwexxwl\",\"usageModel\":\"niexzsrzpgepq\",\"verificationTimer\":417783908,\"writeBackTimer\":2090759507},\"clfs\":{\"target\":\"gdakchz\"},\"unknown\":{\"attributes\":{\"ibn\":\"xqnrkcxk\",\"swqrntvlwijp\":\"mysu\",\"uncuw\":\"ttexoqqpwcyyufmh\",\"unqndyfpchrqb\":\"qspkcdqzhlctd\"}},\"blobNfs\":{\"target\":\"rcgegydcwboxjum\",\"usageModel\":\"qoli\",\"verificationTimer\":960198730,\"writeBackTimer\":153099260},\"allocationPercentage\":1564106365},\"location\":\"ubrjtl\",\"id\":\"xfuojrn\",\"name\":\"iflrzpasccbiu\",\"type\":\"mzdlyjdfqwmkyo\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StorageCacheManager manager = StorageCacheManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        StorageTarget response = manager.storageTargets()
            .define("mwmdxmebwjscjpa")
            .withExistingCache("thwtzol", "a")
            .withJunctions(Arrays.asList(
                new NamespaceJunction().withNamespacePath("a")
                    .withTargetPath("qxnmwmqt")
                    .withNfsExport("xyi")
                    .withNfsAccessPolicy("dt"),
                new NamespaceJunction().withNamespacePath("cttadi")
                    .withTargetPath("eukmr")
                    .withNfsExport("eekpndz")
                    .withNfsAccessPolicy("pmudqmeqwig"),
                new NamespaceJunction().withNamespacePath("bu")
                    .withTargetPath("wyxebeybpmzz")
                    .withNfsExport("tffyaqit")
                    .withNfsAccessPolicy("heioqa"),
                new NamespaceJunction().withNamespacePath("v")
                    .withTargetPath("ufuqyrx")
                    .withNfsExport("lcgqlsismj")
                    .withNfsAccessPolicy("rddga")))
            .withTargetType(StorageTargetType.BLOB_NFS)
            .withState(OperationalStateType.READY)
            .withNfs3(new Nfs3Target().withTarget("sjuivfcdisyir")
                .withUsageModel("zhczexrxzbujrtrh")
                .withVerificationTimer(1247179302)
                .withWriteBackTimer(934568942))
            .withClfs(new ClfsTarget().withTarget("h"))
            .withUnknown(new UnknownTarget().withAttributes(mapOf("jtszcof", "zonzlrpiqywnc", "k", "zehtdhgb")))
            .withBlobNfs(new BlobNfsTarget().withTarget("ljeamu")
                .withUsageModel("zmlovuanash")
                .withVerificationTimer(1712193542)
                .withWriteBackTimer(1846794278))
            .create();

        Assertions.assertEquals("fzzhmkdasv", response.junctions().get(0).namespacePath());
        Assertions.assertEquals("yhbxcudchxgs", response.junctions().get(0).targetPath());
        Assertions.assertEquals("oldforobw", response.junctions().get(0).nfsExport());
        Assertions.assertEquals("vizbfhfo", response.junctions().get(0).nfsAccessPolicy());
        Assertions.assertEquals(StorageTargetType.UNKNOWN, response.targetType());
        Assertions.assertEquals(OperationalStateType.SUSPENDED, response.state());
        Assertions.assertEquals("psvfuurutlwexxwl", response.nfs3().target());
        Assertions.assertEquals("niexzsrzpgepq", response.nfs3().usageModel());
        Assertions.assertEquals(417783908, response.nfs3().verificationTimer());
        Assertions.assertEquals(2090759507, response.nfs3().writeBackTimer());
        Assertions.assertEquals("gdakchz", response.clfs().target());
        Assertions.assertEquals("xqnrkcxk", response.unknown().attributes().get("ibn"));
        Assertions.assertEquals("rcgegydcwboxjum", response.blobNfs().target());
        Assertions.assertEquals("qoli", response.blobNfs().usageModel());
        Assertions.assertEquals(960198730, response.blobNfs().verificationTimer());
        Assertions.assertEquals(153099260, response.blobNfs().writeBackTimer());
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
