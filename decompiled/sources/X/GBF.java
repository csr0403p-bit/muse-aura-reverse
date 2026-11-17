package X;

/* loaded from: classes6.dex */
public final class GBF extends GBK {
    public static final GBF A00 = new GBF();
    public static final GBK A01 = AbstractC9266GBt.A00;

    @Override // X.GBK
    public final boolean isDispatchNeeded(C78T c78t) {
        C7384Etj.A0Y(c78t, 0);
        return A01.isDispatchNeeded(c78t);
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        AnonymousClass003.A0u(c78t, runnable);
        A01.dispatch(c78t, runnable);
    }
}
