package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes5.dex */
public abstract class CLz extends AbstractExecutorService implements InterfaceExecutorServiceC3065Bwn {
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC3435CNg(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: Aga, reason: merged with bridge method [inline-methods] */
    public final <T> ListenableFuture<T> submit(Callable<T> task) {
        return (ListenableFuture) super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable task) {
        return super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) {
        boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
        return new RunnableFutureC3435CNg(Executors.callable(runnable, value));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable task, Object result) {
        return super.submit(task, result);
    }
}
