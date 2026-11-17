package X;

/* loaded from: classes4.dex */
public final class AkW extends Ab8<C1506AkD> {
    public final /* synthetic */ C1517AkR A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
    }

    public AkW(C1517AkR c1517AkR) {
        this.A00 = c1517AkR;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return this.A00.A01;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.A01.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "RootFocusTarget";
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return AnonymousClass002.A1Z(obj, this);
    }
}
