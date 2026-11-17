package X;

/* loaded from: classes6.dex */
public final class FA8 implements FAQ {
    public final /* synthetic */ FA4 A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ FA0 A02;
    public final /* synthetic */ C7648F8p A03;

    @Override // X.FAQ
    public final FDW A4S(F9H f9h, FDW fdw) {
        F9H f9hAQ2;
        C7384Etj.A0Y(fdw, 0);
        C7690FAj c7690FAj = this.A02.A01;
        FDW fdw2 = this.A01;
        C7648F8p c7648F8p = this.A03;
        String str = this.A00.A01;
        F9H f9h2 = fdw.A01;
        if (f9h2 != null) {
            if (f9h == null) {
                f9h = fdw2.A01;
            }
            f9hAQ2 = f9h2.AQ2(f9h);
        } else {
            f9hAQ2 = null;
        }
        return new FDW(f9hAQ2, fdw2.A02, fdw, fdw, c7648F8p, c7690FAj.A00(fdw2, fdw, str), true);
    }

    public FA8(FA4 fa4, FDW fdw, FA0 fa0, C7648F8p c7648F8p) {
        this.A02 = fa0;
        this.A01 = fdw;
        this.A03 = c7648F8p;
        this.A00 = fa4;
    }

    @Override // X.FAQ
    public final void AWx(FDW fdw) {
    }
}
