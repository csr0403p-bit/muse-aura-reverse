package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E4T implements InterfaceC6418E4u {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;
    public final long[] A05;

    @Override // X.InterfaceC6418E4u
    public final int ACf() {
        return this.A00;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEb() {
        return this.A01;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEc() {
        return this.A02;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A03;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        long[] jArr = this.A05;
        int iA08 = Util.A08(jArr, j, true);
        long j2 = jArr[iA08];
        long[] jArr2 = this.A04;
        E29 e29 = new E29(j2, jArr2[iA08]);
        if (e29.A01 >= j || iA08 == jArr.length - 1) {
            return new DkQ(e29, e29);
        }
        int i = iA08 + 1;
        return DkQ.A00(e29, jArr[i], jArr2[i]);
    }

    @Override // X.InterfaceC6418E4u
    public final long ALf(long j) {
        return this.A05[Util.A08(this.A04, j, true)];
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }

    public E4T(long[] jArr, long[] jArr2, int i, long j, long j2, long j3) {
        this.A05 = jArr;
        this.A04 = jArr2;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = i;
    }
}
