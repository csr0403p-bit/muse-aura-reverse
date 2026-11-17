package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dmo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC5659Dmo extends Handler {
    public final C5627DmA A00;
    public final AtomicReference<BWI> A01;
    public final InterfaceC5724DoJ A02;
    public volatile int A03;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7384Etj.A0Y(message, 0);
        C6042Dud c6042Dud = C6042Dud.A00;
        try {
            if (message.what == 2) {
                A00(this);
                if (this.A01.get() == BWI.A03) {
                    removeMessages(2);
                    sendEmptyMessageDelayed(2, 200L);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(c6042Dud, th);
                throw th2;
            }
        }
    }

    public static final void A00(HandlerC5659Dmo handlerC5659Dmo) {
        AtomicReference<BWI> atomicReference = handlerC5659Dmo.A01;
        if (atomicReference.get() == BWI.A04) {
            AbstractC3426CMt.A04("PlayedForThreeSecondsDetectingHandler", "PlayedForThreeSeconds status shouldn't be unknown when attempting to send event", BV4.A1W());
            return;
        }
        BWI bwi = atomicReference.get();
        BWI bwi2 = BWI.A02;
        if (bwi == bwi2 || ((int) ((C5627DmA) handlerC5659Dmo.A02).A07.A0D()) - handlerC5659Dmo.A03 < 3000) {
            return;
        }
        atomicReference.set(bwi2);
    }

    public HandlerC5659Dmo(Looper looper, InterfaceC5724DoJ interfaceC5724DoJ, C5627DmA c5627DmA) {
        super(looper);
        this.A02 = interfaceC5724DoJ;
        this.A00 = c5627DmA;
        this.A01 = BV4.A16(BWI.A04);
    }
}
