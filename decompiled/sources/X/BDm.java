package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BDm extends Snapshot {
    public final Snapshot A00;
    public final G0U<Object, Unit> A01;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ G0U A0D() {
        return this.A01;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0G() {
        if (super.A01) {
            return;
        }
        long jA09 = A09();
        Snapshot snapshot = this.A00;
        if (jA09 != snapshot.A09()) {
            A0L();
        }
        snapshot.A0I();
        super.A0G();
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/AI7;LX/G0U<Ljava/lang/Object;Lkotlin/Unit;>;Landroidx/compose/runtime/snapshots/Snapshot;)V */
    public BDm(Snapshot snapshot, AI7 ai7, G0U g0u, long j) {
        super(ai7, j);
        this.A01 = g0u;
        this.A00 = snapshot;
        snapshot.A0H();
    }
}
