package X;

/* renamed from: X.11R, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C11R {
    public static final AKH<C1DG> A00 = AnonymousClass002.A0L(new C05443bq(10));

    public static final BRg A01(C1DH c1dh, BRg bRg, C1DM c1dm, float f, long j) {
        BRg c1417Aim = BRg.A00;
        BRg bRgA01 = c1417Aim;
        if (f > 0.0f) {
            long j2 = C15k.A01;
            long j3 = C0er.A00;
            c1417Aim = new C1417Aim(c1dm, 1.0f, f, 0.0f, 0, j2, j3, j3, false);
        }
        BRg bRgThen = bRg.then(c1417Aim);
        if (c1dh != null) {
            bRgA01 = C1DI.A01(c1dh, bRgA01, c1dm);
        }
        return C11U.A03(C1b8.A03(bRgThen.then(bRgA01), c1dm, j), c1dm);
    }

    public static final void A02(C1DH c1dh, BFM bfm, BRg bRg, C1DM c1dm, G0V g0v, float f, float f2, int i, long j, long j2) {
        C1DH c1dh2 = c1dh;
        float f3 = f2;
        long jA01 = j2;
        if ((i & 8) != 0) {
            jA01 = AbstractC04931Xw.A01(bfm, j);
        }
        if ((i & 16) != 0) {
            f = 0.0f;
        }
        if ((i & 32) != 0) {
            f3 = 0.0f;
        }
        if ((i & 64) != 0) {
            c1dh2 = null;
        }
        AKH<C1DG> akh = A00;
        float fA00 = C1DG.A00(bfm, akh) + f;
        AKT.A02(bfm, B1V.A00(bfm, new C0v1(c1dh2, bRg, c1dm, g0v, fA00, f3, j), -70914509), new AKJ[]{AnonymousClass003.A0T(C1AZ.A00, jA01), C1DG.A02(akh, fA00)}, 56);
    }

    public static final long A00(BFM bfm, float f, long j) {
        C04921Xv c04921XvA0J = AnonymousClass006.A0J(bfm);
        boolean zA1G = AnonymousClass003.A1G(bfm, AbstractC04931Xw.A01);
        long j2 = c04921XvA0J.A0U;
        long j3 = B6A.A01;
        if (j != j2 || !zA1G) {
            return j;
        }
        if (C1DG.A08(f, 0.0f)) {
            return j2;
        }
        float fLog = ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f;
        long j4 = c04921XvA0J.A0c;
        return HxS.A02(HxS.A04(HDi.A0O[(int) (j4 & 63)], B6A.A03(j4), B6A.A02(j4), B6A.A01(j4), fLog), j2);
    }
}
