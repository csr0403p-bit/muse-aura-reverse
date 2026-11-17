package X;

/* loaded from: classes5.dex */
public abstract class EIA implements EIK {
    public boolean A00;
    public final EI3 A01;
    public final String A02;

    public final void A03() {
        if (this.A00) {
            EJB.A00("statement is closed", 21);
            throw F60.createAndThrow();
        }
    }

    public EIA(EI3 ei3, String str) {
        this.A01 = ei3;
        this.A02 = str;
    }

    public static void A02(EIA eia) {
        eia.A03();
        EJB.A00("no row", 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public /* synthetic */ boolean ACx(int i) {
        return AnonymousClass002.A1L((getLong(i) > 0L ? 1 : (getLong(i) == 0L ? 0 : -1)));
    }
}
