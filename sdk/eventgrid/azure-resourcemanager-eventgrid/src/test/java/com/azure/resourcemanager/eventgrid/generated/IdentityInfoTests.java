// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IdentityInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IdentityInfo model = BinaryData.fromString(
            "{\"type\":\"UserAssigned\",\"principalId\":\"vriuhprwmdyvx\",\"tenantId\":\"ayriwwroyqbexrm\",\"userAssignedIdentities\":{\"pjyzhpv\":{\"principalId\":\"ycnojvknmefqsg\",\"clientId\":\"ah\"},\"hzovawjvzunlut\":{\"principalId\":\"zcjrvxdjzlmwlx\",\"clientId\":\"ug\"}}}")
            .toObject(IdentityInfo.class);
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("vriuhprwmdyvx", model.principalId());
        Assertions.assertEquals("ayriwwroyqbexrm", model.tenantId());
        Assertions.assertEquals("ycnojvknmefqsg", model.userAssignedIdentities().get("pjyzhpv").principalId());
        Assertions.assertEquals("ah", model.userAssignedIdentities().get("pjyzhpv").clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IdentityInfo model = new IdentityInfo().withType(IdentityType.USER_ASSIGNED).withPrincipalId("vriuhprwmdyvx")
            .withTenantId("ayriwwroyqbexrm")
            .withUserAssignedIdentities(mapOf("pjyzhpv",
                new UserIdentityProperties().withPrincipalId("ycnojvknmefqsg").withClientId("ah"), "hzovawjvzunlut",
                new UserIdentityProperties().withPrincipalId("zcjrvxdjzlmwlx").withClientId("ug")));
        model = BinaryData.fromObject(model).toObject(IdentityInfo.class);
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("vriuhprwmdyvx", model.principalId());
        Assertions.assertEquals("ayriwwroyqbexrm", model.tenantId());
        Assertions.assertEquals("ycnojvknmefqsg", model.userAssignedIdentities().get("pjyzhpv").principalId());
        Assertions.assertEquals("ah", model.userAssignedIdentities().get("pjyzhpv").clientId());
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
