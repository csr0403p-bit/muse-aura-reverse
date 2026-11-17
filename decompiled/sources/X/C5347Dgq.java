package X;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* renamed from: X.Dgq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5347Dgq implements InterfaceC5229Ddn<InterfaceC5231Ddp> {
    public final InterfaceC5349Dgs A00;

    @Override // X.InterfaceC5229Ddn
    public final void ATu(InterfaceC5231Ddp interfaceC5231Ddp, long j, long j2) {
        boolean z;
        InterfaceC5349Dgs interfaceC5349Dgs = this.A00;
        synchronized (CXG.A03) {
            z = CXG.A01;
        }
        if (z) {
            interfaceC5349Dgs.ATe();
        } else {
            C5358Dh3.A05(((C5348Dgr) interfaceC5349Dgs).A00, new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // X.InterfaceC5229Ddn
    public final C5230Ddo ATv(InterfaceC5231Ddp interfaceC5231Ddp, IOException iOException, int i, long j, long j2) {
        C5358Dh3.A05(((C5348Dgr) this.A00).A00, iOException);
        return C5342Dgl.A03;
    }

    public C5347Dgq(InterfaceC5349Dgs interfaceC5349Dgs) {
        this.A00 = interfaceC5349Dgs;
    }

    @Override // X.InterfaceC5229Ddn
    public final void ATt(InterfaceC5231Ddp interfaceC5231Ddp, long j, boolean z) {
    }

    @Override // X.InterfaceC5229Ddn
    public final /* synthetic */ void ATx(InterfaceC5231Ddp interfaceC5231Ddp, int i, long j) {
    }
}
