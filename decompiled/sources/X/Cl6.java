package X;

/* loaded from: classes5.dex */
public final class Cl6 implements InterfaceC4069ClG {
    public final InterfaceC4069ClG A00;
    public final C3958Chx A01;

    @Override // X.InterfaceC4069ClG
    public final void ATB() {
        this.A00.ATB();
        C3958Chx c3958Chx = this.A01;
        if (c3958Chx != null) {
            c3958Chx.A01.stopSelf(c3958Chx.A00);
        }
    }

    @Override // X.InterfaceC4069ClG
    public final void AXM(boolean z) {
        this.A00.AXM(z);
    }

    public Cl6(InterfaceC4069ClG interfaceC4069ClG, C3958Chx c3958Chx) {
        this.A00 = interfaceC4069ClG;
        this.A01 = c3958Chx;
    }
}
