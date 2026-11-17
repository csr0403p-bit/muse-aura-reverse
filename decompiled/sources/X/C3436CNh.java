package X;

import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.CNh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3436CNh<V> extends AbstractRunnableC3440CNl<V> {
    public static final String __redex_internal_original_name = "TrustedListenableFutureTask$TrustedFutureInterruptibleTask";
    public final Callable<V> callable;
    public final /* synthetic */ RunnableFutureC3435CNg this$0;

    public C3436CNh(final RunnableFutureC3435CNg this$0, Callable<V> callable) {
        this.this$0 = this$0;
        callable.getClass();
        this.callable = callable;
    }
}
