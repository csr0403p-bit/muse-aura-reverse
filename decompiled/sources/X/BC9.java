package X;

/* loaded from: classes4.dex */
public final class BC9 implements InterfaceC2230BCa {
    public final /* synthetic */ BCN A00;
    public final /* synthetic */ C2229BBz A01;

    @Override // X.InterfaceC2230BCa
    public final void AZo(Object obj) {
    }

    public BC9(BCN bcn, C2229BBz c2229BBz) {
        this.A00 = bcn;
        this.A01 = c2229BBz;
    }

    @Override // X.InterfaceC2230BCa
    public final Integer ANt(BBb bBb, Object obj) {
        Integer numANt;
        InterfaceC2230BCa interfaceC2230BCa;
        BCN bcn = this.A00;
        if (!(bcn instanceof InterfaceC2230BCa) || (interfaceC2230BCa = (InterfaceC2230BCa) bcn) == null || (numANt = interfaceC2230BCa.ANt(bBb, obj)) == null) {
            numANt = C79.A00;
        }
        if (numANt != C79.A00) {
            return numANt;
        }
        C2229BBz c2229BBz = this.A01;
        c2229BBz.A00 = AbstractC0878AGe.A0Q(C3cG.A0r(bBb, obj), c2229BBz.A00);
        return C79.A01;
    }

    @Override // X.InterfaceC2230BCa
    public final void AZi() {
    }
}
