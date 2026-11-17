package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.Dde, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC5221Dde implements Executor {
    public final Handler A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        GVS.A00(this.A00, runnable, "SerialExecutor");
    }

    public ExecutorC5221Dde(Handler handler) {
        this.A00 = handler;
    }
}
