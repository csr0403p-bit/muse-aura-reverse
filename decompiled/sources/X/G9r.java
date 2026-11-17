package X;

/* loaded from: classes6.dex */
public abstract class G9r {
    public static void A01(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static long A00(byte[] bArr, int i) {
        int i2 = i + 4;
        return ((((bArr[i2 + 3] << 24) | (AbstractC7608F5v.A0C(bArr, i2 + 1, bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L) << 32) | (4294967295L & ((bArr[i + 3] << 24) | AbstractC7608F5v.A0C(bArr, i + 1, bArr[i] & 255) | ((bArr[i + 2] & 255) << 16)));
    }
}
