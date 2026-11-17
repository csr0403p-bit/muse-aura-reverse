package X;

/* renamed from: X.Dia, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5439Dia implements InterfaceC5487DjP {
    public final InterfaceC5487DjP A00;
    public final C5422DiI<?>[] A01;

    @Override // X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        boolean zA7A = false;
        for (C5422DiI<?> c5422DiI : this.A01) {
            if (c5422DiI.A0R.A0k && !c5422DiI.A0C && !c5422DiI.A0E) {
                C5342Dgl c5342Dgl = c5422DiI.A0Q;
                if (c5342Dgl.A00 == null && c5342Dgl.A01 == null && ((C5425DiL) c5422DiI.A0S).A0G == null) {
                    zA7A |= c5422DiI.A7A(du1);
                }
            }
        }
        return zA7A;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        return this.A00.AD6(j);
    }

    @Override // X.InterfaceC5487DjP
    public final long AD8() {
        return this.A00.AD8();
    }

    @Override // X.InterfaceC5487DjP
    public final long AI5() {
        return this.A00.AI5();
    }

    @Override // X.InterfaceC5487DjP
    public final boolean AOd() {
        return this.A00.AOd();
    }

    @Override // X.InterfaceC5487DjP
    public final void AZv(long j) {
        this.A00.AZv(j);
    }

    public C5439Dia(InterfaceC5487DjP interfaceC5487DjP, C5422DiI<?>[] c5422DiIArr) {
        this.A00 = interfaceC5487DjP;
        this.A01 = (C5422DiI[]) c5422DiIArr.clone();
    }
}
