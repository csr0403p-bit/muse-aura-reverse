package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E3K implements InterfaceC5509Djl {
    public final long A00;
    public final E3A A01;

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A01.A02();
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        long j2;
        E3A e3a = this.A01;
        E55 e55 = e3a.A0B;
        C1G.A05(e55);
        long[] jArr = e55.A01;
        long[] jArr2 = e55.A00;
        long j3 = e3a.A07;
        int iA08 = Util.A08(jArr, BV8.A0J((j * j3) / 1000000, e3a.A09 - 1), false);
        long j4 = 0;
        if (iA08 == -1) {
            j2 = 0;
        } else {
            j2 = jArr[iA08];
            j4 = jArr2[iA08];
        }
        long j5 = this.A00;
        E29 e29 = new E29((j2 * 1000000) / j3, j5 + j4);
        if (e29.A01 == j || iA08 == jArr.length - 1) {
            return new DkQ(e29, e29);
        }
        int i = iA08 + 1;
        return DkQ.A00(e29, (jArr[i] * 1000000) / j3, j5 + jArr2[i]);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }

    public E3K(E3A e3a, long j) {
        this.A01 = e3a;
        this.A00 = j;
    }
}
