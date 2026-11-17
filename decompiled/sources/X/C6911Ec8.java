package X;

/* renamed from: X.Ec8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6911Ec8 {
    public int A00;
    public C6903Ebz[] A01 = new C6903Ebz[8];

    public static final void A00(C6903Ebz c6903Ebz, C6911Ec8 c6911Ec8, int i) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C6903Ebz c6903Ebz2 = c6911Ec8.A01[i2];
            C7384Etj.A0X(c6903Ebz2);
            if (C7384Etj.A01(0L, c6903Ebz.A02 - c6903Ebz2.A02) <= 0) {
                break;
            }
            c6903Ebz2.A00 = i;
            c6911Ec8.A01[i] = c6903Ebz2;
            i = i2;
        }
        c6911Ec8.A01[i] = c6903Ebz;
        c6903Ebz.A00 = i;
    }

    public final void A01(C6903Ebz c6903Ebz) {
        C6903Ebz c6903Ebz2;
        int i = c6903Ebz.A00;
        if (i == -1) {
            throw BV4.A0O();
        }
        int i2 = this.A00;
        C6903Ebz c6903Ebz3 = this.A01[i2];
        C7384Etj.A0X(c6903Ebz3);
        c6903Ebz.A00 = -1;
        C6903Ebz[] c6903EbzArr = this.A01;
        c6903EbzArr[i2] = null;
        this.A00 = i2 - 1;
        if (c6903Ebz != c6903Ebz3) {
            int iA01 = C7384Etj.A01(0L, c6903Ebz3.A02 - c6903Ebz.A02);
            if (iA01 == 0) {
                c6903EbzArr[i] = c6903Ebz3;
            } else {
                if (iA01 >= 0) {
                    A00(c6903Ebz3, this, i);
                    return;
                }
                while (true) {
                    int i3 = i << 1;
                    int i4 = i3 + 1;
                    int i5 = this.A00;
                    if (i4 > i5) {
                        if (i3 > i5) {
                            break;
                        }
                        c6903Ebz2 = c6903EbzArr[i3];
                        C7384Etj.A0X(c6903Ebz2);
                    } else {
                        c6903Ebz2 = c6903EbzArr[i3];
                        C7384Etj.A0X(c6903Ebz2);
                        C6903Ebz c6903Ebz4 = this.A01[i4];
                        C7384Etj.A0X(c6903Ebz4);
                        if (C7384Etj.A01(0L, c6903Ebz4.A02 - c6903Ebz2.A02) >= 0) {
                            c6903Ebz2 = c6903Ebz4;
                        }
                    }
                    if (C7384Etj.A01(0L, c6903Ebz2.A02 - c6903Ebz3.A02) <= 0) {
                        break;
                    }
                    int i6 = c6903Ebz2.A00;
                    c6903Ebz2.A00 = i;
                    c6903EbzArr = this.A01;
                    c6903EbzArr[i] = c6903Ebz2;
                    i = i6;
                }
                this.A01[i] = c6903Ebz3;
            }
            c6903Ebz3.A00 = i;
        }
    }
}
