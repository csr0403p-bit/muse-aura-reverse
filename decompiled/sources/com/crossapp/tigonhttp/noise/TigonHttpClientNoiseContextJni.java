package com.crossapp.tigonhttp.noise;

import X.ES0;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes5.dex */
public final class TigonHttpClientNoiseContextJni {
    public static final ES0 Companion = new ES0();

    public static final native HybridData createNoiseContextNative(TigonServiceHolder tigonServiceHolder, TigonNoiseContextConfig tigonNoiseContextConfig);

    static {
        ETi.loadLibrary("tigonhttpclient-jni");
        ETi.loadLibrary("mnscertificateverifier");
        ETi.loadLibrary("tigon-noise-context-jni");
        ETi.loadLibrary("noise-channel-manager-jni");
    }
}
