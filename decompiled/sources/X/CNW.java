package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class CNW extends CNV implements ScheduledExecutorService, InterfaceExecutorServiceC3065Bwn {
    public final ScheduledExecutorService A00;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable command, long delay, TimeUnit unit) {
        boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
        RunnableFutureC3435CNg runnableFutureC3435CNg = new RunnableFutureC3435CNg(Executors.callable(command, null));
        return new ScheduledFutureC3449CNu(runnableFutureC3435CNg, this.A00.schedule(runnableFutureC3435CNg, delay, unit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        CNY cny = new CNY(command);
        return new ScheduledFutureC3449CNu(cny, this.A00.scheduleAtFixedRate(cny, initialDelay, period, unit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        CNY cny = new CNY(command);
        return new ScheduledFutureC3449CNu(cny, this.A00.scheduleWithFixedDelay(cny, initialDelay, delay, unit));
    }

    public CNW(ScheduledExecutorService delegate) {
        super(delegate);
        delegate.getClass();
        this.A00 = delegate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long delay, TimeUnit unit) {
        RunnableFutureC3435CNg runnableFutureC3435CNg = new RunnableFutureC3435CNg(callable);
        return new ScheduledFutureC3449CNu(runnableFutureC3435CNg, this.A00.schedule(runnableFutureC3435CNg, delay, unit));
    }
}
