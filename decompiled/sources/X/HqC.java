package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class HqC implements Executor {
    public final Handler A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        Thread threadCurrentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (threadCurrentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            GVS.A00(handler, runnable, "HandlerExecutor");
        }
    }

    public HqC(Handler handler) {
        this.A00 = handler;
    }
}
