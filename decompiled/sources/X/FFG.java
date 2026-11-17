package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes6.dex */
public final class FFG extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        FDW fdw;
        C7384Etj.A0Y(message, 0);
        super.handleMessage(message);
        C7918FKq c7918FKq = (C7918FKq) message.obj;
        if (message.what != 0 || c7918FKq == null || (fdw = c7918FKq.A0J) == null || c7918FKq.A0H == null) {
            return;
        }
        C7384Etj.A0X(fdw);
        HsM hsMA0D = fdw.A0D(38);
        if (hsMA0D != null) {
            FDW fdw2 = c7918FKq.A0J;
            C9115Fyg c9115FygA00 = C9115Fyg.A00();
            c9115FygA00.A06(Float.valueOf(c7918FKq.A08 / 2.14748365E9f), 0);
            F6D.A03(c7918FKq.A0H, fdw2, C9115Fyg.A03(c9115FygA00, c7918FKq.A0H, 1), hsMA0D);
        }
    }

    public FFG(Looper looper) {
        super(looper);
    }
}
