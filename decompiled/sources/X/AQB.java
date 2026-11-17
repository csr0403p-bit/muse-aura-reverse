package X;

/* loaded from: classes4.dex */
public final class AQB extends Ab8<C1991Avw> {
    public final C1AC A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1AC c1ac = this.A00;
        C1991Avw c1991Avw = new C1991Avw();
        c1991Avw.A00 = c1ac;
        return c1991Avw;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        AQB aqb;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AQB) || (aqb = (AQB) obj) == null) {
            return false;
        }
        return C7384Etj.areEqual(this.A00, aqb.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "align";
        asf.A00 = this.A00;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C1991Avw) abstractC1439Aj8).A00 = this.A00;
    }

    public AQB(C1AC c1ac) {
        this.A00 = c1ac;
    }
}
