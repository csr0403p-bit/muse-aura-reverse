package X;

/* renamed from: X.GBp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9262GBp extends GBK {
    public static final C9262GBp A00 = new C9262GBp();

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        C9261GBo c9261GBo = (C9261GBo) c78t.get(C9261GBo.A01);
        if (c9261GBo == null) {
            throw C8j3.A18("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c9261GBo.A00 = true;
    }

    @Override // X.GBK
    public final boolean isDispatchNeeded(C78T c78t) {
        return false;
    }

    @Override // X.GBK
    public final GBK limitedParallelism(int i, String str) {
        throw C8j3.A18("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // X.GBK
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
