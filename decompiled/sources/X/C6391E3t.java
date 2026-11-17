package X;

import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: X.E3t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6391E3t {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public int[] A07;
    public long[] A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final InterfaceC5563Dkg A0C;
    public final E4E A0D;

    public final DkQ A00(long j) {
        E29 e29;
        if (this.A05 == 0) {
            e29 = new E29(0L, this.A06);
        } else {
            long j2 = this.A0B;
            int i = (int) (j / (j2 / this.A01));
            int[] iArr = this.A07;
            int iBinarySearch = Arrays.binarySearch(iArr, i);
            if (iBinarySearch < 0) {
                iBinarySearch = -(iBinarySearch + 2);
            } else {
                while (true) {
                    int i2 = iBinarySearch - 1;
                    if (i2 < 0 || iArr[i2] != i) {
                        break;
                    }
                    iBinarySearch = i2;
                }
            }
            int iMax = Math.max(0, iBinarySearch);
            int i3 = this.A07[iMax];
            long j3 = j2 / this.A01;
            long j4 = i3 * j3;
            long[] jArr = this.A08;
            long j5 = jArr[iMax];
            if (i3 == i) {
                e29 = new E29(j4, j5);
            } else {
                e29 = new E29(j4, j5);
                int i4 = iMax + 1;
                if (i4 < jArr.length) {
                    return DkQ.A00(e29, r8[i4] * j3, jArr[i4]);
                }
            }
        }
        return new DkQ(e29, e29);
    }

    public C6391E3t(InterfaceC5563Dkg interfaceC5563Dkg, E4E e4e, int i) {
        this.A0D = e4e;
        int iA00 = e4e.A00();
        boolean z = true;
        if (iA00 != 1 && iA00 != 2) {
            z = false;
        }
        C1G.A07(z);
        int i2 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.A0A = i2 | (iA00 == 2 ? 1667497984 : 1651965952);
        int i3 = e4e.A00;
        this.A0B = Util.A0F(RoundingMode.DOWN, i3, e4e.A03 * 1000000, e4e.A01);
        this.A0C = interfaceC5563Dkg;
        this.A09 = iA00 == 2 ? i2 | 1650720768 : -1;
        this.A06 = -1L;
        this.A08 = new long[512];
        this.A07 = new int[512];
        this.A01 = i3;
    }
}
