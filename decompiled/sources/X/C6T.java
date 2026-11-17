package X;

import android.os.Process;

/* loaded from: classes5.dex */
public final class C6T {
    public static final void A00(RuntimeException runtimeException) {
        C67 c67;
        if (C5V.A04 != null && C5V.A04.A04) {
            synchronized (C67.class) {
                c67 = C67.A03;
            }
            if (c67 != null) {
                CFK.A04("AppExitUtil", "App in foreground, sending exception to ExceptionHandlerManager");
                Thread threadCurrentThread = Thread.currentThread();
                synchronized (C67.class) {
                    C67.A00().uncaughtException(threadCurrentThread, runtimeException);
                }
            }
        }
        synchronized (C6T.class) {
        }
        Process.killProcess(Process.myPid());
    }
}
