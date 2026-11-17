package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ASa extends Ab8<ASb> {
    public final G0U<InterfaceC1497Ak4, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ASa) && this.A00 == ((ASa) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<InterfaceC1497Ak4, Unit> g0u = this.A00;
        ASb aSb = new ASb();
        aSb.A00 = g0u;
        return aSb;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "onGloballyPositioned";
        asf.A02.A01("onGloballyPositioned", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((ASb) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ASa(G0U<? super InterfaceC1497Ak4, Unit> g0u) {
        this.A00 = g0u;
    }
}
