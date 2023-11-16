// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for RoutingIdentityType.
 */
public final class RoutingIdentityType extends ExpandableStringEnum<RoutingIdentityType> {
    /**
     * Static value None for RoutingIdentityType.
     */
    public static final RoutingIdentityType NONE = fromString("None");

    /**
     * Static value SystemAssigned for RoutingIdentityType.
     */
    public static final RoutingIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Static value UserAssigned for RoutingIdentityType.
     */
    public static final RoutingIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Creates a new instance of RoutingIdentityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RoutingIdentityType() {
    }

    /**
     * Creates or finds a RoutingIdentityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RoutingIdentityType.
     */
    @JsonCreator
    public static RoutingIdentityType fromString(String name) {
        return fromString(name, RoutingIdentityType.class);
    }

    /**
     * Gets known RoutingIdentityType values.
     * 
     * @return known RoutingIdentityType values.
     */
    public static Collection<RoutingIdentityType> values() {
        return values(RoutingIdentityType.class);
    }
}
