// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.fluent.models.OperationInner;
import com.azure.resourcemanager.databoxedge.models.OperationDisplay;
import com.azure.resourcemanager.databoxedge.models.OperationsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"hq\",\"display\":{\"provider\":\"jxpybczmeh\",\"resource\":\"zopbsphrupidgs\",\"operation\":\"bejhphoycmsxa\",\"description\":\"hdxbmtqio\"},\"origin\":\"zehtbmu\",\"properties\":{}},{\"name\":\"noi\",\"display\":{\"provider\":\"lrxybqsoq\",\"resource\":\"gkdmb\",\"operation\":\"zlobcufpd\",\"description\":\"rbt\"},\"origin\":\"qjnqglhqgnufoooj\",\"properties\":{}},{\"name\":\"sqe\",\"display\":{\"provider\":\"gdf\",\"resource\":\"lzl\",\"operation\":\"xrifkwmrvkts\",\"description\":\"nt\"},\"origin\":\"ipa\",\"properties\":{}}],\"nextLink\":\"psqucmpoyf\"}")
                .toObject(OperationsList.class);
        Assertions.assertEquals("hq", model.value().get(0).name());
        Assertions.assertEquals("jxpybczmeh", model.value().get(0).display().provider());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().resource());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().operation());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().description());
        Assertions.assertEquals("zehtbmu", model.value().get(0).origin());
        Assertions.assertEquals("psqucmpoyf", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsList model =
            new OperationsList()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner()
                                .withName("hq")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("jxpybczmeh")
                                        .withResource("zopbsphrupidgs")
                                        .withOperation("bejhphoycmsxa")
                                        .withDescription("hdxbmtqio"))
                                .withOrigin("zehtbmu"),
                            new OperationInner()
                                .withName("noi")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("lrxybqsoq")
                                        .withResource("gkdmb")
                                        .withOperation("zlobcufpd")
                                        .withDescription("rbt"))
                                .withOrigin("qjnqglhqgnufoooj"),
                            new OperationInner()
                                .withName("sqe")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("gdf")
                                        .withResource("lzl")
                                        .withOperation("xrifkwmrvkts")
                                        .withDescription("nt"))
                                .withOrigin("ipa")))
                .withNextLink("psqucmpoyf");
        model = BinaryData.fromObject(model).toObject(OperationsList.class);
        Assertions.assertEquals("hq", model.value().get(0).name());
        Assertions.assertEquals("jxpybczmeh", model.value().get(0).display().provider());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().resource());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().operation());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().description());
        Assertions.assertEquals("zehtbmu", model.value().get(0).origin());
        Assertions.assertEquals("psqucmpoyf", model.nextLink());
    }
}