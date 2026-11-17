package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.FrJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC8854FrJ extends Handler {
    public final /* synthetic */ AbstractC8851FrC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8854FrJ(Looper looper, AbstractC8851FrC abstractC8851FrC) {
        super(looper);
        this.A00 = abstractC8851FrC;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC8858FrW interfaceC8858FrW;
        HandlerC8854FrJ handlerC8854FrJ;
        AbstractC8851FrC abstractC8851FrC;
        if (message.what == 1) {
            AbstractC8851FrC abstractC8851FrC2 = this.A00;
            synchronized (abstractC8851FrC2.mLock) {
                interfaceC8858FrW = abstractC8851FrC2.mSessionImpl.get();
                handlerC8854FrJ = abstractC8851FrC2.mCallbackHandler;
            }
            if (interfaceC8858FrW != null) {
                C8853FrI c8853FrI = (C8853FrI) interfaceC8858FrW;
                synchronized (c8853FrI.A08) {
                    abstractC8851FrC = c8853FrI.A01;
                }
                if (abstractC8851FrC2 != abstractC8851FrC || handlerC8854FrJ == null) {
                    return;
                }
                interfaceC8858FrW.AdD((C8856FrQ) message.obj);
                abstractC8851FrC2.handleMediaPlayPauseIfPendingOnHandler(interfaceC8858FrW, handlerC8854FrJ);
                interfaceC8858FrW.AdD(null);
            }
        }
    }
}
