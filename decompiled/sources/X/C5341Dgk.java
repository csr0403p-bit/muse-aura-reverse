package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.Dgk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5341Dgk {
    public static Executor A00;

    public static synchronized Executor A00() {
        Executor executorNewSingleThreadExecutor;
        executorNewSingleThreadExecutor = A00;
        if (executorNewSingleThreadExecutor == null) {
            executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new Ev6("ExoPlayer:BackgroundExecutor", 1));
            A00 = executorNewSingleThreadExecutor;
        }
        return executorNewSingleThreadExecutor;
    }
}
