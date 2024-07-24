// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.ContainerAppReplicaRunningState;
import com.azure.resourcemanager.appcontainers.models.ReplicaContainer;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Replica resource specific properties.
 */
@Fluent
public final class ReplicaProperties implements JsonSerializable<ReplicaProperties> {
    /*
     * Timestamp describing when the pod was created by controller
     */
    private OffsetDateTime createdTime;

    /*
     * Current running state of the replica
     */
    private ContainerAppReplicaRunningState runningState;

    /*
     * The details of replica current running state
     */
    private String runningStateDetails;

    /*
     * The containers collection under a replica.
     */
    private List<ReplicaContainer> containers;

    /*
     * The init containers collection under a replica.
     */
    private List<ReplicaContainer> initContainers;

    /**
     * Creates an instance of ReplicaProperties class.
     */
    public ReplicaProperties() {
    }

    /**
     * Get the createdTime property: Timestamp describing when the pod was created by controller.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the runningState property: Current running state of the replica.
     * 
     * @return the runningState value.
     */
    public ContainerAppReplicaRunningState runningState() {
        return this.runningState;
    }

    /**
     * Get the runningStateDetails property: The details of replica current running state.
     * 
     * @return the runningStateDetails value.
     */
    public String runningStateDetails() {
        return this.runningStateDetails;
    }

    /**
     * Get the containers property: The containers collection under a replica.
     * 
     * @return the containers value.
     */
    public List<ReplicaContainer> containers() {
        return this.containers;
    }

    /**
     * Set the containers property: The containers collection under a replica.
     * 
     * @param containers the containers value to set.
     * @return the ReplicaProperties object itself.
     */
    public ReplicaProperties withContainers(List<ReplicaContainer> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Get the initContainers property: The init containers collection under a replica.
     * 
     * @return the initContainers value.
     */
    public List<ReplicaContainer> initContainers() {
        return this.initContainers;
    }

    /**
     * Set the initContainers property: The init containers collection under a replica.
     * 
     * @param initContainers the initContainers value to set.
     * @return the ReplicaProperties object itself.
     */
    public ReplicaProperties withInitContainers(List<ReplicaContainer> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containers() != null) {
            containers().forEach(e -> e.validate());
        }
        if (initContainers() != null) {
            initContainers().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("containers", this.containers, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("initContainers", this.initContainers,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReplicaProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicaProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReplicaProperties.
     */
    public static ReplicaProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicaProperties deserializedReplicaProperties = new ReplicaProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdTime".equals(fieldName)) {
                    deserializedReplicaProperties.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("runningState".equals(fieldName)) {
                    deserializedReplicaProperties.runningState
                        = ContainerAppReplicaRunningState.fromString(reader.getString());
                } else if ("runningStateDetails".equals(fieldName)) {
                    deserializedReplicaProperties.runningStateDetails = reader.getString();
                } else if ("containers".equals(fieldName)) {
                    List<ReplicaContainer> containers = reader.readArray(reader1 -> ReplicaContainer.fromJson(reader1));
                    deserializedReplicaProperties.containers = containers;
                } else if ("initContainers".equals(fieldName)) {
                    List<ReplicaContainer> initContainers
                        = reader.readArray(reader1 -> ReplicaContainer.fromJson(reader1));
                    deserializedReplicaProperties.initContainers = initContainers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicaProperties;
        });
    }
}
