package X;

import android.os.Looper;
import java.util.Iterator;

/* renamed from: X.DdF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5203DdF implements InterfaceC4040Ckh {
    public final C5201DdD A00;
    public final C5207DdJ<C5210DdM> A01;

    public C5203DdF(C4025CkE c4025CkE, InterfaceC4036Ckc interfaceC4036Ckc, CGw cGw, C4oT c4oT) {
        AnonymousClass002.A1B(cGw, 2, c4oT);
        C5207DdJ<C5210DdM> c5207DdJ = new C5207DdJ(Looper.getMainLooper());
        this.A01 = c5207DdJ;
        C5201DdD c5201DdD = new C5201DdD(BV5.A0D("AuthManagerImpl"), c4025CkE, interfaceC4036Ckc, cGw, c5207DdJ, c4oT);
        this.A00 = c5201DdD;
        HandlerC5202DdE handlerC5202DdE = c5201DdD.A00;
        if (handlerC5202DdE != null) {
            Iterator itA0x = BV5.A0x(handlerC5202DdE.A0A);
            int i = 0;
            while (itA0x.hasNext()) {
                if (itA0x.next() != null && i < 1) {
                    i = 1;
                }
            }
            handlerC5202DdE.A0C = new C5209DdL[i];
            handlerC5202DdE.A0D = new C5209DdL[i];
            C5209DdL c5209DdL = handlerC5202DdE.A0A.get(handlerC5202DdE.A04);
            int i2 = 0;
            while (true) {
                handlerC5202DdE.A01 = i2;
                if (c5209DdL == null) {
                    break;
                }
                handlerC5202DdE.A0D[i2] = c5209DdL;
                c5209DdL = null;
                i2++;
            }
            handlerC5202DdE.A00 = -1;
            int i3 = 0;
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                handlerC5202DdE.A0C[i3] = handlerC5202DdE.A0D[i4];
                i3++;
            }
            handlerC5202DdE.A00 = i3 - 1;
            handlerC5202DdE.sendMessageAtFrontOfQueue(handlerC5202DdE.obtainMessage(-2, HandlerC5202DdE.A0F));
        }
    }
}
