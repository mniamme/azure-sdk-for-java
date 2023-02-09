// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExtensionOptionType. */
public final class ExtensionOptionType extends ExpandableStringEnum<ExtensionOptionType> {
    /** Static value NotSpecified for ExtensionOptionType. */
    public static final ExtensionOptionType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value DoNotMergeExistingReadOnlyAndSecretProperties for ExtensionOptionType. */
    public static final ExtensionOptionType DO_NOT_MERGE_EXISTING_READ_ONLY_AND_SECRET_PROPERTIES =
        fromString("DoNotMergeExistingReadOnlyAndSecretProperties");

    /** Static value IncludeInternalMetadata for ExtensionOptionType. */
    public static final ExtensionOptionType INCLUDE_INTERNAL_METADATA = fromString("IncludeInternalMetadata");

    /**
     * Creates a new instance of ExtensionOptionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExtensionOptionType() {
    }

    /**
     * Creates or finds a ExtensionOptionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExtensionOptionType.
     */
    @JsonCreator
    public static ExtensionOptionType fromString(String name) {
        return fromString(name, ExtensionOptionType.class);
    }

    /**
     * Gets known ExtensionOptionType values.
     *
     * @return known ExtensionOptionType values.
     */
    public static Collection<ExtensionOptionType> values() {
        return values(ExtensionOptionType.class);
    }
}