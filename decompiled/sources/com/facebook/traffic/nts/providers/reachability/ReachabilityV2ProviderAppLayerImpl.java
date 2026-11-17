package com.facebook.traffic.nts.providers.reachability;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class ReachabilityV2ProviderAppLayerImpl extends ReachabilityV2ProviderAppLayer {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReachabilityV2ProviderAppLayerImpl(HybridData hybridData) {
        super(hybridData);
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderAppLayer
    public native void updateConnectionType(int i);

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("reachability_provider");
    }
}
