package X;

/* loaded from: classes5.dex */
public final class E3H implements InterfaceC6408E4k {
    public C6154Dwx A00;
    public E3J A01;
    public InterfaceC5563Dkg A02;

    @Override // X.InterfaceC6408E4k
    public final void A6w(E1P e1p) {
        long jA00;
        E3J e3j = this.A01;
        C1G.A05(e3j);
        synchronized (e3j) {
            long j = e3j.A00;
            jA00 = j != -9223372036854775807L ? j + e3j.A01 : e3j.A00();
        }
        long jA01 = this.A01.A01();
        if (jA00 == -9223372036854775807L || jA01 == -9223372036854775807L) {
            return;
        }
        C6154Dwx c6154Dwx = this.A00;
        if (jA01 != c6154Dwx.A0R) {
            C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
            c6162Dx5A01.A0P = jA01;
            C6154Dwx c6154DwxA0U = BV6.A0U(c6162Dx5A01);
            this.A00 = c6154DwxA0U;
            this.A02.ABq(c6154DwxA0U);
        }
        int iA04 = e1p.A04();
        this.A02.Abv(e1p, iA04);
        InterfaceC5563Dkg.A02(this.A02, iA04, jA00);
    }

    @Override // X.InterfaceC6408E4k
    public final void ANZ(E3J e3j, InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A01 = e3j;
        e4i.A03();
        E4I.A02(e4i);
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(e4i.A00, 5);
        this.A02 = interfaceC5563DkgAhC;
        interfaceC5563DkgAhC.ABq(this.A00);
    }
}
