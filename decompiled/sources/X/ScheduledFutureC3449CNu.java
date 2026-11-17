package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CNu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ScheduledFutureC3449CNu extends AbstractC3447CNs implements ListenableFuture, ScheduledFuture {
    public final ListenableFuture<V> A00;
    public final ScheduledFuture<?> A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed other) {
        return this.A01.compareTo(other);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit unit) {
        return this.A01.getDelay(unit);
    }

    public ScheduledFutureC3449CNu(ListenableFuture<V> listenableDelegate, ScheduledFuture<?> scheduledDelegate) {
        this.A00 = listenableDelegate;
        this.A01 = scheduledDelegate;
    }

    @Override // X.AbstractFutureC3448CNt, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        boolean zCancel = super.cancel(mayInterruptIfRunning);
        if (zCancel) {
            this.A01.cancel(mayInterruptIfRunning);
        }
        return zCancel;
    }
}
