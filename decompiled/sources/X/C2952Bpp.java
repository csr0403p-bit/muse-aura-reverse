package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Bpp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2952Bpp extends AbstractExecutorService {
    public static final C2952Bpp A00 = new C2952Bpp();

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }
}
