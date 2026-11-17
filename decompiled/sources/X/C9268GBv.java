package X;

/* renamed from: X.GBv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9268GBv extends GBK {
    public static final C9268GBv A00 = new C9268GBv();

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        C9267GBu.A01.A00.A04(runnable, true, false);
    }

    @Override // X.GBK
    public final void dispatchYield(C78T c78t, Runnable runnable) {
        C9267GBu.A01.A00.A04(runnable, true, true);
    }

    @Override // X.GBK
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // X.GBK
    public final GBK limitedParallelism(int i, String str) {
        GBA.A00(i);
        return i >= HlS.A02 ? str != null ? new GBE(str, this) : this : super.limitedParallelism(i, str);
    }
}
