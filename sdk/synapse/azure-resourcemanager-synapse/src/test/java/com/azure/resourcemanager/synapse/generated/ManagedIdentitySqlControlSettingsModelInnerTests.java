// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIdentitySqlControlSettingsModelInner;
import com.azure.resourcemanager.synapse.models.DesiredState;
import com.azure.resourcemanager.synapse.models.ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentitySqlControlSettingsModelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentitySqlControlSettingsModelInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"grantSqlControlToManagedIdentity\":{\"desiredState\":\"Enabled\",\"actualState\":\"Disabling\"}},\"id\":\"nsiru\",\"name\":\"hzmme\",\"type\":\"ckdlpag\"}")
                .toObject(ManagedIdentitySqlControlSettingsModelInner.class);
        Assertions.assertEquals(DesiredState.ENABLED, model.grantSqlControlToManagedIdentity().desiredState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentitySqlControlSettingsModelInner model =
            new ManagedIdentitySqlControlSettingsModelInner()
                .withGrantSqlControlToManagedIdentity(
                    new ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity()
                        .withDesiredState(DesiredState.ENABLED));
        model = BinaryData.fromObject(model).toObject(ManagedIdentitySqlControlSettingsModelInner.class);
        Assertions.assertEquals(DesiredState.ENABLED, model.grantSqlControlToManagedIdentity().desiredState());
    }
}