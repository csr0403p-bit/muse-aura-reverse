package com.facebook.traffic.nts.providers.background;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class BackgroundV2TaskSchedulerAppLayerUpcallsImpl implements BackgroundV2TaskSchedulerAppLayerUpcalls {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public BackgroundV2TaskSchedulerAppLayerUpcallsImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public native void cancel();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public native BackgroundV2TaskSchedulerConfig getConfig();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public native void refresh(long j);

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("background");
    }
}
