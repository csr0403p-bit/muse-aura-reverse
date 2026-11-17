package com.facebook.mobileconfig;

import X.ETi;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes5.dex */
public class MobileConfigCrashReportUtils {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void addCanaryData(String str, String str2);

    public native void clear();

    public native long count();

    public native Map<String, String> getAllCanaryData();

    public native Map<String, Long> getAllLastFetchTimestamps();

    public native void setUpdateListener(MobileConfigCanaryChangeListener mobileConfigCanaryChangeListener);

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }
}
