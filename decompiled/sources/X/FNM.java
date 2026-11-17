package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class FNM extends Handler {
    public final Handler.Callback A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FNM(Looper looper, Handler.Callback callback) {
        super(looper, new FNS(callback));
        C7384Etj.A0Y(looper, 0);
        this.A00 = callback;
    }
}
