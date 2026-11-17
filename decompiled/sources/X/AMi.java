package X;

/* loaded from: classes4.dex */
public final class AMi<T> extends AN8 {
    public int A00;
    public int A01;
    public InterfaceC0900AHc<? extends T> A02;

    @Override // X.AN8
    public final AN8 A02(long j) {
        InterfaceC0900AHc<? extends T> interfaceC0900AHc = this.A02;
        AMi aMi = new AMi();
        ((AN8) aMi).A00 = j;
        aMi.A02 = interfaceC0900AHc;
        return aMi;
    }

    @Override // X.AN8
    public final void A03(AN8 an8) {
        synchronized (AMg.A00) {
            C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            AMi aMi = (AMi) an8;
            this.A02 = aMi.A02;
            this.A00 = aMi.A00;
            this.A01 = aMi.A01;
        }
    }
}
