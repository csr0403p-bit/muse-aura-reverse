package com.facebook.mobileconfig;

import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public class MobileConfigCoreParams {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native boolean isMCListEnabled();

    public native void setMCListEnabled(boolean z);

    public native void setSkipBufferVerification(boolean z);

    public native boolean skipBufferVerification();

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }
}
