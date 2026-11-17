package X;

/* renamed from: X.DeF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5250DeF extends AbstractC5263DeS implements InterfaceC5265DeU {
    public final C5246DeB A00;

    @Override // X.InterfaceC5266DeV
    public final C5247DeC AAl() {
        C5246DeB c5246DeB = this.A00;
        C5247DeC c5247DeCAGU = c5246DeB.A01.AGU();
        c5247DeCAGU.A00.add(c5246DeB.A00);
        return c5247DeCAGU;
    }

    @Override // X.InterfaceC5266DeV
    public final void ABA(Object obj) {
        C5247DeC c5247DeC = (C5247DeC) obj;
        if (c5247DeC != null) {
            c5247DeC.A00();
        }
    }

    public C5250DeF(C5246DeB c5246DeB, AbstractC5257DeM abstractC5257DeM) {
        super(abstractC5257DeM);
        this.A00 = c5246DeB;
    }
}
