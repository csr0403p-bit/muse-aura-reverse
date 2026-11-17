package X;

/* renamed from: X.AvI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1966AvI extends AbstractC1439Aj8 {
    public InterfaceC1435Aj4 A00;
    public final /* synthetic */ Av9 A01;

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        Av9 av9 = this.A01;
        av9.A00 = this;
        if (av9.A01 != null) {
            this.A00 = AbstractC1462AjV.A01(this, BTA.A01(av9, this, 31), 0L, 0L);
        }
    }

    public C1966AvI(Av9 av9) {
        this.A01 = av9;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        Av9 av9 = this.A01;
        if (av9.A00 == this) {
            av9.A00 = null;
        }
        InterfaceC1435Aj4 interfaceC1435Aj4 = this.A00;
        if (interfaceC1435Aj4 != null) {
            interfaceC1435Aj4.Ahh();
        }
        this.A00 = null;
    }
}
