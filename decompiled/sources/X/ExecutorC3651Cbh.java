package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.Cbh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3651Cbh implements Executor {
    public final Handler A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public ExecutorC3651Cbh(Looper looper) {
        this.A00 = new HandlerC3650Cbf(looper);
    }
}
