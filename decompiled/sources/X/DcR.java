package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DcR {
    public volatile InterfaceC5106DYe A03;
    public final AtomicBoolean A01 = new AtomicBoolean();
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final AtomicBoolean A02 = new AtomicBoolean();

    public static final void A00(DcR dcR) {
        InterfaceC5106DYe interfaceC5106DYe = dcR.A03;
        if (interfaceC5106DYe == null || !dcR.A00.get() || dcR.A01.get() || !C3cI.A1W(dcR.A02)) {
            return;
        }
        interfaceC5106DYe.cancel();
    }
}
