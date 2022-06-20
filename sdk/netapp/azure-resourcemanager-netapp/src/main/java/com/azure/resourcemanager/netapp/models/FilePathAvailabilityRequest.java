// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** File path availability request content - availability is based on the name and the subnetId. */
@Fluent
public final class FilePathAvailabilityRequest {
    /*
     * File path to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /**
     * Get the name property: File path to verify.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: File path to verify.
     *
     * @param name the name value to set.
     * @return the FilePathAvailabilityRequest object itself.
     */
    public FilePathAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     *
     * @param subnetId the subnetId value to set.
     * @return the FilePathAvailabilityRequest object itself.
     */
    public FilePathAvailabilityRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model FilePathAvailabilityRequest"));
        }
        if (subnetId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subnetId in model FilePathAvailabilityRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FilePathAvailabilityRequest.class);
}
