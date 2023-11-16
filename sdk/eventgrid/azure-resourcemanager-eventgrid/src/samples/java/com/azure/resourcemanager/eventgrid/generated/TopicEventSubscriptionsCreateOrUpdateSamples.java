// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFilter;
import com.azure.resourcemanager.eventgrid.models.WebhookEventSubscriptionDestination;

/**
 * Samples for TopicEventSubscriptions CreateOrUpdate.
 */
public final class TopicEventSubscriptionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * TopicEventSubscriptions_CreateOrUpdate.json
     */
    /**
     * Sample code: TopicEventSubscriptions_CreateOrUpdate.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void
        topicEventSubscriptionsCreateOrUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topicEventSubscriptions().createOrUpdate("examplerg", "exampleTopic1", "exampleEventSubscriptionName1",
            new EventSubscriptionInner()
                .withDestination(
                    new WebhookEventSubscriptionDestination().withEndpointUrl("https://requestb.in/15ksip71"))
                .withFilter(new EventSubscriptionFilter().withSubjectBeginsWith("ExamplePrefix")
                    .withSubjectEndsWith("ExampleSuffix").withIsSubjectCaseSensitive(false)),
            com.azure.core.util.Context.NONE);
    }
}
