package com.facebook.jni;

import X.C3463COl;

/* loaded from: classes5.dex */
public class Countable {
    public long mInstance = 0;

    public native void dispose();

    static {
        C3463COl.loadLibrary("fb");
    }

    public void finalize() {
        dispose();
    }
}
