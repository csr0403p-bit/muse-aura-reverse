package com.crossapp.tigonhttp.noise;

import X.C06H;
import X.ETJ;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class TigonNoiseAttestationVerifier {
    public static final ETJ Companion = new ETJ();
    public final boolean isNoOp;
    public final HybridData mHybridData;

    public static final native HybridData createNoOpNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    static {
        ETi.loadLibrary("tigon-noise-context-jni");
    }

    public final boolean isNoOp() {
        return this.isNoOp;
    }

    public TigonNoiseAttestationVerifier(HybridData hybridData, boolean z) {
        this.mHybridData = hybridData;
        this.isNoOp = z;
    }

    public static final TigonNoiseAttestationVerifier createNoOp() {
        return new TigonNoiseAttestationVerifier(createNoOpNative(), true);
    }

    public /* synthetic */ TigonNoiseAttestationVerifier(HybridData hybridData, boolean z, C06H c06h) {
        this(hybridData, z);
    }
}
