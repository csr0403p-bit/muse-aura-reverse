package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.analytics2.logger.interfaces.DefaultHandlerThreadFactory;

/* loaded from: classes5.dex */
public final class DFP implements InterfaceC4936DFr {
    public CIA A00;
    public final Context A01;
    public final DG4 A02;
    public final DFQ A03;
    public final DGD A04;
    public final InterfaceC4081ClT A05;
    public final DFV A06;
    public final InterfaceC4083Clb A07;
    public final InterfaceC4083Clb A08;
    public final C3339CFj A09 = new C3339CFj();

    @Override // X.InterfaceC4936DFr
    public final void ART(C4931DFd c4931DFd) {
        synchronized (this) {
            BV4.A1D(this.A03, c4931DFd, 4);
        }
    }

    @Override // X.InterfaceC4936DFr
    public final void AYY(C4932DFh c4932DFh) {
        synchronized (this) {
            BV4.A1D(this.A03, c4932DFh, 2);
        }
    }

    @Override // X.InterfaceC4936DFr
    public final void AYZ(C4932DFh c4932DFh) {
        synchronized (this) {
            DFQ dfq = this.A03;
            dfq.sendMessage(dfq.obtainMessage(1, c4932DFh));
        }
    }

    @Override // X.InterfaceC4936DFr
    public final synchronized void Ag9(CIA cia) {
        this.A00 = cia;
        if (cia != null) {
            cia.A00();
        }
        BV4.A1D(this.A03, cia, 3);
    }

    @Override // X.InterfaceC4936DFr
    public final void AhQ() {
        synchronized (this) {
            BV4.A1C(this.A03, 5);
        }
    }

    public DFP(Context context, DG4 dg4, DGD dgd, InterfaceC4081ClT interfaceC4081ClT, DFV dfv, InterfaceC4083Clb interfaceC4083Clb, InterfaceC4083Clb interfaceC4083Clb2) {
        this.A01 = context;
        this.A02 = dg4;
        this.A04 = dgd;
        this.A05 = interfaceC4081ClT;
        this.A06 = dfv;
        this.A08 = interfaceC4083Clb;
        this.A07 = interfaceC4083Clb2;
        C4046Ckp.A00(context).A05(DefaultHandlerThreadFactory.class.getName());
        Looper looper = BV5.A0C("Analytics2-EventProcessorProxy", 0).getLooper();
        C1H.A01(looper, "Event Proxy HandlerThread is not started.");
        this.A03 = new DFQ(looper, this);
    }
}
