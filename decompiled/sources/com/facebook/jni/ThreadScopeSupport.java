package com.facebook.jni;

import X.C3463COl;

/* loaded from: classes5.dex */
public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    static {
        C3463COl.loadLibrary("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
