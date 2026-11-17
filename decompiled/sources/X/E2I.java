package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E2I implements InterfaceC6418E4u {
    public final long A00;
    public final long[] A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;

    @Override // X.InterfaceC6418E4u
    public final int ACf() {
        return this.A02;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEb() {
        return this.A04;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEc() {
        return this.A06 + this.A03;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        E29 e29;
        long[] jArr = this.A01;
        if (AnonymousClass002.A1X(jArr)) {
            long j2 = this.A00;
            long jA0J = BV8.A0J(j, j2);
            double d = (jA0J * 100.0d) / j2;
            double d2 = 0.0d;
            if (d > 0.0d) {
                if (d >= 100.0d) {
                    d2 = 256.0d;
                } else {
                    int i = (int) d;
                    C1G.A05(jArr);
                    double d3 = jArr[i];
                    d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
                }
            }
            long j3 = this.A05;
            e29 = new E29(jA0J, this.A06 + Math.max(this.A03, Math.min(BV6.A0G(d2 / 256.0d, j3), j3 - 1)));
        } else {
            e29 = new E29(0L, this.A06 + this.A03);
        }
        return new DkQ(e29, e29);
    }

    @Override // X.InterfaceC6418E4u
    public final long ALf(long j) {
        long j2 = j - this.A06;
        long[] jArr = this.A01;
        if (!AnonymousClass002.A1X(jArr) || j2 <= this.A03) {
            return 0L;
        }
        C1G.A05(jArr);
        double d = (j2 * 256.0d) / this.A05;
        int iA08 = Util.A08(jArr, (long) d, true);
        long j3 = this.A00;
        long j4 = (j3 * iA08) / 100;
        long j5 = jArr[iA08];
        int i = iA08 + 1;
        long j6 = (j3 * i) / 100;
        return j4 + BV6.A0G(j5 == (iA08 == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r6 - j5), j6 - j4);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return AnonymousClass002.A1X(this.A01);
    }

    public E2I(long[] jArr, int i, int i2, long j, long j2, long j3) {
        this.A06 = j;
        this.A03 = i;
        this.A00 = j2;
        this.A02 = i2;
        this.A05 = j3;
        this.A01 = jArr;
        this.A04 = j3 != -1 ? j + j3 : -1L;
    }
}
