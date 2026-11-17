package X;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;

/* loaded from: classes6.dex */
public abstract class HxR {
    public static final void A00(C78T c78t, Throwable th) {
        Throwable thA0d;
        Iterator<CoroutineExceptionHandler> it = AbstractC7443Ew6.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(c78t, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    thA0d = th;
                } else {
                    thA0d = BV4.A0d("Exception while trying to handle coroutine exception", th2);
                    CU7.A01(thA0d, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, thA0d);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            CU7.A01(th, new DiagnosticCoroutineContextException(c78t));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
