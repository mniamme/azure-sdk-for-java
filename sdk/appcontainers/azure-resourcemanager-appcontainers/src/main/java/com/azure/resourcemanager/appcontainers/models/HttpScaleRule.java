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
import java.util.Map;

/**
 * Container App container Http scaling rule.
 */
@Fluent
public final class HttpScaleRule implements JsonSerializable<HttpScaleRule> {
    /*
     * Metadata properties to describe http scale rule.
     */
    private Map<String, String> metadata;

    /*
     * Authentication secrets for the custom scale rule.
     */
    private List<ScaleRuleAuth> auth;

    /*
     * The resource ID of a user-assigned managed identity that is assigned to the Container App, or 'system' for
     * system-assigned identity.
     */
    private String identity;

    /**
     * Creates an instance of HttpScaleRule class.
     */
    public HttpScaleRule() {
    }

    /**
     * Get the metadata property: Metadata properties to describe http scale rule.
     * 
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata properties to describe http scale rule.
     * 
     * @param metadata the metadata value to set.
     * @return the HttpScaleRule object itself.
     */
    public HttpScaleRule withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the auth property: Authentication secrets for the custom scale rule.
     * 
     * @return the auth value.
     */
    public List<ScaleRuleAuth> auth() {
        return this.auth;
    }

    /**
     * Set the auth property: Authentication secrets for the custom scale rule.
     * 
     * @param auth the auth value to set.
     * @return the HttpScaleRule object itself.
     */
    public HttpScaleRule withAuth(List<ScaleRuleAuth> auth) {
        this.auth = auth;
        return this;
    }

    /**
     * Get the identity property: The resource ID of a user-assigned managed identity that is assigned to the Container
     * App, or 'system' for system-assigned identity.
     * 
     * @return the identity value.
     */
    public String identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The resource ID of a user-assigned managed identity that is assigned to the Container
     * App, or 'system' for system-assigned identity.
     * 
     * @param identity the identity value to set.
     * @return the HttpScaleRule object itself.
     */
    public HttpScaleRule withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (auth() != null) {
            auth().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("auth", this.auth, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpScaleRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpScaleRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HttpScaleRule.
     */
    public static HttpScaleRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HttpScaleRule deserializedHttpScaleRule = new HttpScaleRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedHttpScaleRule.metadata = metadata;
                } else if ("auth".equals(fieldName)) {
                    List<ScaleRuleAuth> auth = reader.readArray(reader1 -> ScaleRuleAuth.fromJson(reader1));
                    deserializedHttpScaleRule.auth = auth;
                } else if ("identity".equals(fieldName)) {
                    deserializedHttpScaleRule.identity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHttpScaleRule;
        });
    }
}
