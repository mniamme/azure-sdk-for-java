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
 * Container App scaling configurations.
 */
@Fluent
public final class Scale implements JsonSerializable<Scale> {
    /*
     * Optional. Minimum number of container replicas.
     */
    private Integer minReplicas;

    /*
     * Optional. Maximum number of container replicas. Defaults to 10 if not set.
     */
    private Integer maxReplicas;

    /*
     * Scaling rules.
     */
    private List<ScaleRule> rules;

    /**
     * Creates an instance of Scale class.
     */
    public Scale() {
    }

    /**
     * Get the minReplicas property: Optional. Minimum number of container replicas.
     * 
     * @return the minReplicas value.
     */
    public Integer minReplicas() {
        return this.minReplicas;
    }

    /**
     * Set the minReplicas property: Optional. Minimum number of container replicas.
     * 
     * @param minReplicas the minReplicas value to set.
     * @return the Scale object itself.
     */
    public Scale withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * Get the maxReplicas property: Optional. Maximum number of container replicas. Defaults to 10 if not set.
     * 
     * @return the maxReplicas value.
     */
    public Integer maxReplicas() {
        return this.maxReplicas;
    }

    /**
     * Set the maxReplicas property: Optional. Maximum number of container replicas. Defaults to 10 if not set.
     * 
     * @param maxReplicas the maxReplicas value to set.
     * @return the Scale object itself.
     */
    public Scale withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * Get the rules property: Scaling rules.
     * 
     * @return the rules value.
     */
    public List<ScaleRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Scaling rules.
     * 
     * @param rules the rules value to set.
     * @return the Scale object itself.
     */
    public Scale withRules(List<ScaleRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("minReplicas", this.minReplicas);
        jsonWriter.writeNumberField("maxReplicas", this.maxReplicas);
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Scale from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Scale if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Scale.
     */
    public static Scale fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Scale deserializedScale = new Scale();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minReplicas".equals(fieldName)) {
                    deserializedScale.minReplicas = reader.getNullable(JsonReader::getInt);
                } else if ("maxReplicas".equals(fieldName)) {
                    deserializedScale.maxReplicas = reader.getNullable(JsonReader::getInt);
                } else if ("rules".equals(fieldName)) {
                    List<ScaleRule> rules = reader.readArray(reader1 -> ScaleRule.fromJson(reader1));
                    deserializedScale.rules = rules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScale;
        });
    }
}
