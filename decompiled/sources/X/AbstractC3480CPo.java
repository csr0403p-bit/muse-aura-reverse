package X;

import java.util.concurrent.Executor;

/* renamed from: X.CPo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3480CPo<T> extends AbstractRunnableC3440CNl<T> {
    public static final String __redex_internal_original_name = "CombinedFuture$CombinedFutureInterruptibleTask";
    public final Executor listenerExecutor;
    public final /* synthetic */ CPn this$0;

    public AbstractC3480CPo(final CPn this$0, Executor listenerExecutor) {
        this.this$0 = this$0;
        listenerExecutor.getClass();
        this.listenerExecutor = listenerExecutor;
    }

    @Override // X.AbstractRunnableC3440CNl
    public final void A03(T result) {
        CPn cPn = this.this$0;
        CPa cPa = CPg.A03;
        cPn.A00 = null;
        ((CPq) this).this$0.set(result);
    }

    @Override // X.AbstractRunnableC3440CNl
    public final boolean A04() {
        return this.this$0.isDone();
    }
}
