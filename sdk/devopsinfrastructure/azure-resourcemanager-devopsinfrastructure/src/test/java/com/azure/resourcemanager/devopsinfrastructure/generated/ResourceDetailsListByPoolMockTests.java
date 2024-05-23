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
import com.azure.resourcemanager.devopsinfrastructure.models.ResourceDetailsObject;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourceStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceDetailsListByPoolMockTests {
    @Test
    public void testListByPool() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"status\":\"Ready\",\"image\":\"qztpp\",\"imageVersion\":\"iolxor\"},\"id\":\"lt\",\"name\":\"lmncw\",\"type\":\"obqwcsdbnwdcfh\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevOpsInfrastructureManager manager = DevOpsInfrastructureManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ResourceDetailsObject> response
            = manager.resourceDetails().listByPool("fz", "whxxbuyqax", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(ResourceStatus.READY, response.iterator().next().properties().status());
        Assertions.assertEquals("qztpp", response.iterator().next().properties().image());
        Assertions.assertEquals("iolxor", response.iterator().next().properties().imageVersion());
    }
}
