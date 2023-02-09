// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SkuCost model. */
@Fluent
public final class SkuCost {
    /*
     * The meterId property.
     */
    @JsonProperty(value = "meterId", required = true)
    private String meterId;

    /*
     * The quantity property.
     */
    @JsonProperty(value = "quantity")
    private Integer quantity;

    /*
     * The extendedUnit property.
     */
    @JsonProperty(value = "extendedUnit")
    private String extendedUnit;

    /** Creates an instance of SkuCost class. */
    public SkuCost() {
    }

    /**
     * Get the meterId property: The meterId property.
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Set the meterId property: The meterId property.
     *
     * @param meterId the meterId value to set.
     * @return the SkuCost object itself.
     */
    public SkuCost withMeterId(String meterId) {
        this.meterId = meterId;
        return this;
    }

    /**
     * Get the quantity property: The quantity property.
     *
     * @return the quantity value.
     */
    public Integer quantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The quantity property.
     *
     * @param quantity the quantity value to set.
     * @return the SkuCost object itself.
     */
    public SkuCost withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the extendedUnit property: The extendedUnit property.
     *
     * @return the extendedUnit value.
     */
    public String extendedUnit() {
        return this.extendedUnit;
    }

    /**
     * Set the extendedUnit property: The extendedUnit property.
     *
     * @param extendedUnit the extendedUnit value to set.
     * @return the SkuCost object itself.
     */
    public SkuCost withExtendedUnit(String extendedUnit) {
        this.extendedUnit = extendedUnit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (meterId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property meterId in model SkuCost"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SkuCost.class);
}