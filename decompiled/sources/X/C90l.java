package X;

/* renamed from: X.90l, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C90l implements C07C {
    public static final C90l A00 = new C90l();

    @Override // X.C07C
    public final BRg AiP(BRg bRg, float f, boolean z) {
        if (f <= 0.0d) {
            throw C60O.A0i("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return ARK.A01(bRg, f, z);
    }
}
