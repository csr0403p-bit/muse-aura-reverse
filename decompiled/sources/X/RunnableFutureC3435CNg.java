package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.CNg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableFutureC3435CNg<V> extends AbstractC3437CNi<V> implements RunnableFuture<V> {
    public volatile AbstractRunnableC3440CNl<?> A00;

    @Override // X.CQU
    public final String pendingToString() {
        AbstractRunnableC3440CNl<?> abstractRunnableC3440CNl = this.A00;
        return abstractRunnableC3440CNl != null ? BV8.A0u(abstractRunnableC3440CNl, C60O.A0x("task=[")) : BV8.A0t(this);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC3440CNl<?> abstractRunnableC3440CNl = this.A00;
        if (abstractRunnableC3440CNl != null) {
            abstractRunnableC3440CNl.run();
        }
        this.A00 = null;
    }

    public RunnableFutureC3435CNg(Callable<V> callable) {
        this.A00 = new C3436CNh(this, callable);
    }

    @Override // X.CQU
    public final void afterDone() {
        AbstractRunnableC3440CNl<?> abstractRunnableC3440CNl;
        if (wasInterrupted() && (abstractRunnableC3440CNl = this.A00) != null) {
            abstractRunnableC3440CNl.A02();
        }
        this.A00 = null;
    }
}
