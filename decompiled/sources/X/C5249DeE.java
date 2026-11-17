package X;

/* renamed from: X.DeE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5249DeE extends AbstractC5263DeS {
    public static volatile C5249DeE A00;

    public static C5249DeE A00() {
        if (A00 == null) {
            synchronized (C5249DeE.class) {
                if (A00 == null) {
                    A00 = new C5249DeE(AbstractC5257DeM.get(C4JM.A00()));
                }
            }
        }
        return A00;
    }

    @Override // X.InterfaceC5266DeV
    public final C5247DeC AAl() {
        AbstractC5257DeM abstractC5257DeM = ((AbstractC5252DeH) this).A00;
        abstractC5257DeM.AGU().A00.add(this);
        return abstractC5257DeM.AGU();
    }

    @Override // X.InterfaceC5266DeV
    public final void ABA(Object obj) {
        C5247DeC c5247DeC = (C5247DeC) obj;
        if (c5247DeC != null) {
            c5247DeC.A00();
        }
    }
}
