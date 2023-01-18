// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.PeeringInner;
import com.azure.resourcemanager.peering.models.Family;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.PeeringListResult;
import com.azure.resourcemanager.peering.models.PeeringSku;
import com.azure.resourcemanager.peering.models.Size;
import com.azure.resourcemanager.peering.models.Tier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PeeringListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"sku\":{\"name\":\"cbjy\",\"tier\":\"Basic\",\"family\":\"Direct\",\"size\":\"Metered\"},\"kind\":\"Exchange\",\"properties\":{\"peeringLocation\":\"fpikxwczb\",\"provisioningState\":\"Failed\"},\"location\":\"npqxuh\",\"tags\":{\"rtfw\":\"qniwbybrkxvdumj\"},\"id\":\"ukxgaud\",\"name\":\"cs\",\"type\":\"h\"},{\"sku\":{\"name\":\"cnyejhkryhtnapcz\",\"tier\":\"Basic\",\"family\":\"Direct\",\"size\":\"Metered\"},\"kind\":\"Direct\",\"properties\":{\"peeringLocation\":\"ipjoxzjnchgejs\",\"provisioningState\":\"Failed\"},\"location\":\"mailzydehojw\",\"tags\":{\"ixjsprozvcputeg\":\"uxinpmqnjaq\",\"atscmd\":\"vwmf\",\"zkrwfn\":\"pjhulsuuvmkj\"},\"id\":\"iodjp\",\"name\":\"lwejdpv\",\"type\":\"ryo\"}],\"nextLink\":\"soacctazakl\"}")
                .toObject(PeeringListResult.class);
        Assertions.assertEquals("cbjy", model.value().get(0).sku().name());
        Assertions.assertEquals(Tier.BASIC, model.value().get(0).sku().tier());
        Assertions.assertEquals(Family.DIRECT, model.value().get(0).sku().family());
        Assertions.assertEquals(Size.METERED, model.value().get(0).sku().size());
        Assertions.assertEquals(Kind.EXCHANGE, model.value().get(0).kind());
        Assertions.assertEquals("npqxuh", model.value().get(0).location());
        Assertions.assertEquals("qniwbybrkxvdumj", model.value().get(0).tags().get("rtfw"));
        Assertions.assertEquals("fpikxwczb", model.value().get(0).peeringLocation());
        Assertions.assertEquals("soacctazakl", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringListResult model =
            new PeeringListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PeeringInner()
                                .withSku(
                                    new PeeringSku()
                                        .withName("cbjy")
                                        .withTier(Tier.BASIC)
                                        .withFamily(Family.DIRECT)
                                        .withSize(Size.METERED))
                                .withKind(Kind.EXCHANGE)
                                .withLocation("npqxuh")
                                .withTags(mapOf("rtfw", "qniwbybrkxvdumj"))
                                .withPeeringLocation("fpikxwczb"),
                            new PeeringInner()
                                .withSku(
                                    new PeeringSku()
                                        .withName("cnyejhkryhtnapcz")
                                        .withTier(Tier.BASIC)
                                        .withFamily(Family.DIRECT)
                                        .withSize(Size.METERED))
                                .withKind(Kind.DIRECT)
                                .withLocation("mailzydehojw")
                                .withTags(
                                    mapOf("ixjsprozvcputeg", "uxinpmqnjaq", "atscmd", "vwmf", "zkrwfn", "pjhulsuuvmkj"))
                                .withPeeringLocation("ipjoxzjnchgejs")))
                .withNextLink("soacctazakl");
        model = BinaryData.fromObject(model).toObject(PeeringListResult.class);
        Assertions.assertEquals("cbjy", model.value().get(0).sku().name());
        Assertions.assertEquals(Tier.BASIC, model.value().get(0).sku().tier());
        Assertions.assertEquals(Family.DIRECT, model.value().get(0).sku().family());
        Assertions.assertEquals(Size.METERED, model.value().get(0).sku().size());
        Assertions.assertEquals(Kind.EXCHANGE, model.value().get(0).kind());
        Assertions.assertEquals("npqxuh", model.value().get(0).location());
        Assertions.assertEquals("qniwbybrkxvdumj", model.value().get(0).tags().get("rtfw"));
        Assertions.assertEquals("fpikxwczb", model.value().get(0).peeringLocation());
        Assertions.assertEquals("soacctazakl", model.nextLink());
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