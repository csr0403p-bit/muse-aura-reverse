package com.facebook.quicklog;

/* loaded from: classes5.dex */
public class QuickPerformanceLoggerNativeProvider {
    public static native void nativeUpdateQPLInstance();

    public static long getAppStartTimeMs() {
        return 0L;
    }

    public static QuickPerformanceLogger getQPLInstance() {
        return QuickPerformanceLoggerProvider.getQPLInstance();
    }
}
