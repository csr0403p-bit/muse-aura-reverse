package X;

import java.util.concurrent.Executor;

/* renamed from: X.Eyd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC7513Eyd implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C60O.A02().post(runnable);
    }
}
