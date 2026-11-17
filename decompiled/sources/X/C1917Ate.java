package X;

/* renamed from: X.Ate, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1917Ate {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final C1918Atf A04;

    public final char A01(int i) {
        String str;
        int i2;
        C1918Atf c1918Atf = this.A04;
        C2024Awd c2024Awd = c1918Atf.A02;
        if (c2024Awd == null || i < (i2 = c1918Atf.A01)) {
            str = c1918Atf.A03;
        } else {
            int i3 = c2024Awd.A00;
            int i4 = c2024Awd.A01;
            int i5 = c2024Awd.A02;
            int i6 = i3 - (i4 - i5);
            if (i < i6 + i2) {
                int i7 = i - i2;
                char[] cArr = c2024Awd.A03;
                if (i7 >= i5) {
                    i7 = (i7 - i5) + i4;
                }
                return cArr[i7];
            }
            str = c1918Atf.A03;
            i -= (i6 - c1918Atf.A00) + i2;
        }
        return str.charAt(i);
    }

    public final void A03(int i, int i2) {
        int iA00;
        if (i < 0 || i > (iA00 = this.A04.A00())) {
            throw C8j3.A0y("start (", ") offset is outside of text region ", i, this.A04.A00());
        }
        if (i2 < 0 || i2 > iA00) {
            throw C8j3.A0y("end (", ") offset is outside of text region ", i2, iA00);
        }
        if (i >= i2) {
            throw C8j3.A0v("Do not set reversed or empty range: ", " > ", i, i2);
        }
        this.A01 = i;
        this.A00 = i2;
    }

    public final void A04(int i, int i2) {
        int iA00;
        if (i < 0 || i > (iA00 = this.A04.A00())) {
            throw C8j3.A0y("start (", ") offset is outside of text region ", i, this.A04.A00());
        }
        if (i2 < 0 || i2 > iA00) {
            throw C8j3.A0y("end (", ") offset is outside of text region ", i2, iA00);
        }
        if (i > i2) {
            throw C8j3.A0v("Do not set reversed range: ", " > ", i, i2);
        }
        this.A03 = i;
        this.A02 = i2;
    }

    public final void A05(int i, int i2, String str) {
        C1918Atf c1918Atf;
        int iA00;
        if (i < 0 || i > (iA00 = (c1918Atf = this.A04).A00())) {
            throw C8j3.A0y("start (", ") offset is outside of text region ", i, this.A04.A00());
        }
        if (i2 < 0 || i2 > iA00) {
            throw C8j3.A0y("end (", ") offset is outside of text region ", i2, iA00);
        }
        if (i > i2) {
            throw C8j3.A0v("Do not set reversed range: ", " > ", i, i2);
        }
        c1918Atf.A01(i, i2, str);
        int length = str.length() + i;
        if (length < 0) {
            throw C60O.A0i(FGI.A0H("Cannot set selectionStart to a negative value: ", length));
        }
        this.A03 = length;
        this.A02 = length;
        this.A01 = -1;
        this.A00 = -1;
    }

    public final String toString() {
        return this.A04.toString();
    }

    public C1917Ate(ApQ apQ, long j) {
        int length;
        String str = apQ.A00;
        C1918Atf c1918Atf = new C1918Atf();
        c1918Atf.A03 = str;
        c1918Atf.A01 = -1;
        c1918Atf.A00 = -1;
        this.A04 = c1918Atf;
        int iA02 = Au3.A02(j);
        this.A03 = iA02;
        int iA01 = Au3.A01(j);
        this.A02 = iA01;
        this.A01 = -1;
        this.A00 = -1;
        if (iA02 < 0 || iA02 > (length = apQ.length())) {
            throw C8j3.A0y("start (", ") offset is outside of text region ", iA02, apQ.length());
        }
        if (iA01 < 0 || iA01 > length) {
            throw C8j3.A0y("end (", ") offset is outside of text region ", iA01, length);
        }
        if (iA02 > iA01) {
            throw C8j3.A0v("Do not set reversed range: ", " > ", iA02, iA01);
        }
    }

    public static final long A00(long j, long j2) {
        int iA02 = Au3.A02(j);
        int iA01 = Au3.A01(j);
        int iA022 = Au3.A02(j2);
        boolean zA1T = C8j3.A1T(iA022, iA01);
        int iA012 = Au3.A01(j2);
        if (iA02 < iA012 && (zA1T && true)) {
            if (Au3.A06(j2, j)) {
                iA02 = iA022;
            } else {
                if (!Au3.A06(j, j2)) {
                    if (iA022 <= iA02) {
                        iA02 = iA022;
                    }
                }
                iA01 -= iA012 - iA022;
            }
            iA01 = iA022;
        } else if (iA01 > iA022) {
            iA02 -= iA012 - iA022;
            iA01 -= iA012 - iA022;
        }
        return AbstractC1815ArZ.A00(iA02, iA01);
    }

    public final void A02(int i, int i2) {
        StringBuilder sbA0y;
        int iA01;
        long jA00 = AbstractC1815ArZ.A00(i, i2);
        this.A04.A01(i, i2, "");
        long jA002 = A00(AbstractC1815ArZ.A00(this.A03, this.A02), jA00);
        int iA02 = Au3.A02(jA002);
        if (iA02 >= 0) {
            this.A03 = iA02;
            int iA012 = Au3.A01(jA002);
            if (iA012 >= 0) {
                this.A02 = iA012;
                int i3 = this.A01;
                if (i3 != -1) {
                    long jA003 = A00(AbstractC1815ArZ.A00(i3, this.A00), jA00);
                    if (Au3.A04(jA003)) {
                        iA01 = -1;
                        this.A01 = -1;
                    } else {
                        this.A01 = Au3.A02(jA003);
                        iA01 = Au3.A01(jA003);
                    }
                    this.A00 = iA01;
                    return;
                }
                return;
            }
            sbA0y = C60O.A0y("Cannot set selectionEnd to a negative value: ", iA012);
        } else {
            sbA0y = C60O.A0y("Cannot set selectionStart to a negative value: ", iA02);
        }
        throw C60O.A0i(sbA0y.toString());
    }
}
