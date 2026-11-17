package androidx.compose.runtime.snapshots;

import X.AI7;
import X.AOY;
import X.AbstractC0878AGe;
import X.BDh;
import X.BDi;
import X.BDk;
import X.BDl;
import X.BDm;
import X.BDn;
import X.BDr;
import X.BDs;
import X.C2254BDx;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import X.G0V;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class Snapshot {
    public int A00;
    public boolean A01;
    public long A02;
    public AI7 A03;

    public Snapshot A0B(G0U<Object, Unit> g0u) {
        if (this instanceof BDl) {
            BDl bDl = (BDl) this;
            G0U<Object, Unit> g0uA0C = BDh.A0C(g0u, bDl.A00, true);
            boolean z = bDl.A03;
            Snapshot snapshot = bDl.A02;
            if (snapshot == null) {
                snapshot = BDh.A06;
            }
            return !z ? BDh.A01(snapshot.A0B(null), g0uA0C, true) : snapshot.A0B(g0uA0C);
        }
        if (this instanceof BDn) {
            BDn bDn = (BDn) this;
            BDh.A0F(bDn);
            return new BDm(bDn, bDn.A0C(), BDh.A0C(g0u, bDn.A01, true), bDn.A09());
        }
        BDm bDm = (BDm) this;
        return new BDm(bDm.A00, bDm.A0C(), BDh.A0C(g0u, bDm.A01, true), bDm.A09());
    }

    public void A0G() {
        this.A01 = true;
        synchronized (BDh.A08) {
            int i = this.A00;
            if (i >= 0) {
                BDh.A0E(i);
                this.A00 = -1;
            }
        }
    }

    public static final AOY A01(final G0V<? super Set<? extends Object>, ? super Snapshot, Unit> g0v) {
        BDh.A0A(BDh.A09);
        synchronized (BDh.A08) {
            BDh.A02 = AbstractC0878AGe.A0Q(g0v, BDh.A02);
        }
        return new AOY() { // from class: X.AOv
            @Override // X.AOY
            public final void dispose() {
                G0V g0v2 = g0v;
                synchronized (BDh.A08) {
                    BDh.A02 = AbstractC0878AGe.A0b(BDh.A02, g0v2);
                }
            }
        };
    }

    public static final AOY A02(final G0U<Object, Unit> g0u) {
        synchronized (BDh.A08) {
            BDh.A03 = AbstractC0878AGe.A0Q(g0u, BDh.A03);
        }
        BDh.A0A(BDh.A09);
        return new AOY() { // from class: X.BDp
            @Override // X.AOY
            public final void dispose() {
                G0U g0u2 = g0u;
                synchronized (BDh.A08) {
                    BDh.A03 = AbstractC0878AGe.A0b(BDh.A03, g0u2);
                }
                BDh.A0A(BDh.A09);
            }
        };
    }

    public static final Snapshot A03() {
        return BDh.A05.A00();
    }

    public static final Snapshot A04(Snapshot snapshot) {
        if (snapshot instanceof BDk) {
            BDk bDk = (BDk) snapshot;
            if (bDk.A02 == Thread.currentThread().getId()) {
                bDk.A00 = null;
                return snapshot;
            }
        }
        if (snapshot instanceof BDl) {
            BDl bDl = (BDl) snapshot;
            if (bDl.A01 == Thread.currentThread().getId()) {
                bDl.A00 = null;
                return snapshot;
            }
        }
        Snapshot snapshotA01 = BDh.A01(snapshot, null, false);
        snapshotA01.A0A();
        return snapshotA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05() {
        /*
            java.lang.Object r2 = X.BDh.A08
            monitor-enter(r2)
            X.BDo r0 = X.BDh.A06     // Catch: java.lang.Throwable -> L1a
            X.AHt r0 = r0.A0R()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L10
            int r1 = r0.A01     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r1 != 0) goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)
            if (r0 == 0) goto L19
            X.G0U<X.AI7, kotlin.Unit> r0 = X.BDh.A09
            X.BDh.A0A(r0)
        L19:
            return
        L1a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.Snapshot.A05():void");
    }

    public static final void A06(Snapshot snapshot) {
        BDh.A05.A01(snapshot);
    }

    public static final void A07(Snapshot snapshot, Snapshot snapshot2, G0U<Object, Unit> g0u) {
        if (snapshot != snapshot2) {
            A06(snapshot);
            snapshot2.A0G();
        } else if (snapshot instanceof BDk) {
            ((BDk) snapshot).A00 = g0u;
        } else if (snapshot instanceof BDl) {
            ((BDl) snapshot).A00 = g0u;
        } else {
            StringBuilder sb = new StringBuilder("Non-transparent snapshot was reused: ");
            sb.append(snapshot);
            throw new IllegalStateException(sb.toString());
        }
    }

    public int A08() {
        return 0;
    }

    public long A09() {
        return this.A02;
    }

    public final Snapshot A0A() {
        C2254BDx<Snapshot> c2254BDx = BDh.A05;
        Snapshot snapshotA00 = c2254BDx.A00();
        c2254BDx.A01(this);
        return snapshotA00;
    }

    public AI7 A0C() {
        return this.A03;
    }

    public G0U<Object, Unit> A0D() {
        return this instanceof BDn ? ((BDn) this).A01 : ((BDl) this).A00;
    }

    public G0U<Object, Unit> A0E() {
        return null;
    }

    public void A0F() {
        BDh.A01 = BDh.A01.A01(A09());
    }

    public void A0H() {
        if (this instanceof BDl) {
            throw C8j3.A17();
        }
        if (!(this instanceof BDn)) {
            throw C8j3.A17();
        }
        ((BDn) this).A00++;
    }

    public void A0I() {
        if (!(this instanceof BDn)) {
            throw C8j3.A17();
        }
        BDn bDn = (BDn) this;
        int i = bDn.A00 - 1;
        bDn.A00 = i;
        if (i == 0) {
            bDn.A0L();
        }
    }

    public void A0J() {
        if (this instanceof BDl) {
            Snapshot snapshot = ((BDl) this).A02;
            if (snapshot == null) {
                snapshot = BDh.A06;
            }
            snapshot.A0J();
        }
    }

    public void A0K() {
        int i = this.A00;
        if (i >= 0) {
            BDh.A0E(i);
            this.A00 = -1;
        }
    }

    public final void A0L() {
        synchronized (BDh.A08) {
            A0F();
            A0K();
        }
    }

    public void A0M(int i) {
        throw C3cG.A0Q("Updating write count is not supported for this snapshot");
    }

    public void A0P(BDs bDs) {
        if (!(this instanceof BDl)) {
            C2254BDx<Snapshot> c2254BDx = BDh.A05;
            throw C3cG.A0Q("Cannot modify a state object in a read-only snapshot");
        }
        Snapshot snapshot = ((BDl) this).A02;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        snapshot.A0P(bDs);
    }

    public boolean A0Q() {
        if (!(this instanceof BDl)) {
            return true;
        }
        Snapshot snapshot = ((BDl) this).A02;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return snapshot.A0Q();
    }

    public Snapshot(AI7 ai7, long j) {
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        this.A03 = ai7;
        this.A02 = j;
        C2254BDx<Snapshot> c2254BDx = BDh.A05;
        if (j != 0) {
            AI7 ai7A0C = A0C();
            long[] jArr = ai7A0C.A03;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = ai7A0C.A01;
                if (j3 != 0) {
                    j2 = ai7A0C.A00;
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = ai7A0C.A02;
                    if (j4 != 0) {
                        j2 = ai7A0C.A00 + 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + iNumberOfTrailingZeros;
            }
            synchronized (BDh.A08) {
                BDr bDr = BDh.A07;
                int i2 = bDr.A01 + 1;
                long[] jArr2 = bDr.A04;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length * 2;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    System.arraycopy(jArr2, 0, jArr3, 0, length);
                    int[] iArr2 = bDr.A03;
                    System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                    bDr.A04 = jArr3;
                    bDr.A03 = iArr;
                }
                int i4 = bDr.A01;
                bDr.A01 = i4 + 1;
                int[] iArr3 = bDr.A02;
                int length2 = iArr3.length;
                if (bDr.A00 >= length2) {
                    int i5 = length2 * 2;
                    int[] iArr4 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr4[i6] = i7;
                        i6 = i7;
                    }
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    bDr.A02 = iArr4;
                    iArr3 = iArr4;
                }
                i = bDr.A00;
                bDr.A00 = iArr3[i];
                long[] jArr4 = bDr.A04;
                jArr4[i4] = j;
                bDr.A03[i4] = i;
                iArr3[i] = i4;
                while (true) {
                    int i8 = i4;
                    if (i4 <= 0) {
                        break;
                    }
                    i4 = ((i4 + 1) >> 1) - 1;
                    if (C7384Etj.A01(jArr4[i4], j) <= 0) {
                        break;
                    } else {
                        BDr.A00(bDr, i4, i8);
                    }
                }
            }
        } else {
            i = -1;
        }
        this.A00 = i;
    }

    public static final BDi A00(G0U<Object, Unit> g0u, G0U<Object, Unit> g0u2) {
        BDi bDi;
        BDi bDiA0S;
        Snapshot snapshotA00 = BDh.A00();
        if (!(snapshotA00 instanceof BDi) || (bDi = (BDi) snapshotA00) == null || (bDiA0S = bDi.A0S(g0u, g0u2)) == null) {
            throw C3cG.A0Q("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return bDiA0S;
    }

    public void A0N(long j) {
        this.A02 = j;
    }

    public void A0O(AI7 ai7) {
        this.A03 = ai7;
    }
}
