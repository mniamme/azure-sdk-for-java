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
import com.azure.resourcemanager.appcontainers.models.BuilderResource;
import com.azure.resourcemanager.appcontainers.models.ContainerRegistry;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.appcontainers.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BuildersCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"environmentId\":\"jti\",\"containerRegistries\":[{\"containerRegistryServer\":\"zqgxx\",\"identityResourceId\":\"fbbmtlp\"},{\"containerRegistryServer\":\"agynoi\",\"identityResourceId\":\"rnzcalinc\"},{\"containerRegistryServer\":\"yqxzxaqzibmqim\",\"identityResourceId\":\"ymqruqguhfupet\"},{\"containerRegistryServer\":\"svvoqsbpkflanfk\",\"identityResourceId\":\"xsyaowuzowpuoh\"}]},\"identity\":{\"principalId\":\"f1ad45e1-b4d5-4c90-95ae-d80a039ad8c9\",\"tenantId\":\"e8394795-d16e-4ef3-bc76-b25f82f2fb6e\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"rztiochlutixmqr\":{\"principalId\":\"93e35cfa-e054-4fa9-ba42-33cd367fd0a8\",\"clientId\":\"a5f7173c-253a-489c-af05-1e030dc11c04\"},\"izcbfzmcrunfhiuc\":{\"principalId\":\"9789ce82-9526-45b6-b4b8-3cb6c7e601bd\",\"clientId\":\"c791ce71-c592-4f3a-b8bd-203c431e4985\"}}},\"location\":\"fbcpaqktkrumzu\",\"tags\":{\"uxqggvqrnhyhl\":\"yzbfvxovqkx\",\"rkijpeuqlsdxeqz\":\"cjsqggjhffbxr\",\"en\":\"vxwmwwmjs\",\"ecleqioulndhzyo\":\"wwa\"},\"id\":\"ojhtollhs\",\"name\":\"idmytzln\",\"type\":\"lxpnovyoanf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BuilderResource response = manager.builders()
            .define("wnsnlaimouxwks")
            .withRegion("xvjabjq")
            .withExistingResourceGroup("imwbzxpdcldpk")
            .withTags(mapOf("ndoabhjxwxqweuip", "uyvymcnu", "sqxtltclkrdpq", "pvksmit"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("osrnawnvzmlnkoy", new UserAssignedIdentity())))
            .withEnvironmentId("mfcoibic")
            .withContainerRegistries(Arrays.asList(
                new ContainerRegistry().withContainerRegistryServer("swswjrkbq").withIdentityResourceId("jhbtqq"),
                new ContainerRegistry().withContainerRegistryServer("yfscyrfwbivqvo").withIdentityResourceId("fuy"),
                new ContainerRegistry().withContainerRegistryServer("wvbhlimbyq").withIdentityResourceId("crood"),
                new ContainerRegistry().withContainerRegistryServer("ikcdrdaasax").withIdentityResourceId("obsmf")))
            .create();

        Assertions.assertEquals("fbcpaqktkrumzu", response.location());
        Assertions.assertEquals("yzbfvxovqkx", response.tags().get("uxqggvqrnhyhl"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("jti", response.environmentId());
        Assertions.assertEquals("zqgxx", response.containerRegistries().get(0).containerRegistryServer());
        Assertions.assertEquals("fbbmtlp", response.containerRegistries().get(0).identityResourceId());
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
