package X;

/* renamed from: X.AYr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1105AYr extends Ab8<C1104AYq> {
    public final InterfaceC1260Afz A00;
    public final C3MW A01;
    public final BLD A02;
    public final EnumC1108AYu A03;
    public final InterfaceC1180Adj A04;
    public final InterfaceC1072AWd A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C1105AYr c1105AYr = (C1105AYr) obj;
                if (!C7384Etj.areEqual(this.A04, c1105AYr.A04) || this.A03 != c1105AYr.A03 || this.A06 != c1105AYr.A06 || this.A07 != c1105AYr.A07 || !C7384Etj.areEqual(this.A02, c1105AYr.A02) || !C7384Etj.areEqual(this.A05, c1105AYr.A05) || !C7384Etj.areEqual(this.A01, c1105AYr.A01) || this.A08 != c1105AYr.A08 || !C7384Etj.areEqual(this.A00, c1105AYr.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        InterfaceC1180Adj interfaceC1180Adj = this.A04;
        EnumC1108AYu enumC1108AYu = this.A03;
        boolean z = this.A08;
        InterfaceC1260Afz interfaceC1260Afz = this.A00;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        ((C1104AYq) abstractC1439Aj8).A0I(interfaceC1260Afz, this.A01, this.A02, enumC1108AYu, interfaceC1180Adj, this.A05, z, z2, z3);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1180Adj interfaceC1180Adj = this.A04;
        EnumC1108AYu enumC1108AYu = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A07;
        BLD bld = this.A02;
        InterfaceC1072AWd interfaceC1072AWd = this.A05;
        C3MW c3mw = this.A01;
        boolean z3 = this.A08;
        InterfaceC1260Afz interfaceC1260Afz = this.A00;
        C1104AYq c1104AYq = new C1104AYq();
        c1104AYq.A06 = interfaceC1180Adj;
        c1104AYq.A05 = enumC1108AYu;
        c1104AYq.A08 = z;
        c1104AYq.A09 = z2;
        c1104AYq.A04 = bld;
        c1104AYq.A07 = interfaceC1072AWd;
        c1104AYq.A03 = c3mw;
        c1104AYq.A0A = z3;
        c1104AYq.A01 = interfaceC1260Afz;
        return c1104AYq;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A01((((((C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A04)), this.A06), this.A07) + C60R.A01(this.A02)) * 31) + C60R.A01(this.A05)) * 31) + C60R.A01(this.A01)) * 31, this.A08) + C8j4.A0E(this.A00, 0);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "scrollableArea";
        BHD bhd = asf.A02;
        bhd.A01("state", this.A04);
        bhd.A01("orientation", this.A03);
        if (!this.A08) {
            bhd.A01("overscrollEffect", this.A00);
        }
        Ab8.A03(bhd, this.A06);
        bhd.A01("reverseScrolling", Boolean.valueOf(this.A07));
        bhd.A01("flingBehavior", this.A02);
        bhd.A01("interactionSource", this.A05);
        bhd.A01("bringIntoViewSpec", this.A01);
    }

    public C1105AYr(InterfaceC1260Afz interfaceC1260Afz, C3MW c3mw, BLD bld, EnumC1108AYu enumC1108AYu, InterfaceC1180Adj interfaceC1180Adj, InterfaceC1072AWd interfaceC1072AWd, boolean z, boolean z2, boolean z3) {
        this.A04 = interfaceC1180Adj;
        this.A03 = enumC1108AYu;
        this.A06 = z;
        this.A07 = z2;
        this.A02 = bld;
        this.A05 = interfaceC1072AWd;
        this.A01 = c3mw;
        this.A08 = z3;
        this.A00 = interfaceC1260Afz;
    }
}
