package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class BDh {
    public static long A00;
    public static AI7 A01;
    public static List<? extends G0V<? super Set<? extends Object>, ? super Snapshot, Unit>> A02;
    public static List<? extends G0U<Object, Unit>> A03;
    public static C1726ApH A04;
    public static final BDo A06;
    public static final BDr A07;
    public static final Snapshot A0A;
    public static final BDq<BDs> A0B;
    public static final G0U<AI7, Unit> A09 = new C2279BSf(37);
    public static final C2254BDx<Snapshot> A05 = new C2254BDx<>();
    public static final Object A08 = C3cG.A0T();

    public static final Snapshot A01(Snapshot snapshot, G0U<Object, Unit> g0u, boolean z) {
        BDi bDi;
        if (snapshot instanceof BDi) {
            bDi = (BDi) snapshot;
        } else {
            if (snapshot != null) {
                return new BDl(snapshot, g0u, false, z);
            }
            bDi = null;
        }
        return new BDk(bDi, g0u, null, false, z);
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/AN8;>(TT;JLX/AI7;)TT; */
    public static final AN8 A05(AI7 ai7, AN8 an8, long j) {
        AN8 an82 = null;
        while (an8 != null) {
            long j2 = an8.A00;
            if (j2 != 0 && C7384Etj.A01(j2, j) <= 0 && !ai7.A05(j2) && (an82 == null || C7384Etj.A01(an82.A00, an8.A00) < 0)) {
                an82 = an8;
            }
            an8 = an8.A01;
        }
        if (an82 != null) {
            return an82;
        }
        return null;
    }

    static {
        AI7 ai7 = AI7.A04;
        A01 = ai7;
        A00 = 2L;
        A07 = new BDr();
        A0B = new BDq<>();
        C0881AGi c0881AGi = C0881AGi.A00;
        A02 = c0881AGi;
        A03 = c0881AGi;
        A00 = 3L;
        BDo bDo = new BDo(ai7, null, new C2279BSf(36), 2L);
        A01 = A01.A02(bDo.A09());
        A06 = bDo;
        A0A = bDo;
        A04 = new C1726ApH(0);
    }

    public static final Snapshot A00() {
        Snapshot snapshotA00 = A05.A00();
        return snapshotA00 == null ? A06 : snapshotA00;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T A0A(X.G0U<? super X.AI7, ? extends T> r16) {
        /*
            X.BDo r6 = X.BDh.A06
            java.lang.Object r15 = X.BDh.A08
            monitor-enter(r15)
            X.AHt r5 = r6.A0R()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L11
            X.ApH r1 = X.BDh.A04     // Catch: java.lang.Throwable -> L91
            r0 = 1
            r1.addAndGet(r0)     // Catch: java.lang.Throwable -> L91
        L11:
            r0 = r16
            java.lang.Object r14 = A09(r6, r0)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r15)
            if (r5 == 0) goto L42
            java.util.List<? extends X.G0V<? super java.util.Set<? extends java.lang.Object>, ? super androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit>> r4 = X.BDh.A02     // Catch: java.lang.Throwable -> L34
            X.AGQ r3 = new X.AGQ     // Catch: java.lang.Throwable -> L34
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L34
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L34
            r1 = 0
        L26:
            if (r1 >= r2) goto L3c
            java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Throwable -> L34
            X.G0V r0 = (X.G0V) r0     // Catch: java.lang.Throwable -> L34
            r0.invoke(r3, r6)     // Catch: java.lang.Throwable -> L34
            int r1 = r1 + 1
            goto L26
        L34:
            r2 = move-exception
            X.ApH r1 = X.BDh.A04
            r0 = -1
            r1.addAndGet(r0)
            throw r2
        L3c:
            X.ApH r1 = X.BDh.A04
            r0 = -1
            r1.addAndGet(r0)
        L42:
            monitor-enter(r15)
            A0D()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L8f
            java.lang.Object[] r11 = r5.A04     // Catch: java.lang.Throwable -> L91
            long[] r10 = r5.A03     // Catch: java.lang.Throwable -> L91
            int r0 = r10.length     // Catch: java.lang.Throwable -> L91
            int r9 = r0 + (-2)
            if (r9 < 0) goto L8f
            r8 = 0
        L52:
            r12 = r10[r8]     // Catch: java.lang.Throwable -> L91
            r3 = -1
            long r3 = r3 ^ r12
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r12
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            int r0 = r8 - r9
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L6f:
            if (r5 >= r6) goto L88
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r12
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L84
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]     // Catch: java.lang.Throwable -> L91
            X.BDs r0 = (X.BDs) r0     // Catch: java.lang.Throwable -> L91
            A0H(r0)     // Catch: java.lang.Throwable -> L91
        L84:
            long r12 = r12 >> r7
            int r5 = r5 + 1
            goto L6f
        L88:
            if (r6 != r7) goto L8f
        L8a:
            if (r8 == r9) goto L8f
            int r8 = r8 + 1
            goto L52
        L8f:
            monitor-exit(r15)
            return r14
        L91:
            r2 = move-exception
            monitor-exit(r15)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BDh.A0A(X.G0U):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/BDi;LX/AI7;)Ljava/util/Map<LX/AN8;LX/AN8;>; */
    public static final HashMap A0B(BDi bDi, AI7 ai7, long j) {
        char c;
        AN8 an8A05;
        C0917AHt<BDs> c0917AHtA0R = bDi.A0R();
        if (c0917AHtA0R == null) {
            return null;
        }
        long jA09 = bDi.A09();
        AI7 ai7A04 = bDi.A0C().A02(jA09).A04(bDi.A00);
        Object[] objArr = c0917AHtA0R.A04;
        long[] jArr = c0917AHtA0R.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map = null;
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if (((((-1) ^ j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        BDs bDs = (BDs) objArr[(i << 3) + i3];
                        AN8 an8AFh = bDs.AFh();
                        c = '\b';
                        AN8 an8A052 = A05(ai7, an8AFh, j);
                        if (an8A052 != null && (an8A05 = A05(ai7A04, an8AFh, jA09)) != null && !an8A052.equals(an8A05)) {
                            AN8 an8A053 = A05(bDi.A0C(), an8AFh, jA09);
                            if (an8A053 == null) {
                                throw C3cG.A0Q("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                            }
                            AN8 an8AQi = bDs.AQi(an8A05, an8A052, an8A053);
                            if (an8AQi == null) {
                                return null;
                            }
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(an8A052, an8AQi);
                        }
                    } else {
                        c = '\b';
                    }
                    j2 >>= c;
                }
                if (i2 != 8) {
                    return map;
                }
            }
            if (i == length) {
                return map;
            }
            i++;
        }
    }

    public static final G0U<Object, Unit> A0C(G0U<Object, Unit> g0u, G0U<Object, Unit> g0u2, boolean z) {
        if (!z) {
            g0u2 = null;
        }
        return g0u != null ? (g0u2 == null || g0u == g0u2) ? g0u : new BT9(g0u, g0u2, (G0U<Object, Unit>) 18) : g0u2;
    }

    public static final void A0D() {
        BDs bDs;
        BDq<BDs> bDq = A0B;
        int i = bDq.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            BLZ<BDs> blz = bDq.A02[i3];
            if (blz != null && (bDs = blz.get()) != null && A0I(bDs)) {
                if (i2 != i3) {
                    bDq.A02[i2] = blz;
                    int[] iArr = bDq.A01;
                    iArr[i2] = iArr[i3];
                }
                i2++;
            }
        }
        for (int i4 = i2; i4 < i; i4++) {
            bDq.A02[i4] = null;
            bDq.A01[i4] = 0;
        }
        if (i2 != i) {
            bDq.A00 = i2;
        }
    }

    public static final void A0E(int i) {
        BDr bDr = A07;
        int[] iArr = bDr.A02;
        int i2 = iArr[i];
        int i3 = bDr.A01 - 1;
        BDr.A00(bDr, i2, i3);
        bDr.A01 = i3;
        int i4 = i2;
        long[] jArr = bDr.A04;
        long j = jArr[i2];
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (C7384Etj.A01(jArr[i5], j) <= 0) {
                break;
            }
            BDr.A00(bDr, i5, i4);
            i4 = i5;
        }
        int i6 = i3 >> 1;
        while (i2 < i6) {
            int i7 = (i2 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < i3 && C7384Etj.A01(jArr[i7], jArr[i8]) < 0) {
                if (C7384Etj.A01(jArr[i7], jArr[i2]) >= 0) {
                    break;
                }
                BDr.A00(bDr, i7, i2);
                i2 = i7;
            } else {
                if (C7384Etj.A01(jArr[i8], jArr[i2]) >= 0) {
                    break;
                }
                BDr.A00(bDr, i8, i2);
                i2 = i8;
            }
        }
        iArr[i] = bDr.A00;
        bDr.A00 = i;
    }

    public static final void A0F(Snapshot snapshot) {
        long j;
        BDi bDi;
        if (A01.A05(snapshot.A09())) {
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Snapshot is not open: snapshotId=");
        sbA0x.append(snapshot.A09());
        sbA0x.append(", disposed=");
        sbA0x.append(snapshot.A01);
        sbA0x.append(", applied=");
        sbA0x.append((!(snapshot instanceof BDi) || (bDi = (BDi) snapshot) == null) ? "read-only" : Boolean.valueOf(bDi.A01));
        sbA0x.append(", lowestPin=");
        synchronized (A08) {
            BDr bDr = A07;
            j = bDr.A01 > 0 ? bDr.A04[0] : -1L;
        }
        sbA0x.append(j);
        throw C3cG.A0Q(sbA0x.toString());
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/AN8;>(TT;LX/BDs;Landroidx/compose/runtime/snapshots/Snapshot;)TT; */
    public static final AN8 A02(Snapshot snapshot, BDs bDs, AN8 an8) {
        AN8 an8A05;
        if (snapshot.A0Q()) {
            snapshot.A0P(bDs);
        }
        long jA09 = snapshot.A09();
        AN8 an8A052 = A05(snapshot.A0C(), an8, jA09);
        if (an8A052 == null) {
            throw C3cG.A0Q("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
        }
        if (an8A052.A00 == snapshot.A09()) {
            return an8A052;
        }
        synchronized (A08) {
            an8A05 = A05(snapshot.A0C(), bDs.AFh(), jA09);
            if (an8A05 == null) {
                throw C3cG.A0Q("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
            if (an8A05.A00 != jA09) {
                AN8 an8A06 = A06(bDs, an8A05);
                an8A06.A03(an8A05);
                an8A06.A00 = snapshot.A09();
                an8A05 = an8A06;
            }
        }
        if (an8A052.A00 != 1) {
            snapshot.A0P(bDs);
        }
        return an8A05;
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/AN8;>(TT;LX/BDs;Landroidx/compose/runtime/snapshots/Snapshot;TT;)TT; */
    public static final AN8 A03(Snapshot snapshot, BDs bDs, AN8 an8, AN8 an82) {
        AN8 an8A06;
        if (snapshot.A0Q()) {
            snapshot.A0P(bDs);
        }
        long jA09 = snapshot.A09();
        if (an82.A00 == jA09) {
            return an82;
        }
        synchronized (A08) {
            an8A06 = A06(bDs, an8);
        }
        an8A06.A00 = jA09;
        if (an82.A00 != 1) {
            snapshot.A0P(bDs);
        }
        return an8A06;
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/AN8;>(TT;Landroidx/compose/runtime/snapshots/Snapshot;)TT; */
    public static final AN8 A04(Snapshot snapshot, AN8 an8) {
        AN8 an8A05 = A05(snapshot.A0C(), an8, snapshot.A09());
        if (an8A05 == null) {
            synchronized (A08) {
                an8A05 = A05(snapshot.A0C(), an8, snapshot.A09());
            }
            if (an8A05 == null) {
                throw C3cG.A0Q("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return an8A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Incorrect types in method signature: <T:LX/AN8;>(TT;LX/BDs;)TT; */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AN8 A06(X.BDs r11, X.AN8 r12) {
        /*
            X.AN8 r4 = r11.AFh()
            X.BDr r3 = X.BDh.A07
            long r1 = X.BDh.A00
            int r0 = r3.A01
            if (r0 <= 0) goto L11
            long[] r1 = r3.A04
            r0 = 0
            r1 = r1[r0]
        L11:
            r5 = 1
            long r1 = r1 - r5
            X.AI7 r3 = X.AI7.A04
            r10 = 0
            r7 = r10
        L18:
            if (r4 == 0) goto L46
            long r5 = r4.A00
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L44
            long r5 = r4.A00
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L37
            int r0 = X.C7384Etj.A01(r5, r1)
            if (r0 > 0) goto L37
            boolean r0 = r3.A05(r5)
            if (r0 != 0) goto L37
            if (r7 != 0) goto L3a
            r7 = r4
        L37:
            X.AN8 r4 = r4.A01
            goto L18
        L3a:
            long r2 = r4.A00
            long r0 = r7.A00
            int r0 = X.C7384Etj.A01(r2, r0)
            if (r0 >= 0) goto L47
        L44:
            r7 = r4
            goto L47
        L46:
            r7 = r10
        L47:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r7 == 0) goto L51
            r7.A00 = r0
            return r7
        L51:
            X.AN8 r7 = r12.A02(r0)
            X.AN8 r0 = r11.AFh()
            r7.A01 = r0
            r11.AYT(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BDh.A06(X.BDs, X.AN8):X.AN8");
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/AN8;>(TT;LX/BDs;)TT; */
    public static final AN8 A07(BDs bDs, AN8 an8) {
        Snapshot snapshotA00 = A00();
        G0U<Object, Unit> g0uA0D = snapshotA00.A0D();
        if (g0uA0D != null) {
            g0uA0D.invoke(bDs);
        }
        AN8 an8A05 = A05(snapshotA00.A0C(), an8, snapshotA00.A09());
        if (an8A05 == null) {
            synchronized (A08) {
                Snapshot snapshotA002 = A00();
                AN8 an8AFh = bDs.AFh();
                C7384Etj.A0Z(an8AFh, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
                an8A05 = A05(snapshotA002.A0C(), an8AFh, snapshotA002.A09());
                if (an8A05 == null) {
                    throw C3cG.A0Q("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
        }
        return an8A05;
    }

    public static final <T extends AN8> T A08(T t) {
        Snapshot snapshotA00 = A00();
        T t2 = (T) A05(snapshotA00.A0C(), t, snapshotA00.A09());
        if (t2 == null) {
            synchronized (A08) {
                Snapshot snapshotA002 = A00();
                t2 = (T) A05(snapshotA002.A0C(), t, snapshotA002.A09());
            }
            if (t2 == null) {
                throw C3cG.A0Q("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return t2;
    }

    public static final <T> T A09(BDo bDo, G0U<? super AI7, ? extends T> g0u) {
        long jA09 = bDo.A09();
        T tInvoke = g0u.invoke(A01.A01(jA09));
        long j = A00;
        A00 = 1 + j;
        A01 = A01.A01(jA09);
        bDo.A0N(j);
        bDo.A0O(A01);
        bDo.A0M(0);
        bDo.A0Y(null);
        int i = ((Snapshot) bDo).A00;
        if (i >= 0) {
            A0E(i);
            ((Snapshot) bDo).A00 = -1;
        }
        A01 = A01.A02(j);
        return tInvoke;
    }

    public static final void A0G(Snapshot snapshot, BDs bDs) {
        snapshot.A0M(snapshot.A08() + 1);
        G0U<Object, Unit> g0uA0E = snapshot.A0E();
        if (g0uA0E != null) {
            g0uA0E.invoke(bDs);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r8 >= r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r6[r8] != r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r0 = r4[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r0 != r10) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        r0 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        r8 = -r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0H(X.BDs r10) {
        /*
            boolean r0 = A0I(r10)
            if (r0 == 0) goto L64
            X.BDq<X.BDs> r3 = X.BDh.A0B
            int r7 = r3.A00
            int r5 = java.lang.System.identityHashCode(r10)
            r9 = 0
            if (r7 <= 0) goto L6c
            int r2 = r7 + (-1)
            r1 = 0
        L14:
            if (r1 > r2) goto L4d
            int r0 = r1 + r2
            int r8 = r0 >>> 1
            int[] r6 = r3.A01
            r0 = r6[r8]
            if (r0 >= r5) goto L23
            int r1 = r8 + 1
            goto L14
        L23:
            if (r0 <= r5) goto L28
            int r2 = r8 + (-1)
            goto L14
        L28:
            X.BLZ<T>[] r4 = r3.A02
            r0 = r4[r8]
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r0.get()
        L32:
            if (r10 == r0) goto L62
            int r2 = r8 + (-1)
        L36:
            r1 = 0
            r0 = -1
            if (r0 >= r2) goto L50
            r0 = r6[r2]
            if (r0 != r5) goto L50
            r0 = r4[r2]
            if (r0 == 0) goto L46
            java.lang.Object r1 = r0.get()
        L46:
            if (r1 == r10) goto L64
            int r2 = r2 + (-1)
            goto L36
        L4b:
            r0 = 0
            goto L32
        L4d:
            int r0 = r1 + 1
            goto L6a
        L50:
            int r8 = r8 + 1
            if (r8 >= r7) goto L67
            r0 = r6[r8]
            if (r0 != r5) goto L68
            r0 = r4[r8]
            if (r0 == 0) goto L65
            java.lang.Object r0 = r0.get()
        L60:
            if (r0 != r10) goto L50
        L62:
            if (r8 < 0) goto L6d
        L64:
            return
        L65:
            r0 = r1
            goto L60
        L67:
            r8 = r7
        L68:
            int r0 = r8 + 1
        L6a:
            int r8 = -r0
            goto L62
        L6c:
            r8 = -1
        L6d:
            int r0 = r8 + 1
            int r4 = -r0
            X.BLZ<T>[] r8 = r3.A02
            int r0 = r8.length
            if (r7 != r0) goto La9
            int r0 = r0 * 2
            X.BLZ[] r6 = new X.BLZ[r0]
            int[] r2 = new int[r0]
            int r1 = r4 + 1
            int r0 = r7 - r4
            java.lang.System.arraycopy(r8, r4, r6, r1, r0)
            X.BLZ<T>[] r0 = r3.A02
            java.lang.System.arraycopy(r0, r9, r6, r9, r4)
            int[] r0 = r3.A01
            X.AbstractC0903AHf.A03(r0, r2, r1, r4, r7)
            int[] r0 = r3.A01
            X.AbstractC0903AHf.A03(r0, r2, r9, r9, r4)
            r3.A02 = r6
            r3.A01 = r2
        L95:
            X.BLZ<T>[] r1 = r3.A02
            X.BLZ r0 = new X.BLZ
            r0.<init>(r10)
            r1[r4] = r0
            int[] r0 = r3.A01
            r0[r4] = r5
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            return
        La9:
            int r1 = r4 + 1
            int r0 = r7 - r4
            java.lang.System.arraycopy(r8, r4, r8, r1, r0)
            int[] r0 = r3.A01
            X.AbstractC0903AHf.A03(r0, r0, r1, r4, r7)
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BDh.A0H(X.BDs):void");
    }

    public static final boolean A0I(BDs bDs) {
        BDr bDr = A07;
        long j = A00;
        if (bDr.A01 > 0) {
            j = bDr.A04[0];
        }
        AN8 an8 = null;
        AN8 an8AFh = null;
        int i = 0;
        for (AN8 an8AFh2 = bDs.AFh(); an8AFh2 != null; an8AFh2 = an8AFh2.A01) {
            long j2 = an8AFh2.A00;
            if (j2 != 0) {
                if (C7384Etj.A01(j2, j) >= 0) {
                    i++;
                } else if (an8 == null) {
                    i++;
                    an8 = an8AFh2;
                } else {
                    AN8 an82 = an8AFh2;
                    if (C7384Etj.A01(an8AFh2.A00, an8.A00) < 0) {
                        an82 = an8;
                        an8 = an8AFh2;
                    }
                    if (an8AFh == null) {
                        an8AFh = bDs.AFh();
                        AN8 an83 = an8AFh;
                        while (true) {
                            if (an8AFh == null) {
                                an8AFh = an83;
                                break;
                            }
                            if (C7384Etj.A01(an8AFh.A00, j) >= 0) {
                                break;
                            }
                            if (C7384Etj.A01(an83.A00, an8AFh.A00) < 0) {
                                an83 = an8AFh;
                            }
                            an8AFh = an8AFh.A01;
                        }
                    }
                    an8.A00 = 0L;
                    an8.A03(an8AFh);
                    an8 = an82;
                }
            }
        }
        return i > 1;
    }
}
