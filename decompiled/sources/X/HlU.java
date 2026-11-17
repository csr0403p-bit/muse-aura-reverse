package X;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class HlU extends AbstractC9259GBm implements Executor {
    public static final GBK A00;
    public static final HlU A01 = new HlU();

    static {
        A00 = C9268GBv.A00.limitedParallelism((int) AbstractC10483Hlb.A00(64 < HuL.A00 ? r2 : 64, 2147483647L, "kotlinx.coroutines.io.parallelism"), null);
    }

    @Override // X.AbstractC9259GBm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw C3cG.A0Q("Cannot be invoked on Dispatchers.IO");
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        A00.dispatch(c78t, runnable);
    }

    @Override // X.GBK
    public final void dispatchYield(C78T c78t, Runnable runnable) {
        A00.dispatchYield(c78t, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A00.dispatch(C6ys.A00, runnable);
    }

    @Override // X.AbstractC9259GBm
    public final Executor getExecutor() {
        return this;
    }

    @Override // X.GBK
    public final GBK limitedParallelism(int i, String str) {
        return C9268GBv.A00.limitedParallelism(i, str);
    }

    @Override // X.GBK
    public final String toString() {
        return "Dispatchers.IO";
    }
}
