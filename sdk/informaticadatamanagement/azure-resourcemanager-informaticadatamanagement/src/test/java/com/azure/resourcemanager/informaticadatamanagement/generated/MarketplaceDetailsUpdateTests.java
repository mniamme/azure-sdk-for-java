// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.MarketplaceDetailsUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.OfferDetailsUpdate;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceDetailsUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceDetailsUpdate model = BinaryData.fromString(
            "{\"marketplaceSubscriptionId\":\"gigr\",\"offerDetails\":{\"publisherId\":\"ur\",\"offerId\":\"xxjnspydptk\",\"planId\":\"nkoukn\",\"planName\":\"dwtiukbldngkp\",\"termUnit\":\"ipazyxoegukgjnpi\",\"termId\":\"gygev\"}}")
            .toObject(MarketplaceDetailsUpdate.class);
        Assertions.assertEquals("gigr", model.marketplaceSubscriptionId());
        Assertions.assertEquals("ur", model.offerDetails().publisherId());
        Assertions.assertEquals("xxjnspydptk", model.offerDetails().offerId());
        Assertions.assertEquals("nkoukn", model.offerDetails().planId());
        Assertions.assertEquals("dwtiukbldngkp", model.offerDetails().planName());
        Assertions.assertEquals("ipazyxoegukgjnpi", model.offerDetails().termUnit());
        Assertions.assertEquals("gygev", model.offerDetails().termId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceDetailsUpdate model = new MarketplaceDetailsUpdate().withMarketplaceSubscriptionId("gigr")
            .withOfferDetails(new OfferDetailsUpdate().withPublisherId("ur")
                .withOfferId("xxjnspydptk")
                .withPlanId("nkoukn")
                .withPlanName("dwtiukbldngkp")
                .withTermUnit("ipazyxoegukgjnpi")
                .withTermId("gygev"));
        model = BinaryData.fromObject(model).toObject(MarketplaceDetailsUpdate.class);
        Assertions.assertEquals("gigr", model.marketplaceSubscriptionId());
        Assertions.assertEquals("ur", model.offerDetails().publisherId());
        Assertions.assertEquals("xxjnspydptk", model.offerDetails().offerId());
        Assertions.assertEquals("nkoukn", model.offerDetails().planId());
        Assertions.assertEquals("dwtiukbldngkp", model.offerDetails().planName());
        Assertions.assertEquals("ipazyxoegukgjnpi", model.offerDetails().termUnit());
        Assertions.assertEquals("gygev", model.offerDetails().termId());
    }
}
