package X;

import android.os.Process;

/* renamed from: X.Ego, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7133Ego implements Runnable {
    public static final String __redex_internal_original_name = "PriorityThreadFactory$newThread$wrapperRunnable$1";
    public final /* synthetic */ ThreadFactoryC7126Egg A00;
    public final /* synthetic */ Runnable A01;

    public RunnableC7133Ego(ThreadFactoryC7126Egg threadFactoryC7126Egg, Runnable runnable) {
        this.A00 = threadFactoryC7126Egg;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
        } catch (Throwable unused) {
        }
        this.A01.run();
    }
}
