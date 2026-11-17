package com.facebook.aura.analytics.impl.config;

import com.facebook.aura.partners.voice.session.impl.SessionControllerKt;

/* loaded from: classes5.dex */
public final class MetaAnalyticsMC {
    public final long highBackMaxDelayMsBatch;
    public final long highBackMaxDelayMsSingle;
    public final long highBackMinDelayMsBatch;
    public final long highBackMinDelayMsSingle;
    public final long highForeMaxDelayMsBatch;
    public final long highForeMaxDelayMsSingle;
    public final long highForeMinDelayMsBatch;
    public final long highForeMinDelayMsSingle;
    public final long realTimeExemptLatency;
    public final boolean microBatchEnabled = true;
    public final boolean shouldNotifyOnBatchReady = true;
    public final int multiBatchPayloadSize = 20000;
    public final int analyticsBatchInfoSize = 60;
    public final int regularUploadDelay = 300;
    public final long regularExemptLatency = 300000;
    public final long latencyWindowMultiplier = 1;
    public final long inMemoryUploadDelay = 60000;
    public final String eventLatencyOverride = "{}";
    public final long regularForeMinDelayMsBatch = SessionControllerKt.LIVE_AVATAR_UPDATE_STATUS_TIMEOUT_MS;
    public final long regularForeMaxDelayMsBatch = 300000;
    public final long regularForeMinDelayMsSingle = SessionControllerKt.LIVE_AVATAR_UPDATE_STATUS_TIMEOUT_MS;
    public final long regularForeMaxDelayMsSingle = 300000;
    public final long regularBackMinDelayMsBatch = 300000;
    public final long regularBackMaxDelayMsBatch = 900000;
    public final long regularBackMinDelayMsSingle = 300000;
    public final long regularBackMaxDelayMsSingle = 900000;

    public final int getAnalyticsBatchInfoSize() {
        return this.analyticsBatchInfoSize;
    }

    public final boolean getEnableCC() {
        return true;
    }

    public final boolean getEnableFailOpenSampling() {
        return false;
    }

    public final boolean getEnableOneFabricCleanupIdentities() {
        return false;
    }

    public final boolean getEnablePlatformUploads() {
        return false;
    }

    public final boolean getEnablePlatformUploadsHC() {
        return false;
    }

    public final String getEventLatencyOverride() {
        return this.eventLatencyOverride;
    }

    public final long getHighBackMaxDelayMsBatch() {
        return this.highBackMaxDelayMsBatch;
    }

    public final long getHighBackMaxDelayMsSingle() {
        return this.highBackMaxDelayMsSingle;
    }

    public final long getHighBackMinDelayMsBatch() {
        return this.highBackMinDelayMsBatch;
    }

    public final long getHighBackMinDelayMsSingle() {
        return this.highBackMinDelayMsSingle;
    }

    public final long getHighForeMaxDelayMsBatch() {
        return this.highForeMaxDelayMsBatch;
    }

    public final long getHighForeMaxDelayMsSingle() {
        return this.highForeMaxDelayMsSingle;
    }

    public final long getHighForeMinDelayMsBatch() {
        return this.highForeMinDelayMsBatch;
    }

    public final long getHighForeMinDelayMsSingle() {
        return this.highForeMinDelayMsSingle;
    }

    public final long getInMemoryUploadDelay() {
        return this.inMemoryUploadDelay;
    }

    public final long getLatencyWindowMultiplier() {
        return this.latencyWindowMultiplier;
    }

    public final boolean getMicroBatchEnabled() {
        return this.microBatchEnabled;
    }

    public final int getMultiBatchPayloadSize() {
        return this.multiBatchPayloadSize;
    }

    public final long getRealTimeExemptLatency() {
        return this.realTimeExemptLatency;
    }

    public final long getRegularBackMaxDelayMsBatch() {
        return this.regularBackMaxDelayMsBatch;
    }

    public final long getRegularBackMaxDelayMsSingle() {
        return this.regularBackMaxDelayMsSingle;
    }

    public final long getRegularBackMinDelayMsBatch() {
        return this.regularBackMinDelayMsBatch;
    }

    public final long getRegularBackMinDelayMsSingle() {
        return this.regularBackMinDelayMsSingle;
    }

    public final long getRegularExemptLatency() {
        return this.regularExemptLatency;
    }

    public final long getRegularForeMaxDelayMsBatch() {
        return this.regularForeMaxDelayMsBatch;
    }

    public final long getRegularForeMaxDelayMsSingle() {
        return this.regularForeMaxDelayMsSingle;
    }

    public final long getRegularForeMinDelayMsBatch() {
        return this.regularForeMinDelayMsBatch;
    }

    public final long getRegularForeMinDelayMsSingle() {
        return this.regularForeMinDelayMsSingle;
    }

    public final int getRegularUploadDelay() {
        return this.regularUploadDelay;
    }

    public final boolean getShouldNotifyOnBatchReady() {
        return this.shouldNotifyOnBatchReady;
    }
}
