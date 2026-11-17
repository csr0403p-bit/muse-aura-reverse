package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.Bea, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC2581Bea implements Executor {
    public final Handler A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.A00;
        runnable.getClass();
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(AnonymousClass001.A0v(" is shutting down", BV5.A0q(handler)));
        }
    }

    public ExecutorC2581Bea(Handler handler) {
        this.A00 = handler;
    }
}
