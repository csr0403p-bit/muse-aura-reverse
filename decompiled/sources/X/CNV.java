package X;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class CNV extends CLz {
    public final ExecutorService A00;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) {
        return this.A00.awaitTermination(timeout, unit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        this.A00.execute(command);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.A00.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.A00.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.A00.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.A00.shutdownNow();
    }

    public CNV(ExecutorService delegate) {
        delegate.getClass();
        this.A00 = delegate;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        sbA0w.append("[");
        return BV8.A0u(this.A00, sbA0w);
    }
}
