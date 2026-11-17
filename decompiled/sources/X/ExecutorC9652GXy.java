package X;

import java.util.concurrent.Executor;

/* renamed from: X.GXy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC9652GXy implements Executor {
    public static final ExecutorC9652GXy A00 = new ExecutorC9652GXy();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
