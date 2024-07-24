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
import java.util.List;

/**
 * Configuration of Open Telemetry metrics.
 */
@Fluent
public final class MetricsConfiguration implements JsonSerializable<MetricsConfiguration> {
    /*
     * Open telemetry metrics destinations
     */
    private List<String> destinations;

    /**
     * Creates an instance of MetricsConfiguration class.
     */
    public MetricsConfiguration() {
    }

    /**
     * Get the destinations property: Open telemetry metrics destinations.
     * 
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: Open telemetry metrics destinations.
     * 
     * @param destinations the destinations value to set.
     * @return the MetricsConfiguration object itself.
     */
    public MetricsConfiguration withDestinations(List<String> destinations) {
        this.destinations = destinations;
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
        jsonWriter.writeArrayField("destinations", this.destinations, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricsConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricsConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricsConfiguration.
     */
    public static MetricsConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricsConfiguration deserializedMetricsConfiguration = new MetricsConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("destinations".equals(fieldName)) {
                    List<String> destinations = reader.readArray(reader1 -> reader1.getString());
                    deserializedMetricsConfiguration.destinations = destinations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricsConfiguration;
        });
    }
}
