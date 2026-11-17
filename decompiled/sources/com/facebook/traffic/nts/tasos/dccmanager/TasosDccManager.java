package com.facebook.traffic.nts.tasos.dccmanager;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class TasosDccManager {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public TasosDccManager(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public final native DccStateSnapshot getDccStateSnapshot();

    public final native boolean shouldApplyDccTreatment(int i);

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("dccmanager");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }
}
