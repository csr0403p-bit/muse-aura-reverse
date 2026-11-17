package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BDo extends BDi {
    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot A0B(G0U<Object, Unit> g0u) {
        C2297BSx c2297BSx = new C2297BSx((G0U) g0u, 32);
        C2254BDx<Snapshot> c2254BDx = BDh.A05;
        return (Snapshot) BDh.A0A(new C2297BSx((G0U) c2297BSx, 33));
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final void A0G() {
        synchronized (BDh.A08) {
            int i = ((Snapshot) this).A00;
            if (i >= 0) {
                BDh.A0E(i);
                ((Snapshot) this).A00 = -1;
            }
        }
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final void A0J() {
        BDh.A0A(BDh.A09);
    }

    @Override // X.BDi
    public final BDi A0S(G0U<Object, Unit> g0u, G0U<Object, Unit> g0u2) {
        BT9 bt9 = new BT9(g0u, g0u2, (G0U<Object, Unit>) 17);
        C2254BDx<Snapshot> c2254BDx = BDh.A05;
        return (BDi) ((Snapshot) BDh.A0A(new C2297BSx((G0U) bt9, 33)));
    }

    @Override // X.BDi
    public final AnonymousClass776 A0T() {
        throw C3cG.A0Q("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ void A0H() {
        throw C8j3.A17();
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ void A0I() {
        throw C8j3.A17();
    }
}
