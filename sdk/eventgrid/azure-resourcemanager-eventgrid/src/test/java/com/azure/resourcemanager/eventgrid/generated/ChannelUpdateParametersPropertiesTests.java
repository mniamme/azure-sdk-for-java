// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.ChannelUpdateParametersProperties;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerUpdateDestinationInfo;
import com.azure.resourcemanager.eventgrid.models.PartnerUpdateTopicInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChannelUpdateParametersPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChannelUpdateParametersProperties model = BinaryData.fromString(
            "{\"expirationTimeIfNotActivatedUtc\":\"2021-11-08T18:58:31Z\",\"partnerDestinationInfo\":{\"endpointType\":\"PartnerUpdateDestinationInfo\"},\"partnerTopicInfo\":{\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"zga\":{\"description\":\"muouqfp\",\"displayName\":\"zw\",\"documentationUrl\":\"g\",\"dataSchemaUrl\":\"tnwu\"},\"i\":{\"description\":\"ufizuckyf\",\"displayName\":\"rfidfvzwdz\",\"documentationUrl\":\"tymw\",\"dataSchemaUrl\":\"dkfthwxmnt\"},\"cs\":{\"description\":\"opvkmijcm\",\"displayName\":\"dcuf\",\"documentationUrl\":\"srp\",\"dataSchemaUrl\":\"zidnsezcxtbzsgfy\"},\"dqxhcrmnohjtckwh\":{\"description\":\"wmdwzjeiachboo\",\"displayName\":\"lnrosfqp\",\"documentationUrl\":\"ehzzvypyqrim\",\"dataSchemaUrl\":\"npvswjdkirso\"}}}}}")
            .toObject(ChannelUpdateParametersProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-08T18:58:31Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("muouqfp",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").description());
        Assertions.assertEquals("zw",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").displayName());
        Assertions.assertEquals("g",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").documentationUrl());
        Assertions.assertEquals("tnwu",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").dataSchemaUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChannelUpdateParametersProperties model = new ChannelUpdateParametersProperties()
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-11-08T18:58:31Z"))
            .withPartnerDestinationInfo(new PartnerUpdateDestinationInfo()).withPartnerTopicInfo(
                new PartnerUpdateTopicInfo().withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                    .withInlineEventTypes(mapOf("zga",
                        new InlineEventProperties().withDescription("muouqfp").withDisplayName("zw")
                            .withDocumentationUrl("g").withDataSchemaUrl("tnwu"),
                        "i",
                        new InlineEventProperties().withDescription("ufizuckyf").withDisplayName("rfidfvzwdz")
                            .withDocumentationUrl("tymw").withDataSchemaUrl("dkfthwxmnt"),
                        "cs",
                        new InlineEventProperties().withDescription("opvkmijcm").withDisplayName("dcuf")
                            .withDocumentationUrl("srp").withDataSchemaUrl("zidnsezcxtbzsgfy"),
                        "dqxhcrmnohjtckwh",
                        new InlineEventProperties().withDescription("wmdwzjeiachboo").withDisplayName("lnrosfqp")
                            .withDocumentationUrl("ehzzvypyqrim").withDataSchemaUrl("npvswjdkirso")))));
        model = BinaryData.fromObject(model).toObject(ChannelUpdateParametersProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-08T18:58:31Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("muouqfp",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").description());
        Assertions.assertEquals("zw",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").displayName());
        Assertions.assertEquals("g",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").documentationUrl());
        Assertions.assertEquals("tnwu",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("zga").dataSchemaUrl());
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
