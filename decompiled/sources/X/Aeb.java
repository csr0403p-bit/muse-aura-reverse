package X;

/* loaded from: classes4.dex */
public final class Aeb extends Ab8<C1206Aed> {
    public final EnumC1108AYu A00;
    public final C1145Aby A01;
    public final InterfaceC1220Aey A02;
    public final boolean A03;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Aeb) {
                Aeb aeb = (Aeb) obj;
                if (!C7384Etj.areEqual(this.A02, aeb.A02) || !C7384Etj.areEqual(this.A01, aeb.A01) || this.A03 != aeb.A03 || this.A00 != aeb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1220Aey interfaceC1220Aey = this.A02;
        C1145Aby c1145Aby = this.A01;
        boolean z = this.A03;
        EnumC1108AYu enumC1108AYu = this.A00;
        C1206Aed c1206Aed = new C1206Aed();
        c1206Aed.A02 = interfaceC1220Aey;
        c1206Aed.A01 = c1145Aby;
        c1206Aed.A03 = z;
        c1206Aed.A00 = enumC1108AYu;
        return c1206Aed;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, C0KA.A01(AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)), this.A03));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1206Aed c1206Aed = (C1206Aed) abstractC1439Aj8;
        InterfaceC1220Aey interfaceC1220Aey = this.A02;
        C1145Aby c1145Aby = this.A01;
        boolean z = this.A03;
        EnumC1108AYu enumC1108AYu = this.A00;
        c1206Aed.A02 = interfaceC1220Aey;
        c1206Aed.A01 = c1145Aby;
        c1206Aed.A03 = z;
        c1206Aed.A00 = enumC1108AYu;
    }

    public Aeb(EnumC1108AYu enumC1108AYu, C1145Aby c1145Aby, InterfaceC1220Aey interfaceC1220Aey, boolean z) {
        this.A02 = interfaceC1220Aey;
        this.A01 = c1145Aby;
        this.A03 = z;
        this.A00 = enumC1108AYu;
    }
}
