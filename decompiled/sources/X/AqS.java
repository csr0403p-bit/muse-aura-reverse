package X;

/* loaded from: classes4.dex */
public final class AqS extends Ab8<C1773AqR> {
    public final float A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AqS) && Float.compare(this.A00, ((AqS) obj).A00) == 0);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A00;
        C1773AqR c1773AqR = new C1773AqR();
        c1773AqR.A00 = f;
        return c1773AqR;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "zIndex";
        asf.A02.A01("zIndex", Float.valueOf(this.A00));
    }

    public final String toString() {
        return FGI.A0F("ZIndexElement(zIndex=", ')', this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C1773AqR) abstractC1439Aj8).A00 = this.A00;
    }

    public AqS(float f) {
        this.A00 = f;
    }
}
