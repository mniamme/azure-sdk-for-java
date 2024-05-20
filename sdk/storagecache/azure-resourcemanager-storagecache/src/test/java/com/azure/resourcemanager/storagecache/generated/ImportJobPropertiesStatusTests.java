// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.fluent.models.ImportJobPropertiesStatus;

public final class ImportJobPropertiesStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImportJobPropertiesStatus model = BinaryData.fromString(
            "{\"state\":\"Canceled\",\"statusMessage\":\"dmgloug\",\"totalBlobsWalked\":9051452946148232776,\"blobsWalkedPerSecond\":2331240743756595548,\"totalBlobsImported\":5083557747309548738,\"blobsImportedPerSecond\":6527154524069647921,\"lastCompletionTime\":\"2021-10-29T20:46:58Z\",\"lastStartedTime\":\"2021-01-27T01:22:28Z\",\"totalErrors\":807711520,\"totalConflicts\":1678823592}")
            .toObject(ImportJobPropertiesStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImportJobPropertiesStatus model = new ImportJobPropertiesStatus();
        model = BinaryData.fromObject(model).toObject(ImportJobPropertiesStatus.class);
    }
}
