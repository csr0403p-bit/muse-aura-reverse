package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class HjR {
    public static final int[] A02 = {8000, 8000, 2000, 2000};
    public static final int[] A03 = {4000, 4000, 200, 200};
    public final AtomicReferenceArray<byte[]> A00 = new AtomicReferenceArray<>(4);
    public final AtomicReferenceArray<char[]> A01 = new AtomicReferenceArray<>(4);

    public static final byte[] A00(HjR hjR, int i) {
        int i2 = A02[i];
        int i3 = 0 < i2 ? i2 : 0;
        byte[] andSet = hjR.A00.getAndSet(i, null);
        return (andSet == null || andSet.length < i3) ? new byte[i3] : andSet;
    }

    public final void A01(int i, byte[] bArr) {
        AtomicReferenceArray<byte[]> atomicReferenceArray = this.A00;
        byte[] bArr2 = atomicReferenceArray.get(i);
        if (bArr2 == null || bArr.length > bArr2.length) {
            atomicReferenceArray.set(i, bArr);
        }
    }

    public final void A02(char[] cArr, int i) {
        AtomicReferenceArray<char[]> atomicReferenceArray = this.A01;
        char[] cArr2 = atomicReferenceArray.get(i);
        if (cArr2 == null || cArr.length > cArr2.length) {
            atomicReferenceArray.set(i, cArr);
        }
    }

    public final char[] A03(int i, int i2) {
        int i3 = A03[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] andSet = this.A01.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? new char[i2] : andSet;
    }
}
