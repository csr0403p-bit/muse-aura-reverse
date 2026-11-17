package X;

import java.util.concurrent.Executor;

/* renamed from: X.EwV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC7452EwV implements Executor {
    public static final ExecutorC7452EwV A00 = new ExecutorC7452EwV();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C60O.A02().post(runnable);
    }
}
