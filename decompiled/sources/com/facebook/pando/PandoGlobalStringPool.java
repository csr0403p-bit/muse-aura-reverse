package com.facebook.pando;

import X.ETi;
import com.facebook.jni.HybridClassBase;

/* loaded from: classes5.dex */
public final class PandoGlobalStringPool extends HybridClassBase {
    public static final native void enablePoolShortStrings();

    public static final native void enableStringPooling();

    public static final native void initialize();

    static {
        ETi.loadLibrary("pando-jni");
    }
}
