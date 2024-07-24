// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Top level properties that describes current states of the patch resource.
 */
@Fluent
public final class PatchProperties implements JsonSerializable<PatchProperties> {
    /*
     * The Azure resource id of the target environment for the patch.
     */
    private String targetEnvironmentId;

    /*
     * The Azure resource id of the target container app for the patch.
     */
    private String targetContainerAppId;

    /*
     * The Azure resource id of the target revision for the patch.
     */
    private String targetRevisionId;

    /*
     * The status of the patch operation.
     */
    private PatchApplyStatus patchApplyStatus;

    /*
     * The UTC timestamp that describes when the patch object was created.
     */
    private OffsetDateTime createdAt;

    /*
     * The UTC timestamp that describes when the patch object was last updated.
     */
    private OffsetDateTime lastModifiedAt;

    /*
     * Detailed info describes the patch operation for the target container app.
     */
    private List<PatchDetails> patchDetails;

    /**
     * Creates an instance of PatchProperties class.
     */
    public PatchProperties() {
    }

    /**
     * Get the targetEnvironmentId property: The Azure resource id of the target environment for the patch.
     * 
     * @return the targetEnvironmentId value.
     */
    public String targetEnvironmentId() {
        return this.targetEnvironmentId;
    }

    /**
     * Set the targetEnvironmentId property: The Azure resource id of the target environment for the patch.
     * 
     * @param targetEnvironmentId the targetEnvironmentId value to set.
     * @return the PatchProperties object itself.
     */
    public PatchProperties withTargetEnvironmentId(String targetEnvironmentId) {
        this.targetEnvironmentId = targetEnvironmentId;
        return this;
    }

    /**
     * Get the targetContainerAppId property: The Azure resource id of the target container app for the patch.
     * 
     * @return the targetContainerAppId value.
     */
    public String targetContainerAppId() {
        return this.targetContainerAppId;
    }

    /**
     * Set the targetContainerAppId property: The Azure resource id of the target container app for the patch.
     * 
     * @param targetContainerAppId the targetContainerAppId value to set.
     * @return the PatchProperties object itself.
     */
    public PatchProperties withTargetContainerAppId(String targetContainerAppId) {
        this.targetContainerAppId = targetContainerAppId;
        return this;
    }

    /**
     * Get the targetRevisionId property: The Azure resource id of the target revision for the patch.
     * 
     * @return the targetRevisionId value.
     */
    public String targetRevisionId() {
        return this.targetRevisionId;
    }

    /**
     * Set the targetRevisionId property: The Azure resource id of the target revision for the patch.
     * 
     * @param targetRevisionId the targetRevisionId value to set.
     * @return the PatchProperties object itself.
     */
    public PatchProperties withTargetRevisionId(String targetRevisionId) {
        this.targetRevisionId = targetRevisionId;
        return this;
    }

    /**
     * Get the patchApplyStatus property: The status of the patch operation.
     * 
     * @return the patchApplyStatus value.
     */
    public PatchApplyStatus patchApplyStatus() {
        return this.patchApplyStatus;
    }

    /**
     * Get the createdAt property: The UTC timestamp that describes when the patch object was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the lastModifiedAt property: The UTC timestamp that describes when the patch object was last updated.
     * 
     * @return the lastModifiedAt value.
     */
    public OffsetDateTime lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Get the patchDetails property: Detailed info describes the patch operation for the target container app.
     * 
     * @return the patchDetails value.
     */
    public List<PatchDetails> patchDetails() {
        return this.patchDetails;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (patchDetails() != null) {
            patchDetails().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetEnvironmentId", this.targetEnvironmentId);
        jsonWriter.writeStringField("targetContainerAppId", this.targetContainerAppId);
        jsonWriter.writeStringField("targetRevisionId", this.targetRevisionId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PatchProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PatchProperties.
     */
    public static PatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PatchProperties deserializedPatchProperties = new PatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetEnvironmentId".equals(fieldName)) {
                    deserializedPatchProperties.targetEnvironmentId = reader.getString();
                } else if ("targetContainerAppId".equals(fieldName)) {
                    deserializedPatchProperties.targetContainerAppId = reader.getString();
                } else if ("targetRevisionId".equals(fieldName)) {
                    deserializedPatchProperties.targetRevisionId = reader.getString();
                } else if ("patchApplyStatus".equals(fieldName)) {
                    deserializedPatchProperties.patchApplyStatus = PatchApplyStatus.fromString(reader.getString());
                } else if ("createdAt".equals(fieldName)) {
                    deserializedPatchProperties.createdAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastModifiedAt".equals(fieldName)) {
                    deserializedPatchProperties.lastModifiedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("patchDetails".equals(fieldName)) {
                    List<PatchDetails> patchDetails = reader.readArray(reader1 -> PatchDetails.fromJson(reader1));
                    deserializedPatchProperties.patchDetails = patchDetails;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPatchProperties;
        });
    }
}
