package X;

/* renamed from: X.DjT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5491DjT implements InterfaceC5412Di8 {
    public long A00;
    public final long A01;
    public final long A02;
    public final C5432DiT A03;

    @Override // X.InterfaceC5412Di8
    public final long ADe() {
        long j = this.A00;
        if (j < this.A01 || j > this.A02) {
            throw C8j3.A1D();
        }
        return this.A03.A04(j);
    }

    @Override // X.InterfaceC5412Di8
    public final long ADf() {
        long j = this.A00;
        if (j < this.A01 || j > this.A02) {
            throw C8j3.A1D();
        }
        return DhD.A00(this.A03, j);
    }

    @Override // X.InterfaceC5412Di8
    public final boolean ARH() {
        this.A00 = this.A00 + 1;
        return !AnonymousClass002.A1N((r3 > this.A02 ? 1 : (r3 == this.A02 ? 0 : -1)));
    }

    public C5491DjT(C5432DiT c5432DiT, long j, long j2) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j - 1;
        this.A03 = c5432DiT;
    }
}
