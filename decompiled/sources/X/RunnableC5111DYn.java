package X;

/* renamed from: X.DYn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5111DYn implements Runnable {
    public static final String __redex_internal_original_name = "IGraphQLQueryExecutorExtensionsKt$asFutureImpl$1";
    public final /* synthetic */ InterfaceC5106DYe A00;

    public RunnableC5111DYn(InterfaceC5106DYe interfaceC5106DYe) {
        this.A00 = interfaceC5106DYe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.cancel();
    }
}
