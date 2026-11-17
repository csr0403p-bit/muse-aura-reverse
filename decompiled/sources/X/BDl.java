package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BDl extends Snapshot {
    public G0U<Object, Unit> A00;
    public final long A01;
    public final Snapshot A02;
    public final boolean A03;
    public final Snapshot A04;
    public final boolean A05;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0G() {
        Snapshot snapshot;
        super.A01 = true;
        if (!this.A05 || (snapshot = this.A02) == null) {
            return;
        }
        snapshot.A0G();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BDl(Snapshot snapshot, G0U<Object, Unit> g0u, boolean z, boolean z2) {
        super(AI7.A04, 0L);
        C2254BDx<Snapshot> c2254BDx = BDh.A05;
        this.A02 = snapshot;
        this.A03 = z;
        this.A05 = z2;
        G0U<Object, Unit> g0uA0D = snapshot.A0D();
        this.A00 = BDh.A0C(g0u, g0uA0D == null ? BDh.A06.A0D() : g0uA0D, z);
        this.A01 = Thread.currentThread().getId();
        this.A04 = this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final long A09() {
        Snapshot snapshot = this.A02;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return snapshot.A09();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final AI7 A0C() {
        Snapshot snapshot = this.A02;
        if (snapshot == null) {
            snapshot = BDh.A06;
        }
        return snapshot.A0C();
    }
}
