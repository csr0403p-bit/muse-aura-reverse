package X;

/* loaded from: classes4.dex */
public final class AXK extends Ab8<AXL> {
    public final G0U<C2AA, Boolean> A00;
    public final G0U<C2AA, Boolean> A01;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AXK) {
                AXK axk = (AXK) obj;
                if (this.A00 != axk.A00 || this.A01 != axk.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<C2AA, Boolean> g0u = this.A00;
        G0U<C2AA, Boolean> g0u2 = this.A01;
        AXL axl = new AXL();
        axl.A00 = g0u;
        axl.A01 = g0u2;
        return axl;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return (C60R.A01(this.A00) * 31) + C8j4.A0E(this.A01, 0);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        G0U<C2AA, Boolean> g0u = this.A00;
        if (g0u != null) {
            asf.A01 = "onKeyEvent";
            asf.A02.A01("onKeyEvent", g0u);
        }
        G0U<C2AA, Boolean> g0u2 = this.A01;
        if (g0u2 != null) {
            asf.A01 = "onPreviewKeyEvent";
            asf.A02.A01("onPreviewKeyEvent", g0u2);
        }
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AXL axl = (AXL) abstractC1439Aj8;
        axl.A00 = this.A00;
        axl.A01 = this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AXK(G0U<? super C2AA, Boolean> g0u, G0U<? super C2AA, Boolean> g0u2) {
        this.A00 = g0u;
        this.A01 = g0u2;
    }
}
