package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public final class Any extends AoF {
    public static Any A03;
    public C1562Alc A00;
    public C1958Aux A01;
    public Rect A02 = new Rect();
    public static final Integer A05 = C79.A01;
    public static final Integer A04 = C79.A00;

    private final int A00(Integer num, int i) {
        C1958Aux c1958Aux = this.A01;
        if (c1958Aux == null) {
            C7384Etj.A0b("layoutResult");
            throw F60.createAndThrow();
        }
        int iA03 = c1958Aux.A03(i);
        C1958Aux c1958Aux2 = this.A01;
        if (c1958Aux2 == null) {
            C7384Etj.A0b("layoutResult");
            throw F60.createAndThrow();
        }
        Integer numA09 = c1958Aux2.A09(iA03);
        C1958Aux c1958Aux3 = this.A01;
        if (num != numA09) {
            if (c1958Aux3 != null) {
                return c1958Aux3.A03(i);
            }
            C7384Etj.A0b("layoutResult");
            throw F60.createAndThrow();
        }
        if (c1958Aux3 != null) {
            return c1958Aux3.A03.A0A(i, false) - 1;
        }
        C7384Etj.A0b("layoutResult");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC1686AoP
    public final int[] ABi(int i) {
        int iA08;
        if (AoF.A01(this) <= 0 || i >= AoF.A01(this)) {
            return null;
        }
        try {
            C1562Alc c1562Alc = this.A00;
            if (c1562Alc == null) {
                C7384Etj.A0b("node");
                throw F60.createAndThrow();
            }
            AaC aaCA05 = c1562Alc.A05();
            int iRound = Math.round(aaCA05.A00 - aaCA05.A03);
            if (0 >= i) {
                i = 0;
            }
            C1958Aux c1958Aux = this.A01;
            if (c1958Aux == null) {
                C7384Etj.A0b("layoutResult");
                throw F60.createAndThrow();
            }
            int iA09 = c1958Aux.A03.A09(i);
            C1958Aux c1958Aux2 = this.A01;
            if (c1958Aux2 == null) {
                C7384Etj.A0b("layoutResult");
                throw F60.createAndThrow();
            }
            float fA07 = c1958Aux2.A03.A07(iA09) + iRound;
            C1958Aux c1958Aux3 = this.A01;
            if (c1958Aux3 == null) {
                C7384Etj.A0b("layoutResult");
                throw F60.createAndThrow();
            }
            float fA072 = c1958Aux3.A03.A07(r1.A02 - 1);
            C1958Aux c1958Aux4 = this.A01;
            if (fA07 < fA072) {
                if (c1958Aux4 == null) {
                    C7384Etj.A0b("layoutResult");
                    throw F60.createAndThrow();
                }
                iA08 = c1958Aux4.A03.A08(fA07);
            } else {
                if (c1958Aux4 == null) {
                    C7384Etj.A0b("layoutResult");
                    throw F60.createAndThrow();
                }
                iA08 = c1958Aux4.A03.A02;
            }
            return A03(i, A00(A04, iA08 - 1) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC1686AoP
    public final int[] AYK(int i) {
        int iA08;
        if (AoF.A01(this) <= 0 || i <= 0) {
            return null;
        }
        try {
            C1562Alc c1562Alc = this.A00;
            if (c1562Alc == null) {
                C7384Etj.A0b("node");
                throw F60.createAndThrow();
            }
            AaC aaCA05 = c1562Alc.A05();
            int iRound = Math.round(aaCA05.A00 - aaCA05.A03);
            int iA01 = AoF.A01(this);
            if (iA01 <= i) {
                i = iA01;
            }
            C1958Aux c1958Aux = this.A01;
            if (c1958Aux == null) {
                C7384Etj.A0b("layoutResult");
                throw F60.createAndThrow();
            }
            int iA09 = c1958Aux.A03.A09(i);
            C1958Aux c1958Aux2 = this.A01;
            if (c1958Aux2 == null) {
                C7384Etj.A0b("layoutResult");
                throw F60.createAndThrow();
            }
            float fA07 = c1958Aux2.A03.A07(iA09) - iRound;
            if (fA07 > 0.0f) {
                C1958Aux c1958Aux3 = this.A01;
                if (c1958Aux3 == null) {
                    C7384Etj.A0b("layoutResult");
                    throw F60.createAndThrow();
                }
                iA08 = c1958Aux3.A03.A08(fA07);
            } else {
                iA08 = 0;
            }
            if (i == AoF.A01(this) && iA08 < iA09) {
                iA08++;
            }
            return A03(A00(A05, iA08), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
