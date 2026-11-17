package X;

import X.InterfaceC4391Cut;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Coi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC4175Coi<R extends InterfaceC4391Cut> extends HandlerC4000CjT {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                throw BV4.A0a("onResult");
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", FGI.A0H("Don't know how to handle message: ", i), new Exception());
        } else {
            ((BasePendingResult) message.obj).A03(Status.A0A);
        }
    }

    public HandlerC4175Coi() {
        super(Looper.getMainLooper());
    }
}
