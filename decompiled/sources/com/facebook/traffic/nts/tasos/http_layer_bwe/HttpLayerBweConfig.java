package com.facebook.traffic.nts.tasos.http_layer_bwe;

import java.util.List;

/* loaded from: classes6.dex */
public interface HttpLayerBweConfig {
    long getCacheSaveMinIntervalSecs();

    short getComputationMode();

    boolean getEnableAdjustmentForUpstreamLatency();

    boolean getEnableBase64EncodingForCache();

    boolean getEnableHttpLayerBweCacheLoad();

    boolean getEnableHttpLayerBweCacheSave();

    double getEwmaAlphaBitrate();

    double getEwmaLowPassFilterAlphaMultiplier();

    double getEwmaMaxBandwidthMultiplier();

    double getEwmaMinBandwidthMultiplier();

    boolean getEwmaUseLowPassFilter();

    long getMaxSamplesToCalculateStats();

    long getMinBytesThreshold();

    long getMinSamplesToCalculateStats();

    List<Long> getSizeBucketEdgesBytes();
}
