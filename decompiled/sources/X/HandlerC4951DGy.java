package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DGy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC4951DGy extends Handler {
    public final int A00;
    public final AIG<Object> A01;
    public final G0U<Object, Unit> A02;
    public final int A03;
    public final Function0<Boolean> A04;

    public HandlerC4951DGy(Looper looper, Function0 function0, G0U g0u) {
        super(looper);
        this.A02 = g0u;
        this.A04 = function0;
        this.A03 = 1;
        this.A00 = 2;
        this.A01 = new AIG<>();
        sendEmptyMessageDelayed(1, 500L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long j;
        C7384Etj.A0Y(message, 0);
        int i = message.what;
        if (i == this.A00) {
            AIG<Object> aig = this.A01;
            Object obj = message.obj;
            C7384Etj.A0T(obj);
            aig.add(obj);
            return;
        }
        int i2 = this.A03;
        if (i == i2) {
            if (this.A04.invoke().booleanValue()) {
                while (true) {
                    AIG<Object> aig2 = this.A01;
                    if (aig2.isEmpty()) {
                        break;
                    } else {
                        this.A02.invoke(aig2.removeFirst());
                    }
                }
                j = 500;
            } else {
                j = 100;
            }
            sendEmptyMessageDelayed(i2, j);
        }
    }
}
