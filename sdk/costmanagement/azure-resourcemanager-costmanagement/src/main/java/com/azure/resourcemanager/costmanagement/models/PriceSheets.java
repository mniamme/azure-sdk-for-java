// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.Context;

/** Resource collection API of PriceSheets. */
public interface PriceSheets {
    /**
     * Gets a URL to download the pricesheet for an invoice. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download the pricesheet for an invoice.
     */
    DownloadUrl download(String billingAccountName, String billingProfileName, String invoiceName);

    /**
     * Gets a URL to download the pricesheet for an invoice. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download the pricesheet for an invoice.
     */
    DownloadUrl download(String billingAccountName, String billingProfileName, String invoiceName, Context context);

    /**
     * Gets a URL to download the current month's pricesheet for a billing profile. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.Due to Azure
     * product growth, the Azure price sheet download experience in this preview version will be updated from a single
     * csv file to a Zip file containing multiple csv files, each with max 200k records.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download the current month's pricesheet for a billing profile.
     */
    DownloadUrl downloadByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Gets a URL to download the current month's pricesheet for a billing profile. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.Due to Azure
     * product growth, the Azure price sheet download experience in this preview version will be updated from a single
     * csv file to a Zip file containing multiple csv files, each with max 200k records.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download the current month's pricesheet for a billing profile.
     */
    DownloadUrl downloadByBillingProfile(String billingAccountName, String billingProfileName, Context context);
}