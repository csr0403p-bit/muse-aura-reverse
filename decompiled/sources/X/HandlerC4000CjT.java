package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.CjT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class HandlerC4000CjT extends Handler {
    public final Looper A00;

    public HandlerC4000CjT(Looper looper) {
        super(looper);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC4000CjT(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.A00 = Looper.getMainLooper();
    }

    public HandlerC4000CjT() {
        this.A00 = Looper.getMainLooper();
    }
}
