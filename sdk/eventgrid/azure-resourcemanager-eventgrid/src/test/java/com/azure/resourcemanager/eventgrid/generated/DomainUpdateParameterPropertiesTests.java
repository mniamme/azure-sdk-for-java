// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainUpdateParameterProperties;
import com.azure.resourcemanager.eventgrid.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DomainUpdateParameterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DomainUpdateParameterProperties model = BinaryData.fromString(
            "{\"publicNetworkAccess\":\"Enabled\",\"inboundIpRules\":[{\"ipMask\":\"ytkblmpew\",\"action\":\"Allow\"},{\"ipMask\":\"krvrns\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.1\",\"disableLocalAuth\":false,\"autoCreateTopicWithFirstSubscription\":true,\"autoDeleteTopicWithLastSubscription\":false,\"dataResidencyBoundary\":\"WithinGeopair\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"znfqqnvwpmqtar\":{\"description\":\"uvwbhsqfs\",\"displayName\":\"cgjbirxbp\",\"documentationUrl\":\"srfbjfdtwss\",\"dataSchemaUrl\":\"ftpvjzbexil\"},\"enq\":{\"description\":\"ujmkcjhwqy\",\"displayName\":\"r\",\"documentationUrl\":\"n\",\"dataSchemaUrl\":\"ewgdrjervn\"},\"qolbgyc\":{\"description\":\"hin\",\"displayName\":\"ygmi\",\"documentationUrl\":\"hnzdndslgnayqi\",\"dataSchemaUrl\":\"nduhavhqlkthum\"}}}}")
            .toObject(DomainUpdateParameterProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals("ytkblmpew", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(true, model.autoCreateTopicWithFirstSubscription());
        Assertions.assertEquals(false, model.autoDeleteTopicWithLastSubscription());
        Assertions.assertEquals(DataResidencyBoundary.WITHIN_GEOPAIR, model.dataResidencyBoundary());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("uvwbhsqfs",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").description());
        Assertions.assertEquals("cgjbirxbp",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").displayName());
        Assertions.assertEquals("srfbjfdtwss",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").documentationUrl());
        Assertions.assertEquals("ftpvjzbexil",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").dataSchemaUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DomainUpdateParameterProperties model = new DomainUpdateParameterProperties()
            .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
            .withInboundIpRules(
                Arrays.asList(new InboundIpRule().withIpMask("ytkblmpew").withAction(IpActionType.ALLOW),
                    new InboundIpRule().withIpMask("krvrns").withAction(IpActionType.ALLOW)))
            .withMinimumTlsVersionAllowed(TlsVersion.ONE_ONE).withDisableLocalAuth(false)
            .withAutoCreateTopicWithFirstSubscription(true).withAutoDeleteTopicWithLastSubscription(false)
            .withDataResidencyBoundary(DataResidencyBoundary.WITHIN_GEOPAIR)
            .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                .withInlineEventTypes(mapOf("znfqqnvwpmqtar", new InlineEventProperties().withDescription("uvwbhsqfs")
                    .withDisplayName("cgjbirxbp").withDocumentationUrl("srfbjfdtwss").withDataSchemaUrl("ftpvjzbexil"),
                    "enq",
                    new InlineEventProperties().withDescription("ujmkcjhwqy").withDisplayName("r")
                        .withDocumentationUrl("n").withDataSchemaUrl("ewgdrjervn"),
                    "qolbgyc", new InlineEventProperties().withDescription("hin").withDisplayName("ygmi")
                        .withDocumentationUrl("hnzdndslgnayqi").withDataSchemaUrl("nduhavhqlkthum"))));
        model = BinaryData.fromObject(model).toObject(DomainUpdateParameterProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals("ytkblmpew", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(true, model.autoCreateTopicWithFirstSubscription());
        Assertions.assertEquals(false, model.autoDeleteTopicWithLastSubscription());
        Assertions.assertEquals(DataResidencyBoundary.WITHIN_GEOPAIR, model.dataResidencyBoundary());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("uvwbhsqfs",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").description());
        Assertions.assertEquals("cgjbirxbp",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").displayName());
        Assertions.assertEquals("srfbjfdtwss",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").documentationUrl());
        Assertions.assertEquals("ftpvjzbexil",
            model.eventTypeInfo().inlineEventTypes().get("znfqqnvwpmqtar").dataSchemaUrl());
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
