package X;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Hy1 extends AbstractC9259GBm implements Hni {
    public final Executor A00;

    @Override // X.Hni
    public final HsS AO7(Runnable runnable, C78T c78t, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (scheduledFutureSchedule != null) {
                    return new Hz0(scheduledFutureSchedule);
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                HzS.A03(cancellationException, c78t);
            }
        }
        return GB0.A00.AO7(runnable, c78t, j);
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Hm1<-Lkotlin/Unit;>;)V */
    @Override // X.Hni
    public final void AcD(Hm1 hm1, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            FXy fXy = new FXy(hm1, this);
            C78T context = hm1.getContext();
            try {
                ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(fXy, j, TimeUnit.MILLISECONDS);
                if (scheduledFutureSchedule != null) {
                    GBO.A01(new C10614Hyw(scheduledFutureSchedule), hm1);
                    return;
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                HzS.A03(cancellationException, context);
            }
        }
        GB0.A00.AcD(hm1, j);
    }

    @Override // X.AbstractC9259GBm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.A00;
        if (!(executor instanceof ExecutorService) || (executorService = (ExecutorService) executor) == null) {
            return;
        }
        executorService.shutdown();
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        try {
            this.A00.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            HzS.A03(cancellationException, c78t);
            GBK gbk = AbstractC9266GBt.A00;
            HlU.A01.dispatch(c78t, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Hy1) && ((Hy1) obj).A00 == this.A00;
    }

    @Override // X.AbstractC9259GBm
    public final Executor getExecutor() {
        return this.A00;
    }

    public final int hashCode() {
        return System.identityHashCode(this.A00);
    }

    @Override // X.GBK
    public final String toString() {
        return this.A00.toString();
    }

    public Hy1(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.A00 = executor;
        try {
            if (!(executor instanceof ScheduledThreadPoolExecutor) || (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) == null || (method = Hz3.A00) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable unused) {
        }
    }
}
