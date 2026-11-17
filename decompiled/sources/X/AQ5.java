package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AQ5 extends Ab8<AFf> {
    public final G0U<AT3, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AQ5) && this.A00 == ((AQ5) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<AT3, Unit> g0u = this.A00;
        AFf aFf = new AFf();
        aFf.A00 = g0u;
        return aFf;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "drawBehind";
        asf.A02.A01("onDraw", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((AFf) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AQ5(G0U<? super AT3, Unit> g0u) {
        this.A00 = g0u;
    }
}
