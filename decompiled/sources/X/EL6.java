package X;

/* loaded from: classes5.dex */
public final class EL6 implements EN7 {
    public final EKU A00;
    public final ENP A01;

    @Override // X.EN7
    public final void AgU(EMx eMx, int i) {
        C7384Etj.A0Y(eMx, 0);
        ENP enp = this.A01;
        ((C6616EKj) enp).A01.execute(new EKT(this.A00, eMx, i, false));
    }

    public EL6(EKU eku, ENP enp) {
        AnonymousClass003.A0u(eku, enp);
        this.A00 = eku;
        this.A01 = enp;
    }
}
