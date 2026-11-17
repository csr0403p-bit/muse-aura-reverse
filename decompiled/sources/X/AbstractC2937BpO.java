package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BpO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2937BpO<V> implements ListenableFuture<V> {
    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException {
        if (this instanceof BpQ) {
            return ((BpQ) this).A00;
        }
        throw new ExecutionException(((C2938BpP) this).A00);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            AbstractC2875Bni.A05("ImmediateFuture", AnonymousClass006.A0y(executor, " on Executor ", C3cG.A0f(runnable, "Experienced RuntimeException while attempting to notify ")), e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
