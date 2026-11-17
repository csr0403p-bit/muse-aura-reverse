package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes6.dex */
public final class FFA extends Handler {
    public final /* synthetic */ FFB A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7384Etj.A0Y(message, 0);
        super.handleMessage(message);
        Object obj = message.obj;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        FFB ffb = this.A00;
        FDW fdw = ffb.A03;
        C9115Fyg c9115FygA00 = C9115Fyg.A00();
        F9J.A03(ffb.A02, fdw, c9115FygA00, (HsM) obj, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FFA(Looper looper, FFB ffb) {
        super(looper);
        this.A00 = ffb;
    }
}
