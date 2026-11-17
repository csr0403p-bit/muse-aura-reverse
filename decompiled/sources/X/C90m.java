package X;

/* renamed from: X.90m, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C90m implements C08R {
    public static final C90m A00 = new C90m();

    @Override // X.C08R
    public final BRg AiP(BRg bRg, float f, boolean z) {
        if (f <= 0.0d) {
            throw C60O.A0i("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return ARK.A01(bRg, f, z);
    }

    @Override // X.C08R
    public final BRg A4D(C1AC c1ac, BRg bRg) {
        return bRg.then(new AQB(c1ac));
    }
}
