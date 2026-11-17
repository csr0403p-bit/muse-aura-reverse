package X;

/* loaded from: classes5.dex */
public final class E4C implements InterfaceC5509Djl {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final E5Y A04;
    public final long A05;

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A05;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        E29 e29 = new E29(j, E4G.A00(this.A04.Agr(j), 0L, this.A02, this.A03, this.A01, this.A00));
        return new DkQ(e29, e29);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }

    public E4C(E5Y e5y, long j, long j2, long j3, long j4, long j5) {
        this.A04 = e5y;
        this.A05 = j;
        this.A02 = j2;
        this.A03 = j3;
        this.A01 = j4;
        this.A00 = j5;
    }
}
