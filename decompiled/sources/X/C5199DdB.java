package X;

import android.os.Message;

/* renamed from: X.DdB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5199DdB implements InterfaceC3355CGq {
    public final /* synthetic */ C5201DdD A00;

    @Override // X.InterfaceC3355CGq
    public final void ARt(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HandlerC5202DdE handlerC5202DdE = this.A00.A00;
        if (handlerC5202DdE != null) {
            handlerC5202DdE.sendMessage(Message.obtain(handlerC5202DdE, 2, abstractC3358CGz));
        }
    }

    public C5199DdB(C5201DdD c5201DdD) {
        this.A00 = c5201DdD;
    }
}
