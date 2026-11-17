package X;

/* loaded from: classes4.dex */
public final class AQ7 extends Ab8<AQF> {
    public final String A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        String str = this.A00;
        AQF aqf = new AQF();
        aqf.A00 = str;
        return aqf;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AQ7) {
            return C7384Etj.areEqual(this.A00, ((AQ7) obj).A00);
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "testTag";
        asf.A02.A01("tag", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((AQF) abstractC1439Aj8).A00 = this.A00;
    }

    public AQ7(String str) {
        this.A00 = str;
    }
}
