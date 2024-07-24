// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.BillingMeter;
import java.io.IOException;
import java.util.List;

/**
 * Collection of billing meters.
 */
@Fluent
public final class BillingMeterCollectionInner implements JsonSerializable<BillingMeterCollectionInner> {
    /*
     * Collection of billing meters.
     */
    private List<BillingMeter> value;

    /**
     * Creates an instance of BillingMeterCollectionInner class.
     */
    public BillingMeterCollectionInner() {
    }

    /**
     * Get the value property: Collection of billing meters.
     * 
     * @return the value value.
     */
    public List<BillingMeter> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of billing meters.
     * 
     * @param value the value value to set.
     * @return the BillingMeterCollectionInner object itself.
     */
    public BillingMeterCollectionInner withValue(List<BillingMeter> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model BillingMeterCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BillingMeterCollectionInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BillingMeterCollectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BillingMeterCollectionInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BillingMeterCollectionInner.
     */
    public static BillingMeterCollectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BillingMeterCollectionInner deserializedBillingMeterCollectionInner = new BillingMeterCollectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<BillingMeter> value = reader.readArray(reader1 -> BillingMeter.fromJson(reader1));
                    deserializedBillingMeterCollectionInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBillingMeterCollectionInner;
        });
    }
}
