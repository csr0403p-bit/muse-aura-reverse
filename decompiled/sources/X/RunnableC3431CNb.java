package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CNb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3431CNb<V> implements Runnable {
    public static final String __redex_internal_original_name = "TimeoutFuture$Fire";
    public C3434CNf<V> A00;

    @Override // java.lang.Runnable
    public final void run() {
        C3434CNf<V> c3434CNf = this.A00;
        if (c3434CNf != null) {
            boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
            ListenableFuture<V> listenableFuture = c3434CNf.A00;
            if (listenableFuture != null) {
                this.A00 = null;
                if (listenableFuture.isDone()) {
                    c3434CNf.setFuture(listenableFuture);
                    return;
                }
                try {
                    ScheduledFuture<?> scheduledFuture = c3434CNf.A01;
                    c3434CNf.A01 = null;
                    String strA0J = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                strA0J = FGI.A0J("Timed out (timeout delayed by ", jAbs, " ms after scheduled time)");
                            }
                        } catch (Throwable th) {
                            c3434CNf.setException(new TimeoutFuture$TimeoutFutureException(strA0J));
                            throw th;
                        }
                    }
                    StringBuilder sbA0g = C3cG.A0g(strA0J);
                    sbA0g.append(": ");
                    sbA0g.append(listenableFuture);
                    c3434CNf.setException(new TimeoutFuture$TimeoutFutureException(sbA0g.toString()));
                } finally {
                    listenableFuture.cancel(true);
                }
            }
        }
    }
}
