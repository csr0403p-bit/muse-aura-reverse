package X;

/* loaded from: classes5.dex */
public final class F5G implements CSP {
    public final int $t;
    public final Object A00;

    public F5G(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        InterfaceC4453CwV interfaceC4453CwV;
        switch (this.$t) {
            case 2:
                interfaceC4453CwV = (InterfaceC4453CwV) this.A00;
                C7384Etj.A0Y(interfaceC4453CwV, 0);
                break;
            case 3:
                C7384Etj.A0Y(exc, 0);
                ((C3320CDz) this.A00).A00(exc);
                return;
            default:
                interfaceC4453CwV = (InterfaceC4453CwV) this.A00;
                break;
        }
        C7384Etj.A0Y(exc, 1);
        ((C4445CwC) interfaceC4453CwV).A00.A04(exc);
    }
}
