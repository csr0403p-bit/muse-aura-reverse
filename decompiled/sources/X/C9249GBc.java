package X;

/* renamed from: X.GBc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9249GBc extends GBP {
    public final Object A00;
    public final C9254GBh A01;
    public final GBS A02;
    public final GBM A03;

    @Override // X.GBP
    public final void A06(Throwable th) {
        GBM gbm = this.A03;
        GBS gbs = this.A02;
        C9254GBh c9254GBh = this.A01;
        Object obj = this.A00;
        C9254GBh c9254GBhA05 = GBM.A05(c9254GBh);
        if (c9254GBhA05 == null || !GBM.A0A(obj, c9254GBhA05, gbs, gbm)) {
            gbs.A00.A04(new C9265GBs(2), 2);
            C9254GBh c9254GBhA052 = GBM.A05(c9254GBh);
            if (c9254GBhA052 == null || !GBM.A0A(obj, c9254GBhA052, gbs, gbm)) {
                gbm.A0J(GBM.A02(obj, gbs, gbm));
            }
        }
    }

    @Override // X.GBP
    public final boolean A07() {
        return false;
    }

    public C9249GBc(Object obj, C9254GBh c9254GBh, GBS gbs, GBM gbm) {
        this.A03 = gbm;
        this.A02 = gbs;
        this.A01 = c9254GBh;
        this.A00 = obj;
    }
}
