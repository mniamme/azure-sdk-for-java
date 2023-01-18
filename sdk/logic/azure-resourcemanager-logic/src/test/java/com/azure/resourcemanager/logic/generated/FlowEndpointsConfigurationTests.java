// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.FlowEndpoints;
import com.azure.resourcemanager.logic.models.FlowEndpointsConfiguration;
import com.azure.resourcemanager.logic.models.IpAddress;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FlowEndpointsConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlowEndpointsConfiguration model =
            BinaryData
                .fromString(
                    "{\"workflow\":{\"outgoingIpAddresses\":[{\"address\":\"mutduqktaps\"},{\"address\":\"gcue\"}],\"accessEndpointIpAddresses\":[{\"address\":\"kdosvqw\"},{\"address\":\"mdgbbjfdd\"},{\"address\":\"bmbexppbhtqqro\"},{\"address\":\"p\"}]},\"connector\":{\"outgoingIpAddresses\":[{\"address\":\"gbquxigj\"},{\"address\":\"gzjaoyfhrtxilne\"},{\"address\":\"ujysvle\"},{\"address\":\"vfqawrlyxwjkcpr\"}],\"accessEndpointIpAddresses\":[{\"address\":\"xgjvtbv\"},{\"address\":\"sszdnru\"}]}}")
                .toObject(FlowEndpointsConfiguration.class);
        Assertions.assertEquals("mutduqktaps", model.workflow().outgoingIpAddresses().get(0).address());
        Assertions.assertEquals("kdosvqw", model.workflow().accessEndpointIpAddresses().get(0).address());
        Assertions.assertEquals("gbquxigj", model.connector().outgoingIpAddresses().get(0).address());
        Assertions.assertEquals("xgjvtbv", model.connector().accessEndpointIpAddresses().get(0).address());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlowEndpointsConfiguration model =
            new FlowEndpointsConfiguration()
                .withWorkflow(
                    new FlowEndpoints()
                        .withOutgoingIpAddresses(
                            Arrays
                                .asList(
                                    new IpAddress().withAddress("mutduqktaps"), new IpAddress().withAddress("gcue")))
                        .withAccessEndpointIpAddresses(
                            Arrays
                                .asList(
                                    new IpAddress().withAddress("kdosvqw"),
                                    new IpAddress().withAddress("mdgbbjfdd"),
                                    new IpAddress().withAddress("bmbexppbhtqqro"),
                                    new IpAddress().withAddress("p"))))
                .withConnector(
                    new FlowEndpoints()
                        .withOutgoingIpAddresses(
                            Arrays
                                .asList(
                                    new IpAddress().withAddress("gbquxigj"),
                                    new IpAddress().withAddress("gzjaoyfhrtxilne"),
                                    new IpAddress().withAddress("ujysvle"),
                                    new IpAddress().withAddress("vfqawrlyxwjkcpr")))
                        .withAccessEndpointIpAddresses(
                            Arrays
                                .asList(
                                    new IpAddress().withAddress("xgjvtbv"), new IpAddress().withAddress("sszdnru"))));
        model = BinaryData.fromObject(model).toObject(FlowEndpointsConfiguration.class);
        Assertions.assertEquals("mutduqktaps", model.workflow().outgoingIpAddresses().get(0).address());
        Assertions.assertEquals("kdosvqw", model.workflow().accessEndpointIpAddresses().get(0).address());
        Assertions.assertEquals("gbquxigj", model.connector().outgoingIpAddresses().get(0).address());
        Assertions.assertEquals("xgjvtbv", model.connector().accessEndpointIpAddresses().get(0).address());
    }
}