package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BDk extends BDi {
    public G0U<Object, Unit> A00;
    public G0U<Object, Unit> A01;
    public final long A02;
    public final BDi A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final void A0G() {
        BDi bDi;
        ((Snapshot) this).A01 = true;
        if (!this.A05 || (bDi = this.A03) == null) {
            return;
        }
        bDi.A0G();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BDk(BDi bDi, G0U<Object, Unit> g0u, G0U<Object, Unit> g0u2, boolean z, boolean z2) {
        G0U<Object, Unit> g0uA0D;
        C2254BDx<Snapshot> c2254BDx = BDh.A05;
        AI7 ai7 = AI7.A04;
        G0U<Object, Unit> g0uA0C = BDh.A0C(g0u, (bDi == null || (g0uA0D = bDi.A0D()) == null) ? BDh.A06.A0D() : g0uA0D, z);
        G0U<Object, Unit> g0uA0E = (bDi == null || (g0uA0E = bDi.A0E()) == null) ? BDh.A06.A0E() : g0uA0E;
        super(ai7, g0uA0C, g0u2 != null ? (g0uA0E == null || g0u2 == g0uA0E) ? g0u2 : new BT9(g0u2, g0uA0E, (G0U<Object, Unit>) 19) : g0uA0E, 0L);
        this.A03 = bDi;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = this.A07;
        this.A01 = this.A08;
        this.A02 = Thread.currentThread().getId();
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final int A08() {
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return snapshot.A08();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final long A09() {
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return snapshot.A09();
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot A0B(G0U<Object, Unit> g0u) {
        G0U<Object, Unit> g0uA0C = BDh.A0C(g0u, this.A00, true);
        boolean z = this.A04;
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return !z ? BDh.A01(snapshot.A0B(null), g0uA0C, true) : snapshot.A0B(g0uA0C);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final AI7 A0C() {
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return snapshot.A0C();
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ G0U A0D() {
        return this.A00;
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final G0U<Object, Unit> A0E() {
        return this.A01;
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final void A0J() {
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        snapshot.A0J();
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final void A0M(int i) {
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        snapshot.A0M(i);
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final void A0P(BDs bDs) {
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        snapshot.A0P(bDs);
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final boolean A0Q() {
        Snapshot snapshot = this.A03;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return snapshot.A0Q();
    }

    @Override // X.BDi
    public final C0917AHt<BDs> A0R() {
        BDi bDi = this.A03;
        if (bDi == null) {
            bDi = BDh.A06;
        }
        return bDi.A0R();
    }

    @Override // X.BDi
    public final BDi A0S(G0U<Object, Unit> g0u, G0U<Object, Unit> g0u2) {
        G0U<Object, Unit> g0uA0C = BDh.A0C(g0u, this.A00, true);
        G0U<Object, Unit> g0u3 = this.A01;
        G0U<Object, Unit> bt9 = g0u2 != null ? (g0u3 == null || g0u2 == g0u3) ? g0u2 : new BT9(g0u2, g0u3, (G0U<Object, Unit>) 19) : g0u3;
        boolean z = this.A04;
        BDi bDi = this.A03;
        if (bDi == null) {
            bDi = BDh.A06;
        }
        return !z ? new BDk(bDi.A0S(null, bt9), g0uA0C, bt9, false, true) : bDi.A0S(g0uA0C, bt9);
    }

    @Override // X.BDi
    public final AnonymousClass776 A0T() {
        BDi bDi = this.A03;
        if (bDi == null) {
            bDi = BDh.A06;
        }
        return bDi.A0T();
    }

    @Override // X.BDi
    /* renamed from: A0V */
    public final G0U<Object, Unit> A0D() {
        return this.A00;
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ void A0H() {
        throw C8j3.A17();
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ void A0I() {
        throw C8j3.A17();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0N(long j) {
        throw C8j3.A17();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0O(AI7 ai7) {
        throw C8j3.A17();
    }

    @Override // X.BDi
    public final void A0Y(C0917AHt<BDs> c0917AHt) {
        throw C8j3.A17();
    }
}
