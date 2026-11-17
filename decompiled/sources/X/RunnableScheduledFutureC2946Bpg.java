package X;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bpg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableScheduledFutureC2946Bpg<V> implements RunnableScheduledFuture<V> {
    public final AtomicReference<C3010Brs<V>> A00 = BV5.A1A();
    public final long A01;
    public final ListenableFuture<V> A02;
    public final Callable<V> A03;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.A02.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (getDelay(timeUnit) > delayed.getDelay(timeUnit) ? 1 : (getDelay(timeUnit) == delayed.getDelay(timeUnit) ? 0 : -1));
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.A02.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A02.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A02.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C3010Brs c3010Brs = (C3010Brs) C8j3.A10(this.A00);
        if (c3010Brs != null) {
            try {
                c3010Brs.A03(this.A03.call());
            } catch (Exception e) {
                c3010Brs.A04(e);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/os/Handler;JLjava/util/concurrent/Callable<TV;>;)V */
    public RunnableScheduledFutureC2946Bpg(Handler handler, Callable callable, long j) {
        this.A01 = j;
        this.A03 = callable;
        this.A02 = AbstractC2947Bpi.A03(handler, this, callable, 1);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.A02.get(j, timeUnit);
    }
}
