package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BpL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ScheduledExecutorServiceC2936BpL extends AbstractExecutorService implements ScheduledExecutorService {
    public static ThreadLocal<ScheduledExecutorService> A01 = new Bp7();
    public final Handler A00;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C8j3.A18("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.A00;
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(AnonymousClass001.A0v(" is shutting down", BV5.A0q(handler)));
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C8j3.A18("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C8j3.A18("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw C8j3.A18("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw C8j3.A18("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    public ScheduledExecutorServiceC2936BpL(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        Handler handler = this.A00;
        RunnableScheduledFutureC2946Bpg runnableScheduledFutureC2946Bpg = new RunnableScheduledFutureC2946Bpg(handler, callable, jUptimeMillis);
        return !handler.postAtTime(runnableScheduledFutureC2946Bpg, jUptimeMillis) ? new BpM(new RejectedExecutionException(AnonymousClass001.A0v(" is shutting down", BV5.A0q(handler)))) : runnableScheduledFutureC2946Bpg;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC7565F4e(0, this, runnable), j, timeUnit);
    }
}
