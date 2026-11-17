package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.bloks.componentquery.DeadLooperException;

/* loaded from: classes6.dex */
public abstract class GVS {
    public static final F0C A00 = AbstractC5321DgF.A00(C79.A00, 49);

    public static final void A00(Handler handler, Runnable runnable, String str) {
        Looper looper = handler.getLooper();
        C7384Etj.A0U(looper);
        if (!looper.getThread().isAlive()) {
            String strA1P = C60P.A1P(": Attempted to enqueue task on dead looper. Thread alive: ", C3cG.A0g(str), handler.getLooper().getThread().isAlive());
            FFI.A01(null, strA1P, null);
            throw new DeadLooperException(strA1P);
        }
        if (handler.post(runnable)) {
            return;
        }
        String strA0M = FGI.A0M(str, ": Failed to post task to handler. The message queue may have been quit.");
        FFI.A01(null, strA0M, null);
        throw new DeadLooperException(strA0M);
    }
}
