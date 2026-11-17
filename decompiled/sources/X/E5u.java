package X;

import android.util.Pair;
import androidx.media3.common.Timeline;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E5u {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public E81 A04;
    public C6444E5x A05;
    public C6444E5x A06;
    public C6444E5x A07;
    public C6444E5x A08;
    public Object A09;
    public boolean A0B;
    public final int A0C;
    public final E82 A0F;
    public final E65 A0G;
    public final InterfaceC6459E6s A0H;
    public final E6B A0D = new E6B();
    public final C5998Dth A0E = new C5998Dth();
    public List<C6444E5x> A0A = C3cG.A0h();

    public static E6Q A02(Timeline timeline, E5u e5u, Object obj, int i, int i2, long j, long j2) {
        Dy6 dy6 = new Dy6(obj, i, i2, -1, j2);
        long jA03 = timeline.A0B(e5u.A0D, dy6.A04).A03(dy6.A00, dy6.A01);
        long jMax = 0;
        if (jA03 != -9223372036854775807L && 0 >= jA03) {
            jMax = Math.max(0L, jA03 - 1);
        }
        return new E6Q(dy6, jMax, j, -9223372036854775807L, jA03, false, false, false, false, false);
    }

    public final boolean A0C(C6444E5x c6444E5x) {
        boolean z = false;
        C1G.A08(AnonymousClass002.A1X(c6444E5x));
        if (!c6444E5x.equals(this.A05)) {
            this.A05 = c6444E5x;
            while (c6444E5x.A01 != null) {
                c6444E5x = c6444E5x.A01;
                if (c6444E5x == this.A08) {
                    this.A08 = this.A06;
                    z = true;
                }
                c6444E5x.A04();
                this.A00--;
            }
            C6444E5x c6444E5x2 = this.A05;
            if (null != c6444E5x2.A01) {
                C6444E5x.A00(c6444E5x2);
                c6444E5x2.A01 = null;
                C6444E5x.A01(c6444E5x2);
            }
            A04(this);
        }
        return z;
    }

    public static E6Q A00(Timeline timeline, C6444E5x c6444E5x, E5u e5u, long j) {
        long j2;
        long j3;
        Object obj;
        int i;
        int i2;
        int i3;
        long jA0T;
        E6Q e6q = c6444E5x.A02;
        long j4 = c6444E5x.A00;
        long j5 = e6q.A00;
        long j6 = (j4 + j5) - j;
        if (e6q.A07) {
            Dy6 dy6 = e6q.A04;
            Object obj2 = dy6.A04;
            int iA06 = timeline.A06(obj2);
            E6B e6b = e5u.A0D;
            C5998Dth c5998Dth = e5u.A0E;
            long j7 = 0;
            int iA05 = timeline.A05(e6b, c5998Dth, iA06, e5u.A01, e5u.A0B);
            if (iA05 == -1) {
                return null;
            }
            int i4 = timeline.A0D(e6b, iA05, true).A00;
            Object obj3 = e6b.A05;
            obj3.getClass();
            long j8 = dy6.A03;
            if (timeline.A0E(c5998Dth, i4, 0L).A00 == iA05) {
                Pair pairA0A = timeline.A0A(e6b, c5998Dth, i4, -9223372036854775807L, Math.max(0L, j6));
                if (pairA0A == null) {
                    return null;
                }
                obj3 = pairA0A.first;
                jA0T = BV7.A0T(pairA0A);
                C6444E5x c6444E5x2 = c6444E5x.A01;
                if (c6444E5x2 == null || !c6444E5x2.A0A.equals(obj3)) {
                    j8 = e5u.A02;
                    e5u.A02 = 1 + j8;
                } else {
                    j8 = c6444E5x2.A02.A04.A03;
                }
                j7 = -9223372036854775807L;
            } else {
                jA0T = 0;
            }
            timeline.A0B(e6b, obj3);
            timeline.A0E(c5998Dth, e6b.A00, 0L);
            timeline.A06(obj3);
            timeline.A0B(e6b, obj3);
            Dy6 dy62 = new Dy6(obj3, j8, -1);
            if (j7 != -9223372036854775807L && e6q.A02 != -9223372036854775807L) {
                timeline.A0B(e6b, obj2);
            }
            return A01(timeline, e5u, dy62, j7, jA0T);
        }
        Dy6 dy63 = e6q.A04;
        Object obj4 = dy63.A04;
        E6B e6b2 = e5u.A0D;
        timeline.A0B(e6b2, obj4);
        int i5 = dy63.A00;
        if (AnonymousClass002.A1P(i5, -1)) {
            E6C e6c = e6b2.A03;
            int i6 = (i5 < 0 ? E6C.A01 : e6c.A00[i5]).A00;
            if (i6 == -1) {
                return null;
            }
            int i7 = dy63.A01;
            E6D e6d = i5 < 0 ? E6C.A01 : e6c.A00[i5];
            do {
                i7++;
                int[] iArr = e6d.A01;
                if (i7 >= iArr.length || (i3 = iArr[i7]) == 0) {
                    break;
                }
            } while (i3 != 1);
            if (i7 >= i6) {
                long jA0T2 = e6q.A02;
                if (jA0T2 == -9223372036854775807L) {
                    Pair pairA0A2 = timeline.A0A(e6b2, e5u.A0E, e6b2.A00, -9223372036854775807L, Math.max(0L, j6));
                    if (pairA0A2 == null) {
                        return null;
                    }
                    jA0T2 = BV7.A0T(pairA0A2);
                }
                timeline.A0B(e6b2, obj4);
                return A03(timeline, e5u, obj4, Math.max(0L, jA0T2), jA0T2, dy63.A03);
            }
            j2 = e6q.A02;
            j3 = dy63.A03;
            obj = obj4;
            i = i5;
            i2 = i7;
        } else {
            int i8 = dy63.A02;
            int iA02 = e6b2.A02(i8);
            if (iA02 == (i8 < 0 ? E6C.A01 : e6b2.A03.A00[i8]).A00) {
                timeline.A0B(e6b2, obj4);
                return A03(timeline, e5u, obj4, 0L, j5, dy63.A03);
            }
            j2 = j5;
            j3 = dy63.A03;
            obj = obj4;
            i = i8;
            i2 = iA02;
        }
        return A02(timeline, e5u, obj, i, i2, j2, j3);
    }

    public static E6Q A01(Timeline timeline, E5u e5u, Dy6 dy6, long j, long j2) {
        Object obj = dy6.A04;
        timeline.A0B(e5u.A0D, obj);
        int i = dy6.A00;
        return AnonymousClass002.A1P(i, -1) ? A02(timeline, e5u, obj, i, dy6.A01, j, dy6.A03) : A03(timeline, e5u, obj, j2, j, dy6.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.E6Q A03(androidx.media3.common.Timeline r13, X.E5u r14, java.lang.Object r15, long r16, long r18, long r20) {
        /*
            r9 = r16
            r17 = 0
            X.E6B r5 = r14.A0D
            r13.A0B(r5, r15)
            r1 = -1
            X.Dy6 r8 = new X.Dy6
            r2 = r20
            r8.<init>(r15, r2, r1)
            int r0 = r8.A00
            boolean r0 = X.AnonymousClass002.A1P(r0, r1)
            if (r0 != 0) goto L1e
            int r0 = r8.A02
            r4 = 1
            if (r0 == r1) goto L1f
        L1e:
            r4 = 0
        L1f:
            boolean r20 = r14.A06(r13, r8)
            boolean r21 = r14.A07(r13, r8, r4)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r15 = r5.A01
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L3e
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 < 0) goto L3e
            r2 = 1
            long r0 = r15 - r2
            long r9 = X.BV5.A07(r0)
        L3e:
            X.E6Q r7 = new X.E6Q
            r11 = r18
            r18 = r17
            r19 = r4
            r7.<init>(r8, r9, r11, r13, r15, r17, r18, r19, r20, r21)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5u.A03(androidx.media3.common.Timeline, X.E5u, java.lang.Object, long, long, long):X.E6Q");
    }

    public static boolean A05(Timeline timeline, E5u e5u) {
        C6444E5x c6444E5x;
        C6444E5x c6444E5x2 = e5u.A06;
        if (c6444E5x2 == null) {
            return true;
        }
        int iA06 = timeline.A06(c6444E5x2.A0A);
        while (true) {
            iA06 = timeline.A05(e5u.A0D, e5u.A0E, iA06, e5u.A01, e5u.A0B);
            while (true) {
                c6444E5x = c6444E5x2.A01;
                if (c6444E5x == null || c6444E5x2.A02.A07) {
                    break;
                }
                c6444E5x2 = c6444E5x;
            }
            if (iA06 == -1 || c6444E5x == null || timeline.A06(c6444E5x.A0A) != iA06) {
                break;
            }
            c6444E5x2 = c6444E5x;
        }
        boolean zA0C = e5u.A0C(c6444E5x2);
        c6444E5x2.A02 = e5u.A09(timeline, c6444E5x2.A02);
        return !zA0C;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A06(androidx.media3.common.Timeline r5, X.Dy6 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.E5u.A06(androidx.media3.common.Timeline, X.Dy6):boolean");
    }

    private boolean A07(Timeline timeline, Dy6 dy6, boolean z) {
        int iA06 = timeline.A06(dy6.A04);
        E6B e6b = this.A0D;
        int iA00 = E6B.A00(e6b, timeline, iA06);
        C5998Dth c5998Dth = this.A0E;
        return !BV7.A0d(c5998Dth, timeline, iA00).A0D && timeline.A05(e6b, c5998Dth, iA06, this.A01, this.A0B) == -1 && z;
    }

    public final C6444E5x A08() {
        C6444E5x c6444E5x = this.A06;
        if (c6444E5x == null) {
            return null;
        }
        if (c6444E5x == this.A08) {
            this.A08 = c6444E5x.A01;
        }
        c6444E5x.A04();
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            this.A05 = null;
            C6444E5x c6444E5x2 = this.A06;
            this.A09 = c6444E5x2.A0A;
            this.A03 = c6444E5x2.A02.A04.A03;
        }
        this.A06 = this.A06.A01;
        A04(this);
        return this.A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.E6Q A09(androidx.media3.common.Timeline r20, X.E6Q r21) {
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
            boolean r20 = r3.A06(r7, r8)
            boolean r21 = r3.A07(r7, r8, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: X.E5u.A09(androidx.media3.common.Timeline, X.E6Q):X.E6Q");
    }

    public final Dy6 A0A(Timeline timeline, Object obj) {
        long j;
        int iA06;
        E6B e6b = this.A0D;
        int iA01 = E6B.A01(e6b, timeline, obj);
        Object obj2 = this.A09;
        if (obj2 == null || (iA06 = timeline.A06(obj2)) == -1 || E6B.A00(e6b, timeline, iA06) != iA01) {
            C6444E5x c6444E5x = this.A06;
            while (true) {
                if (c6444E5x == null) {
                    c6444E5x = this.A06;
                    while (c6444E5x != null) {
                        int iA062 = timeline.A06(c6444E5x.A0A);
                        if (iA062 == -1 || E6B.A00(e6b, timeline, iA062) != iA01) {
                            c6444E5x = c6444E5x.A01;
                        }
                    }
                    j = this.A02;
                    this.A02 = 1 + j;
                    if (this.A06 == null) {
                        this.A09 = obj;
                        this.A03 = j;
                    }
                } else {
                    if (c6444E5x.A0A.equals(obj)) {
                        break;
                    }
                    c6444E5x = c6444E5x.A01;
                }
            }
            j = c6444E5x.A02.A04.A03;
        } else {
            j = this.A03;
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
        return new Dy6(obj, j, -1);
    }

    public final void A0B() {
        if (this.A00 != 0) {
            C6444E5x c6444E5x = this.A06;
            C1G.A05(c6444E5x);
            this.A09 = c6444E5x.A0A;
            this.A03 = c6444E5x.A02.A04.A03;
            do {
                c6444E5x.A04();
                c6444E5x = c6444E5x.A01;
            } while (c6444E5x != null);
            this.A06 = null;
            this.A05 = null;
            this.A08 = null;
            this.A00 = 0;
            A04(this);
        }
    }

    public E5u(InterfaceC6459E6s interfaceC6459E6s, E81 e81, E82 e82, E65 e65) {
        this.A0G = e65;
        this.A0H = interfaceC6459E6s;
        this.A0F = e82;
        this.A04 = e81;
        int iA00 = AbstractC5653Dmh.A00(EnumC5679DnI.A06);
        this.A0C = iA00 >= 0 ? Math.min(iA00, 100) : 100;
    }

    public static void A04(final E5u e5u) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (C6444E5x c6444E5x = e5u.A06; c6444E5x != null; c6444E5x = c6444E5x.A01) {
            builder.add((ImmutableList.Builder) c6444E5x.A02.A04);
        }
        C6444E5x c6444E5x2 = e5u.A08;
        final Dy6 dy6 = c6444E5x2 == null ? null : c6444E5x2.A02.A04;
        BV6.A1C(e5u.A0H, new Runnable() { // from class: X.E6k
            public static final String __redex_internal_original_name = "MediaPeriodQueue$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                E5u e5u2 = this.A00;
                ImmutableList.Builder builder2 = builder;
                e5u2.A0G.Ahx(dy6, builder2.build());
            }
        });
    }
}
