package X;

/* renamed from: X.1b8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1b8 {
    public static void A04(BFM bfm, BRg bRg, long j) {
        C3Ue.A04(A03(bRg, C1OM.A00, j), bfm, 0);
    }

    public static void A05(BFM bfm, BRg bRg, C1EQ c1eq) {
        C3Ue.A04(A02(bRg, c1eq, C1OM.A00), bfm, 0);
    }

    public static BRg A01(BRg bRg, long j) {
        return A03(bRg, C1OM.A00, j);
    }

    public static final BRg A02(BRg bRg, C1EQ c1eq, C1DM c1dm) {
        return bRg.then(new AW5(c1eq, c1dm, AbstractC2139Az7.A00, B6A.A07));
    }

    public static final BRg A03(BRg bRg, C1DM c1dm, long j) {
        return bRg.then(new AW5(null, c1dm, AbstractC2139Az7.A00, j));
    }

    public static BRg A00(BRg bRg, float f, long j) {
        return A03(bRg, C1OM.A00, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), f));
    }
}
