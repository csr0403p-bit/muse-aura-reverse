package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DmX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5643DmX implements Handler.Callback {
    public final Handler A00;
    public final InterfaceC5724DoJ A01;
    public final C6125DwR A02;
    public final String A03;
    public final AtomicBoolean A04;
    public final C6129DwV A05;
    public final Thread A06;

    public C5643DmX(Looper looper, InterfaceC5724DoJ interfaceC5724DoJ, C6125DwR c6125DwR, C6129DwV c6129DwV, String str) {
        C7384Etj.A0Y(looper, 2);
        this.A01 = interfaceC5724DoJ;
        this.A03 = str;
        this.A02 = c6125DwR;
        this.A05 = c6129DwV;
        Handler handler = new Handler(looper, this);
        this.A00 = handler;
        Thread threadA13 = BV7.A13(handler);
        C7384Etj.A0U(threadA13);
        this.A06 = threadA13;
        this.A04 = BV4.A12(false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList, java.util.List] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C7384Etj.A0Y(message, 0);
        C6042Dud c6042Dud = C6042Dud.A00;
        try {
            if (message.what == 1) {
                Object obj = message.obj;
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                AtomicBoolean atomicBoolean = this.A04;
                if (!atomicBoolean.get()) {
                    InterfaceC5724DoJ interfaceC5724DoJ = this.A01;
                    if (interfaceC5724DoJ.isPlaying()) {
                        C5627DmA c5627DmA = (C5627DmA) interfaceC5724DoJ;
                        if (c5627DmA.A0Y.get()) {
                            ?? AFt = interfaceC5724DoJ.AFt();
                            if (AFt != 0) {
                                C3066Bwo.A02(AFt, 0, AFt.size());
                            }
                            AbstractC3426CMt.A03("GrootPlayerLogger", "Heartbeat: vid %s, reason: %s", this.A03, str);
                            c5627DmA.A07.A0D();
                            if (!atomicBoolean.get()) {
                                Handler handler = this.A00;
                                handler.sendMessageDelayed(handler.obtainMessage(1, str), 0L);
                            }
                        }
                    }
                }
            }
            return true;
        } finally {
        }
    }

    public static final void A00(C5643DmX c5643DmX, Runnable runnable) {
        if (Thread.currentThread() == c5643DmX.A06) {
            runnable.run();
        } else {
            c5643DmX.A00.post(runnable);
        }
    }
}
