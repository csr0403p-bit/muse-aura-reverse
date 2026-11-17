package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CNr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3446CNr<V> extends CQU<V> implements InterfaceC2989Br2<V> {
    @Override // X.CQU, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        return super.cancel(mayInterruptIfRunning);
    }

    @Override // X.CQU, java.util.concurrent.Future
    public final V get() {
        return (V) super.get();
    }

    @Override // X.CQU, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // X.CQU, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // X.CQU, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        super.addListener(listener, executor);
    }

    @Override // X.CQU, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return (V) super.get(j, timeUnit);
    }
}
