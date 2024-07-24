// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Peer traffic settings for the Managed Environment.
 */
@Fluent
public final class ManagedEnvironmentPropertiesPeerTrafficConfiguration
    implements JsonSerializable<ManagedEnvironmentPropertiesPeerTrafficConfiguration> {
    /*
     * Peer traffic encryption settings for the Managed Environment
     */
    private ManagedEnvironmentPropertiesPeerTrafficConfigurationEncryption encryption;

    /**
     * Creates an instance of ManagedEnvironmentPropertiesPeerTrafficConfiguration class.
     */
    public ManagedEnvironmentPropertiesPeerTrafficConfiguration() {
    }

    /**
     * Get the encryption property: Peer traffic encryption settings for the Managed Environment.
     * 
     * @return the encryption value.
     */
    public ManagedEnvironmentPropertiesPeerTrafficConfigurationEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Peer traffic encryption settings for the Managed Environment.
     * 
     * @param encryption the encryption value to set.
     * @return the ManagedEnvironmentPropertiesPeerTrafficConfiguration object itself.
     */
    public ManagedEnvironmentPropertiesPeerTrafficConfiguration
        withEncryption(ManagedEnvironmentPropertiesPeerTrafficConfigurationEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryption() != null) {
            encryption().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("encryption", this.encryption);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedEnvironmentPropertiesPeerTrafficConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedEnvironmentPropertiesPeerTrafficConfiguration if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedEnvironmentPropertiesPeerTrafficConfiguration.
     */
    public static ManagedEnvironmentPropertiesPeerTrafficConfiguration fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedEnvironmentPropertiesPeerTrafficConfiguration deserializedManagedEnvironmentPropertiesPeerTrafficConfiguration
                = new ManagedEnvironmentPropertiesPeerTrafficConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("encryption".equals(fieldName)) {
                    deserializedManagedEnvironmentPropertiesPeerTrafficConfiguration.encryption
                        = ManagedEnvironmentPropertiesPeerTrafficConfigurationEncryption.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedEnvironmentPropertiesPeerTrafficConfiguration;
        });
    }
}
