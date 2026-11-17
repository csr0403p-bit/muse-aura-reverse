package X;

/* renamed from: X.DpU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5786DpU implements InterfaceC5922Ds9 {
    public final /* synthetic */ C5620Dm3 A00;

    public C5786DpU(C5620Dm3 c5620Dm3) {
        this.A00 = c5620Dm3;
    }

    @Override // X.InterfaceC5922Ds9
    public final C6233Dyb AIo() {
        C5620Dm3 c5620Dm3 = this.A00;
        InterfaceC5922Ds9 interfaceC5922Ds9AHZ = ((AbstractC6067Dv5) c5620Dm3).A00.AHZ();
        return (!c5620Dm3.A0B || interfaceC5922Ds9AHZ == null) ? c5620Dm3.A0M.A00 : interfaceC5922Ds9AHZ.AIo();
    }

    @Override // X.InterfaceC5922Ds9
    public final long AIv() {
        C5620Dm3 c5620Dm3 = this.A00;
        InterfaceC5922Ds9 interfaceC5922Ds9AHZ = ((AbstractC6067Dv5) c5620Dm3).A00.AHZ();
        return (!c5620Dm3.A0B || interfaceC5922Ds9AHZ == null) ? c5620Dm3.A0M.A00() : interfaceC5922Ds9AHZ.AIv();
    }

    @Override // X.InterfaceC5922Ds9
    public final /* synthetic */ boolean ANJ() {
        return false;
    }

    @Override // X.InterfaceC5922Ds9
    public final void Ae1(C6233Dyb c6233Dyb) {
        C5620Dm3 c5620Dm3 = this.A00;
        c5620Dm3.A0M.A04(c6233Dyb);
        InterfaceC5922Ds9 interfaceC5922Ds9AHZ = ((AbstractC6067Dv5) c5620Dm3).A00.AHZ();
        if (interfaceC5922Ds9AHZ != null) {
            interfaceC5922Ds9AHZ.Ae1(c6233Dyb);
        }
    }
}
