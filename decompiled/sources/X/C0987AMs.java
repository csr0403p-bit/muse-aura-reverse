package X;

/* renamed from: X.AMs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0987AMs<K, V> extends AN8 {
    public int A00;
    public AK8<K, ? extends V> A01;

    @Override // X.AN8
    public final AN8 A02(long j) {
        AK8<K, ? extends V> ak8 = this.A01;
        C0987AMs c0987AMs = new C0987AMs();
        ((AN8) c0987AMs).A00 = j;
        c0987AMs.A01 = ak8;
        return c0987AMs;
    }

    @Override // X.AN8
    public final void A03(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        C0987AMs c0987AMs = (C0987AMs) an8;
        synchronized (AbstractC0991AMw.A00) {
            this.A01 = c0987AMs.A01;
            this.A00 = c0987AMs.A00;
        }
    }
}
