package X;

/* renamed from: X.11U, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C11U {
    public static final BRg A00(BRg bRg) {
        long j = C15k.A01;
        C1DM c1dm = C1OM.A00;
        long j2 = C0er.A00;
        return bRg.then(new C1417Aim(c1dm, 1.0f, 0.0f, 0.0f, 0, j, j2, j2, true));
    }

    public static final BRg A03(BRg bRg, C1DM c1dm) {
        long j = C15k.A01;
        long j2 = C0er.A00;
        return bRg.then(new C1417Aim(c1dm, 1.0f, 0.0f, 0.0f, 0, j, j2, j2, true));
    }

    public static BRg A01(BRg bRg, float f) {
        return A03(bRg, C1D8.A00(f));
    }

    public static BRg A02(BRg bRg, float f) {
        return A03(C10G.A07(bRg, f), C1D8.A00);
    }

    public static BRg A04(BRg bRg, C1DM c1dm, long j) {
        return C1b8.A03(A03(bRg, c1dm), C1OM.A00, j);
    }
}
