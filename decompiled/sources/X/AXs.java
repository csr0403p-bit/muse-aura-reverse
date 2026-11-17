package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AXs extends AbstractC1437Aj6 implements InterfaceC1740Apd, C1Z2 {
    public C1085AXt A00;
    public G0U<? super InterfaceC1497Ak4, AaC> A01;
    public G0U<? super HtJ<? super Unit>, ? extends Object> A02;
    public G0U<? super HtJ<? super Unit>, ? extends Object> A03;
    public HoC A04;
    public final C1BO A06 = BBP.A0A(C2298BSy.A00(this, 16));
    public AaC A05 = AaC.A04;

    @Override // X.InterfaceC1740Apd
    public final AaC A77(InterfaceC1497Ak4 interfaceC1497Ak4) {
        AaC aaCInvoke;
        if (!this.isAttached || (aaCInvoke = this.A01.invoke(interfaceC1497Ak4)) == null) {
            return this.A05;
        }
        this.A05 = aaCInvoke;
        return aaCInvoke;
    }

    @Override // X.InterfaceC1740Apd
    public final AqW A8C() {
        return (AqW) this.A06.getValue();
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        C1085AXt c1085AXt = this.A00;
        c1085AXt.A01 = C79.A0C;
        c1085AXt.A00 = this;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        C1085AXt c1085AXt = this.A00;
        c1085AXt.A01 = C79.A01;
        c1085AXt.A00 = null;
    }

    public AXs(C1085AXt c1085AXt, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, G0U<? super HtJ<? super Unit>, ? extends Object> g0u2, G0U<? super InterfaceC1497Ak4, AaC> g0u3) {
        this.A00 = c1085AXt;
        this.A03 = g0u;
        this.A02 = g0u2;
        this.A01 = g0u3;
    }

    @Override // X.InterfaceC1740Apd
    public final long AYC(InterfaceC1497Ak4 interfaceC1497Ak4) {
        AaC aaCA77 = A77(interfaceC1497Ak4);
        return AnonymousClass005.A0J(aaCA77.A01, aaCA77.A03);
    }
}
