package X;

/* renamed from: X.FAf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7686FAf {
    public F6D A00;
    public final FDW A01;
    public final C7648F8p A02;
    public final String A03;
    public final boolean A04;

    public C7686FAf(FDW fdw) {
        this.A01 = fdw;
        String strA0q = AbstractC7608F5v.A0q(fdw);
        String strA02 = strA0q != null ? strA0q : "";
        C7648F8p c7648F8p = fdw.A09;
        if (fdw.A0L(51, true) && c7648F8p != null && c7648F8p.A01.length != 0) {
            strA02 = AbstractC7647F8o.A02(strA02, AbstractC7647F8o.A00(c7648F8p, C79.A01));
        }
        this.A03 = strA02;
        this.A04 = fdw.A0L(42, false);
        this.A02 = c7648F8p;
    }
}
