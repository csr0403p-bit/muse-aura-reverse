package X;

/* loaded from: classes4.dex */
public final class AQC extends Ab8<C1992Avx> {
    public final C3TH A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C3TH c3th = this.A00;
        C1992Avx c1992Avx = new C1992Avx();
        c1992Avx.A00 = c3th;
        return c1992Avx;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        AQC aqc;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AQC) || (aqc = (AQC) obj) == null) {
            return false;
        }
        return C7384Etj.areEqual(this.A00, aqc.A00);
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
        ((C1992Avx) abstractC1439Aj8).A00 = this.A00;
    }

    public AQC(C3TH c3th) {
        this.A00 = c3th;
    }
}
