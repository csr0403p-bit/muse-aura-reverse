package X;

import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class EIE implements EIB, InterfaceC6578EHw {
    public static final TreeMap<Integer, EIE> A07 = new TreeMap<>();
    public int A00;
    public final double[] A01;
    public final int[] A02;
    public final long[] A03;
    public final String[] A04;
    public final byte[][] A05;
    public volatile String A06;

    @Override // X.EIB
    public final void A5A(int i, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        this.A02[i] = 5;
        this.A05[i] = bArr;
    }

    @Override // X.EIB
    public final void A5E(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.A02[i] = 4;
        this.A04[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.EIB
    public final void A5B(int i, double d) {
        this.A02[i] = 3;
        this.A01[i] = d;
    }

    @Override // X.EIB
    public final void A5C(int i, long j) {
        this.A02[i] = 2;
        this.A03[i] = j;
    }

    @Override // X.EIB
    public final void A5D(int i) {
        this.A02[i] = 1;
    }

    @Override // X.InterfaceC6578EHw
    public final void A5H(EIB eib) {
        int i = this.A00;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.A02[i2];
            if (i3 == 1) {
                eib.A5D(i2);
            } else if (i3 == 2) {
                eib.A5C(i2, this.A03[i2]);
            } else if (i3 == 3) {
                eib.A5B(i2, this.A01[i2]);
            } else if (i3 == 4) {
                String str = this.A04[i2];
                if (str == null) {
                    throw C60O.A0i("Required value was null.");
                }
                eib.A5E(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.A05[i2];
                if (bArr == null) {
                    throw C60O.A0i("Required value was null.");
                }
                eib.A5A(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // X.InterfaceC6578EHw
    public final String AKr() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        throw BV4.A0U();
    }

    public EIE(int i) {
        int i2 = i + 1;
        this.A02 = new int[i2];
        this.A03 = new long[i2];
        this.A01 = new double[i2];
        this.A04 = new String[i2];
        this.A05 = new byte[i2][];
    }
}
