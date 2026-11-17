package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E39 extends AbstractC6395E3x {
    public boolean A00;
    public static final byte[] A02 = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A01 = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean A00(E1P e1p, byte[] bArr) {
        if (e1p.A04() < 8) {
            return false;
        }
        int i = e1p.A01;
        byte[] bArr2 = new byte[8];
        e1p.A0U(bArr2, 0, 8);
        e1p.A0R(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // X.AbstractC6395E3x
    public final void A01(boolean z) {
        super.A01(z);
        if (z) {
            this.A00 = false;
        }
    }
}
