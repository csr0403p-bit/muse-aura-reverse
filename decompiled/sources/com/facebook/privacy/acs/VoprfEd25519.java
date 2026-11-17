package com.facebook.privacy.acs;

import X.A8G;
import X.ETi;

/* loaded from: classes4.dex */
public class VoprfEd25519 implements A8G {
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

    public native int verify(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static {
        ETi.loadLibrary("voprf-ed25519");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }
}
