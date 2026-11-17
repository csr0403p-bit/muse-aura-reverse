package X;

/* loaded from: classes6.dex */
public final class GOD implements InterfaceC10512HoG {
    public final GNM A00;
    public final EnumC9706GeK A01;
    public final C9581GPs A02;
    public final String A03;

    @Override // X.InterfaceC10512HoG
    public final String AEf() {
        return this.A03;
    }

    @Override // X.InterfaceC10512HoG
    public final C9581GPs AJJ() {
        return this.A02;
    }

    @Override // X.InterfaceC10512HoG
    public final EnumC9706GeK AJk() {
        return this.A01;
    }

    public GOD(GNM gnm) {
        this.A00 = gnm;
        this.A01 = AbstractC9718GeW.A00(gnm.A00);
        String str = gnm.A02;
        C7384Etj.A0U(str);
        this.A03 = str;
        int i = gnm.A01;
        this.A02 = new C9581GPs(i, i != 0 ? i != 1 ? i != 2 ? C79.A0K : C79.A0C : C79.A01 : C79.A00);
    }
}
