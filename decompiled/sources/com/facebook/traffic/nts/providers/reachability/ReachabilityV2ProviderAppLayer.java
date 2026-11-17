package com.facebook.traffic.nts.providers.reachability;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public abstract class ReachabilityV2ProviderAppLayer {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public ReachabilityV2ProviderAppLayer(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
        initializeSelfReference(this);
    }

    public static final native HybridData initHybrid0();

    private final native void initializeSelfReference(ReachabilityV2ProviderAppLayer reachabilityV2ProviderAppLayer);

    public abstract void updateConnectionType(int i);

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final HybridData initHybrid0() {
            return ReachabilityV2ProviderAppLayer.initHybrid0();
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("reachability_provider");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }

    public ReachabilityV2ProviderAppLayer() {
        this(initHybrid0());
    }
}
