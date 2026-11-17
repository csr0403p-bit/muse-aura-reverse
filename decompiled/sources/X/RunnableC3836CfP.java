package X;

import android.util.Log;

/* renamed from: X.CfP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3836CfP implements Runnable {
    public static final String __redex_internal_original_name = "SafeLoggingExecutor$SafeLoggingRunnable";
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.run();
        } catch (Exception e) {
            Log.e(FGI.A0M("TransportRuntime.", "Executor"), "Background execution failure.", e);
        }
    }

    public RunnableC3836CfP(Runnable runnable) {
        this.A00 = runnable;
    }
}
