// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

/** Samples for Locations GetCapability. */
public final class LocationsGetCapabilitySamples {
    /*
     * x-ms-original-file: specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/stable/2016-11-01/examples/Locations_GetCapability.json
     */
    /**
     * Sample code: Gets subscription-level properties and limits for Data Lake Analytics specified by resource
     * location.
     *
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void getsSubscriptionLevelPropertiesAndLimitsForDataLakeAnalyticsSpecifiedByResourceLocation(
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        manager.locations().getCapabilityWithResponse("EastUS2", com.azure.core.util.Context.NONE);
    }
}