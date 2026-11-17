package X;

import androidx.media3.common.util.Util;

/* renamed from: X.E2t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6366E2t {
    public final int A00;
    public final int A01;
    public final long A02;
    public final E3P A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public final int A00(long j) {
        long[] jArr = this.A07;
        for (int iA07 = Util.A07(jArr, j, true); iA07 < jArr.length; iA07++) {
            if ((this.A04[iA07] & 1) != 0) {
                return iA07;
            }
        }
        return -1;
    }

    public C6366E2t(E3P e3p, int[] iArr, int[] iArr2, long[] jArr, long[] jArr2, int i, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        C1G.A07(AnonymousClass002.A1Q(length, length2));
        int length3 = jArr.length;
        C1G.A07(AnonymousClass002.A1Q(length3, length2));
        int length4 = iArr2.length;
        C1G.A07(length4 == length2);
        this.A03 = e3p;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }
}
