package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.Eyc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC7512Eyc implements Executor {
    public static final Handler A00 = C60O.A02();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A00.post(runnable);
    }
}
