package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Dxn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6203Dxn {
    public static final C6203Dxn A0e = A00(new C6203Dxn[0]);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final long A0Q;
    public final long A0R;
    public final long A0S;
    public final long A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final List<DyR> A0X;
    public final List<DyS> A0Y;
    public final List<long[]> A0Z;
    public final List<DyS> A0a;
    public final List<C6234Dyc> A0b;
    public final List<DyR> A0c;
    public final long[] A0d;

    public static C6203Dxn A00(C6203Dxn... c6203DxnArr) {
        long[] jArr = new long[16];
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = -1;
        long j12 = -1;
        long jMax = -9223372036854775807L;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long jMin = -9223372036854775807L;
        int i5 = 0;
        long j13 = -9223372036854775807L;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        for (C6203Dxn c6203Dxn : c6203DxnArr) {
            i += c6203Dxn.A0B;
            int i19 = 0;
            do {
                jArr[i19] = jArr[i19] + c6203Dxn.A0d[i19];
                i19++;
            } while (i19 < 16);
            if (jMin == -9223372036854775807L) {
                jMin = c6203Dxn.A0I;
            } else {
                long j14 = c6203Dxn.A0I;
                if (j14 != -9223372036854775807L) {
                    jMin = Math.min(jMin, j14);
                }
            }
            i2 += c6203Dxn.A06;
            i3 += c6203Dxn.A00;
            i4 += c6203Dxn.A03;
            i5 += c6203Dxn.A02;
            long j15 = c6203Dxn.A0S;
            if (j13 == -9223372036854775807L) {
                j13 = j15;
            } else if (j15 != -9223372036854775807L) {
                j13 += j15;
            }
            i6 += c6203Dxn.A0H;
            i7 += c6203Dxn.A0E;
            i8 += c6203Dxn.A0D;
            i9 += c6203Dxn.A0G;
            i10 += c6203Dxn.A0F;
            if (jMax == -9223372036854775807L) {
                jMax = c6203Dxn.A0J;
            } else {
                long j16 = c6203Dxn.A0J;
                if (j16 != -9223372036854775807L) {
                    jMax = Math.max(jMax, j16);
                }
            }
            i11 += c6203Dxn.A01;
            j += c6203Dxn.A0V;
            j2 += c6203Dxn.A0W;
            j3 += c6203Dxn.A0T;
            j4 += c6203Dxn.A0U;
            j5 += c6203Dxn.A0L;
            j6 += c6203Dxn.A0K;
            i12 += c6203Dxn.A09;
            i13 += c6203Dxn.A08;
            int i20 = c6203Dxn.A0C;
            if (i18 == -1) {
                i18 = i20;
            } else if (i20 != -1) {
                i18 += i20;
            }
            long j17 = c6203Dxn.A0R;
            if (j11 == -1) {
                j11 = j17;
            } else if (j17 != -1) {
                j11 += j17;
            }
            i14 += c6203Dxn.A07;
            long j18 = c6203Dxn.A0Q;
            if (j12 == -1) {
                j12 = j18;
            } else if (j18 != -1) {
                j12 += j18;
            }
            j7 += c6203Dxn.A0O;
            j8 += c6203Dxn.A0N;
            j9 += c6203Dxn.A0P;
            j10 += c6203Dxn.A0M;
            i15 += c6203Dxn.A05;
            i16 += c6203Dxn.A04;
            i17 += c6203Dxn.A0A;
        }
        List list = Collections.EMPTY_LIST;
        return new C6203Dxn(list, list, list, list, list, list, jArr, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i18, i14, i15, i16, i17, jMin, j13, jMax, j, j2, j3, j4, j5, j6, j11, j12, j7, j8, j9, j10);
    }

    /* JADX WARN: Incorrect types in method signature: (I[JLjava/util/List<LX/Dyc;>;Ljava/util/List<[J>;JIIIIJIIIIIJILjava/util/List<LX/DyR;>;Ljava/util/List<LX/DyR;>;JJJJJJIIIJIJJJJJIIILjava/util/List<LX/DyS;>;Ljava/util/List<LX/DyS;>;)V */
    public C6203Dxn(List list, List list2, List list3, List list4, List list5, List list6, long[] jArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.A0B = i;
        this.A0d = jArr;
        this.A0b = Collections.unmodifiableList(list);
        this.A0Z = Collections.unmodifiableList(list2);
        this.A0I = j;
        this.A06 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A02 = i5;
        this.A0S = j2;
        this.A0H = i6;
        this.A0E = i7;
        this.A0D = i8;
        this.A0G = i9;
        this.A0F = i10;
        this.A0J = j3;
        this.A01 = i11;
        this.A0c = Collections.unmodifiableList(list3);
        this.A0X = Collections.unmodifiableList(list4);
        this.A0V = j4;
        this.A0W = j5;
        this.A0T = j6;
        this.A0U = j7;
        this.A0L = j8;
        this.A0K = j9;
        this.A09 = i12;
        this.A08 = i13;
        this.A0C = i14;
        this.A0R = j10;
        this.A07 = i15;
        this.A0Q = j11;
        this.A0O = j12;
        this.A0N = j13;
        this.A0P = j14;
        this.A0M = j15;
        this.A05 = i16;
        this.A04 = i17;
        this.A0A = i18;
        this.A0Y = Collections.unmodifiableList(list5);
        this.A0a = Collections.unmodifiableList(list6);
    }
}
