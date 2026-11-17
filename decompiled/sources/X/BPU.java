package X;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes4.dex */
public final class BPU implements C78g {
    public final /* synthetic */ C1BO A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ Set A03;

    public BPU(C1BO c1bo, Object obj, Set set, Set set2) {
        this.A03 = set;
        this.A01 = obj;
        this.A02 = set2;
        this.A00 = c1bo;
    }

    @Override // X.C78g
    public final void dispose() {
        Set set = this.A03;
        Object obj = this.A01;
        boolean zRemove = set.remove(obj);
        if (this.A02.contains(obj) || !zRemove) {
            return;
        }
        List list = (List) this.A00.getValue();
        if (!(list instanceof RandomAccess)) {
            Iterator it = AbstractC0878AGe.A0V(list).iterator();
            while (it.hasNext()) {
                ((BQw) it.next()).onPop.invoke(obj);
            }
            return;
        }
        int iA00 = C60O.A00(list);
        if (iA00 < 0) {
            return;
        }
        while (true) {
            int i = iA00 - 1;
            ((BQw) list.get(iA00)).onPop.invoke(obj);
            if (i < 0) {
                return;
            } else {
                iA00 = i;
            }
        }
    }
}
