package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.BtT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3051BtT extends AbstractExecutorService implements InterfaceExecutorServiceC3053BtV {
    public final RunnableC3052BtU A00;
    public final String A01;
    public final BlockingQueue<Runnable> A02;
    public final Executor A03;
    public final AtomicInteger A04;
    public final AtomicInteger A05;
    public volatile int A06;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (runnable == null) {
            throw BV4.A0a("runnable parameter is null");
        }
        BlockingQueue<Runnable> blockingQueue = this.A02;
        if (!blockingQueue.offer(runnable)) {
            throw new RejectedExecutionException(FGI.A0S(this.A01, " queue is full, size=", blockingQueue.size()));
        }
        int size = blockingQueue.size();
        AtomicInteger atomicInteger = this.A04;
        int i = atomicInteger.get();
        if (size > i) {
            atomicInteger.compareAndSet(i, size);
        }
        A00(this);
    }

    public C3051BtT(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.A01 = "SerialExecutor";
        this.A03 = executor;
        this.A06 = 1;
        this.A02 = linkedBlockingQueue;
        this.A00 = new RunnableC3052BtU(this);
        this.A05 = BV4.A13(0);
        this.A04 = BV4.A13(0);
    }

    public static void A00(C3051BtT c3051BtT) {
        int i;
        AtomicInteger atomicInteger = c3051BtT.A05;
        do {
            i = atomicInteger.get();
            if (i >= c3051BtT.A06) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        c3051BtT.A03.execute(c3051BtT.A00);
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
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
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
}
