package com.facebook.privacy.acs;

import X.A8G;
import X.ETi;

/* loaded from: classes4.dex */
public class VoprfRistretto implements A8G {
    public static final VoprfRistretto $redex_init_class = null;

    public static native int sodiumInit();

    @Override // X.A8G
    public native int blind(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // X.A8G
    public native int computeSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // X.A8G
    public native int getCurveBytes();

    @Override // X.A8G
    public native int getCurveScalarBytes();

    @Override // X.A8G
    public native int unblind(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, byte[] bArr5, byte[] bArr6, byte[] bArr7);

    public native int unblindBatched(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, boolean z, byte[] bArr5, byte[] bArr6, byte[] bArr7);

    static {
        ETi.loadLibrary("voprf-ristretto");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }
}
