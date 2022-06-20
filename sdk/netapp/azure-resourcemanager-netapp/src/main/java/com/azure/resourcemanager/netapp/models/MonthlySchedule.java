// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Monthly Schedule properties. */
@Fluent
public final class MonthlySchedule {
    /*
     * Monthly snapshot count to keep
     */
    @JsonProperty(value = "snapshotsToKeep")
    private Integer snapshotsToKeep;

    /*
     * Indicates which days of the month snapshot should be taken. A comma
     * delimited string.
     */
    @JsonProperty(value = "daysOfMonth")
    private String daysOfMonth;

    /*
     * Indicates which hour in UTC timezone a snapshot should be taken
     */
    @JsonProperty(value = "hour")
    private Integer hour;

    /*
     * Indicates which minute snapshot should be taken
     */
    @JsonProperty(value = "minute")
    private Integer minute;

    /*
     * Resource size in bytes, current storage usage for the volume in bytes
     */
    @JsonProperty(value = "usedBytes")
    private Long usedBytes;

    /**
     * Get the snapshotsToKeep property: Monthly snapshot count to keep.
     *
     * @return the snapshotsToKeep value.
     */
    public Integer snapshotsToKeep() {
        return this.snapshotsToKeep;
    }

    /**
     * Set the snapshotsToKeep property: Monthly snapshot count to keep.
     *
     * @param snapshotsToKeep the snapshotsToKeep value to set.
     * @return the MonthlySchedule object itself.
     */
    public MonthlySchedule withSnapshotsToKeep(Integer snapshotsToKeep) {
        this.snapshotsToKeep = snapshotsToKeep;
        return this;
    }

    /**
     * Get the daysOfMonth property: Indicates which days of the month snapshot should be taken. A comma delimited
     * string.
     *
     * @return the daysOfMonth value.
     */
    public String daysOfMonth() {
        return this.daysOfMonth;
    }

    /**
     * Set the daysOfMonth property: Indicates which days of the month snapshot should be taken. A comma delimited
     * string.
     *
     * @param daysOfMonth the daysOfMonth value to set.
     * @return the MonthlySchedule object itself.
     */
    public MonthlySchedule withDaysOfMonth(String daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }

    /**
     * Get the hour property: Indicates which hour in UTC timezone a snapshot should be taken.
     *
     * @return the hour value.
     */
    public Integer hour() {
        return this.hour;
    }

    /**
     * Set the hour property: Indicates which hour in UTC timezone a snapshot should be taken.
     *
     * @param hour the hour value to set.
     * @return the MonthlySchedule object itself.
     */
    public MonthlySchedule withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Get the minute property: Indicates which minute snapshot should be taken.
     *
     * @return the minute value.
     */
    public Integer minute() {
        return this.minute;
    }

    /**
     * Set the minute property: Indicates which minute snapshot should be taken.
     *
     * @param minute the minute value to set.
     * @return the MonthlySchedule object itself.
     */
    public MonthlySchedule withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Get the usedBytes property: Resource size in bytes, current storage usage for the volume in bytes.
     *
     * @return the usedBytes value.
     */
    public Long usedBytes() {
        return this.usedBytes;
    }

    /**
     * Set the usedBytes property: Resource size in bytes, current storage usage for the volume in bytes.
     *
     * @param usedBytes the usedBytes value to set.
     * @return the MonthlySchedule object itself.
     */
    public MonthlySchedule withUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
