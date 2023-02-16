// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents key wrap metadata that a key wrapping provider can use to wrap/unwrap a client encryption key. */
@Fluent
public final class KeyWrapMetadata {
    /*
     * The name of associated KeyEncryptionKey (aka CustomerManagedKey).
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * ProviderName of KeyStoreProvider.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Reference / link to the KeyEncryptionKey.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Algorithm used in wrapping and unwrapping of the data encryption key.
     */
    @JsonProperty(value = "algorithm")
    private String algorithm;

    /** Creates an instance of KeyWrapMetadata class. */
    public KeyWrapMetadata() {
    }

    /**
     * Get the name property: The name of associated KeyEncryptionKey (aka CustomerManagedKey).
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of associated KeyEncryptionKey (aka CustomerManagedKey).
     *
     * @param name the name value to set.
     * @return the KeyWrapMetadata object itself.
     */
    public KeyWrapMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: ProviderName of KeyStoreProvider.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: ProviderName of KeyStoreProvider.
     *
     * @param type the type value to set.
     * @return the KeyWrapMetadata object itself.
     */
    public KeyWrapMetadata withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Reference / link to the KeyEncryptionKey.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Reference / link to the KeyEncryptionKey.
     *
     * @param value the value value to set.
     * @return the KeyWrapMetadata object itself.
     */
    public KeyWrapMetadata withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the algorithm property: Algorithm used in wrapping and unwrapping of the data encryption key.
     *
     * @return the algorithm value.
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: Algorithm used in wrapping and unwrapping of the data encryption key.
     *
     * @param algorithm the algorithm value to set.
     * @return the KeyWrapMetadata object itself.
     */
    public KeyWrapMetadata withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}