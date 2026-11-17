package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.ByA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3096ByA implements Executor {
    public final Handler A00 = new HandlerC3095By9(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
