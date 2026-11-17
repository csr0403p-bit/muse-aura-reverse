package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class BpJ implements Executor {
    public static volatile Executor A01;
    public final ExecutorService A00 = Executors.newFixedThreadPool(2, new F2W(this));

    public static Executor A00() {
        if (A01 == null) {
            synchronized (BpJ.class) {
                if (A01 == null) {
                    A01 = new BpJ();
                }
            }
        }
        return A01;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.execute(runnable);
    }
}
