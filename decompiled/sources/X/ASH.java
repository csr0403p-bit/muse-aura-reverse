package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ASH extends Ab8<ASI> implements AbD {
    public final G0U<InterfaceC0857A6e, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ASH) && this.A00 == ((ASH) obj).A00);
    }

    @Override // X.AbD
    public final C0919AHv AKL() {
        C0919AHv c0919AHv = new C0919AHv();
        c0919AHv.A01 = false;
        c0919AHv.A00 = true;
        this.A00.invoke(c0919AHv);
        return c0919AHv;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<InterfaceC0857A6e, Unit> g0u = this.A00;
        ASI asi = new ASI();
        asi.A02 = false;
        asi.A01 = true;
        asi.A00 = g0u;
        return asi;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "clearAndSetSemantics";
        ARD.A02(asf, AKL());
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((ASI) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ASH(G0U<? super InterfaceC0857A6e, Unit> g0u) {
        this.A00 = g0u;
    }
}
