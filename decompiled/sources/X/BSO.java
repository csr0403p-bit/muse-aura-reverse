package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BSO implements C78g {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public BSO(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    @Override // X.C78g
    public final void dispose() {
        F2N lifecycle;
        switch (this.$t) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.A00;
                Object obj = this.A02;
                snapshotStateList.remove(obj);
                ((C0995ANh) this.A01).A02.A0B(obj);
                break;
            case 1:
                AG9 ag9 = (AG9) this.A02;
                C0918AHu<Object, AFx> c0918AHu = ag9.A01;
                Object obj2 = this.A00;
                AFx aFxA0B = c0918AHu.A0B(obj2);
                AFw aFw = (AFw) this.A01;
                if (aFxA0B == aFw) {
                    Map<Object, Map<String, List<Object>>> map = ag9.A02;
                    Map<String, List<Object>> mapAXs = aFw.A02.AXs();
                    if (!mapAXs.isEmpty()) {
                        map.put(obj2, mapAXs);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
            default:
                C1HY c1hy = (C1HY) this.A02;
                if (c1hy != null && (lifecycle = c1hy.getLifecycle()) != null) {
                    lifecycle.A05((C2Kw) this.A01);
                }
                C9nm c9nm = (C9nm) this.A00;
                c9nm.A01 = EnumC3085Bxl.ON_DESTROY.A01();
                C9nm.A00(c9nm);
                break;
        }
    }
}
