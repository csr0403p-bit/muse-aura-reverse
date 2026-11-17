package X;

/* renamed from: X.Al8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1545Al8 implements InterfaceC1550AlF, ASS {
    public C0918AHu<C1546Al9, C1547AlA> A00;
    public C1546Al9 A01;

    @Override // X.InterfaceC1550AlF
    public final C1547AlA ARa(C1DM c1dm, C1543Al6 c1543Al6, AXN axn, EnumC1820Arj enumC1820Arj, long j) {
        C1547AlA c1547AlAA05;
        synchronized (this) {
            C1546Al9 c1546Al9 = this.A01;
            if (c1546Al9 == null) {
                C1DM c1dm2 = C1OM.A00;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                c1546Al9 = new C1546Al9();
                c1546Al9.A02 = c1dm2;
                c1546Al9.A01 = 0L;
                c1546Al9.A04 = enumC1820Arj2;
                c1546Al9.A00 = 1.0f;
                c1546Al9.A03 = null;
                this.A01 = c1546Al9;
            }
            c1546Al9.A02 = c1dm;
            c1546Al9.A01 = j;
            c1546Al9.A04 = enumC1820Arj;
            c1546Al9.A00 = axn.AEm();
            c1546Al9.A03 = new C1543Al6(c1543Al6.A06, c1543Al6.A01, c1543Al6.A02, c1543Al6.A00, c1543Al6.A03, 0L, c1543Al6.A04);
            C0918AHu<C1546Al9, C1547AlA> c0918AHu = this.A00;
            if (c0918AHu == null) {
                c0918AHu = new C0918AHu<>(6);
                this.A00 = c0918AHu;
            }
            c1547AlAA05 = c0918AHu.A05(c1546Al9);
            if (c1547AlAA05 == null) {
                c1547AlAA05 = new C1547AlA(c1dm.mo2createOutlinePq9zytI(j, enumC1820Arj, axn), c1543Al6);
                C0918AHu<C1546Al9, C1547AlA> c0918AHu2 = this.A00;
                if (c0918AHu2 == null) {
                    c0918AHu2 = new C0918AHu<>(6);
                    this.A00 = c0918AHu2;
                }
                C1DM c1dm3 = c1546Al9.A02;
                long j2 = c1546Al9.A01;
                EnumC1820Arj enumC1820Arj3 = c1546Al9.A04;
                float f = c1546Al9.A00;
                C1543Al6 c1543Al62 = c1546Al9.A03;
                C1546Al9 c1546Al92 = new C1546Al9();
                c1546Al92.A02 = c1dm3;
                c1546Al92.A01 = j2;
                c1546Al92.A04 = enumC1820Arj3;
                c1546Al92.A00 = f;
                c1546Al92.A03 = c1543Al62;
                c0918AHu2.A0E(c1546Al92, c1547AlAA05);
            }
        }
        return c1547AlAA05;
    }
}
