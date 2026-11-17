package com.facebook.traffic.nts.tasos.http_layer_bwe;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes6.dex */
public final class HttpLayerBweConfigImpl implements HttpLayerBweConfig {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public HttpLayerBweConfigImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native long getCacheSaveMinIntervalSecs();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native short getComputationMode();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native boolean getEnableAdjustmentForUpstreamLatency();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native boolean getEnableBase64EncodingForCache();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native boolean getEnableHttpLayerBweCacheLoad();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native boolean getEnableHttpLayerBweCacheSave();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native double getEwmaAlphaBitrate();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native double getEwmaLowPassFilterAlphaMultiplier();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native double getEwmaMaxBandwidthMultiplier();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native double getEwmaMinBandwidthMultiplier();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native boolean getEwmaUseLowPassFilter();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native long getMaxSamplesToCalculateStats();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native long getMinBytesThreshold();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native long getMinSamplesToCalculateStats();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBweConfig
    public native List<Long> getSizeBucketEdgesBytes();

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("http_layer_bwe");
    }
}
