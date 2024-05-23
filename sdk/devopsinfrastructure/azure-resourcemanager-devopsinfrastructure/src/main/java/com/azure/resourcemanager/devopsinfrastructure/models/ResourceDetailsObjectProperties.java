// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the ResourceDetailsObject.
 */
@Immutable
public final class ResourceDetailsObjectProperties {
    /*
     * The status of the resource.
     */
    @JsonProperty(value = "status", required = true)
    private ResourceStatus status;

    /*
     * The image name of the resource.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /*
     * The version of the image running on the resource.
     */
    @JsonProperty(value = "imageVersion", required = true)
    private String imageVersion;

    /**
     * Creates an instance of ResourceDetailsObjectProperties class.
     */
    private ResourceDetailsObjectProperties() {
    }

    /**
     * Get the status property: The status of the resource.
     * 
     * @return the status value.
     */
    public ResourceStatus status() {
        return this.status;
    }

    /**
     * Get the image property: The image name of the resource.
     * 
     * @return the image value.
     */
    public String image() {
        return this.image;
    }

    /**
     * Get the imageVersion property: The version of the image running on the resource.
     * 
     * @return the imageVersion value.
     */
    public String imageVersion() {
        return this.imageVersion;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property status in model ResourceDetailsObjectProperties"));
        }
        if (image() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property image in model ResourceDetailsObjectProperties"));
        }
        if (imageVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property imageVersion in model ResourceDetailsObjectProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceDetailsObjectProperties.class);
}
