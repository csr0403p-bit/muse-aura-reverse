package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E4B {
    public int A00;
    public boolean A01;
    public boolean A02;
    public byte[] A03;
    public final int A04;

    public final void A00(int i) {
        C1G.A08(!this.A02);
        boolean z = i == this.A04;
        this.A02 = z;
        if (z) {
            this.A00 = 3;
            this.A01 = false;
        }
    }

    public final void A01(byte[] bArr, int i, int i2) {
        if (this.A02) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.A03;
            int length = bArrCopyOf.length;
            int i4 = this.A00 + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 * 2);
                this.A03 = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.A00, i3);
            this.A00 += i3;
        }
    }

    public final boolean A02(int i) {
        if (!this.A02) {
            return false;
        }
        this.A00 -= i;
        this.A02 = false;
        this.A01 = true;
        return true;
    }

    public E4B(int i) {
        this.A04 = i;
        byte[] bArr = new byte[131];
        this.A03 = bArr;
        bArr[2] = 1;
    }
}
