package com.facebook.tigon.iface;

import X.C06H;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public class HttpPriorityContext {
    public HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }

    public HttpPriorityContext(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final void setMHybridData(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public /* synthetic */ HttpPriorityContext(HybridData hybridData, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public HttpPriorityContext() {
        this(null);
    }
}
