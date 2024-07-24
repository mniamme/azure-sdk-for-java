// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.GithubActionConfiguration;
import com.azure.resourcemanager.appcontainers.models.SourceControlOperationState;
import java.io.IOException;

/**
 * SourceControl resource specific properties.
 */
@Fluent
public final class SourceControlProperties implements JsonSerializable<SourceControlProperties> {
    /*
     * Current provisioning State of the operation
     */
    private SourceControlOperationState operationState;

    /*
     * The repo url which will be integrated to ContainerApp.
     */
    private String repoUrl;

    /*
     * The branch which will trigger the auto deployment
     */
    private String branch;

    /*
     * Container App Revision Template with all possible settings and the
     * defaults if user did not provide them. The defaults are populated
     * as they were at the creation time
     */
    private GithubActionConfiguration githubActionConfiguration;

    /**
     * Creates an instance of SourceControlProperties class.
     */
    public SourceControlProperties() {
    }

    /**
     * Get the operationState property: Current provisioning State of the operation.
     * 
     * @return the operationState value.
     */
    public SourceControlOperationState operationState() {
        return this.operationState;
    }

    /**
     * Get the repoUrl property: The repo url which will be integrated to ContainerApp.
     * 
     * @return the repoUrl value.
     */
    public String repoUrl() {
        return this.repoUrl;
    }

    /**
     * Set the repoUrl property: The repo url which will be integrated to ContainerApp.
     * 
     * @param repoUrl the repoUrl value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * Get the branch property: The branch which will trigger the auto deployment.
     * 
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The branch which will trigger the auto deployment.
     * 
     * @param branch the branch value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the githubActionConfiguration property: Container App Revision Template with all possible settings and the
     * defaults if user did not provide them. The defaults are populated
     * as they were at the creation time.
     * 
     * @return the githubActionConfiguration value.
     */
    public GithubActionConfiguration githubActionConfiguration() {
        return this.githubActionConfiguration;
    }

    /**
     * Set the githubActionConfiguration property: Container App Revision Template with all possible settings and the
     * defaults if user did not provide them. The defaults are populated
     * as they were at the creation time.
     * 
     * @param githubActionConfiguration the githubActionConfiguration value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withGithubActionConfiguration(GithubActionConfiguration githubActionConfiguration) {
        this.githubActionConfiguration = githubActionConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (githubActionConfiguration() != null) {
            githubActionConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("repoUrl", this.repoUrl);
        jsonWriter.writeStringField("branch", this.branch);
        jsonWriter.writeJsonField("githubActionConfiguration", this.githubActionConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SourceControlProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SourceControlProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SourceControlProperties.
     */
    public static SourceControlProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SourceControlProperties deserializedSourceControlProperties = new SourceControlProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationState".equals(fieldName)) {
                    deserializedSourceControlProperties.operationState
                        = SourceControlOperationState.fromString(reader.getString());
                } else if ("repoUrl".equals(fieldName)) {
                    deserializedSourceControlProperties.repoUrl = reader.getString();
                } else if ("branch".equals(fieldName)) {
                    deserializedSourceControlProperties.branch = reader.getString();
                } else if ("githubActionConfiguration".equals(fieldName)) {
                    deserializedSourceControlProperties.githubActionConfiguration
                        = GithubActionConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSourceControlProperties;
        });
    }
}
