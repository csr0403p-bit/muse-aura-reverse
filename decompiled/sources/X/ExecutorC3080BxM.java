package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.BxM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3080BxM implements Executor {
    public static final ExecutorC3080BxM A00 = new ExecutorC3080BxM();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) AbstractC3079BxL.A01.getValue()).post(runnable);
    }
}
