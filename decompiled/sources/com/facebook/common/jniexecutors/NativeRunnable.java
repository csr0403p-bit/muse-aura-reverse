package com.facebook.common.jniexecutors;

import X.C3463COl;
import X.FGI;
import com.facebook.debug.tracer.Tracer;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public class NativeRunnable implements Runnable {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    private final native void nativeRun();

    static {
        C3463COl.loadLibrary("jniexecutors");
    }

    @Override // java.lang.Runnable
    public void run() {
        Tracer.A02("%s", this);
        try {
            nativeRun();
        } finally {
            Tracer.A00();
        }
    }

    public String toString() {
        String str = this.mNativeExecutor;
        return str == null ? "NativeRunnable" : FGI.A0M("NativeRunnable - ", str);
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final void runNativeDirectly() {
        nativeRun();
    }
}
