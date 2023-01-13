// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.OperationInner;
import com.azure.resourcemanager.baremetalinfrastructure.models.Display;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"xypininmayhuybbk\",\"display\":{\"provider\":\"epoo\",\"resource\":\"nuvamiheogna\",\"operation\":\"zxtheotusivyevcc\",\"description\":\"ihnhun\"},\"isDataAction\":true}")
                .toObject(OperationInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model = new OperationInner().withDisplay(new Display());
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
    }
}