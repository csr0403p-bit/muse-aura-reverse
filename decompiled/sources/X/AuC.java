package X;

/* loaded from: classes4.dex */
public abstract class AuC {
    public static final void A01(C1891AtA c1891AtA, int i, int i2) {
        C1919Atg c1919Atg = c1891AtA.A05;
        c1891AtA.A04(AbstractC1815ArZ.A00(ATD.A04(i, 0, c1919Atg.length()), ATD.A04(i2, 0, c1919Atg.length())));
    }

    public static final long A00(int i, int i2, int i3, long j) {
        int i4;
        int iA02 = Au3.A02(j);
        int iA01 = Au3.A01(j);
        if (iA01 < i) {
            return j;
        }
        if (iA02 <= i && i2 <= iA01) {
            i4 = i3 - (i2 - i);
            if (iA02 == iA01) {
                iA02 += i4;
            }
            i = iA01 + i4;
        } else if (iA02 > i && iA01 < i2) {
            i += i3;
            iA02 = i;
        } else if (iA02 >= i2) {
            i4 = i3 - (i2 - i);
            iA02 += i4;
            i = iA01 + i4;
        } else if (i < iA02) {
            iA02 = i + i3;
            i4 = i3 - (i2 - i);
            i = iA01 + i4;
        }
        return AbstractC1815ArZ.A00(iA02, i);
    }
}
