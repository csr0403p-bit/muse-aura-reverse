package com.facebook.mobileconfig;

import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public class MobileConfigFetcherHandler {
    public final HybridData mHybridData;

    private native void onCompletion(boolean z, String str);

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }

    public MobileConfigFetcherHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void onComplete(boolean z, String str) {
        onCompletion(z, str);
    }
}
