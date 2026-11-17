package X;

/* renamed from: X.AYs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1106AYs extends Ab8<C1262Ag1> {
    public final EnumC1108AYu A00;
    public final InterfaceC1180Adj A01;
    public final InterfaceC1072AWd A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1106AYs) {
                C1106AYs c1106AYs = (C1106AYs) obj;
                if (!C7384Etj.areEqual(this.A01, c1106AYs.A01) || this.A00 != c1106AYs.A00 || this.A03 != c1106AYs.A03 || this.A04 != c1106AYs.A04 || !C7384Etj.areEqual(this.A02, c1106AYs.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        InterfaceC1180Adj interfaceC1180Adj = this.A01;
        ((C1262Ag1) abstractC1439Aj8).A0O(null, null, null, this.A00, interfaceC1180Adj, this.A02, this.A03, this.A04);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1180Adj interfaceC1180Adj = this.A01;
        return new C1262Ag1(null, null, null, this.A00, interfaceC1180Adj, this.A02, this.A03, this.A04);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return ((C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01)) * 31, this.A03), this.A04) * 31) + C60R.A01(this.A02)) * 31;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "scrollable";
        BHD bhd = asf.A02;
        bhd.A01("orientation", this.A00);
        bhd.A01("state", this.A01);
        bhd.A01("overscrollEffect", null);
        Ab8.A03(bhd, this.A03);
        bhd.A01("reverseDirection", Boolean.valueOf(this.A04));
        bhd.A01("flingBehavior", null);
        bhd.A01("interactionSource", this.A02);
        bhd.A01("bringIntoViewSpec", null);
    }

    public C1106AYs(EnumC1108AYu enumC1108AYu, InterfaceC1180Adj interfaceC1180Adj, InterfaceC1072AWd interfaceC1072AWd, boolean z, boolean z2) {
        this.A01 = interfaceC1180Adj;
        this.A00 = enumC1108AYu;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = interfaceC1072AWd;
    }
}
