package X;

/* loaded from: classes5.dex */
public final class E2C extends E28 implements InterfaceC6418E4u {
    public final int A00;
    public final int A01;
    public final long A02;
    public final boolean A03;
    public final long A04;

    @Override // X.InterfaceC6418E4u
    public final int ACf() {
        return this.A00;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEb() {
        return this.A04;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEc() {
        return this.A02;
    }

    public E2C(long j, int i, int i2, long j2, boolean z) {
        super(j, i, i2, j2, z);
        this.A02 = j2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A04 = j == -1 ? -1L : j;
    }

    @Override // X.InterfaceC6418E4u
    public final long ALf(long j) {
        return A00(j);
    }
}
