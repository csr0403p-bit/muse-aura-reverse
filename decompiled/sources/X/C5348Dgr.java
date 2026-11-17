package X;

/* renamed from: X.Dgr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5348Dgr implements InterfaceC5349Dgs {
    public final /* synthetic */ C5358Dh3 A00;

    public C5348Dgr(C5358Dh3 c5358Dh3) {
        this.A00 = c5358Dh3;
    }

    @Override // X.InterfaceC5349Dgs
    public final void ATe() {
        long j;
        C5358Dh3 c5358Dh3 = this.A00;
        synchronized (CXG.A03) {
            j = CXG.A01 ? CXG.A00 : -9223372036854775807L;
        }
        C5358Dh3.A04(c5358Dh3, j);
    }
}
