package X;

/* loaded from: classes5.dex */
public abstract class E28 implements InterfaceC5509Djl {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    public final long A00(long j) {
        return (Math.max(0L, j - this.A04) * 8000000) / this.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A03;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        E29 e29;
        long j2 = this.A02;
        if (j2 != -1 || this.A06) {
            long j3 = this.A01;
            long jMin = (((j * this.A00) / 8000000) / j3) * j3;
            if (j2 != -1) {
                jMin = Math.min(jMin, j2 - j3);
            }
            long jMax = this.A04 + Math.max(jMin, 0L);
            long jA00 = A00(jMax);
            e29 = new E29(jA00, jMax);
            if (j2 != -1 && jA00 < j) {
                long j4 = j3 + jMax;
                if (j4 < this.A05) {
                    return DkQ.A00(e29, A00(j4), j4);
                }
            }
        } else {
            e29 = new E29(0L, this.A04);
        }
        return new DkQ(e29, e29);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return this.A02 != -1 || this.A06;
    }

    public E28(long j, int i, int i2, long j2, boolean z) {
        long jA07;
        this.A05 = j;
        this.A04 = j2;
        this.A01 = i2 == -1 ? 1 : i2;
        this.A00 = i;
        this.A06 = z;
        if (j == -1) {
            this.A02 = -1L;
            jA07 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.A02 = j3;
            jA07 = (BV5.A07(j3) * 8000000) / i;
        }
        this.A03 = jA07;
    }
}
