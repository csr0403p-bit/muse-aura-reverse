package X;

/* loaded from: classes6.dex */
public final class FDu implements FE2 {
    public final /* synthetic */ G0U<InterfaceC7780FEk, R> A00;

    @Override // X.FE2
    public final /* bridge */ /* synthetic */ void ANz(InterfaceC7762FDp interfaceC7762FDp) {
        C7384Etj.A0Y(interfaceC7762FDp, 0);
        G0U<InterfaceC7780FEk, R> g0u = this.A00;
        FCN fcnA00 = AbstractC7757FDj.A00();
        C0938AIr c0938AIr = fcnA00.A02;
        fcnA00.A02 = null;
        try {
            g0u.invoke(interfaceC7762FDp);
        } finally {
            fcnA00.A02 = c0938AIr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FDu(G0U<? super InterfaceC7780FEk, ? extends R> g0u) {
        this.A00 = g0u;
    }
}
