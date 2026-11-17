package X;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EJR implements InterfaceC2261BLa, EJV {
    public Throwable A00;
    public C78T A01;
    public final EJU A02;
    public final EJV A03;
    public final InterfaceC2261BLa A04;

    @Override // X.EJV
    public final EIK AYO(String str) {
        C7384Etj.A0Y(str, 0);
        EJU eju = this.A02;
        if (eju == null) {
            return this.A03.AYO(str);
        }
        EIK eikA02 = eju.A02(str);
        C7384Etj.A0X(eikA02);
        return new EIL(eikA02);
    }

    public /* synthetic */ EJR(EJV ejv, int i) {
        C9258GBl c9258GBl = new C9258GBl();
        C7384Etj.A0Y(ejv, 0);
        this.A03 = ejv;
        this.A04 = c9258GBl;
        this.A02 = i > 0 ? new EJU(this, i) : null;
    }

    @Override // X.EJV
    public final boolean ANT() {
        return this.A03.ANT();
    }

    @Override // X.InterfaceC2261BLa
    public final boolean AOf() {
        return this.A04.AOf();
    }

    @Override // X.InterfaceC2261BLa
    public final Object APs(Object obj, HtJ<? super Unit> htJ) {
        return this.A04.APs(obj, htJ);
    }

    @Override // X.InterfaceC2261BLa
    public final boolean AhW(Object obj) {
        return this.A04.AhW(obj);
    }

    @Override // X.InterfaceC2261BLa
    public final void Ahe(Object obj) {
        this.A04.Ahe(obj);
    }

    @Override // X.EJV, java.lang.AutoCloseable
    public final void close() {
        EJU eju = this.A02;
        if (eju != null) {
            C7523EzA.A00(eju, -1);
        }
        this.A03.close();
    }

    public final String toString() {
        return this.A03.toString();
    }
}
