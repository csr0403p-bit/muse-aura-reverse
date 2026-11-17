package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class HD5 {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public HD5() {
        this(null, null, null, null, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                HD5 hd5 = (HD5) obj;
                if (!Arrays.equals(this.A01, hd5.A01) || !Arrays.equals(this.A04, hd5.A04) || !Arrays.equals(this.A02, hd5.A02) || !Arrays.equals(this.A03, hd5.A03) || this.A00 != hd5.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.A04);
        int iHashCode2 = iHashCode + (iHashCode * 31) + Arrays.hashCode(this.A02);
        return iHashCode2 + (iHashCode2 * 31) + Arrays.hashCode(this.A03);
    }

    public HD5(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        byte[] bArrCopyOf;
        byte[] bArrCopyOf2;
        byte[] bArrCopyOf3;
        if (bArr != null) {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        } else {
            bArrCopyOf = null;
        }
        this.A01 = bArrCopyOf;
        if (bArr2 != null) {
            bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArrCopyOf2 = null;
        }
        this.A04 = bArrCopyOf2;
        if (bArr3 != null) {
            bArrCopyOf3 = Arrays.copyOf(bArr3, bArr3.length);
        } else {
            bArrCopyOf3 = null;
        }
        this.A02 = bArrCopyOf3;
        this.A03 = bArr4 != null ? Arrays.copyOf(bArr4, bArr4.length) : null;
        this.A00 = i;
    }
}
