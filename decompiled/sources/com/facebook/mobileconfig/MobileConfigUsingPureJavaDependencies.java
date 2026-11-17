package com.facebook.mobileconfig;

import X.AnonymousClass002;
import X.DSg;
import X.ETi;
import android.content.res.AssetManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public class MobileConfigUsingPureJavaDependencies {
    public static final MobileConfigUsingPureJavaDependencies $redex_init_class = null;
    public final HybridData mHybridData;

    public MobileConfigUsingPureJavaDependencies(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, MobileConfigFetcher mobileConfigFetcher, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger, MobileConfigCxxPerfLogger mobileConfigCxxPerfLogger, MobileConfigExposureHandler mobileConfigExposureHandler) {
        this.mHybridData = initHybrid(androidAsyncExecutorFactory, mobileConfigFetcher, z, mobileConfigCxxLogger, null, null);
    }

    private native MobileConfigManagerHolderImpl createManagerInternal(String str, String str2, String str3, String str4, int i, String str5, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map<String, String> map, MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder);

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, MobileConfigFetcher mobileConfigFetcher, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger, MobileConfigCxxPerfLogger mobileConfigCxxPerfLogger, MobileConfigExposureHandler mobileConfigExposureHandler);

    public static native void setNetworkService(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, MobileConfigFetcher mobileConfigFetcher, boolean z);

    public MobileConfigManagerHolderImpl createManager(File file, String str, String str2, String str3, int i, String str4, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map<String, String> map, MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, DSg dSg, ScheduledExecutorService scheduledExecutorService, boolean z2, FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder) {
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImplCreateManagerInternal = createManagerInternal(file.getPath(), str, str2, str3, i, str4, assetManager, false, mobileConfigManagerParamsHolder, map, null, null);
        if (mobileConfigManagerHolderImplCreateManagerInternal != null && mobileConfigManagerHolderImplCreateManagerInternal.isValid()) {
            mobileConfigManagerHolderImplCreateManagerInternal.mDataDirPath = file.getAbsolutePath();
            mobileConfigManagerHolderImplCreateManagerInternal.mHasSessionId = AnonymousClass002.A1M(str3.isEmpty() ? 1 : 0);
        }
        if (i == 1 && mobileConfigManagerParamsHolder != null) {
            mobileConfigManagerParamsHolder.getFamilyDeviceId();
        }
        return mobileConfigManagerHolderImplCreateManagerInternal;
    }

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }
}
