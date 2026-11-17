package X;

/* renamed from: X.Aiv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1426Aiv extends AYU {
    public final AbstractC1424Ait A00;

    @Override // X.AYU
    public final InterfaceC1497Ak4 A08() {
        InterfaceC1497Ak4 interfaceC1497Ak4A0d;
        AbstractC1424Ait abstractC1424Ait = this.A00;
        if (!abstractC1424Ait.A05) {
            interfaceC1497Ak4A0d = abstractC1424Ait.A0d();
            if (interfaceC1497Ak4A0d == null) {
            }
            return interfaceC1497Ak4A0d;
        }
        interfaceC1497Ak4A0d = null;
        abstractC1424Ait.AGz().A0d.A01();
        return interfaceC1497Ak4A0d;
    }

    @Override // X.AYU
    public final EnumC1820Arj A09() {
        return this.A00.getLayoutDirection();
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A00.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A00.AFo();
    }

    public C1426Aiv(AbstractC1424Ait abstractC1424Ait) {
        this.A00 = abstractC1424Ait;
    }
}
