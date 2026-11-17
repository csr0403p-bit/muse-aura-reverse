package X;

import java.lang.Thread;

/* loaded from: classes5.dex */
public final class C6V implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ C66 A00;
    public final /* synthetic */ Thread.UncaughtExceptionHandler A01;

    public C6V(C66 c66, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.A01 = uncaughtExceptionHandler;
        this.A00 = c66;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
        C66 c66 = this.A00;
        if (c66.A01.accept(thread, th)) {
            c66.A00(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A01;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
