package X;

/* loaded from: classes5.dex */
public final class F5Y implements E5L {
    public final int $t;
    public final Object A00;

    public F5Y(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.E5L
    public final void A6y(E1P e1p, long j) {
        InterfaceC5563Dkg[] interfaceC5563DkgArr;
        switch (this.$t) {
            case 0:
                interfaceC5563DkgArr = ((C6367E2u) this.A00).A0K;
                break;
            case 1:
                interfaceC5563DkgArr = ((C6368E2v) this.A00).A0I;
                break;
            case 2:
                interfaceC5563DkgArr = ((E31) this.A00).A01;
                break;
            default:
                E3M.A01(e1p, ((C6372E2z) this.A00).A00, j);
                return;
        }
        E3M.A00(e1p, interfaceC5563DkgArr, j);
    }
}
