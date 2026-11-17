package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class Ad5 implements InterfaceC1187Adq {
    public final /* synthetic */ LazyGridState A00;

    public Ad5(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1187Adq
    public final List<Ac3> Ac9(int i) {
        ArrayList arrayListA0h = C3cG.A0h();
        LazyGridState lazyGridState = this.A00;
        Snapshot snapshotA03 = Snapshot.A03();
        G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            Ad2 value = lazyGridState.A03 ? lazyGridState.A01 : lazyGridState.A0I.getValue();
            if (value != null) {
                F1E f1e = new F1E();
                f1e.element = 1;
                List list = (List) C8j4.A0r(value.A0E, i);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    HxE hxE = (HxE) list.get(i2);
                    arrayListA0h.add(lazyGridState.A0E.A00(new BTL(list, value, f1e, 0), AnonymousClass001.A0F(hxE.first), ((Constraints) hxE.second).A00, false));
                }
            }
            return arrayListA0h;
        } finally {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
        }
    }
}
