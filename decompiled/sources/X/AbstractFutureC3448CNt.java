package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CNt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractFutureC3448CNt<V> extends AbstractC3450CNv implements Future<V> {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return ((ScheduledFutureC3449CNu) this).A00.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return ((ScheduledFutureC3449CNu) this).A00.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((ScheduledFutureC3449CNu) this).A00.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((ScheduledFutureC3449CNu) this).A00.isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) {
        return ((ScheduledFutureC3449CNu) this).A00.get(timeout, unit);
    }
}
