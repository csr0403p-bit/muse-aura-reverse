package X;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class FEF<V> implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC7751FDd<RenderContext> A01;
    public final /* synthetic */ FED<ResolveState, RenderContext, StateUpdateType> A02;

    public FEF(InterfaceC7751FDd interfaceC7751FDd, FED fed, int i) {
        this.A02 = fed;
        this.A01 = interfaceC7751FDd;
        this.A00 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        FED<ResolveState, RenderContext, StateUpdateType> fed = this.A02;
        Object obj = this.A01;
        ResolveState resolvestate = fed.A06;
        RenderContext rendercontext = fed.A0N;
        FEE<Object, RenderContext> fee = fed.A02;
        int i = this.A00;
        long j = fed.A01;
        FDW fdw = (FDW) obj;
        FBB fbb = (FBB) rendercontext;
        C7384Etj.A0Y(fdw, 1);
        if (resolvestate instanceof FCA) {
            if (fbb != null) {
                return FEC.A01(fee, fbb, fdw, (FCA) resolvestate, resolvestate, i, j);
            }
            throw C3cG.A0Q("Required value was null.");
        }
        if (fbb != null) {
            return FEC.A02(fee, fbb, fdw, resolvestate, i, j);
        }
        throw C3cG.A0Q("Required value was null.");
    }
}
