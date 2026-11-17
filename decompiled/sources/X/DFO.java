package X;

import android.os.HandlerThread;

/* loaded from: classes5.dex */
public final class DFO {
    public DFT A00;
    public DFT A01;
    public final DGD A02;
    public final DGW A03;
    public final DGc A04;
    public final DFR A05;
    public final DFL A06;

    public DFO(HandlerThread handlerThread, DGD dgd, DGW dgw, DGc dGc, DFR dfr) {
        this.A06 = new DFL(handlerThread.getLooper(), this);
        this.A04 = dGc;
        this.A05 = dfr;
        this.A03 = dgw;
        this.A02 = dgd;
    }
}
