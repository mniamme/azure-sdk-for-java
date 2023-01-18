// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.PrePostStep;
import com.azure.resourcemanager.deploymentmanager.models.StepGroup;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StepGroupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StepGroup model =
            BinaryData
                .fromString(
                    "{\"name\":\"dlikwyqkgfgibma\",\"dependsOnStepGroups\":[\"keqsrxybzqqedq\",\"tbciqfouflmm\"],\"preDeploymentSteps\":[{\"stepId\":\"smodmgloug\"}],\"deploymentTargetId\":\"b\",\"postDeploymentSteps\":[{\"stepId\":\"mutduqktaps\"}]}")
                .toObject(StepGroup.class);
        Assertions.assertEquals("dlikwyqkgfgibma", model.name());
        Assertions.assertEquals("keqsrxybzqqedq", model.dependsOnStepGroups().get(0));
        Assertions.assertEquals("smodmgloug", model.preDeploymentSteps().get(0).stepId());
        Assertions.assertEquals("b", model.deploymentTargetId());
        Assertions.assertEquals("mutduqktaps", model.postDeploymentSteps().get(0).stepId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StepGroup model =
            new StepGroup()
                .withName("dlikwyqkgfgibma")
                .withDependsOnStepGroups(Arrays.asList("keqsrxybzqqedq", "tbciqfouflmm"))
                .withPreDeploymentSteps(Arrays.asList(new PrePostStep().withStepId("smodmgloug")))
                .withDeploymentTargetId("b")
                .withPostDeploymentSteps(Arrays.asList(new PrePostStep().withStepId("mutduqktaps")));
        model = BinaryData.fromObject(model).toObject(StepGroup.class);
        Assertions.assertEquals("dlikwyqkgfgibma", model.name());
        Assertions.assertEquals("keqsrxybzqqedq", model.dependsOnStepGroups().get(0));
        Assertions.assertEquals("smodmgloug", model.preDeploymentSteps().get(0).stepId());
        Assertions.assertEquals("b", model.deploymentTargetId());
        Assertions.assertEquals("mutduqktaps", model.postDeploymentSteps().get(0).stepId());
    }
}