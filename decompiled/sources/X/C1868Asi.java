package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Asi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1868Asi {
    public final C2K7 A00;
    public final AXN A01;
    public final EnumC1820Arj A02;
    public final C1869Asj A03;

    public static /* synthetic */ C1958Aux A01(C1868Asi c1868Asi, C1822Arm c1822Arm, String str, int i, int i2, long j) {
        int i3 = i;
        long jA06 = j;
        boolean zA1L = AnonymousClass002.A1L(i2 & 8);
        if ((i2 & 16) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i2 & 32) != 0) {
            jA06 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        }
        EnumC1820Arj enumC1820Arj = c1868Asi.A02;
        AXN axn = c1868Asi.A01;
        C2K7 c2k7 = c1868Asi.A00;
        C0881AGi c0881AGi = C0881AGi.A00;
        return A00(new ApQ(str, c0881AGi), c1868Asi, c1822Arm, c2k7, axn, enumC1820Arj, c0881AGi, 1, i3, jA06, zA1L);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ApQ;LX/Arm;IZILjava/util/List<LX/ApU<LX/Arl;>;>;JLX/Arj;LX/AXN;LX/2K7;Z)LX/Aux; */
    public static final C1958Aux A00(ApQ apQ, C1868Asi c1868Asi, C1822Arm c1822Arm, C2K7 c2k7, AXN axn, EnumC1820Arj enumC1820Arj, List list, int i, int i2, long j, boolean z) {
        int i3;
        int i4;
        C1958Aux c1958AuxA02;
        C1870Ask c1870Ask = new C1870Ask(apQ, c1822Arm, c2k7, axn, enumC1820Arj, list, i2, i, j, z);
        C1869Asj c1869Asj = c1868Asi.A03;
        if (c1869Asj != null) {
            C1849AsM c1849AsM = new C1849AsM(c1870Ask);
            C7523EzA<C1849AsM, C1958Aux> c7523EzA = c1869Asj.A02;
            if (c7523EzA != null) {
                c1958AuxA02 = c7523EzA.A02(c1849AsM);
            } else if (C7384Etj.areEqual(c1869Asj.A00, c1849AsM)) {
                c1958AuxA02 = c1869Asj.A01;
            }
            if (c1958AuxA02 != null) {
                C1956Auv c1956Auv = c1958AuxA02.A03;
                if (!c1956Auv.A04.AG7()) {
                    return new C1958Aux(c1956Auv, c1870Ask, AYL.A09(j, AnonymousClass007.A0C(C8j3.A08(c1956Auv.A01), C8j3.A08(c1956Auv.A00))));
                }
            }
        }
        C1834Ary c1834Ary = new C1834Ary(c1870Ask.A03, AbstractC1823Arn.A01(c1870Ask.A04, c1870Ask.A07), c1870Ask.A05, c1870Ask.A06, c1870Ask.A08);
        long j2 = c1870Ask.A02;
        int iA03 = Constraints.A03(j2);
        boolean z2 = c1870Ask.A09;
        int iA01 = ((z2 || (i4 = c1870Ask.A01) == 2 || i4 == 4 || i4 == 5) && Constraints.A0A(j2)) ? Constraints.A01(j2) : Integer.MAX_VALUE;
        int i5 = (z2 || !((i3 = c1870Ask.A01) == 2 || i3 == 4 || i3 == 5)) ? c1870Ask.A00 : 1;
        if (iA03 != iA01) {
            iA01 = ATD.A04(C8j3.A08(c1834Ary.AHR()), iA03, iA01);
        }
        C1956Auv c1956Auv2 = new C1956Auv(c1834Ary, i5, c1870Ask.A01, Constraints.A07(0, iA01, 0, Constraints.A00(j2)));
        C1958Aux c1958Aux = new C1958Aux(c1956Auv2, c1870Ask, AYL.A09(j2, AnonymousClass007.A0C(C8j3.A08(c1956Auv2.A01), C8j3.A08(c1956Auv2.A00))));
        if (c1869Asj == null) {
            return c1958Aux;
        }
        C7523EzA<C1849AsM, C1958Aux> c7523EzA2 = c1869Asj.A02;
        if (c7523EzA2 != null) {
            c7523EzA2.A05(new C1849AsM(c1870Ask), c1958Aux);
            return c1958Aux;
        }
        c1869Asj.A00 = new C1849AsM(c1870Ask);
        c1869Asj.A01 = c1958Aux;
        return c1958Aux;
    }

    public C1868Asi(C2K7 c2k7, AXN axn, EnumC1820Arj enumC1820Arj, int i) {
        this.A00 = c2k7;
        this.A01 = axn;
        this.A02 = enumC1820Arj;
        this.A03 = i > 0 ? new C1869Asj(i) : null;
    }
}
