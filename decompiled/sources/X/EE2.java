package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class EE2 implements InterfaceC2940BpU {
    public final int $t;
    public final long A00;
    public final Object A01;
    public final Object A02;

    public EE2(ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, int i, long j) {
        this.$t = i;
        this.A01 = listenableFuture;
        this.A02 = scheduledExecutorService;
        this.A00 = j;
    }

    @Override // X.InterfaceC2940BpU
    public final Object A4r(final C3010Brs c3010Brs) {
        Runnable runnable;
        int i = this.$t;
        final ListenableFuture listenableFuture = (ListenableFuture) this.A01;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.A02;
        if (i != 0) {
            long j = this.A00;
            AbstractC2942BpW.A04(c3010Brs, listenableFuture);
            if (!listenableFuture.isDone()) {
                final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: X.Bla
                    public static final String __redex_internal_original_name = "Futures$$ExternalSyntheticLambda5";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3010Brs c3010Brs2 = c3010Brs;
                        ListenableFuture listenableFuture2 = listenableFuture;
                        c3010Brs2.A03(null);
                        listenableFuture2.cancel(true);
                    }
                }, j, TimeUnit.MILLISECONDS);
                runnable = new Runnable() { // from class: X.Blb
                    public static final String __redex_internal_original_name = "Futures$$ExternalSyntheticLambda6";

                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledFutureSchedule.cancel(true);
                    }
                };
                ExecutorC2446BbZ.A03(listenableFuture, runnable);
            }
        } else {
            long j2 = this.A00;
            AbstractC2942BpW.A04(c3010Brs, listenableFuture);
            if (!listenableFuture.isDone()) {
                final ScheduledFuture scheduledFutureSchedule2 = scheduledExecutorService.schedule(new CallableC7566F4f(c3010Brs, listenableFuture, 0, j2), j2, TimeUnit.MILLISECONDS);
                runnable = new Runnable() { // from class: X.Blc
                    public static final String __redex_internal_original_name = "Futures$$ExternalSyntheticLambda8";

                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledFutureSchedule2.cancel(true);
                    }
                };
                ExecutorC2446BbZ.A03(listenableFuture, runnable);
            }
        }
        return BV8.A0u(listenableFuture, C60O.A0x("TimeoutFuture["));
    }
}
