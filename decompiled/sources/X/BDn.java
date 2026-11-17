package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BDn extends Snapshot {
    public int A00;
    public final G0U<Object, Unit> A01;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0G() {
        if (super.A01) {
            return;
        }
        A0I();
        super.A0G();
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/AI7;LX/G0U<Ljava/lang/Object;Lkotlin/Unit;>;)V */
    public BDn(AI7 ai7, G0U g0u, long j) {
        super(ai7, j);
        this.A01 = g0u;
        this.A00 = 1;
    }
}
