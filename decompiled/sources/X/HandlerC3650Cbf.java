package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.Cbf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class HandlerC3650Cbf extends Handler {
    public final Looper A00;

    public HandlerC3650Cbf(Looper looper) {
        super(looper);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC3650Cbf(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC3650Cbf() {
        this.A00 = Looper.getMainLooper();
    }
}
