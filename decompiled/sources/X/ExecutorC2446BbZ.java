package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.BbZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC2446BbZ implements Executor {
    public static volatile ExecutorC2446BbZ A00;

    public static ExecutorC2446BbZ A00() {
        if (A00 == null) {
            synchronized (ExecutorC2446BbZ.class) {
                if (A00 == null) {
                    A00 = new ExecutorC2446BbZ();
                }
            }
        }
        return A00;
    }

    public static Bpe A01(ListenableFuture listenableFuture, int i) {
        F5L f5l = new F5L(i);
        Executor executorA00 = A00();
        Bpe bpe = new Bpe(new F4M(f5l, 7), listenableFuture);
        listenableFuture.addListener(bpe, executorA00);
        return bpe;
    }

    public static void A02(ListenableFuture listenableFuture, Object obj, Object obj2, int i) {
        AbstractC2942BpW.A03(new F58(i, obj, obj2), listenableFuture, A00());
    }

    public static void A03(ListenableFuture listenableFuture, Runnable runnable) {
        listenableFuture.addListener(runnable, A00());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
