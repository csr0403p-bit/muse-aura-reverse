package X;

import java.io.EOFException;

/* loaded from: classes5.dex */
public final class E2H {
    public final E1P A00 = BV6.A0Y(10);

    public final C5402Dhv A00(E2K e2k, E5T e5t) {
        C5402Dhv c5402DhvA06 = null;
        int i = 0;
        while (true) {
            try {
                E1P e1p = this.A00;
                e2k.AXi(e1p.A02, 0, 10);
                e1p.A0R(0);
                if (e1p.A0B() != 4801587) {
                    break;
                }
                e1p.A0S(3);
                int iA09 = e1p.A09();
                int i2 = iA09 + 10;
                if (c5402DhvA06 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(e1p.A02, 0, bArr, 0, 10);
                    e2k.AXi(bArr, 10, iA09);
                    c5402DhvA06 = new E2P(e5t).A06(bArr, i2);
                } else {
                    e2k.A47(iA09);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        e2k.AbN();
        e2k.A47(i);
        return c5402DhvA06;
    }
}
