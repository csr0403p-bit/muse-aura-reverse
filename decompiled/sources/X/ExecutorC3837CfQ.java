package X;

import java.util.concurrent.Executor;

/* renamed from: X.CfQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3837CfQ implements Executor {
    public final Executor A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.execute(new RunnableC3836CfP(runnable));
    }

    public ExecutorC3837CfQ(Executor executor) {
        this.A00 = executor;
    }
}
