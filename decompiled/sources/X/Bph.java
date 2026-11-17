package X;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class Bph implements Runnable {
    public static final String __redex_internal_original_name = "HandlerScheduledExecutorService$HandlerScheduledFuture$1$1";
    public final /* synthetic */ C7424Evc A00;

    public Bph(C7424Evc c7424Evc) {
        this.A00 = c7424Evc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7424Evc c7424Evc = this.A00;
        RunnableScheduledFutureC2946Bpg runnableScheduledFutureC2946Bpg = (RunnableScheduledFutureC2946Bpg) c7424Evc.A00;
        if (C8j3.A10(runnableScheduledFutureC2946Bpg.A00) != null) {
            ((Handler) c7424Evc.A01).removeCallbacks(runnableScheduledFutureC2946Bpg);
        }
    }
}
