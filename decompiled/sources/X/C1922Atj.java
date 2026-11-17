package X;

import java.util.List;

/* renamed from: X.Atj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1922Atj {
    public C1834Ary A00;
    public EnumC1820Arj A01;
    public final ApQ A02;
    public final C1822Arm A03;
    public final C2K7 A04;
    public final AXN A05;
    public final List<C1733ApU<C1821Arl>> A06;
    public final boolean A07;

    public final void A00(EnumC1820Arj enumC1820Arj) {
        C1834Ary c1834Ary = this.A00;
        if (c1834Ary == null || enumC1820Arj != this.A01 || c1834Ary.AG7()) {
            this.A01 = enumC1820Arj;
            c1834Ary = new C1834Ary(this.A02, AbstractC1823Arn.A01(this.A03, enumC1820Arj), this.A04, this.A05, this.A06);
        }
        this.A00 = c1834Ary;
    }

    public C1922Atj(ApQ apQ, C1822Arm c1822Arm, C2K7 c2k7, AXN axn, List list, boolean z) {
        this.A02 = apQ;
        this.A03 = c1822Arm;
        this.A07 = z;
        this.A05 = axn;
        this.A04 = c2k7;
        this.A06 = list;
    }
}
