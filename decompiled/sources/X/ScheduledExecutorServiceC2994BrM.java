package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BrM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class ScheduledExecutorServiceC2994BrM extends AbstractExecutorService implements ScheduledExecutorService {
    public final Handler A00;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableFutureC2996BrP runnableFutureC2996BrP = new RunnableFutureC2996BrP(handler, null, runnable);
        handler.postDelayed(runnableFutureC2996BrP, timeUnit.toMillis(j));
        return runnableFutureC2996BrP;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        RunnableFutureC2996BrP runnableFutureC2996BrP = new RunnableFutureC2996BrP(this.A00, null, runnable);
        execute(runnableFutureC2996BrP);
        return runnableFutureC2996BrP;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC2996BrP(this.A00, callable);
    }

    public ScheduledExecutorServiceC2994BrM(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C8j3.A17();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C8j3.A17();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C8j3.A17();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw C8j3.A17();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw C8j3.A17();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC2996BrP(this.A00, obj, runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableFutureC2996BrP runnableFutureC2996BrP = new RunnableFutureC2996BrP(handler, callable);
        handler.postDelayed(runnableFutureC2996BrP, timeUnit.toMillis(j));
        return runnableFutureC2996BrP;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        RunnableFutureC2996BrP runnableFutureC2996BrP = new RunnableFutureC2996BrP(this.A00, obj, runnable);
        execute(runnableFutureC2996BrP);
        return runnableFutureC2996BrP;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        RunnableFutureC2996BrP runnableFutureC2996BrP = new RunnableFutureC2996BrP(this.A00, callable);
        execute(runnableFutureC2996BrP);
        return runnableFutureC2996BrP;
    }
}
