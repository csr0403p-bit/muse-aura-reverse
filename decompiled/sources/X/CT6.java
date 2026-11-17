package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final /* synthetic */ class CT6 implements Executor {
    public static final Executor A00 = new CT6();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
