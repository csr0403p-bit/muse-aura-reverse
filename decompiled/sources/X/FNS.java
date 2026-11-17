package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes6.dex */
public final class FNS implements Handler.Callback {
    public final Handler.Callback A00;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C7384Etj.A0Y(message, 0);
        Object obj = message.obj;
        if (obj instanceof FOJ) {
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
        }
        return this.A00.handleMessage(message);
    }

    public FNS(Handler.Callback callback) {
        this.A00 = callback;
    }
}
