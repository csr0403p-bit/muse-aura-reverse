package X;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class GXC implements Executor {
    public static final GXC A00 = new GXC();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
