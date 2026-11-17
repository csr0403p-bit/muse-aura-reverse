package com.facebook.traffic.nts.providers.background;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class BackgroundV2TaskSchedulerConfigImpl implements BackgroundV2TaskSchedulerConfig {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public BackgroundV2TaskSchedulerConfigImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native boolean getAppWakeupMetricsRecordEnabled();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native boolean getExecuteIfIdleEnabled();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native boolean getExecuteIfNetworkConnectedEnabled();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native long getPeriodicBackgroundJobFlexIntervalSeconds();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native long getSchedulingAlignmentInterval();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native long getTimeoutAwaitSchedulerSeconds();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native boolean getUseCoroutinesForJobExecution();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native boolean getUseCoroutinesForJobScheduling();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native boolean getVerifyNtsManagerEnabled();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerConfig
    public native boolean getVerifyNtsSchedulerEnabled();

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
