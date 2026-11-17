package X;

/* loaded from: classes5.dex */
public final class E2J implements E2K {
    public final E2K A00;
    public final long A01;

    @Override // X.E2K
    public final void A47(int i) {
        this.A00.A47(i);
    }

    @Override // X.E2K
    public final long AIf() {
        return this.A00.AIf() - this.A01;
    }

    @Override // X.E2K
    public final long AIu() {
        return this.A00.AIu() - this.A01;
    }

    @Override // X.E2K
    public final int AXh(byte[] bArr, int i, int i2) {
        return this.A00.AXh(bArr, i, i2);
    }

    @Override // X.E2K
    public final void AXi(byte[] bArr, int i, int i2) {
        this.A00.AXi(bArr, i, i2);
    }

    @Override // X.E2K
    public final boolean AXj(byte[] bArr, int i, int i2, boolean z) {
        return this.A00.AXj(bArr, i, i2, z);
    }

    @Override // X.E2K
    public final boolean AZM(byte[] bArr, int i, int i2, boolean z) {
        return this.A00.AZM(bArr, i, i2, z);
    }

    @Override // X.E2K
    public final void AbN() {
        this.A00.AbN();
    }

    @Override // X.E2K
    public final int Afj(int i) {
        return this.A00.Afj(i);
    }

    @Override // X.E2K
    public final void Afm(int i) {
        this.A00.Afm(i);
    }

    @Override // X.E2K
    public final boolean Afn(int i, boolean z) {
        return this.A00.Afn(i, z);
    }

    @Override // X.E2K
    public final long getLength() {
        return this.A00.getLength() - this.A01;
    }

    @Override // X.E2K, X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    @Override // X.E2K
    public final void readFully(byte[] bArr, int i, int i2) {
        this.A00.readFully(bArr, i, i2);
    }

    public E2J(E2K e2k, long j) {
        this.A00 = e2k;
        C1G.A07(C8j3.A1Q((e2k.AIu() > j ? 1 : (e2k.AIu() == j ? 0 : -1))));
        this.A01 = j;
    }
}
