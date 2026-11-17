package X;

import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public abstract class HwS {
    public static final void A00(C78T c78t, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).cause;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) c78t.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(c78t, th);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeExceptionA0d = BV4.A0d("Exception while trying to handle coroutine exception", th2);
                CU7.A01(runtimeExceptionA0d, th);
                th = runtimeExceptionA0d;
            }
        }
        HxR.A00(c78t, th);
    }
}
