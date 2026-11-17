package X;

/* renamed from: X.FCk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7733FCk implements FCX {
    public volatile FED<ResolveState, RenderContext, StateUpdateType> A00;

    /* JADX WARN: Incorrect types in method signature: (TStateUpdateType;)V */
    @Override // X.FCX
    public final void AAk(FCT fct) {
        Object obj;
        FED<ResolveState, RenderContext, StateUpdateType> fed = this.A00;
        if (fed != 0) {
            synchronized (fed) {
                fed.A0P.add(fct);
                obj = fed.A03;
            }
            if (obj != null) {
                FEH feh = fed.A0K;
                Object obj2 = fed.A0O;
                feh.removeCallbacksAndMessages(obj2);
                feh.postAtTime(new RunnableC7737FCo(fed), obj2, 0L);
            }
        }
    }
}
