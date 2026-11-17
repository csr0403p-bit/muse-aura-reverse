package X;

import java.util.concurrent.BlockingQueue;

/* renamed from: X.BtU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3052BtU implements Runnable {
    public static final String __redex_internal_original_name = "ConstrainedExecutorService$Worker";
    public final /* synthetic */ C3051BtT A00;

    public RunnableC3052BtU(C3051BtT c3051BtT) {
        this.A00 = c3051BtT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C3051BtT c3051BtT = this.A00;
            BlockingQueue<Runnable> blockingQueue = c3051BtT.A02;
            Runnable runnablePoll = blockingQueue.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            }
            c3051BtT.A05.decrementAndGet();
            if (blockingQueue.isEmpty()) {
                return;
            }
            C3051BtT.A00(c3051BtT);
        } catch (Throwable th) {
            C3051BtT c3051BtT2 = this.A00;
            c3051BtT2.A05.decrementAndGet();
            if (!c3051BtT2.A02.isEmpty()) {
                C3051BtT.A00(c3051BtT2);
            }
            throw th;
        }
    }
}
