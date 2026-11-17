package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BrP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableFutureC2996BrP<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    public final Handler A00;
    public final FutureTask<V> A01;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.A01.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.A01.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A01.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A01.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.A01.run();
    }

    public RunnableFutureC2996BrP(Handler handler, Callable<V> callable) {
        this.A00 = handler;
        this.A01 = new FutureTask<>(callable);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        throw C8j3.A17();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw C8j3.A17();
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/os/Handler;Ljava/lang/Runnable;TV;)V */
    public RunnableFutureC2996BrP(Handler handler, Object obj, Runnable runnable) {
        this.A00 = handler;
        this.A01 = new FutureTask<>(runnable, obj);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }
}
