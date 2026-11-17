package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Bpn implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
