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
 * Policy that defines circuit breaker conditions.
 */
@Fluent
public final class CircuitBreakerPolicy implements JsonSerializable<CircuitBreakerPolicy> {
    /*
     * Number of consecutive errors before the circuit breaker opens
     */
    private Integer consecutiveErrors;

    /*
     * The time interval, in seconds, between endpoint checks. This can result in opening the circuit breaker if the
     * check fails as well as closing the circuit breaker if the check succeeds. Defaults to 10s.
     */
    private Integer intervalInSeconds;

    /*
     * Maximum percentage of hosts that will be ejected after failure threshold has been met
     */
    private Integer maxEjectionPercent;

    /**
     * Creates an instance of CircuitBreakerPolicy class.
     */
    public CircuitBreakerPolicy() {
    }

    /**
     * Get the consecutiveErrors property: Number of consecutive errors before the circuit breaker opens.
     * 
     * @return the consecutiveErrors value.
     */
    public Integer consecutiveErrors() {
        return this.consecutiveErrors;
    }

    /**
     * Set the consecutiveErrors property: Number of consecutive errors before the circuit breaker opens.
     * 
     * @param consecutiveErrors the consecutiveErrors value to set.
     * @return the CircuitBreakerPolicy object itself.
     */
    public CircuitBreakerPolicy withConsecutiveErrors(Integer consecutiveErrors) {
        this.consecutiveErrors = consecutiveErrors;
        return this;
    }

    /**
     * Get the intervalInSeconds property: The time interval, in seconds, between endpoint checks. This can result in
     * opening the circuit breaker if the check fails as well as closing the circuit breaker if the check succeeds.
     * Defaults to 10s.
     * 
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: The time interval, in seconds, between endpoint checks. This can result in
     * opening the circuit breaker if the check fails as well as closing the circuit breaker if the check succeeds.
     * Defaults to 10s.
     * 
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the CircuitBreakerPolicy object itself.
     */
    public CircuitBreakerPolicy withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the maxEjectionPercent property: Maximum percentage of hosts that will be ejected after failure threshold has
     * been met.
     * 
     * @return the maxEjectionPercent value.
     */
    public Integer maxEjectionPercent() {
        return this.maxEjectionPercent;
    }

    /**
     * Set the maxEjectionPercent property: Maximum percentage of hosts that will be ejected after failure threshold has
     * been met.
     * 
     * @param maxEjectionPercent the maxEjectionPercent value to set.
     * @return the CircuitBreakerPolicy object itself.
     */
    public CircuitBreakerPolicy withMaxEjectionPercent(Integer maxEjectionPercent) {
        this.maxEjectionPercent = maxEjectionPercent;
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
        jsonWriter.writeNumberField("consecutiveErrors", this.consecutiveErrors);
        jsonWriter.writeNumberField("intervalInSeconds", this.intervalInSeconds);
        jsonWriter.writeNumberField("maxEjectionPercent", this.maxEjectionPercent);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CircuitBreakerPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CircuitBreakerPolicy if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CircuitBreakerPolicy.
     */
    public static CircuitBreakerPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CircuitBreakerPolicy deserializedCircuitBreakerPolicy = new CircuitBreakerPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("consecutiveErrors".equals(fieldName)) {
                    deserializedCircuitBreakerPolicy.consecutiveErrors = reader.getNullable(JsonReader::getInt);
                } else if ("intervalInSeconds".equals(fieldName)) {
                    deserializedCircuitBreakerPolicy.intervalInSeconds = reader.getNullable(JsonReader::getInt);
                } else if ("maxEjectionPercent".equals(fieldName)) {
                    deserializedCircuitBreakerPolicy.maxEjectionPercent = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCircuitBreakerPolicy;
        });
    }
}
