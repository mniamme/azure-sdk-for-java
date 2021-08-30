// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ServerPropertiesForUpdate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents a server to be updated. */
@Fluent
public final class ServerForUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerForUpdate.class);

    /*
     * The location the resource resides in.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The SKU (pricing tier) of the server.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Properties of the server.
     */
    @JsonProperty(value = "properties")
    private ServerPropertiesForUpdate innerProperties;

    /*
     * Application-specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the location property: The location the resource resides in.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location the resource resides in.
     *
     * @param location the location value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku property: The SKU (pricing tier) of the server.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU (pricing tier) of the server.
     *
     * @param sku the sku value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the server.
     *
     * @return the innerProperties value.
     */
    private ServerPropertiesForUpdate innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @param tags the tags value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorLoginPassword();
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerPropertiesForUpdate();
        }
        this.innerProperties().withAdministratorLoginPassword(administratorLoginPassword);
        return this;
    }

    /**
     * Get the storage property: Storage properties of a server.
     *
     * @return the storage value.
     */
    public Storage storage() {
        return this.innerProperties() == null ? null : this.innerProperties().storage();
    }

    /**
     * Set the storage property: Storage properties of a server.
     *
     * @param storage the storage value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withStorage(Storage storage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerPropertiesForUpdate();
        }
        this.innerProperties().withStorage(storage);
        return this;
    }

    /**
     * Get the backup property: Backup properties of a server.
     *
     * @return the backup value.
     */
    public Backup backup() {
        return this.innerProperties() == null ? null : this.innerProperties().backup();
    }

    /**
     * Set the backup property: Backup properties of a server.
     *
     * @param backup the backup value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withBackup(Backup backup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerPropertiesForUpdate();
        }
        this.innerProperties().withBackup(backup);
        return this;
    }

    /**
     * Get the highAvailability property: High availability properties of a server.
     *
     * @return the highAvailability value.
     */
    public HighAvailability highAvailability() {
        return this.innerProperties() == null ? null : this.innerProperties().highAvailability();
    }

    /**
     * Set the highAvailability property: High availability properties of a server.
     *
     * @param highAvailability the highAvailability value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withHighAvailability(HighAvailability highAvailability) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerPropertiesForUpdate();
        }
        this.innerProperties().withHighAvailability(highAvailability);
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.innerProperties() == null ? null : this.innerProperties().maintenanceWindow();
    }

    /**
     * Set the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerPropertiesForUpdate();
        }
        this.innerProperties().withMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * Get the createMode property: The mode to update a new PostgreSQL server.
     *
     * @return the createMode value.
     */
    public CreateModeForUpdate createMode() {
        return this.innerProperties() == null ? null : this.innerProperties().createMode();
    }

    /**
     * Set the createMode property: The mode to update a new PostgreSQL server.
     *
     * @param createMode the createMode value to set.
     * @return the ServerForUpdate object itself.
     */
    public ServerForUpdate withCreateMode(CreateModeForUpdate createMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerPropertiesForUpdate();
        }
        this.innerProperties().withCreateMode(createMode);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
