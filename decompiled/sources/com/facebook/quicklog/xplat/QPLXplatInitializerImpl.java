package com.facebook.quicklog.xplat;

import X.AnonymousClass003;
import X.C7384Etj;
import X.DJU;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes5.dex */
public final class QPLXplatInitializerImpl {
    public static volatile boolean isLibraryLoaded;
    public static HybridData mHybridData;

    public static final native HybridData initHybrid();

    public static final native void onConfigBeenUpdatedNative();

    public static final native void setReleaseFlagsNative(QuickPerformanceLoggerGKs quickPerformanceLoggerGKs);

    public static final native void setupNativeQPLWithXAnalyticsHolder(XAnalyticsHolder xAnalyticsHolder, String str);

    public /* synthetic */ void initialize(DJU dju, QuickPerformanceLoggerGKs quickPerformanceLoggerGKs) {
        C7384Etj.A0Y(dju, 1);
        initialize(dju, quickPerformanceLoggerGKs, "");
    }

    public void loadNativeLibrary() {
        if (isLibraryLoaded) {
            return;
        }
        synchronized (QPLXplatInitializerImpl.class) {
            if (!isLibraryLoaded) {
                ETi.loadLibrary("perfloggerxplat_init");
                mHybridData = initHybrid();
                isLibraryLoaded = true;
            }
        }
    }

    public void onConfigBeenUpdated() {
        if (isLibraryLoaded) {
            onConfigBeenUpdatedNative();
        }
    }

    public void setReleaseFlags(QuickPerformanceLoggerGKs quickPerformanceLoggerGKs) {
        if (isLibraryLoaded) {
            setReleaseFlagsNative(quickPerformanceLoggerGKs);
        }
    }

    public static final XAnalyticsHolder nativeHolderOrNull(DJU dju) {
        return dju.getXAnalyticsNative();
    }

    public void initialize(DJU dju, QuickPerformanceLoggerGKs quickPerformanceLoggerGKs, String str) {
        AnonymousClass003.A0v(dju, str);
        loadNativeLibrary();
        XAnalyticsHolder xAnalyticsNative = dju.getXAnalyticsNative();
        if (xAnalyticsNative != null) {
            if (QuickPerformanceLoggerProvider.getQPLInstance() != null) {
                setupNativeQPLWithXAnalyticsHolder(xAnalyticsNative, str);
                setReleaseFlags(quickPerformanceLoggerGKs);
                return;
            }
            throw new QPLXplatInitializer$QPLXplatInitializationException("Call QuickPerformanceLoggerProvider.setQuickPerformanceLogger(qplInstance) before calling QPLXplatInitializer.initialize(xAnalytixAnalyticsProvider)");
        }
    }
}
