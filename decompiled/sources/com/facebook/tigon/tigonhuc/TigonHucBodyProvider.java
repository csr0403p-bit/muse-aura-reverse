package com.facebook.tigon.tigonhuc;

import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class TigonHucBodyProvider {
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native void beginStream(HucBodyStream hucBodyStream);

    static {
        ETi.loadLibrary("tigonhuc");
    }

    public TigonHucBodyProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
