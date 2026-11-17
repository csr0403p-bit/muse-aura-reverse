package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class CPq<V> extends CPn<V>.CombinedFutureInterruptibleTask<V> {
    public static final String __redex_internal_original_name = "CombinedFuture$CallableInterruptibleTask";
    public final Callable<V> callable;
    public final /* synthetic */ CPn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CPq(final CPn this$0, Callable<V> callable, Executor listenerExecutor) {
        super(this$0, listenerExecutor);
        this.this$0 = this$0;
        this.callable = callable;
    }

    public final V A01() {
        return this.callable.call();
    }
}
