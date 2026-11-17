package X;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: X.CNm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3441CNm extends AbstractOwnableSynchronizer implements Runnable {
    public static final String __redex_internal_original_name = "InterruptibleTask$Blocker";
    public final AbstractRunnableC3440CNl<?> task;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.task.toString();
    }

    public RunnableC3441CNm(AbstractRunnableC3440CNl<?> task) {
        this.task = task;
    }

    public static void A00(RunnableC3441CNm runnableC3441CNm, Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
