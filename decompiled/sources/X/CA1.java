package X;

import java.lang.Thread;

/* loaded from: classes5.dex */
public final class CA1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C5J.A00("Achilles", "Uncaught exception in Achilles thread", th);
    }
}
