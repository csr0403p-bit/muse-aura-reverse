package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DV8 implements Runnable {
    public static final String __redex_internal_original_name = "TaskQueueExecutor$1";
    public final /* synthetic */ DV7 A00;

    public DV8(DV7 dv7) {
        this.A00 = dv7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DV7 dv7 = this.A00;
        Dlv dlv = dv7.A00.A00.A01.gen;
        if (dlv.enable_expired_prefetch_tasks_cleanup) {
            SystemClock.elapsedRealtime();
            long j = dlv.prefetch_task_ttl_ms;
            LinkedList linkedListA0y = BV4.A0y();
            ReentrantLock reentrantLock = dv7.A03;
            reentrantLock.lock();
            try {
                Iterator itA0N = C7384Etj.A0N(dv7.A02);
                if (itA0N.hasNext()) {
                    C7384Etj.A0U(itA0N.next());
                    throw BV4.A0a("getCreationTime");
                }
                reentrantLock.unlock();
                Iterator it = linkedListA0y.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw BV4.A0a("getMTask");
                }
                if (linkedListA0y.isEmpty()) {
                    return;
                }
                AbstractC3426CMt.A03("TaskQueueExecutor", "Cleaned up %d expired tasks (TTL: %dms)", BV4.A1Y(Integer.valueOf(linkedListA0y.size()), j));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
