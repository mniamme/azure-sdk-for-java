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
 * Session network configuration.
 */
@Fluent
public final class SessionNetworkConfiguration implements JsonSerializable<SessionNetworkConfiguration> {
    /*
     * Network status for the sessions.
     */
    private SessionNetworkStatus status;

    /**
     * Creates an instance of SessionNetworkConfiguration class.
     */
    public SessionNetworkConfiguration() {
    }

    /**
     * Get the status property: Network status for the sessions.
     * 
     * @return the status value.
     */
    public SessionNetworkStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Network status for the sessions.
     * 
     * @param status the status value to set.
     * @return the SessionNetworkConfiguration object itself.
     */
    public SessionNetworkConfiguration withStatus(SessionNetworkStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SessionNetworkConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SessionNetworkConfiguration if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SessionNetworkConfiguration.
     */
    public static SessionNetworkConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SessionNetworkConfiguration deserializedSessionNetworkConfiguration = new SessionNetworkConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedSessionNetworkConfiguration.status
                        = SessionNetworkStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSessionNetworkConfiguration;
        });
    }
}
