package X;

/* renamed from: X.Arf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1816Arf {
    public static final long A00 = C1809ArT.A01;

    public static final C1818Arh A00(C1818Arh c1818Arh, C1830Aru c1830Aru, C1804ArN c1804ArN, C1810ArU c1810ArU, As2 as2, int i, int i2, int i3, int i4, long j) {
        C1830Aru c1830Aru2 = c1830Aru;
        C1810ArU c1810ArU2 = c1810ArU;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        long j2 = j;
        C1804ArN c1804ArN2 = c1804ArN;
        As2 as22 = as2;
        boolean zA1Q = AnonymousClass002.A1Q(i5, 0);
        if (zA1Q || i5 == c1818Arh.A02) {
            C1813ArX[] c1813ArXArr = C1809ArT.A02;
            if (((j & 1095216660480L) == 0 || j == c1818Arh.A04) && ((c1810ArU2 == null || c1810ArU2.equals(c1818Arh.A07)) && ((i6 == 0 || i6 == c1818Arh.A03) && ((c1830Aru2 == null || c1830Aru2.equals(c1818Arh.A05)) && ((c1804ArN2 == null || c1804ArN2.equals(c1818Arh.A06)) && ((i7 == 0 || i7 == c1818Arh.A01) && ((i8 == 0 || i8 == c1818Arh.A00) && (as22 == null || as22.equals(c1818Arh.A08))))))))) {
                return c1818Arh;
            }
        }
        C1813ArX[] c1813ArXArr2 = C1809ArT.A02;
        if ((j & 1095216660480L) == 0) {
            j2 = c1818Arh.A04;
        }
        if (c1810ArU2 == null) {
            c1810ArU2 = c1818Arh.A07;
        }
        if (zA1Q) {
            i5 = c1818Arh.A02;
        }
        if (i6 == 0) {
            i6 = c1818Arh.A03;
        }
        C1830Aru c1830Aru3 = c1818Arh.A05;
        if (c1830Aru3 != null) {
            if (c1830Aru2 != null) {
                c1830Aru3 = c1830Aru2;
            }
            c1830Aru2 = c1830Aru3;
        }
        if (c1804ArN2 == null) {
            c1804ArN2 = c1818Arh.A06;
        }
        if (i7 == 0) {
            i7 = c1818Arh.A01;
        }
        if (i8 == 0) {
            i8 = c1818Arh.A00;
        }
        if (as22 == null) {
            as22 = c1818Arh.A08;
        }
        return new C1818Arh(c1830Aru2, c1804ArN2, c1810ArU2, as22, i5, i6, i7, i8, j2);
    }
}
