package X;

import android.util.Pair;
import androidx.media3.common.Timeline;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.E5t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6441E5t {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public E81 A04;
    public C6442E5v A05;
    public C6442E5v A06;
    public C6442E5v A07;
    public C6442E5v A08;
    public C6442E5v A09;
    public Object A0A;
    public boolean A0C;
    public final E7S A0F;
    public final E65 A0G;
    public final InterfaceC6459E6s A0H;
    public final E6B A0D = new E6B();
    public final C5998Dth A0E = new C5998Dth();
    public List<C6442E5v> A0B = C3cG.A0h();

    private long A01(Object obj) {
        for (int i = 0; i < this.A0B.size(); i++) {
            C6442E5v c6442E5v = this.A0B.get(i);
            if (c6442E5v.A0A.equals(obj)) {
                return c6442E5v.A02.A04.A03;
            }
        }
        return -1L;
    }

    private E6Q A04(Timeline timeline, Object obj, int i, int i2, long j, long j2, boolean z) {
        Dy6 dy6 = new Dy6(obj, i, i2, -1, j2);
        long jA03 = timeline.A0B(this.A0D, dy6.A04).A03(dy6.A00, dy6.A01);
        long jMax = 0;
        if (jA03 != -9223372036854775807L && 0 >= jA03) {
            jMax = Math.max(0L, jA03 - 1);
        }
        return new E6Q(dy6, jMax, j, -9223372036854775807L, jA03, z, false, false, false, false);
    }

    public static void A07(C6441E5t c6441E5t, List list) {
        for (int i = 0; i < c6441E5t.A0B.size(); i++) {
            c6441E5t.A0B.get(i).A06();
        }
        c6441E5t.A0B = list;
        c6441E5t.A07 = null;
        c6441E5t.A0F();
    }

    public static int A00(Timeline timeline, C6441E5t c6441E5t) {
        C6442E5v c6442E5v;
        C6442E5v c6442E5v2 = c6441E5t.A06;
        if (c6442E5v2 == null) {
            return 0;
        }
        int iA06 = timeline.A06(c6442E5v2.A0A);
        while (true) {
            iA06 = timeline.A05(c6441E5t.A0D, c6441E5t.A0E, iA06, c6441E5t.A01, c6441E5t.A0C);
            while (true) {
                c6442E5v = c6442E5v2.A01;
                if (c6442E5v == null || c6442E5v2.A02.A07) {
                    break;
                }
                c6442E5v2 = c6442E5v;
            }
            if (iA06 == -1 || c6442E5v == null || timeline.A06(c6442E5v.A0A) != iA06) {
                break;
            }
            c6442E5v2 = c6442E5v;
        }
        int iA0A = c6441E5t.A0A(c6442E5v2);
        c6442E5v2.A02 = c6441E5t.A0C(timeline, c6442E5v2.A02);
        return iA0A;
    }

    public static E6Q A02(Timeline timeline, C6442E5v c6442E5v, C6441E5t c6441E5t, long j) {
        int iA02;
        Object obj;
        long j2;
        int i;
        long jA0T;
        E6Q e6q = c6442E5v.A02;
        long j3 = (c6442E5v.A00 + e6q.A00) - j;
        if (e6q.A07) {
            int iA06 = timeline.A06(e6q.A04.A04);
            E6B e6b = c6441E5t.A0D;
            C5998Dth c5998Dth = c6441E5t.A0E;
            int iA05 = timeline.A05(e6b, c5998Dth, iA06, c6441E5t.A01, c6441E5t.A0C);
            if (iA05 == -1) {
                return null;
            }
            int i2 = timeline.A0D(e6b, iA05, true).A00;
            Object obj2 = e6b.A05;
            obj2.getClass();
            Dy6 dy6 = e6q.A04;
            long jA01 = dy6.A03;
            long j4 = 0;
            if (timeline.A0E(c5998Dth, i2, 0L).A00 == iA05) {
                Pair pairA0A = timeline.A0A(e6b, c5998Dth, i2, -9223372036854775807L, Math.max(0L, j3));
                if (pairA0A == null) {
                    return null;
                }
                obj2 = pairA0A.first;
                jA0T = BV7.A0T(pairA0A);
                C6442E5v c6442E5v2 = c6442E5v.A01;
                if (c6442E5v2 == null || !c6442E5v2.A0A.equals(obj2)) {
                    jA01 = c6441E5t.A01(obj2);
                    if (jA01 == -1) {
                        jA01 = c6441E5t.A02;
                        c6441E5t.A02 = 1 + jA01;
                    }
                } else {
                    jA01 = c6442E5v2.A02.A04.A03;
                }
                j4 = -9223372036854775807L;
            } else {
                jA0T = 0;
            }
            timeline.A0B(e6b, obj2);
            timeline.A0E(c5998Dth, e6b.A00, 0L);
            timeline.A06(obj2);
            timeline.A0B(e6b, obj2);
            Dy6 dy62 = new Dy6(obj2, jA01, -1);
            if (j4 != -9223372036854775807L && e6q.A02 != -9223372036854775807L) {
                timeline.A0B(e6b, dy6.A04);
            }
            return A03(timeline, c6441E5t, dy62, j4, jA0T);
        }
        Dy6 dy63 = e6q.A04;
        Object obj3 = dy63.A04;
        E6B e6b2 = c6441E5t.A0D;
        timeline.A0B(e6b2, obj3);
        boolean z = e6q.A06;
        int i3 = dy63.A00;
        if (AnonymousClass002.A1P(i3, -1)) {
            E6C e6c = e6b2.A03;
            int i4 = (i3 < 0 ? E6C.A01 : e6c.A00[i3]).A00;
            if (i4 == -1) {
                return null;
            }
            iA02 = dy63.A01;
            E6D e6d = i3 < 0 ? E6C.A01 : e6c.A00[i3];
            do {
                iA02++;
                int[] iArr = e6d.A01;
                if (iA02 >= iArr.length || (i = iArr[iA02]) == 0) {
                    break;
                }
            } while (i != 1);
            if (iA02 >= i4) {
                long jA0T2 = e6q.A02;
                if (jA0T2 == -9223372036854775807L) {
                    Pair pairA0A2 = timeline.A0A(e6b2, c6441E5t.A0E, e6b2.A00, -9223372036854775807L, BV5.A07(j3));
                    if (pairA0A2 == null) {
                        return null;
                    }
                    jA0T2 = BV7.A0T(pairA0A2);
                }
                Object obj4 = dy63.A04;
                timeline.A0B(e6b2, obj4);
                return c6441E5t.A05(timeline, obj4, BV5.A07(jA0T2), jA0T2, dy63.A03, z);
            }
            obj = dy63.A04;
            j2 = e6q.A02;
        } else {
            i3 = dy63.A02;
            iA02 = e6b2.A02(i3);
            if (iA02 == (i3 < 0 ? E6C.A01 : e6b2.A03.A00[i3]).A00) {
                Object obj5 = dy63.A04;
                timeline.A0B(e6b2, obj5);
                return c6441E5t.A05(timeline, obj5, 0L, e6q.A00, dy63.A03, false);
            }
            obj = dy63.A04;
            j2 = e6q.A00;
        }
        return c6441E5t.A04(timeline, obj, i3, iA02, j2, dy63.A03, z);
    }

    public static E6Q A03(Timeline timeline, C6441E5t c6441E5t, Dy6 dy6, long j, long j2) {
        Object obj = dy6.A04;
        timeline.A0B(c6441E5t.A0D, obj);
        int i = dy6.A00;
        return AnonymousClass002.A1P(i, -1) ? c6441E5t.A04(timeline, obj, i, dy6.A01, j, dy6.A03, false) : c6441E5t.A05(timeline, obj, j2, j, dy6.A03, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.E6Q A05(androidx.media3.common.Timeline r17, java.lang.Object r18, long r19, long r21, long r23, boolean r25) {
        /*
            r16 = this;
            r6 = r16
            r8 = r19
            X.E6B r2 = r6.A0D
            r5 = r17
            r0 = r18
            r5.A0B(r2, r0)
            r1 = -1
            X.Dy6 r7 = new X.Dy6
            r3 = r23
            r7.<init>(r0, r3, r1)
            int r0 = r7.A00
            boolean r0 = X.AnonymousClass002.A1P(r0, r1)
            if (r0 != 0) goto L22
            int r0 = r7.A02
            r4 = 1
            if (r0 == r1) goto L23
        L22:
            r4 = 0
        L23:
            boolean r19 = r6.A08(r5, r7)
            boolean r20 = r6.A09(r5, r7, r4)
            r17 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r14 = r2.A01
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L44
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 < 0) goto L44
            r2 = 1
            long r0 = r14 - r2
            long r8 = X.BV5.A07(r0)
        L44:
            X.E6Q r6 = new X.E6Q
            r10 = r21
            r16 = r25
            r18 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6441E5t.A05(androidx.media3.common.Timeline, java.lang.Object, long, long, long, boolean):X.E6Q");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A08(androidx.media3.common.Timeline r5, X.Dy6 r6) {
        /*
            r4 = this;
            int r0 = r6.A00
            r2 = -1
            boolean r0 = X.AnonymousClass002.A1P(r0, r2)
            if (r0 != 0) goto Le
            int r1 = r6.A02
            r0 = 1
            if (r1 == r2) goto Lf
        Le:
            r0 = 0
        Lf:
            r3 = 0
            if (r0 == 0) goto L29
            java.lang.Object r1 = r6.A04
            X.E6B r0 = r4.A0D
            int r2 = X.E6B.A01(r0, r5, r1)
            int r1 = r5.A06(r1)
            X.Dth r0 = r4.A0E
            X.Dth r0 = X.BV7.A0d(r0, r5, r2)
            int r0 = r0.A01
            if (r0 != r1) goto L29
            r3 = 1
        L29:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6441E5t.A08(androidx.media3.common.Timeline, X.Dy6):boolean");
    }

    private boolean A09(Timeline timeline, Dy6 dy6, boolean z) {
        int iA06 = timeline.A06(dy6.A04);
        E6B e6b = this.A0D;
        int iA00 = E6B.A00(e6b, timeline, iA06);
        C5998Dth c5998Dth = this.A0E;
        return !BV7.A0d(c5998Dth, timeline, iA00).A0D && timeline.A05(e6b, c5998Dth, iA06, this.A01, this.A0C) == -1 && z;
    }

    public final C6442E5v A0B() {
        C6442E5v c6442E5v = this.A06;
        if (c6442E5v == null) {
            return null;
        }
        if (c6442E5v == this.A09) {
            this.A09 = c6442E5v.A01;
        }
        if (c6442E5v == this.A08) {
            this.A08 = c6442E5v.A01;
        }
        c6442E5v.A06();
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            this.A05 = null;
            C6442E5v c6442E5v2 = this.A06;
            this.A0A = c6442E5v2.A0A;
            this.A03 = c6442E5v2.A02.A04.A03;
        }
        this.A06 = this.A06.A01;
        A06(this);
        return this.A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.E6Q A0C(androidx.media3.common.Timeline r20, X.E6Q r21) {
        /*
            r19 = this;
            r2 = r21
            X.Dy6 r8 = r2.A04
            int r6 = r8.A00
            r5 = -1
            boolean r4 = X.AnonymousClass002.A1P(r6, r5)
            if (r4 != 0) goto L12
            int r0 = r8.A02
            r1 = 1
            if (r0 == r5) goto L13
        L12:
            r1 = 0
        L13:
            r3 = r19
            r7 = r20
            boolean r20 = r3.A08(r7, r8)
            boolean r21 = r3.A09(r7, r8, r1)
            java.lang.Object r0 = r8.A04
            X.E6B r3 = r3.A0D
            r7.A0B(r3, r0)
            if (r4 != 0) goto L42
            int r0 = r8.A02
            if (r0 == r5) goto L42
            r13 = 0
            r15 = 0
        L30:
            r18 = 0
            long r9 = r2.A03
            long r11 = r2.A02
            boolean r0 = r2.A09
            X.E6Q r7 = new X.E6Q
            r19 = r1
            r17 = r0
            r7.<init>(r8, r9, r11, r13, r15, r17, r18, r19, r20, r21)
            return r7
        L42:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L50
            int r0 = r8.A01
            long r15 = r3.A03(r6, r0)
            goto L30
        L50:
            long r15 = r3.A01
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6441E5t.A0C(androidx.media3.common.Timeline, X.E6Q):X.E6Q");
    }

    public final Dy6 A0D(Timeline timeline, Object obj) {
        long jA01;
        int iA06;
        E6B e6b = this.A0D;
        int iA01 = E6B.A01(e6b, timeline, obj);
        Object obj2 = this.A0A;
        if (obj2 == null || (iA06 = timeline.A06(obj2)) == -1 || E6B.A00(e6b, timeline, iA06) != iA01) {
            C6442E5v c6442E5v = this.A06;
            while (true) {
                if (c6442E5v == null) {
                    c6442E5v = this.A06;
                    while (c6442E5v != null) {
                        int iA062 = timeline.A06(c6442E5v.A0A);
                        if (iA062 == -1 || E6B.A00(e6b, timeline, iA062) != iA01) {
                            c6442E5v = c6442E5v.A01;
                        }
                    }
                    jA01 = A01(obj);
                    if (jA01 == -1) {
                        jA01 = this.A02;
                        this.A02 = 1 + jA01;
                        if (this.A06 == null) {
                            this.A0A = obj;
                            this.A03 = jA01;
                        }
                    }
                } else {
                    if (c6442E5v.A0A.equals(obj)) {
                        break;
                    }
                    c6442E5v = c6442E5v.A01;
                }
            }
            jA01 = c6442E5v.A02.A04.A03;
        } else {
            jA01 = this.A03;
        }
        timeline.A0B(e6b, obj);
        int i = e6b.A00;
        C5998Dth c5998Dth = this.A0E;
        timeline.A0E(c5998Dth, i, 0L);
        for (int iA063 = timeline.A06(obj); iA063 >= c5998Dth.A00; iA063--) {
            timeline.A0D(e6b, iA063, true);
        }
        timeline.A0B(e6b, obj);
        timeline.A0E(c5998Dth, e6b.A00, 0L);
        timeline.A06(obj);
        timeline.A0B(e6b, obj);
        return new Dy6(obj, jA01, -1);
    }

    public final void A0E() {
        if (this.A00 != 0) {
            C6442E5v c6442E5v = this.A06;
            C1G.A05(c6442E5v);
            this.A0A = c6442E5v.A0A;
            this.A03 = c6442E5v.A02.A04.A03;
            do {
                c6442E5v.A06();
                c6442E5v = c6442E5v.A01;
            } while (c6442E5v != null);
            this.A06 = null;
            this.A05 = null;
            this.A09 = null;
            this.A08 = null;
            this.A00 = 0;
            A06(this);
        }
    }

    public final void A0F() {
        C6442E5v c6442E5v = this.A07;
        if (c6442E5v != null) {
            if (!c6442E5v.A08) {
                return;
            }
            if (!c6442E5v.A09() && c6442E5v.A03() - c6442E5v.A02.A03 < -9223372036854775807L) {
                return;
            }
        }
        this.A07 = null;
        for (int i = 0; i < this.A0B.size(); i++) {
            C6442E5v c6442E5v2 = this.A0B.get(i);
            if (!c6442E5v2.A08 || (!c6442E5v2.A09() && c6442E5v2.A03() - c6442E5v2.A02.A03 < -9223372036854775807L)) {
                this.A07 = c6442E5v2;
                return;
            }
        }
    }

    public final void A0G(long j) {
        C6442E5v c6442E5v = this.A05;
        if (c6442E5v != null) {
            C1G.A08(AnonymousClass002.A1Y(c6442E5v.A01));
            if (c6442E5v.A08) {
                c6442E5v.A09.AZv(j - c6442E5v.A00);
            }
        }
    }

    public C6441E5t(InterfaceC6459E6s interfaceC6459E6s, E81 e81, E7S e7s, E65 e65) {
        this.A0G = e65;
        this.A0H = interfaceC6459E6s;
        this.A0F = e7s;
        this.A04 = e81;
    }

    public static void A06(final C6441E5t c6441E5t) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (C6442E5v c6442E5v = c6441E5t.A06; c6442E5v != null; c6442E5v = c6442E5v.A01) {
            builder.add((ImmutableList.Builder) c6442E5v.A02.A04);
        }
        C6442E5v c6442E5v2 = c6441E5t.A09;
        final Dy6 dy6 = c6442E5v2 == null ? null : c6442E5v2.A02.A04;
        BV6.A1C(c6441E5t.A0H, new Runnable() { // from class: X.E6j
            public static final String __redex_internal_original_name = "MediaPeriodQueue2$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C6441E5t c6441E5t2 = this.A00;
                ImmutableList.Builder builder2 = builder;
                c6441E5t2.A0G.Ahx(dy6, builder2.build());
            }
        });
    }

    public final int A0A(C6442E5v c6442E5v) {
        C1G.A05(c6442E5v);
        int i = 0;
        if (!c6442E5v.equals(this.A05)) {
            this.A05 = c6442E5v;
            while (c6442E5v.A01 != null) {
                c6442E5v = c6442E5v.A01;
                c6442E5v.getClass();
                C6442E5v c6442E5v2 = this.A09;
                if (c6442E5v == c6442E5v2) {
                    c6442E5v2 = this.A06;
                    this.A09 = c6442E5v2;
                    this.A08 = c6442E5v2;
                    i = 3;
                }
                if (c6442E5v == this.A08) {
                    this.A08 = c6442E5v2;
                    i |= 2;
                }
                c6442E5v.A06();
                this.A00--;
            }
            C6442E5v c6442E5v3 = this.A05;
            c6442E5v3.getClass();
            if (null != c6442E5v3.A01) {
                C6442E5v.A01(c6442E5v3);
                c6442E5v3.A01 = null;
                C6442E5v.A02(c6442E5v3);
            }
            A06(this);
        }
        return i;
    }
}
