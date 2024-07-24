// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The updatable properties of the BuilderResource.
 */
@Fluent
public final class BuilderResourceUpdateProperties implements JsonSerializable<BuilderResourceUpdateProperties> {
    /*
     * Resource ID of the container apps environment that the builder is associated with.
     */
    private String environmentId;

    /**
     * Creates an instance of BuilderResourceUpdateProperties class.
     */
    public BuilderResourceUpdateProperties() {
    }

    /**
     * Get the environmentId property: Resource ID of the container apps environment that the builder is associated
     * with.
     * 
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: Resource ID of the container apps environment that the builder is associated
     * with.
     * 
     * @param environmentId the environmentId value to set.
     * @return the BuilderResourceUpdateProperties object itself.
     */
    public BuilderResourceUpdateProperties withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
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
        jsonWriter.writeStringField("environmentId", this.environmentId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BuilderResourceUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BuilderResourceUpdateProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BuilderResourceUpdateProperties.
     */
    public static BuilderResourceUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BuilderResourceUpdateProperties deserializedBuilderResourceUpdateProperties
                = new BuilderResourceUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("environmentId".equals(fieldName)) {
                    deserializedBuilderResourceUpdateProperties.environmentId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBuilderResourceUpdateProperties;
        });
    }
}
