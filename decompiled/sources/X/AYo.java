package X;

/* loaded from: classes4.dex */
public final class AYo extends Ab8<C1102AYn> {
    public final C1110AYw A00;
    public final boolean A01;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1110AYw c1110AYw = this.A00;
        boolean z = this.A01;
        C1102AYn c1102AYn = new C1102AYn();
        c1102AYn.A00 = c1110AYw;
        c1102AYn.A01 = z;
        return c1102AYn;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (!(obj instanceof AYo)) {
            return false;
        }
        AYo aYo = (AYo) obj;
        return C7384Etj.areEqual(this.A00, aYo.A00) && this.A01 == aYo.A01;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00((AnonymousClass005.A0E(this.A00) + 1237) * 31, this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "scroll";
        BHD bhd = asf.A02;
        bhd.A01("state", this.A00);
        bhd.A01("reverseScrolling", AnonymousClass001.A0h());
        bhd.A01("isVertical", Boolean.valueOf(this.A01));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1102AYn c1102AYn = (C1102AYn) abstractC1439Aj8;
        c1102AYn.A00 = this.A00;
        c1102AYn.A01 = this.A01;
    }

    public AYo(C1110AYw c1110AYw, boolean z) {
        this.A00 = c1110AYw;
        this.A01 = z;
    }
}
