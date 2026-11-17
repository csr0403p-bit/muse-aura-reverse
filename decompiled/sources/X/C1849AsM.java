package X;

/* renamed from: X.AsM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1849AsM {
    public final C1870Ask A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1849AsM) {
                C1870Ask c1870Ask = this.A00;
                ApQ apQ = c1870Ask.A03;
                C1870Ask c1870Ask2 = ((C1849AsM) obj).A00;
                if (!C7384Etj.areEqual(apQ, c1870Ask2.A03) || !c1870Ask.A04.A03(c1870Ask2.A04) || !C7384Etj.areEqual(c1870Ask.A08, c1870Ask2.A08) || c1870Ask.A00 != c1870Ask2.A00 || c1870Ask.A09 != c1870Ask2.A09 || c1870Ask.A01 != c1870Ask2.A01 || !C7384Etj.areEqual(c1870Ask.A06, c1870Ask2.A06) || c1870Ask.A07 != c1870Ask2.A07 || c1870Ask.A05 != c1870Ask2.A05 || c1870Ask.A02 != c1870Ask2.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C1870Ask c1870Ask = this.A00;
        int iA0E = AnonymousClass005.A0E(c1870Ask.A03);
        C1822Arm c1822Arm = c1870Ask.A04;
        C1824Aro c1824Aro = c1822Arm.A02;
        long j = c1824Aro.A01;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        int iA07 = (((AnonymousClass005.A07(j) + C60R.A01(c1824Aro.A09)) * 31) + C1824Aro.A00(c1824Aro)) * 31;
        B0I b0i = c1824Aro.A08;
        int iA01 = (((iA07 + (b0i != null ? b0i.A00 : 0)) * 31) + C60R.A01(c1824Aro.A06)) * 31;
        String str = c1824Aro.A0F;
        int iA06 = AnonymousClass006.A06(c1824Aro.A02, (iA01 + (str != null ? str.hashCode() : 0)) * 31);
        ArS arS = c1824Aro.A0B;
        int iFloatToIntBits = (((((iA06 + (arS != null ? Float.floatToIntBits(arS.A00) : 0)) * 31) + C60R.A01(c1824Aro.A0E)) * 31) + C60R.A01(c1824Aro.A0A)) * 31;
        long j2 = c1824Aro.A00;
        long j3 = B6A.A01;
        return C8j4.A0B(c1870Ask.A02, AnonymousClass005.A0F(c1870Ask.A05, AnonymousClass005.A0F(c1870Ask.A07, AnonymousClass005.A0F(c1870Ask.A06, (C0KA.A01((AnonymousClass005.A0F(c1870Ask.A08, (iA0E + AnonymousClass005.A0F(c1822Arm.A00, (AnonymousClass006.A06(j2, iFloatToIntBits) + C8j4.A0E(c1824Aro.A05, 0)) * 31) + C60R.A01(c1822Arm.A01)) * 31) + c1870Ask.A00) * 31, c1870Ask.A09) + c1870Ask.A01) * 31))));
    }

    public C1849AsM(C1870Ask c1870Ask) {
        this.A00 = c1870Ask;
    }
}
