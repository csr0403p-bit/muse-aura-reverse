package X;

import java.util.Collection;

/* loaded from: classes5.dex */
public final class BfP implements InterfaceC2610Bfb {
    public final C2614Bff A00;
    public final C2560Bdo A01;
    public final InterfaceC2630Bfx A02;
    public final InterfaceC2610Bfb A03;

    @Override // X.InterfaceC2610Bfb
    public final void A4u(Collection<BfD> collection) {
        throw C8j3.A18("Operation not supported by VirtualCamera.");
    }

    @Override // X.InterfaceC2610Bfb
    public final void A8x(Collection<BfD> collection) {
        throw C8j3.A18("Operation not supported by VirtualCamera.");
    }

    @Override // X.InterfaceC2783Bl3
    public final /* synthetic */ InterfaceC2622Bfo ADF() {
        return this.A00;
    }

    @Override // X.InterfaceC2610Bfb
    public final BfV ADG() {
        return this.A00;
    }

    @Override // X.InterfaceC2783Bl3
    public final /* synthetic */ InterfaceC2546BdX ADI() {
        return this.A01;
    }

    @Override // X.InterfaceC2610Bfb
    public final InterfaceC2544BdV ADJ() {
        return this.A01;
    }

    @Override // X.InterfaceC2610Bfb
    public final InterfaceC2620Bfm<EnumC2819Blw> ADL() {
        return this.A03.ADL();
    }

    @Override // X.InterfaceC2610Bfb
    public final /* synthetic */ InterfaceC2562Bdq AFS() {
        return AbstractC2591Ben.A00;
    }

    @Override // X.InterfaceC2610Bfb
    public final boolean AG8() {
        return false;
    }

    public BfP(InterfaceC2630Bfx interfaceC2630Bfx, InterfaceC2610Bfb interfaceC2610Bfb, InterfaceC2677BhX interfaceC2677BhX) {
        this.A03 = interfaceC2610Bfb;
        this.A02 = interfaceC2630Bfx;
        this.A00 = new C2614Bff(interfaceC2610Bfb.ADG(), interfaceC2677BhX);
        this.A01 = new C2560Bdo(interfaceC2610Bfb.ADJ());
    }

    @Override // X.InterfaceC2630Bfx
    public final void AWy(BfD bfD) {
        BoT.A00();
        this.A02.AWy(bfD);
    }

    @Override // X.InterfaceC2630Bfx
    public final void AWz(BfD bfD) {
        BoT.A00();
        this.A02.AWz(bfD);
    }

    @Override // X.InterfaceC2630Bfx
    public final void AX0(BfD bfD) {
        BoT.A00();
        this.A02.AX0(bfD);
    }

    @Override // X.InterfaceC2630Bfx
    public final void AX1(BfD bfD) {
        BoT.A00();
        this.A02.AX1(bfD);
    }

    @Override // X.InterfaceC2610Bfb
    public final /* synthetic */ void Ach(boolean z) {
    }

    @Override // X.InterfaceC2610Bfb
    public final /* synthetic */ void AdP(InterfaceC2562Bdq interfaceC2562Bdq) {
    }

    @Override // X.InterfaceC2610Bfb
    public final /* synthetic */ void AeF(boolean z) {
    }
}
