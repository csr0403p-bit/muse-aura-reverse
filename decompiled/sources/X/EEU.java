package X;

/* loaded from: classes5.dex */
public final class EEU implements InterfaceC6586EIe {
    public final EEV A00;

    public EEU(EEV eev) {
        C7384Etj.A0Y(eev, 0);
        this.A00 = eev;
    }

    @Override // X.InterfaceC6586EIe
    public final /* bridge */ /* synthetic */ EJV AXS(String str) {
        C7384Etj.A0Y(str, 0);
        EEV eev = this.A00;
        String str2 = ((EET) eev).A03;
        if (str2 == null) {
            if (!str.equals(":memory:")) {
                throw C60Q.A0V("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested.");
            }
        } else if (!str2.equals(str) && !C7384Etj.areEqual(C7BY.A0R(str2, str2, '/'), C7BY.A0R(str, str, '/'))) {
            throw C60O.A0i(FGI.A0h("This driver is configured to open a database named '", str2, "' but '", str, "' was requested."));
        }
        return new EI7(eev.AMs());
    }

    @Override // X.InterfaceC6586EIe
    public final boolean AN7() {
        return true;
    }
}
