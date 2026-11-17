package com.facebook.traffic.nts.providers.telemetry_claim;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class TelemetryClaimProviderImplHolder {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public TelemetryClaimProviderImplHolder(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public static final native TelemetryClaimProviderImplHolder getInstance();

    public final native TelemetryClaimProviderAppLayer getTelemetryClaimProviderAppLayer();

    public final native void setUpcallImpl(TelemetryClaimProviderAppLayerUpcalls telemetryClaimProviderAppLayerUpcalls);

    public final class Companion {
        public Companion() {
        }

        public final TelemetryClaimProviderImplHolder getInstance() {
            return TelemetryClaimProviderImplHolder.getInstance();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("telemetry_claim_provider");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }
}
