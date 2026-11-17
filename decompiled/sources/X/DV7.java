package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DV7 {
    public final DVB A00;
    public final ReentrantLock A03;
    public final ScheduledExecutorService A04;
    public final AtomicInteger A05;
    public final Condition A06;
    public final LinkedList A02 = BV4.A0y();
    public final HashSet A01 = C60O.A13();

    public DV7(DVB dvb, ScheduledExecutorService scheduledExecutorService) {
        this.A00 = dvb;
        this.A04 = scheduledExecutorService;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A03 = reentrantLock;
        this.A06 = reentrantLock.newCondition();
        this.A05 = BV4.A13(0);
        if (scheduledExecutorService != null) {
            Dlv dlv = dvb.A00.A01.gen;
            if (dlv.enable_expired_prefetch_tasks_cleanup) {
                long j = dlv.expired_prefetch_task_cleanup_interval_ms;
                if (j > 0) {
                    scheduledExecutorService.scheduleWithFixedDelay(new DV8(this), j, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
}
