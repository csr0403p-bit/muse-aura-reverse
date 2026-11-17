package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BT5 implements Ht9, G0U {
    public final int $t;
    public final int A00;
    public final Object A01;

    public BT5(Object obj, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                int i = this.A00;
                Ac4 ac4 = (Ac4) obj;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                Snapshot snapshotA03 = Snapshot.A03();
                Snapshot.A07(snapshotA03, Snapshot.A04(snapshotA03), C8j3.A1F(snapshotA03));
                int i2 = ((C1228Af6) ac4).A00;
                if (i2 == -1) {
                    i2 = 2;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    ac4.AcA(i + i3);
                }
                break;
            case 1:
                int i4 = this.A00;
                Ac4 ac42 = (Ac4) obj;
                AFs<LazyGridState, ?> aFs2 = LazyGridState.A0O;
                Snapshot snapshotA032 = Snapshot.A03();
                Snapshot.A07(snapshotA032, Snapshot.A04(snapshotA032), C8j3.A1F(snapshotA032));
                int i5 = ((C1228Af6) ac42).A00;
                if (i5 == -1) {
                    i5 = 2;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    ac42.AcA(i4 + i6);
                }
                break;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.A00, (Collection) this.A01));
        }
        return Unit.INSTANCE;
    }
}
