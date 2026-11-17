package X;

/* renamed from: X.AXq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1083AXq implements InterfaceC1740Apd {
    public final long A00;
    public final /* synthetic */ C1081AXo A01;

    public C1083AXq(C1081AXo c1081AXo, long j) {
        this.A01 = c1081AXo;
        this.A00 = j;
    }

    @Override // X.InterfaceC1740Apd
    public final AqW A8C() {
        return AbstractC1793ArC.A00(this.A01);
    }

    @Override // X.InterfaceC1740Apd
    public final long AYC(InterfaceC1497Ak4 interfaceC1497Ak4) {
        InterfaceC1497Ak4 interfaceC1497Ak42 = (InterfaceC1497Ak4) this.A01.A01.getValue();
        if (interfaceC1497Ak42 != null) {
            return interfaceC1497Ak4.APm(interfaceC1497Ak42, this.A00);
        }
        throw C3cG.A0Q("Tried to open context menu before the anchor was placed.");
    }

    @Override // X.InterfaceC1740Apd
    public final AaC A77(InterfaceC1497Ak4 interfaceC1497Ak4) {
        return C2J7.A00(AYC(interfaceC1497Ak4), 0L);
    }
}
