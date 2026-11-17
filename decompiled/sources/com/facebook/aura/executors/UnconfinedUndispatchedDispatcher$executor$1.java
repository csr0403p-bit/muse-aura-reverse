package com.facebook.aura.executors;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class UnconfinedUndispatchedDispatcher$executor$1 implements Executor {
    public static final UnconfinedUndispatchedDispatcher$executor$1 INSTANCE = new UnconfinedUndispatchedDispatcher$executor$1();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
