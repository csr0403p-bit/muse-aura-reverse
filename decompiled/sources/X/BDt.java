package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* loaded from: classes4.dex */
public final class BDt extends AnonymousClass776 {
    public final Snapshot A00;

    @Override // X.AnonymousClass776
    public final void A00() throws SnapshotApplyConflictException {
        Snapshot snapshot = this.A00;
        snapshot.A0G();
        throw new SnapshotApplyConflictException(snapshot);
    }

    public BDt(Snapshot snapshot) {
        this.A00 = snapshot;
    }
}
