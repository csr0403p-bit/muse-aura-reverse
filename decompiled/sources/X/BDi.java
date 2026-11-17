package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public class BDi extends Snapshot {
    public static final int[] A09 = new int[0];
    public AI7 A00;
    public boolean A01;
    public int[] A02;
    public int A03;
    public int A04;
    public C0917AHt<BDs> A05;
    public List<? extends BDs> A06;
    public final G0U<Object, Unit> A07;
    public final G0U<Object, Unit> A08;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot A0B(G0U<Object, Unit> g0u) {
        BDm bDm;
        if (super.A01) {
            throw C60O.A0i("Cannot use a disposed snapshot");
        }
        if (this.A01 && super.A00 < 0) {
            AK7.A00("Unsupported operation on a disposed or applied snapshot");
            throw F60.createAndThrow();
        }
        long jA09 = A09();
        A0X(A09());
        Object obj = BDh.A08;
        synchronized (obj) {
            long j = BDh.A00;
            BDh.A00 = j + 1;
            BDh.A01 = BDh.A01.A02(j);
            AI7 ai7A0C = A0C();
            for (long j2 = jA09 + 1; C7384Etj.A01(j2, j) < 0; j2++) {
                ai7A0C = ai7A0C.A02(j2);
            }
            bDm = new BDm(this, ai7A0C, BDh.A0C(g0u, A0D(), true), j);
        }
        if (!this.A01 && !super.A01) {
            long jA092 = A09();
            synchronized (obj) {
                long j3 = BDh.A00;
                BDh.A00 = j3 + 1;
                A0N(j3);
                BDh.A01 = BDh.A01.A02(A09());
            }
            AI7 ai7A0C2 = A0C();
            long jA093 = A09();
            for (long j4 = jA092 + 1; C7384Etj.A01(j4, jA093) < 0; j4++) {
                ai7A0C2 = ai7A0C2.A02(j4);
            }
            A0O(ai7A0C2);
        }
        return bDm;
    }

    public BDi A0S(G0U<Object, Unit> g0u, G0U<Object, Unit> g0u2) {
        BDj bDj;
        if (super.A01) {
            throw C60O.A0i("Cannot use a disposed snapshot");
        }
        if (this.A01 && super.A00 < 0) {
            AK7.A00("Unsupported operation on a disposed or applied snapshot");
            throw F60.createAndThrow();
        }
        A0X(A09());
        Object obj = BDh.A08;
        synchronized (obj) {
            long j = BDh.A00;
            BDh.A00 = j + 1;
            BDh.A01 = BDh.A01.A02(j);
            AI7 ai7A0C = A0C();
            A0O(ai7A0C.A02(j));
            long jA09 = A09();
            while (true) {
                jA09++;
                if (C7384Etj.A01(jA09, j) >= 0) {
                    break;
                }
                ai7A0C = ai7A0C.A02(jA09);
            }
            G0U<Object, Unit> g0uA0C = BDh.A0C(g0u, A0D(), true);
            G0U<Object, Unit> g0uA0E = A0E();
            bDj = new BDj(this, ai7A0C, g0uA0C, g0u2 != null ? (g0uA0E == null || g0u2 == g0uA0E) ? g0u2 : new BT9(g0u2, g0uA0E, (G0U<Object, Unit>) 19) : g0uA0E, j);
        }
        if (!this.A01 && !super.A01) {
            long jA092 = A09();
            synchronized (obj) {
                long j2 = BDh.A00;
                BDh.A00 = j2 + 1;
                A0N(j2);
                BDh.A01 = BDh.A01.A02(A09());
            }
            AI7 ai7A0C2 = A0C();
            long jA093 = A09();
            for (long j3 = jA092 + 1; C7384Etj.A01(j3, jA093) < 0; j3++) {
                ai7A0C2 = ai7A0C2.A02(j3);
            }
            A0O(ai7A0C2);
        }
        return bDj;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int A08() {
        return this.A04;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public G0U<Object, Unit> A0E() {
        return this.A08;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0F() {
        BDh.A01 = BDh.A01.A01(A09()).A03(this.A00);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0G() {
        if (super.A01) {
            return;
        }
        super.A0G();
        A0I();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0H() {
        this.A03++;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    @Override // androidx.compose.runtime.snapshots.Snapshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0I() {
        /*
            r16 = this;
            r10 = r16
            int r0 = r10.A03
            if (r0 <= 0) goto L87
            int r0 = r0 + (-1)
            r10.A03 = r0
            if (r0 != 0) goto L86
            boolean r0 = r10.A01
            if (r0 != 0) goto L86
            X.AHt r1 = r10.A0R()
            if (r1 == 0) goto L83
            r0 = 0
            r10.A0Y(r0)
            long r15 = r10.A09()
            java.lang.Object[] r9 = r1.A04
            long[] r8 = r1.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L83
            r6 = 0
        L28:
            r13 = r8[r6]
            r3 = -1
            long r3 = r3 ^ r13
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r13
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L7e
            int r0 = r6 - r7
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L45:
            if (r3 >= r4) goto L7c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L78
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r9[r0]
            X.BDs r0 = (X.BDs) r0
            X.AN8 r0 = r0.AFh()
        L5b:
            if (r0 == 0) goto L78
            long r1 = r0.A00
            int r11 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r11 == 0) goto L6f
            X.AI7 r11 = r10.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r1 = X.AbstractC0878AGe.A0k(r11, r1)
            if (r1 == 0) goto L75
        L6f:
            X.BDx<androidx.compose.runtime.snapshots.Snapshot> r1 = X.BDh.A05
            r1 = 0
            r0.A00 = r1
        L75:
            X.AN8 r0 = r0.A01
            goto L5b
        L78:
            long r13 = r13 >> r5
            int r3 = r3 + 1
            goto L45
        L7c:
            if (r4 != r5) goto L83
        L7e:
            if (r6 == r7) goto L83
            int r6 = r6 + 1
            goto L28
        L83:
            r10.A0L()
        L86:
            return
        L87:
            java.lang.String r0 = "no pending nested snapshots"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BDi.A0I():void");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0J() {
        if (this.A01 || super.A01) {
            return;
        }
        A0W();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0K() {
        for (int i : this.A02) {
            BDh.A0E(i);
        }
        super.A0K();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean A0Q() {
        return false;
    }

    public C0917AHt<BDs> A0R() {
        return this.A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011a A[Catch: all -> 0x0175, TryCatch #0 {, blocks: (B:9:0x0025, B:11:0x002a, B:13:0x002e, B:17:0x004c, B:39:0x00bc, B:41:0x00cf, B:44:0x00db, B:46:0x00e9, B:48:0x00f6, B:50:0x00fc, B:51:0x0106, B:55:0x0111, B:59:0x011a, B:62:0x0124, B:64:0x0132, B:66:0x013d, B:68:0x0143, B:69:0x014d, B:72:0x0155, B:73:0x0158, B:75:0x015c, B:77:0x0163, B:78:0x016f, B:18:0x0061, B:20:0x0071, B:22:0x0075), top: B:85:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c A[Catch: all -> 0x0175, TryCatch #0 {, blocks: (B:9:0x0025, B:11:0x002a, B:13:0x002e, B:17:0x004c, B:39:0x00bc, B:41:0x00cf, B:44:0x00db, B:46:0x00e9, B:48:0x00f6, B:50:0x00fc, B:51:0x0106, B:55:0x0111, B:59:0x011a, B:62:0x0124, B:64:0x0132, B:66:0x013d, B:68:0x0143, B:69:0x014d, B:72:0x0155, B:73:0x0158, B:75:0x015c, B:77:0x0163, B:78:0x016f, B:18:0x0061, B:20:0x0071, B:22:0x0075), top: B:85:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AnonymousClass776 A0T() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BDi.A0T():X.776");
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/AHt<LX/BDs;>;Ljava/util/Map<LX/AN8;+LX/AN8;>;LX/AI7;)LX/776; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[PHI: r2 r6
  0x00f9: PHI (r2v3 java.util.ArrayList) = (r2v2 java.util.ArrayList), (r2v7 java.util.ArrayList) binds: [B:6:0x003a, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00f9: PHI (r6v2 java.util.ArrayList) = (r6v1 java.util.ArrayList), (r6v4 java.util.ArrayList) binds: [B:6:0x003a, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AnonymousClass776 A0U(X.C0917AHt r24, X.AI7 r25, java.util.Map r26, long r27) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BDi.A0U(X.AHt, X.AI7, java.util.Map, long):X.776");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: A0V, reason: merged with bridge method [inline-methods] */
    public G0U<Object, Unit> A0D() {
        return this.A07;
    }

    public final void A0X(long j) {
        synchronized (BDh.A08) {
            this.A00 = this.A00.A02(j);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/AI7;LX/G0U<Ljava/lang/Object;Lkotlin/Unit;>;LX/G0U<Ljava/lang/Object;Lkotlin/Unit;>;)V */
    public BDi(AI7 ai7, G0U g0u, G0U g0u2, long j) {
        super(ai7, j);
        this.A07 = g0u;
        this.A08 = g0u2;
        this.A00 = AI7.A04;
        this.A02 = A09;
        this.A03 = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0P(BDs bDs) {
        C0917AHt<BDs> c0917AHtA0R = A0R();
        if (c0917AHtA0R == null) {
            C0917AHt<Object> c0917AHt = HsU.A00;
            c0917AHtA0R = new C0917AHt<>(6);
            A0Y(c0917AHtA0R);
        }
        c0917AHtA0R.A0B(bDs);
    }

    public final void A0W() {
        A0X(A09());
        if (this.A01 || super.A01) {
            return;
        }
        long jA09 = A09();
        synchronized (BDh.A08) {
            long j = BDh.A00;
            BDh.A00 = j + 1;
            A0N(j);
            BDh.A01 = BDh.A01.A02(A09());
        }
        AI7 ai7A0C = A0C();
        long jA092 = A09();
        for (long j2 = jA09 + 1; C7384Etj.A01(j2, jA092) < 0; j2++) {
            ai7A0C = ai7A0C.A02(j2);
        }
        A0O(ai7A0C);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0M(int i) {
        this.A04 = i;
    }

    public void A0Y(C0917AHt<BDs> c0917AHt) {
        this.A05 = c0917AHt;
    }
}
