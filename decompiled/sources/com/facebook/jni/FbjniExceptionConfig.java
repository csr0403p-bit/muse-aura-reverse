package com.facebook.jni;

import X.C3463COl;

/* loaded from: classes5.dex */
public class FbjniExceptionConfig {
    public static native void setFixReleaseThrowableLeak(boolean z);

    static {
        C3463COl.loadLibrary("fbjni");
    }
}
