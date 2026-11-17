package X;

/* loaded from: classes6.dex */
public final class FA9 implements FAQ {
    public final /* synthetic */ F8I A00;
    public final /* synthetic */ FDW A01;

    @Override // X.FAQ
    public final FDW A4S(F9H f9h, FDW fdw) {
        F9H f9h2 = fdw.A01;
        if (f9h2 == null && this.A00 == null) {
            return fdw;
        }
        return new FDW(f9h2 != null ? f9h2.AQ2(f9h) : null, this.A00, fdw, fdw.A08, fdw.A09, fdw.A04, false);
    }

    public FA9(F8I f8i, FDW fdw) {
        this.A00 = f8i;
        this.A01 = fdw;
    }

    @Override // X.FAQ
    public final void AWx(FDW fdw) {
    }
}
