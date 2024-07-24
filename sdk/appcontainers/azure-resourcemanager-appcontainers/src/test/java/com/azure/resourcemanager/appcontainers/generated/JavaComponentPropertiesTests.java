// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.JavaComponentConfigurationProperty;
import com.azure.resourcemanager.appcontainers.models.JavaComponentProperties;
import com.azure.resourcemanager.appcontainers.models.JavaComponentServiceBind;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JavaComponentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JavaComponentProperties model = BinaryData.fromString(
            "{\"componentType\":\"JavaComponentProperties\",\"provisioningState\":\"Deleting\",\"configurations\":[{\"propertyName\":\"unwqr\",\"value\":\"frgqhaohcm\"},{\"propertyName\":\"oc\",\"value\":\"r\"},{\"propertyName\":\"mbpyryxamebly\",\"value\":\"vkfkmr\"},{\"propertyName\":\"xne\",\"value\":\"sm\"}],\"serviceBinds\":[{\"name\":\"fpyapucygvoavyu\",\"serviceId\":\"sxlghieegjlg\"}]}")
            .toObject(JavaComponentProperties.class);
        Assertions.assertEquals("unwqr", model.configurations().get(0).propertyName());
        Assertions.assertEquals("frgqhaohcm", model.configurations().get(0).value());
        Assertions.assertEquals("fpyapucygvoavyu", model.serviceBinds().get(0).name());
        Assertions.assertEquals("sxlghieegjlg", model.serviceBinds().get(0).serviceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JavaComponentProperties model = new JavaComponentProperties()
            .withConfigurations(Arrays.asList(
                new JavaComponentConfigurationProperty().withPropertyName("unwqr").withValue("frgqhaohcm"),
                new JavaComponentConfigurationProperty().withPropertyName("oc").withValue("r"),
                new JavaComponentConfigurationProperty().withPropertyName("mbpyryxamebly").withValue("vkfkmr"),
                new JavaComponentConfigurationProperty().withPropertyName("xne").withValue("sm")))
            .withServiceBinds(Arrays
                .asList(new JavaComponentServiceBind().withName("fpyapucygvoavyu").withServiceId("sxlghieegjlg")));
        model = BinaryData.fromObject(model).toObject(JavaComponentProperties.class);
        Assertions.assertEquals("unwqr", model.configurations().get(0).propertyName());
        Assertions.assertEquals("frgqhaohcm", model.configurations().get(0).value());
        Assertions.assertEquals("fpyapucygvoavyu", model.serviceBinds().get(0).name());
        Assertions.assertEquals("sxlghieegjlg", model.serviceBinds().get(0).serviceId());
    }
}
