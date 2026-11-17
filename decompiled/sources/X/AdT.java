package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes4.dex */
public final class AdT implements InterfaceC1193Adw {
    public final /* synthetic */ LazyListState A00;

    public AdT(LazyListState lazyListState) {
        this.A00 = lazyListState;
    }

    @Override // X.InterfaceC1193Adw
    public final Ac3 AcC(G0U g0u, int i) {
        LazyListState lazyListState = this.A00;
        Snapshot snapshotA03 = Snapshot.A03();
        G0U g0uA1F = C8j3.A1F(snapshotA03);
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            AFs<LazyListState, ?> aFs = LazyListState.A0Q;
            C1161Act value = lazyListState.A0K.getValue();
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
            return lazyListState.A0G.A00(BTA.A01(value, g0u, 28), i, value.A08, lazyListState.A03);
        } catch (Throwable th) {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
            throw th;
        }
    }
}
