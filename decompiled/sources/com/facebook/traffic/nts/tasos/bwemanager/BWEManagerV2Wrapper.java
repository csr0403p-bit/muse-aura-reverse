package com.facebook.traffic.nts.tasos.bwemanager;

import X.C06H;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class BWEManagerV2Wrapper implements BWEManagerV2 {
    public static final Companion Companion = new Companion();
    public final HybridData hybridData;
    public final HybridData mHybridData;

    @Override // com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2
    public native FbFeedEstimateSnapshot getFbFeedEstimateSnapshot();

    @Override // com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2
    public native FbImageEstimateSnapshot getFbImageEstimateSnapshot();

    @Override // com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2
    public native Long getUnscaledTasosBweEstimate(BWEManagerV2RequestContext bWEManagerV2RequestContext);

    @Override // com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2
    public native BweWithMetadata getUnscaledTasosBweWithMetadata(BWEManagerV2RequestContext bWEManagerV2RequestContext);

    @Override // com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2
    public native VideoEstimateSnapshot getVideoEstimateSnapshot(BWEManagerV2RequestContext bWEManagerV2RequestContext, ClientVideoEstimateSnapshot clientVideoEstimateSnapshot);

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("bwemanager");
    }

    public BWEManagerV2Wrapper(HybridData hybridData) {
        this.hybridData = hybridData;
        this.mHybridData = hybridData;
    }
}
