package X;

/* loaded from: classes4.dex */
public final class AQA extends Ab8<C2007AwG> {
    public final AbstractC1493Ak0 A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        AbstractC1493Ak0 abstractC1493Ak0 = this.A00;
        C2007AwG c2007AwG = new C2007AwG();
        c2007AwG.A00 = abstractC1493Ak0;
        return c2007AwG;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        AQA aqa;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AQA) || (aqa = (AQA) obj) == null) {
            return false;
        }
        return C7384Etj.areEqual(this.A00, aqa.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "alignBy";
        asf.A00 = this.A00;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C2007AwG) abstractC1439Aj8).A00 = this.A00;
    }

    public AQA(AbstractC1493Ak0 abstractC1493Ak0) {
        this.A00 = abstractC1493Ak0;
    }
}
