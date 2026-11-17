package X;

/* loaded from: classes5.dex */
public final class E2A implements InterfaceC5509Djl {
    public final long A00;
    public final DkQ A01;

    public static void A00(InterfaceC6413E4p interfaceC6413E4p, long j) {
        interfaceC6413E4p.AcM(new E2A(j, 0L));
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return false;
    }

    public E2A(long j, long j2) {
        this.A00 = j;
        E29 e29 = j2 == 0 ? E29.A02 : new E29(0L, j2);
        this.A01 = new DkQ(e29, e29);
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        return this.A01;
    }
}
