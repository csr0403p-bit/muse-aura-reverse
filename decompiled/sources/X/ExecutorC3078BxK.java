package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.BxK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3078BxK implements Executor {
    public static final ExecutorC3078BxK A00 = new ExecutorC3078BxK();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) AbstractC3077BxJ.A02.getValue()).post(runnable);
    }
}
