// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration.generated;

import com.azure.analytics.purview.administration.AccountsClient;
import com.azure.analytics.purview.administration.AccountsClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class AccountsUpdateAccountProperties {
    public static void main(String[] args) {
        AccountsClient accountsClient =
                new AccountsClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.administration.generated.accountsupdateaccountproperties.accountsupdateaccountproperties
        BinaryData accountUpdateParameters = BinaryData.fromString("{\"friendlyName\":\"friendly-account1\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                accountsClient.updateAccountPropertiesWithResponse(accountUpdateParameters, requestOptions);
        // END:com.azure.analytics.purview.administration.generated.accountsupdateaccountproperties.accountsupdateaccountproperties
    }
}
