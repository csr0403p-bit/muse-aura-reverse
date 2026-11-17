package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AQ6 extends Ab8<AQG> {
    public final G0U<C16Z, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AQ6) && this.A00 == ((AQ6) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<C16Z, Unit> g0u = this.A00;
        AQG aqg = new AQG();
        aqg.A00 = g0u;
        return aqg;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "drawWithContent";
        asf.A02.A01("onDraw", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((AQG) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AQ6(G0U<? super C16Z, Unit> g0u) {
        this.A00 = g0u;
    }
}
