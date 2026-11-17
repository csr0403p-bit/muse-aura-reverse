package X;

/* loaded from: classes4.dex */
public interface A8G {
    int blind(byte[] bArr, byte[] bArr2, byte[] bArr3);

    int computeSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3);

    int getCurveBytes();

    int getCurveScalarBytes();

    int unblind(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, byte[] bArr5, byte[] bArr6, byte[] bArr7);
}
