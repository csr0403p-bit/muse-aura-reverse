package X;

/* loaded from: classes6.dex */
public final class FEK implements Runnable {
    public static final String __redex_internal_original_name = "RenderState$requestResolve$3";
    public final /* synthetic */ FED<ResolveState, RenderContext, StateUpdateType> A00;
    public final /* synthetic */ C10543Hqv<C7736FCn<ResolveState, RenderContext, StateUpdateType>> A01;

    public FEK(FED<ResolveState, RenderContext, StateUpdateType> fed, C10543Hqv<C7736FCn<ResolveState, RenderContext, StateUpdateType>> c10543Hqv) {
        this.A00 = fed;
        this.A01 = c10543Hqv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        FED<ResolveState, RenderContext, StateUpdateType> fed = this.A00;
        C7736FCn c7736FCn = (C7736FCn) this.A01.element;
        if (FED.A00(fed, c7736FCn, (FCW) c7736FCn.A00()).intValue() == 0) {
            FED.A03(fed, null);
        }
    }
}
