package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Atx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1934Atx {
    public static C1934Atx A07;
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public final C1822Arm A02;
    public final C2K7 A03;
    public final AXN A04;
    public final EnumC1820Arj A05;
    public final C1822Arm A06;

    public static final C1934Atx A00(C1934Atx c1934Atx, C1822Arm c1822Arm, C2K7 c2k7, AXN axn, EnumC1820Arj enumC1820Arj) {
        if (c1934Atx != null && enumC1820Arj == c1934Atx.A05 && AbstractC1823Arn.A01(c1822Arm, enumC1820Arj).equals(c1934Atx.A02) && axn.AEm() == c1934Atx.A04.AEm() && c2k7 == c1934Atx.A03) {
            return c1934Atx;
        }
        C1934Atx c1934Atx2 = A07;
        if (c1934Atx2 != null && enumC1820Arj == c1934Atx2.A05 && AbstractC1823Arn.A01(c1822Arm, enumC1820Arj).equals(c1934Atx2.A02) && axn.AEm() == c1934Atx2.A04.AEm() && c2k7 == c1934Atx2.A03) {
            return c1934Atx2;
        }
        C1934Atx c1934Atx3 = new C1934Atx(AbstractC1823Arn.A01(c1822Arm, enumC1820Arj), c2k7, new ATH(axn.AEm(), axn.AFo()), enumC1820Arj);
        A07 = c1934Atx3;
        return c1934Atx3;
    }

    public final long A01(long j, int i) {
        int iA02;
        float fAGD = this.A01;
        float fAGD2 = this.A00;
        if (Float.isNaN(fAGD) || Float.isNaN(fAGD2)) {
            String str = AbstractC2028Awh.A00;
            C1822Arm c1822Arm = this.A06;
            long jA06 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            AXN axn = this.A04;
            C2K7 c2k7 = this.A03;
            C0881AGi c0881AGi = C0881AGi.A00;
            fAGD = new C1957Auw(new C1833Arx(c1822Arm, c2k7, axn, str, c0881AGi, c0881AGi), 1, 1, jA06).AGD();
            fAGD2 = new C1957Auw(new C1833Arx(c1822Arm, c2k7, axn, AbstractC2028Awh.A01, c0881AGi, c0881AGi), 2, 1, AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE)).AGD() - fAGD;
            this.A01 = fAGD;
            this.A00 = fAGD2;
        }
        if (i != 1) {
            iA02 = Math.round(fAGD + (fAGD2 * (i - 1)));
            if (iA02 < 0) {
                iA02 = 0;
            }
            int iA00 = Constraints.A00(j);
            if (iA02 > iA00) {
                iA02 = iA00;
            }
        } else {
            iA02 = Constraints.A02(j);
        }
        return AYL.A05(Constraints.A03(j), Constraints.A01(j), iA02, Constraints.A00(j));
    }

    public C1934Atx(C1822Arm c1822Arm, C2K7 c2k7, AXN axn, EnumC1820Arj enumC1820Arj) {
        this.A05 = enumC1820Arj;
        this.A02 = c1822Arm;
        this.A04 = axn;
        this.A03 = c2k7;
        this.A06 = AbstractC1823Arn.A01(c1822Arm, enumC1820Arj);
    }
}
