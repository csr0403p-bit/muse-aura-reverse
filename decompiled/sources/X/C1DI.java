package X;

/* renamed from: X.1DI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1DI {
    public static final BRg A01(C1DH c1dh, BRg bRg, C1DM c1dm) {
        return bRg.then(new AW0(c1dh.A01, c1dm, c1dh.A00));
    }

    public static final BRg A02(BRg bRg, C1DM c1dm, float f, long j) {
        return bRg.then(new AW0(new C1326AhD(j), c1dm, f));
    }

    public static final long A00(long j, float f) {
        return AnonymousClass005.A0L(Math.max(0.0f, AnonymousClass001.A00(j) - f), Math.max(0.0f, AnonymousClass001.A01(j, 4294967295L) - f));
    }
}
