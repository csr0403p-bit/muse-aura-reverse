package X;

/* loaded from: classes6.dex */
public final class FAC implements FAQ {
    public final /* synthetic */ C7690FAj A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ C7648F8p A02;
    public final /* synthetic */ String A03;

    @Override // X.FAQ
    public final FDW A4S(F9H f9h, FDW fdw) {
        F9H f9hAQ2;
        C7384Etj.A0Y(fdw, 0);
        C7690FAj c7690FAj = this.A00;
        FDW fdw2 = this.A01;
        C7648F8p c7648F8p = this.A02;
        String str = this.A03;
        F9H f9h2 = fdw.A01;
        if (f9h2 != null) {
            if (f9h == null) {
                f9h = fdw2.A01;
            }
            f9hAQ2 = f9h2.AQ2(f9h);
        } else {
            f9hAQ2 = null;
        }
        return new FDW(f9hAQ2, null, fdw, fdw, c7648F8p, c7690FAj.A00(fdw2, fdw, str), true);
    }

    public FAC(C7690FAj c7690FAj, FDW fdw, C7648F8p c7648F8p, String str) {
        this.A00 = c7690FAj;
        this.A01 = fdw;
        this.A02 = c7648F8p;
        this.A03 = str;
    }

    @Override // X.FAQ
    public final void AWx(FDW fdw) {
    }
}
