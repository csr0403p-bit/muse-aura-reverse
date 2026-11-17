package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AQ8 extends Ab8<AQH> {
    public final G0U<C2Um, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AQ8) && this.A00 == ((AQ8) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<C2Um, Unit> g0u = this.A00;
        AQH aqh = new AQH();
        aqh.A00 = g0u;
        return aqh;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "onFocusChanged";
        asf.A02.A01("onFocusChanged", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((AQH) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AQ8(G0U<? super C2Um, Unit> g0u) {
        this.A00 = g0u;
    }
}
