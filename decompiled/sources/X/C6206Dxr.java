package X;

/* renamed from: X.Dxr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6206Dxr {
    public final String A00;

    public static C6206Dxr A00(E1P e1p) {
        String str;
        String strA1O;
        String str2;
        boolean zA03 = AbstractC5653Dmh.A03(EnumC5618Dlz.A0m);
        int iA06 = BV6.A06(e1p, 2);
        int i = iA06 >> 1;
        int iA0A = ((e1p.A0A() >> 3) & 31) | ((iA06 & 1) << 5);
        if (zA03) {
            if (i == 4 || i == 5 || i == 7 || i == 8) {
                str = "dvhe";
            } else if (i == 9) {
                str = "dvav";
            } else {
                if (i != 10) {
                    return null;
                }
                str = "dav1";
            }
            StringBuilder sbA0g = C3cG.A0g(str);
            sbA0g.append(i < 10 ? ".0" : ".");
            sbA0g.append(i);
            strA1O = C60P.A1O(iA0A >= 10 ? "." : ".0", sbA0g, iA0A);
        } else {
            if (i == 4 || i == 5 || i == 7) {
                str2 = "dvhe";
            } else if (i == 8) {
                str2 = "hev1";
            } else {
                if (i != 9) {
                    return null;
                }
                str2 = "avc3";
            }
            StringBuilder sbA0g2 = C3cG.A0g(str2);
            sbA0g2.append(".0");
            sbA0g2.append(i);
            strA1O = C60P.A1O(iA0A >= 10 ? "." : ".0", sbA0g2, iA0A);
        }
        return new C6206Dxr(strA1O);
    }

    public C6206Dxr(String str) {
        this.A00 = str;
    }
}
