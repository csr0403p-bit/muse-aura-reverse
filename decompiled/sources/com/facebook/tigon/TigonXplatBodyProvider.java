package com.facebook.tigon;

import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public abstract class TigonXplatBodyProvider extends TigonBodyProvider {
    public static final TigonXplatBodyProvider $redex_init_class = null;

    private native HybridData initHybrid();

    static {
        ETi.loadLibrary("tigonjni");
    }

    public TigonXplatBodyProvider() {
        this.mHybridData = initHybrid();
    }
}
