package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Dxk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6200Dxk {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C6154Dwx A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public long A0S;
    public long A0T;
    public long A0U;
    public long A0V;
    public long A0W;
    public C6154Dwx A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final List<DyS> A0b;
    public final List<long[]> A0c;
    public final List<DyS> A0d;
    public final boolean A0e;
    public final List<DyR> A0f;
    public final List<C6234Dyc> A0g;
    public final List<DyR> A0h;
    public final boolean A0i;
    public final long[] A0j = new long[16];

    private void A00(long j) {
        int i = this.A01;
        if (i == 6 || i == 7 || i == 10) {
            long j2 = j - this.A0Q;
            long j3 = this.A0S;
            if (j3 == -9223372036854775807L || j2 > j3) {
                this.A0S = j2;
            }
        }
    }

    public static void A01(C6154Dwx c6154Dwx, C6202Dxm c6202Dxm, C6200Dxk c6200Dxk) {
        int i;
        if (C6xC.A00(c6200Dxk.A0X, c6154Dwx)) {
            return;
        }
        A04(c6200Dxk, c6202Dxm.A04);
        if (c6154Dwx != null && c6200Dxk.A0N == -1 && (i = c6154Dwx.A05) != -1) {
            c6200Dxk.A0N = i;
        }
        c6200Dxk.A0X = c6154Dwx;
        if (c6200Dxk.A0e) {
            c6200Dxk.A0f.add(new DyR(c6154Dwx, c6202Dxm));
        }
    }

    public static void A02(C6154Dwx c6154Dwx, C6202Dxm c6202Dxm, C6200Dxk c6200Dxk) {
        int i;
        int i2;
        if (C6xC.A00(c6200Dxk.A08, c6154Dwx)) {
            return;
        }
        A05(c6200Dxk, c6202Dxm.A04);
        if (c6154Dwx != null) {
            if (c6200Dxk.A0E == -1 && (i2 = c6154Dwx.A0D) != -1) {
                c6200Dxk.A0E = i2;
            }
            if (c6200Dxk.A0O == -1 && (i = c6154Dwx.A05) != -1) {
                c6200Dxk.A0O = i;
            }
        }
        c6200Dxk.A08 = c6154Dwx;
        if (c6200Dxk.A0e) {
            c6200Dxk.A0h.add(new DyR(c6154Dwx, c6202Dxm));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C6202Dxm r10, X.C6200Dxk r11, int r12) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6200Dxk.A03(X.Dxm, X.Dxk, int):void");
    }

    public static void A04(C6200Dxk c6200Dxk, long j) {
        C6154Dwx c6154Dwx;
        int i;
        if (c6200Dxk.A01 == 3 && (c6154Dwx = c6200Dxk.A0X) != null && (i = c6154Dwx.A05) != -1) {
            long j2 = (long) ((j - c6200Dxk.A0P) * c6200Dxk.A00);
            c6200Dxk.A0K += j2;
            c6200Dxk.A0J += j2 * i;
        }
        c6200Dxk.A0P = j;
    }

    public static void A05(C6200Dxk c6200Dxk, long j) {
        C6154Dwx c6154Dwx;
        if (c6200Dxk.A01 == 3 && (c6154Dwx = c6200Dxk.A08) != null) {
            long j2 = (long) ((j - c6200Dxk.A0R) * c6200Dxk.A00);
            int i = c6154Dwx.A0D;
            if (i != -1) {
                c6200Dxk.A0V += j2;
                c6200Dxk.A0W += i * j2;
            }
            int i2 = c6154Dwx.A05;
            if (i2 != -1) {
                c6200Dxk.A0T += j2;
                c6200Dxk.A0U += j2 * i2;
            }
        }
        c6200Dxk.A0R = j;
    }

    public static void A06(C6200Dxk c6200Dxk, long j, long j2) {
        long[] jArr;
        if (c6200Dxk.A0e) {
            if (c6200Dxk.A01 != 3) {
                if (j2 == -9223372036854775807L) {
                    return;
                }
                List<long[]> list = c6200Dxk.A0c;
                if (!list.isEmpty()) {
                    long j3 = ((long[]) BV7.A0t(list))[1];
                    if (j3 != j2) {
                        list.add(new long[]{j, j3});
                    }
                }
            }
            List<long[]> list2 = c6200Dxk.A0c;
            if (j2 != -9223372036854775807L) {
                jArr = new long[]{j, j2};
            } else {
                if (list2.isEmpty()) {
                    return;
                }
                jArr = new long[]{j, ((long[]) BV7.A0t(list2))[1] + ((long) ((j - r2[0]) * c6200Dxk.A00))};
            }
            list2.add(jArr);
        }
    }

    public final C6203Dxn A07(boolean z) {
        List<long[]> list;
        int i;
        long j;
        long[] jArrCopyOf = this.A0j;
        List<long[]> list2 = this.A0c;
        if (z) {
            list = list2;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, 16);
            long jMax = Math.max(0L, jElapsedRealtime - this.A0L);
            int i2 = this.A01;
            jArrCopyOf[i2] = jArrCopyOf[i2] + jMax;
            A00(jElapsedRealtime);
            A05(this, jElapsedRealtime);
            A04(this, jElapsedRealtime);
            ArrayList arrayListA0t = BV4.A0t(list2);
            list = arrayListA0t;
            if (this.A0e) {
                list = arrayListA0t;
                if (this.A01 == 3) {
                    arrayListA0t.add(new long[]{jElapsedRealtime, list2.get(list2.size() - 1)[1] + ((long) ((jElapsedRealtime - r3[0]) * this.A00))});
                    list = arrayListA0t;
                }
            }
        }
        if (this.A0a || !this.A0Y) {
            i = 1;
            j = -9223372036854775807L;
        } else {
            i = 0;
            j = jArrCopyOf[2];
        }
        boolean zA1N = AnonymousClass002.A1N((jArrCopyOf[1] > 0L ? 1 : (jArrCopyOf[1] == 0L ? 0 : -1)));
        List<DyR> list3 = this.A0h;
        List<DyR> listA0t = z ? list3 : BV4.A0t(list3);
        List<DyR> list4 = this.A0f;
        List<DyR> listA0t2 = z ? list4 : BV4.A0t(list4);
        C6203Dxn c6203Dxn = C6203Dxn.A0e;
        List<C6234Dyc> list5 = this.A0g;
        List<C6234Dyc> listA0t3 = z ? list5 : BV4.A0t(list5);
        long j2 = this.A0M;
        boolean z2 = this.A0A;
        int i3 = !this.A0Y ? 1 : 0;
        boolean z3 = this.A0Z;
        int i4 = i ^ 1;
        int i5 = this.A0G;
        int i6 = this.A0F;
        int i7 = this.A0I;
        int i8 = this.A0H;
        long j3 = this.A0S;
        boolean z4 = this.A0i;
        long j4 = this.A0V;
        long j5 = this.A0W;
        long j6 = this.A0T;
        long j7 = this.A0U;
        long j8 = this.A0K;
        long j9 = this.A0J;
        int i9 = this.A0E;
        int i10 = i9 == -1 ? 0 : 1;
        long j10 = this.A0O;
        boolean zA1S = C8j3.A1S((j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1)));
        long j11 = this.A0N;
        boolean zA1S2 = C8j3.A1S((j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1)));
        long j12 = this.A06;
        long j13 = this.A05;
        long j14 = this.A07;
        long j15 = this.A04;
        int i11 = this.A02;
        return new C6203Dxn(listA0t3, list, listA0t, listA0t2, this.A0b, this.A0d, jArrCopyOf, 1, z2 ? 1 : 0, i3, z3 ? 1 : 0, zA1N ? 1 : 0, i4, i5, i6, i7, i8, z4 ? 1 : 0, i10, zA1S ? 1 : 0, i9, zA1S2 ? 1 : 0, AnonymousClass002.A1N(i11) ? 1 : 0, i11, this.A03, j2, j, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15);
    }

    public C6200Dxk(C6202Dxm c6202Dxm, boolean z) {
        this.A0e = z;
        this.A0g = z ? C3cG.A0h() : Collections.EMPTY_LIST;
        this.A0c = z ? C3cG.A0h() : Collections.EMPTY_LIST;
        this.A0h = z ? C3cG.A0h() : Collections.EMPTY_LIST;
        this.A0f = z ? C3cG.A0h() : Collections.EMPTY_LIST;
        this.A0b = z ? C3cG.A0h() : Collections.EMPTY_LIST;
        this.A0d = z ? C3cG.A0h() : Collections.EMPTY_LIST;
        boolean z2 = false;
        this.A01 = 0;
        this.A0L = c6202Dxm.A04;
        this.A0M = -9223372036854775807L;
        this.A0S = -9223372036854775807L;
        Dy6 dy6 = c6202Dxm.A09;
        if (dy6 != null && AnonymousClass002.A1P(dy6.A00, -1)) {
            z2 = true;
        }
        this.A0i = z2;
        this.A0N = -1L;
        this.A0O = -1L;
        this.A0E = -1;
        this.A00 = 1.0f;
    }
}
