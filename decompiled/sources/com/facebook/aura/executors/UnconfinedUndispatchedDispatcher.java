package com.facebook.aura.executors;

import X.AbstractC9259GBm;
import X.C7384Etj;
import X.C78T;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class UnconfinedUndispatchedDispatcher extends AbstractC9259GBm {
    @Override // X.GBK
    public void dispatch(C78T c78t, Runnable runnable) {
        C7384Etj.A0Y(runnable, 1);
        UnconfinedUndispatchedDispatcher$executor$1.INSTANCE.execute(runnable);
    }

    @Override // X.AbstractC9259GBm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // X.AbstractC9259GBm
    public Executor getExecutor() {
        return UnconfinedUndispatchedDispatcher$executor$1.INSTANCE;
    }
}
