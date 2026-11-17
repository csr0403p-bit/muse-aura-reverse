package com.facebook.traffic.nts.providers.background;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class BackgroundV2TaskSchedulerImplHolder {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public BackgroundV2TaskSchedulerImplHolder(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public static final native BackgroundV2TaskSchedulerImplHolder getInstance();

    public final native BackgroundV2TaskSchedulerAppLayer getBackgroundV2TaskSchedulerAppLayer();

    public final native void setUpcallImpl(BackgroundV2TaskSchedulerAppLayerUpcalls backgroundV2TaskSchedulerAppLayerUpcalls);

    public final class Companion {
        public Companion() {
        }

        public final BackgroundV2TaskSchedulerImplHolder getInstance() {
            return BackgroundV2TaskSchedulerImplHolder.getInstance();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("background");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }
}
