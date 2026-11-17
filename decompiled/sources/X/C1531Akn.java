package X;

/* renamed from: X.Akn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1531Akn implements C3UX, Dg3 {
    public final F2N A00;
    public final C78T A01;

    public C1531Akn(F2N f2n, C78T c78t) {
        C7384Etj.A0Y(c78t, 1);
        this.A00 = f2n;
        this.A01 = c78t;
        if (((C5303Dfm) f2n).A01 == EnumC10573Huf.A03) {
            HzS.A03(null, c78t);
        }
    }

    @Override // X.C3UX
    public final C78T AEA() {
        return this.A01;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        F2N f2n = this.A00;
        if (((C5303Dfm) f2n).A01.compareTo(EnumC10573Huf.A03) <= 0) {
            f2n.A05(this);
            HzS.A03(null, this.A01);
        }
    }

    public C1531Akn() {
    }
}
