// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * How the import job will handle conflicts. For example, if the import job is trying to bring in a directory, but a
 * file is at that path, how it handles it. Fail indicates that the import job should stop immediately and not do
 * anything with the conflict. Skip indicates that it should pass over the conflict. OverwriteIfDirty causes the import
 * job to delete and re-import the file or directory if it is a conflicting type, is dirty, or was not previously
 * imported. OverwriteAlways extends OverwriteIfDirty to include releasing files that had been restored but were not
 * dirty. Please reference https://learn.microsoft.com/en-us/azure/azure-managed-lustre/ for a thorough explanation of
 * these resolution modes.
 */
public final class ConflictResolutionMode extends ExpandableStringEnum<ConflictResolutionMode> {
    /**
     * Static value Fail for ConflictResolutionMode.
     */
    public static final ConflictResolutionMode FAIL = fromString("Fail");

    /**
     * Static value Skip for ConflictResolutionMode.
     */
    public static final ConflictResolutionMode SKIP = fromString("Skip");

    /**
     * Static value OverwriteIfDirty for ConflictResolutionMode.
     */
    public static final ConflictResolutionMode OVERWRITE_IF_DIRTY = fromString("OverwriteIfDirty");

    /**
     * Static value OverwriteAlways for ConflictResolutionMode.
     */
    public static final ConflictResolutionMode OVERWRITE_ALWAYS = fromString("OverwriteAlways");

    /**
     * Creates a new instance of ConflictResolutionMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConflictResolutionMode() {
    }

    /**
     * Creates or finds a ConflictResolutionMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConflictResolutionMode.
     */
    @JsonCreator
    public static ConflictResolutionMode fromString(String name) {
        return fromString(name, ConflictResolutionMode.class);
    }

    /**
     * Gets known ConflictResolutionMode values.
     * 
     * @return known ConflictResolutionMode values.
     */
    public static Collection<ConflictResolutionMode> values() {
        return values(ConflictResolutionMode.class);
    }
}
