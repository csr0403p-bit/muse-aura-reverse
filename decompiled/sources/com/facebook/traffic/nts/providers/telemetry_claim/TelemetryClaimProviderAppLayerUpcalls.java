package com.facebook.traffic.nts.providers.telemetry_claim;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public abstract class TelemetryClaimProviderAppLayerUpcalls {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid0();

    private final native void initializeSelfReference(TelemetryClaimProviderAppLayerUpcalls telemetryClaimProviderAppLayerUpcalls);

    public abstract TrafficTelemetryClaim getTrafficTelemetryClaim();

    public final class Companion {
        public Companion() {
        }

        private final HybridData initHybrid0() {
            return TelemetryClaimProviderAppLayerUpcalls.initHybrid0();
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

    public TelemetryClaimProviderAppLayerUpcalls() {
        this(initHybrid0());
    }

    public TelemetryClaimProviderAppLayerUpcalls(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
        initializeSelfReference(this);
    }
}
