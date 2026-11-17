package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: X.GBu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9267GBu extends AbstractC9259GBm {
    public static final C9267GBu A01 = new C9267GBu();
    public GCC A00 = new GCC(HlS.A01, HlS.A02, HlS.A05, HlS.A03);

    @Override // X.AbstractC9259GBm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw C8j3.A18("Dispatchers.Default cannot be closed");
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        GCC gcc = this.A00;
        AtomicLongFieldUpdater atomicLongFieldUpdater = GCC.A0A;
        gcc.A04(runnable, false, false);
    }

    @Override // X.GBK
    public final void dispatchYield(C78T c78t, Runnable runnable) {
        GCC gcc = this.A00;
        AtomicLongFieldUpdater atomicLongFieldUpdater = GCC.A0A;
        gcc.A04(runnable, false, true);
    }

    @Override // X.AbstractC9259GBm
    public final Executor getExecutor() {
        return this.A00;
    }

    @Override // X.GBK
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // X.GBK
    public final GBK limitedParallelism(int i, String str) {
        GBA.A00(i);
        return i >= HlS.A01 ? str != null ? new GBE(str, this) : this : super.limitedParallelism(i, str);
    }
}
