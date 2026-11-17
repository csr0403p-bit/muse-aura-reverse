package X;

import java.util.concurrent.Executor;

/* renamed from: X.Brd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3002Brd implements Executor {
    public static final ExecutorC3002Brd A00 = new ExecutorC3002Brd();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
