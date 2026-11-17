package com.facebook.traffic.nts.providers.reachability;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class ReachabilityV2ProviderImplHolder {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public ReachabilityV2ProviderImplHolder(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public static final native ReachabilityV2ProviderImplHolder getInstance();

    public final native ReachabilityV2ProviderAppLayer getReachabilityV2ProviderAppLayer();

    public final native void setUpcallImpl(ReachabilityV2ProviderAppLayerUpcalls reachabilityV2ProviderAppLayerUpcalls);

    public final class Companion {
        public Companion() {
        }

        public final ReachabilityV2ProviderImplHolder getInstance() {
            return ReachabilityV2ProviderImplHolder.getInstance();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("reachability_provider");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }
}
