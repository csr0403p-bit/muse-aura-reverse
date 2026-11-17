package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.CNa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3430CNa<V> extends AbstractC3446CNr<V> implements Runnable {
    public static final String __redex_internal_original_name = "Futures$NonCancellationPropagatingFuture";
    public ListenableFuture<V> A00;

    @Override // X.CQU
    public final void afterDone() {
        this.A00 = null;
    }

    @Override // X.CQU
    public final String pendingToString() {
        ListenableFuture<V> listenableFuture = this.A00;
        if (listenableFuture != null) {
            return BV8.A0u(listenableFuture, C60O.A0x("delegate=["));
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<V> listenableFuture = this.A00;
        if (listenableFuture != null) {
            setFuture(listenableFuture);
        }
    }
}
