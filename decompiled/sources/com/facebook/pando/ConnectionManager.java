package com.facebook.pando;

import X.ETi;
import com.facebook.jni.HybridClassBase;

/* loaded from: classes5.dex */
public final class ConnectionManager extends HybridClassBase {
    private final native void initHybrid();

    static {
        ETi.loadLibrary("pando-connection-jni");
    }

    public ConnectionManager() {
        initHybrid();
    }
}
