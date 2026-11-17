package X;

import java.util.concurrent.Executor;

/* renamed from: X.GQl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC9588GQl implements Executor {
    public static final ExecutorC9588GQl A00 = new ExecutorC9588GQl();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
