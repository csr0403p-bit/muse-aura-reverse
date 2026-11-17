package X;

import android.os.HandlerThread;

/* loaded from: classes5.dex */
public final class DFN implements InterfaceC4936DFr {
    public DFU A00;
    public DFU A01;
    public final DGD A02;
    public final DGW A03;
    public final DGc A04;
    public final DFV A05;
    public final DFS A06;
    public final DFK A07;
    public final C4082ClZ A08;

    @Override // X.InterfaceC4936DFr
    public final void ART(C4931DFd c4931DFd) {
        BV4.A1D(this.A07, c4931DFd, 4);
    }

    @Override // X.InterfaceC4936DFr
    public final void AYY(C4932DFh c4932DFh) {
        DFK dfk = this.A07;
        dfk.sendMessageAtFrontOfQueue(dfk.obtainMessage(1, c4932DFh));
        DFK.A01(dfk, c4932DFh.A07, "event.queued", c4932DFh.A09, c4932DFh.A0A);
    }

    @Override // X.InterfaceC4936DFr
    public final void AYZ(C4932DFh c4932DFh) {
        DFK dfk = this.A07;
        DFK.A01(dfk, c4932DFh.A07, "event.queued", c4932DFh.A09, c4932DFh.A0A);
        dfk.sendMessage(dfk.obtainMessage(1, 1, 0, c4932DFh));
    }

    @Override // X.InterfaceC4936DFr
    public final void Ag9(CIA cia) {
        DFK dfk = this.A07;
        C1H.A01(cia, "Cannot start a session with null batchSession");
        BV4.A1D(dfk, cia, 3);
    }

    @Override // X.InterfaceC4936DFr
    public final void AhQ() {
        BV4.A1C(this.A07, 9);
    }

    public DFN(HandlerThread handlerThread, DGD dgd, DGW dgw, DGc dGc, DFV dfv, DFS dfs, C4082ClZ c4082ClZ) {
        this.A07 = new DFK(handlerThread.getLooper(), this);
        this.A04 = dGc;
        this.A06 = dfs;
        this.A03 = dgw;
        this.A05 = dfv;
        this.A02 = dgd;
        this.A08 = c4082ClZ;
    }
}
