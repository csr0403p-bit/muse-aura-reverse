package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes6.dex */
public final class FEH extends Handler {
    public final /* synthetic */ FED<ResolveState, RenderContext, StateUpdateType> A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7384Etj.A0Y(message, 0);
        int i = message.what;
        if (i != 99) {
            throw BV5.A0g("Unknown message: ", i);
        }
        FED.A02(this.A00, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FEH(Looper looper, Looper looper2) {
        super(looper);
        this.A00 = looper2;
    }
}
