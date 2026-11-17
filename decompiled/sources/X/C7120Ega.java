package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Ega, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7120Ega implements InterfaceC7147EhG {
    public final Executor A00;
    public final Executor A01;
    public final Executor A02;
    public final Executor A03;
    public final ScheduledExecutorService A04;

    public C7120Ega(int i) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactoryC7126Egg("FrescoIoBoundExecutor"));
        C7384Etj.A0U(executorServiceNewFixedThreadPool);
        this.A02 = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i, new ThreadFactoryC7126Egg("FrescoDecodeExecutor"));
        C7384Etj.A0U(executorServiceNewFixedThreadPool2);
        this.A01 = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i, new ThreadFactoryC7126Egg("FrescoBackgroundExecutor"));
        C7384Etj.A0U(executorServiceNewFixedThreadPool3);
        this.A00 = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new ThreadFactoryC7126Egg("FrescoLightWeightBackgroundExecutor"));
        C7384Etj.A0U(executorServiceNewFixedThreadPool4);
        this.A03 = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, new ThreadFactoryC7126Egg("FrescoBackgroundExecutor"));
        C7384Etj.A0U(scheduledExecutorServiceNewScheduledThreadPool);
        this.A04 = scheduledExecutorServiceNewScheduledThreadPool;
    }
}
