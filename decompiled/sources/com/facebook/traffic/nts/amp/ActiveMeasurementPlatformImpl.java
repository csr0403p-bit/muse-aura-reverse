package com.facebook.traffic.nts.amp;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class ActiveMeasurementPlatformImpl implements ActiveMeasurementPlatform {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public ActiveMeasurementPlatformImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("activemeasurementplatform");
    }
}
