package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E4R {
    public static final byte[] A04 = {0, 0, 1};
    public int A00;
    public int A01;
    public boolean A02;
    public byte[] A03;

    public final void A00(byte[] bArr, int i, int i2) {
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
}
