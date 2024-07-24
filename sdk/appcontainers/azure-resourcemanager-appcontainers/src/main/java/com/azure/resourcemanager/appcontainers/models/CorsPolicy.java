// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Cross-Origin-Resource-Sharing policy.
 */
@Fluent
public final class CorsPolicy implements JsonSerializable<CorsPolicy> {
    /*
     * Specifies the content for the access-control-allow-origins header
     */
    private List<String> allowedOrigins;

    /*
     * Specifies the content for the access-control-allow-methods header
     */
    private List<String> allowedMethods;

    /*
     * Specifies the content for the access-control-allow-headers header
     */
    private List<String> allowedHeaders;

    /*
     * Specifies the content for the access-control-expose-headers header
     */
    private List<String> exposeHeaders;

    /*
     * Specifies the content for the access-control-max-age header
     */
    private Integer maxAge;

    /*
     * Specifies whether the resource allows credentials
     */
    private Boolean allowCredentials;

    /**
     * Creates an instance of CorsPolicy class.
     */
    public CorsPolicy() {
    }

    /**
     * Get the allowedOrigins property: Specifies the content for the access-control-allow-origins header.
     * 
     * @return the allowedOrigins value.
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: Specifies the content for the access-control-allow-origins header.
     * 
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the allowedMethods property: Specifies the content for the access-control-allow-methods header.
     * 
     * @return the allowedMethods value.
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the allowedMethods property: Specifies the content for the access-control-allow-methods header.
     * 
     * @param allowedMethods the allowedMethods value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedMethods(List<String> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the allowedHeaders property: Specifies the content for the access-control-allow-headers header.
     * 
     * @return the allowedHeaders value.
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the allowedHeaders property: Specifies the content for the access-control-allow-headers header.
     * 
     * @param allowedHeaders the allowedHeaders value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedHeaders(List<String> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Get the exposeHeaders property: Specifies the content for the access-control-expose-headers header.
     * 
     * @return the exposeHeaders value.
     */
    public List<String> exposeHeaders() {
        return this.exposeHeaders;
    }

    /**
     * Set the exposeHeaders property: Specifies the content for the access-control-expose-headers header.
     * 
     * @param exposeHeaders the exposeHeaders value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withExposeHeaders(List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }

    /**
     * Get the maxAge property: Specifies the content for the access-control-max-age header.
     * 
     * @return the maxAge value.
     */
    public Integer maxAge() {
        return this.maxAge;
    }

    /**
     * Set the maxAge property: Specifies the content for the access-control-max-age header.
     * 
     * @param maxAge the maxAge value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Get the allowCredentials property: Specifies whether the resource allows credentials.
     * 
     * @return the allowCredentials value.
     */
    public Boolean allowCredentials() {
        return this.allowCredentials;
    }

    /**
     * Set the allowCredentials property: Specifies whether the resource allows credentials.
     * 
     * @param allowCredentials the allowCredentials value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allowedOrigins() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property allowedOrigins in model CorsPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CorsPolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("allowedOrigins", this.allowedOrigins,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedMethods", this.allowedMethods,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedHeaders", this.allowedHeaders,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("exposeHeaders", this.exposeHeaders,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("maxAge", this.maxAge);
        jsonWriter.writeBooleanField("allowCredentials", this.allowCredentials);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CorsPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CorsPolicy if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CorsPolicy.
     */
    public static CorsPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CorsPolicy deserializedCorsPolicy = new CorsPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowedOrigins".equals(fieldName)) {
                    List<String> allowedOrigins = reader.readArray(reader1 -> reader1.getString());
                    deserializedCorsPolicy.allowedOrigins = allowedOrigins;
                } else if ("allowedMethods".equals(fieldName)) {
                    List<String> allowedMethods = reader.readArray(reader1 -> reader1.getString());
                    deserializedCorsPolicy.allowedMethods = allowedMethods;
                } else if ("allowedHeaders".equals(fieldName)) {
                    List<String> allowedHeaders = reader.readArray(reader1 -> reader1.getString());
                    deserializedCorsPolicy.allowedHeaders = allowedHeaders;
                } else if ("exposeHeaders".equals(fieldName)) {
                    List<String> exposeHeaders = reader.readArray(reader1 -> reader1.getString());
                    deserializedCorsPolicy.exposeHeaders = exposeHeaders;
                } else if ("maxAge".equals(fieldName)) {
                    deserializedCorsPolicy.maxAge = reader.getNullable(JsonReader::getInt);
                } else if ("allowCredentials".equals(fieldName)) {
                    deserializedCorsPolicy.allowCredentials = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCorsPolicy;
        });
    }
}
