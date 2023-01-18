// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetFilterInner;
import com.azure.resourcemanager.mediaservices.models.FilterTrackSelection;
import com.azure.resourcemanager.mediaservices.models.FirstQuality;
import com.azure.resourcemanager.mediaservices.models.PresentationTimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AssetFilterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssetFilterInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"presentationTimeRange\":{\"startTimestamp\":6050958993805304885,\"endTimestamp\":988487328349657078,\"presentationWindowDuration\":4353962267137944263,\"liveBackoffDuration\":4045271831667825207,\"timescale\":5126500575476383860,\"forceEndTimestamp\":true},\"firstQuality\":{\"bitrate\":974818519},\"tracks\":[{\"trackSelections\":[]},{\"trackSelections\":[]},{\"trackSelections\":[]},{\"trackSelections\":[]}]},\"id\":\"xnkjzkdesl\",\"name\":\"vlopwiyighx\",\"type\":\"kdwzbaiuebbaumny\"}")
                .toObject(AssetFilterInner.class);
        Assertions.assertEquals(6050958993805304885L, model.presentationTimeRange().startTimestamp());
        Assertions.assertEquals(988487328349657078L, model.presentationTimeRange().endTimestamp());
        Assertions.assertEquals(4353962267137944263L, model.presentationTimeRange().presentationWindowDuration());
        Assertions.assertEquals(4045271831667825207L, model.presentationTimeRange().liveBackoffDuration());
        Assertions.assertEquals(5126500575476383860L, model.presentationTimeRange().timescale());
        Assertions.assertEquals(true, model.presentationTimeRange().forceEndTimestamp());
        Assertions.assertEquals(974818519, model.firstQuality().bitrate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssetFilterInner model =
            new AssetFilterInner()
                .withPresentationTimeRange(
                    new PresentationTimeRange()
                        .withStartTimestamp(6050958993805304885L)
                        .withEndTimestamp(988487328349657078L)
                        .withPresentationWindowDuration(4353962267137944263L)
                        .withLiveBackoffDuration(4045271831667825207L)
                        .withTimescale(5126500575476383860L)
                        .withForceEndTimestamp(true))
                .withFirstQuality(new FirstQuality().withBitrate(974818519))
                .withTracks(
                    Arrays
                        .asList(
                            new FilterTrackSelection().withTrackSelections(Arrays.asList()),
                            new FilterTrackSelection().withTrackSelections(Arrays.asList()),
                            new FilterTrackSelection().withTrackSelections(Arrays.asList()),
                            new FilterTrackSelection().withTrackSelections(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(AssetFilterInner.class);
        Assertions.assertEquals(6050958993805304885L, model.presentationTimeRange().startTimestamp());
        Assertions.assertEquals(988487328349657078L, model.presentationTimeRange().endTimestamp());
        Assertions.assertEquals(4353962267137944263L, model.presentationTimeRange().presentationWindowDuration());
        Assertions.assertEquals(4045271831667825207L, model.presentationTimeRange().liveBackoffDuration());
        Assertions.assertEquals(5126500575476383860L, model.presentationTimeRange().timescale());
        Assertions.assertEquals(true, model.presentationTimeRange().forceEndTimestamp());
        Assertions.assertEquals(974818519, model.firstQuality().bitrate());
    }
}