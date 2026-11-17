package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.AsR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1854AsR {
    public long A00;
    public C1822Arm A01;
    public C2K7 A02;
    public AXN A03;
    public EnumC1820Arj A04;
    public Object A05;
    public final MutableState A06 = AbstractC1798ArH.A08(true);

    public static /* synthetic */ void A00(C1854AsR c1854AsR, C1822Arm c1822Arm, AXN axn, EnumC1820Arj enumC1820Arj, int i) {
        if ((i & 1) != 0) {
            enumC1820Arj = c1854AsR.A04;
        }
        if ((i & 2) != 0) {
            axn = c1854AsR.A03;
        }
        C2K7 c2k7 = c1854AsR.A02;
        if ((i & 8) != 0) {
            c1822Arm = c1854AsR.A01;
        }
        Object obj = c1854AsR.A05;
        if (enumC1820Arj != c1854AsR.A04 || !C7384Etj.areEqual(axn, c1854AsR.A03) || !C7384Etj.areEqual(c2k7, c1854AsR.A02) || !C7384Etj.areEqual(c1822Arm, c1854AsR.A01)) {
            c1854AsR.A04 = enumC1820Arj;
            c1854AsR.A03 = axn;
            c1854AsR.A02 = c2k7;
            c1854AsR.A01 = c1822Arm;
        } else if (C7384Etj.areEqual(obj, c1854AsR.A05)) {
            return;
        } else {
            c1854AsR.A05 = obj;
        }
        MutableState.A09(true, c1854AsR.A06);
    }

    public C1854AsR(C1822Arm c1822Arm, C2K7 c2k7, AXN axn, EnumC1820Arj enumC1820Arj, Object obj) {
        this.A04 = enumC1820Arj;
        this.A03 = axn;
        this.A02 = c2k7;
        this.A01 = c1822Arm;
        this.A05 = obj;
        this.A00 = AbstractC1933Atw.A00(this.A01, this.A02, this.A03, AbstractC1933Atw.A00, 1);
    }
}
