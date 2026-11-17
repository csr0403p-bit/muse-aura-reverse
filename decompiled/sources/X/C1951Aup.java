package X;

/* renamed from: X.Aup, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1951Aup implements InterfaceC1559AlZ {
    public C2069Axk A00;
    public InterfaceC2043AxB A01;
    public final long A02;
    public final long A03;
    public final InterfaceC2072Axn A04;
    public final BRg A05;

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        InterfaceC2043AxB interfaceC2043AxB = this.A01;
        if (interfaceC2043AxB != null) {
            this.A04.Ahn(interfaceC2043AxB);
            this.A01 = null;
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        InterfaceC2043AxB interfaceC2043AxB = this.A01;
        if (interfaceC2043AxB != null) {
            this.A04.Ahn(interfaceC2043AxB);
            this.A01 = null;
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
        StringBuilder sbA0z;
        InterfaceC2072Axn interfaceC2072Axn = this.A04;
        C1941Aue c1941Aue = new C1941Aue(C2293BSt.A00(this, 1), C2293BSt.A00(this, 2), this.A03);
        C1949Aun c1949Aun = (C1949Aun) interfaceC2072Axn;
        long j = c1941Aue.A02;
        if (j != 0) {
            AXI<InterfaceC2043AxB> axi = c1949Aun.A09;
            if (!axi.A06(j)) {
                axi.A0A(j, c1941Aue);
                c1949Aun.A0B.add(c1941Aue);
                c1949Aun.A08 = false;
                this.A01 = c1941Aue;
                return;
            }
            sbA0z = C3cG.A0f(c1941Aue, "Another selectable with the id: ");
            sbA0z.append(".selectableId has already subscribed.");
        } else {
            sbA0z = C60O.A0z("The selectable contains an invalid id: ", j);
        }
        AbstractC1061ATk.A00(sbA0z.toString());
        throw F60.createAndThrow();
    }

    public C1951Aup(C2069Axk c2069Axk, InterfaceC2072Axn interfaceC2072Axn, long j, long j2) {
        this.A03 = j;
        this.A04 = interfaceC2072Axn;
        this.A02 = j2;
        this.A00 = c2069Axk;
        C2293BSt c2293BStA00 = C2293BSt.A00(this, 3);
        Av5 av5 = new Av5(interfaceC2072Axn, c2293BStA00, j);
        Av6 av6 = new Av6(interfaceC2072Axn, c2293BStA00, j);
        this.A05 = AaM.A01(BRg.A00, new BSK(3, av5, av6), av6, av5).then(new AnN(C1763AqG.A02));
    }
}
