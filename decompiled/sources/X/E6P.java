package X;

/* loaded from: classes5.dex */
public final class E6P {
    public boolean A00 = false;
    public final int A01;
    public final InterfaceC6068Dv6 A02;

    public final void A00(long j) {
        InterfaceC6068Dv6 interfaceC6068Dv6 = this.A02;
        interfaceC6068Dv6.AdF();
        if (interfaceC6068Dv6 instanceof E0H) {
            E0H e0h = (E0H) interfaceC6068Dv6;
            C1G.A08(((AbstractC6146Dwo) e0h).A0B);
            e0h.A02 = j;
        }
    }

    public final boolean A01(C6444E5x c6444E5x) {
        InterfaceC6022DuF interfaceC6022DuF = c6444E5x.A0C[this.A01];
        return interfaceC6022DuF != null && this.A02.AL9() == interfaceC6022DuF;
    }

    public E6P(InterfaceC6068Dv6 interfaceC6068Dv6, int i) {
        this.A02 = interfaceC6068Dv6;
        this.A01 = i;
    }
}
