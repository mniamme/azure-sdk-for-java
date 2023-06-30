// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Bounding polygon on a specific page of the input. */
@Immutable
public final class BoundingRegion {
    /*
     * 1-based page number of page containing the bounding region.
     */
    @JsonProperty(value = "pageNumber", required = true)
    private int pageNumber;

    /*
     * Bounding polygon on the page, or the entire page if not specified.
     */
    @JsonProperty(value = "polygon", required = true)
    private List<Float> polygon;

    /**
     * Creates an instance of BoundingRegion class.
     *
     * @param pageNumber the pageNumber value to set.
     * @param polygon the polygon value to set.
     */
    @JsonCreator
    private BoundingRegion(
            @JsonProperty(value = "pageNumber", required = true) int pageNumber,
            @JsonProperty(value = "polygon", required = true) List<Float> polygon) {
        this.pageNumber = pageNumber;
        this.polygon = polygon;
    }

    /**
     * Get the pageNumber property: 1-based page number of page containing the bounding region.
     *
     * @return the pageNumber value.
     */
    public int getPageNumber() {
        return this.pageNumber;
    }

    /**
     * Get the polygon property: Bounding polygon on the page, or the entire page if not specified.
     *
     * @return the polygon value.
     */
    public List<Float> getPolygon() {
        return this.polygon;
    }
}
