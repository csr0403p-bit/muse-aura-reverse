package X;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class GXz implements Executor {
    public static final GXz A00 = new GXz();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
