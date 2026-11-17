package X;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Bh7 implements Executor {
    public static final ThreadFactory A02 = new ThreadFactoryC2450Bbd(0);
    public ThreadPoolExecutor A00;
    public final Object A01 = C3cG.A0T();

    public Bh7() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), A02);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC2671BhG());
        this.A00 = threadPoolExecutor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.A01) {
            this.A00.execute(runnable);
        }
    }
}
