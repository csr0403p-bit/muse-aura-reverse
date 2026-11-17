package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes4.dex */
public final class BPV implements C78g {
    public final /* synthetic */ C1BO A00;
    public final /* synthetic */ C1BO A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ Set A03;
    public final /* synthetic */ Set A04;

    public BPV(C1BO c1bo, C1BO c1bo2, Object obj, Set set, Set set2) {
        this.A02 = obj;
        this.A03 = set;
        this.A04 = set2;
        this.A01 = c1bo;
        this.A00 = c1bo2;
    }

    @Override // X.C78g
    public final void dispose() {
        ArrayList arrayListA0i;
        List list = (List) this.A01.getValue();
        if (list instanceof RandomAccess) {
            arrayListA0i = C60Q.A0t(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayListA0i.add(((BRL) list.get(i)).A00);
            }
        } else {
            arrayListA0i = AnonymousClass003.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(((BRL) it.next()).A00);
            }
        }
        Object obj = this.A02;
        if (arrayListA0i.contains(obj) || !this.A03.remove(obj) || this.A04.contains(obj)) {
            return;
        }
        List list2 = (List) this.A00.getValue();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it2 = AbstractC0878AGe.A0V(list2).iterator();
            while (it2.hasNext()) {
                ((BQw) it2.next()).onPop.invoke(obj);
            }
            return;
        }
        int iA00 = C60O.A00(list2);
        if (iA00 < 0) {
            return;
        }
        while (true) {
            int i2 = iA00 - 1;
            ((BQw) list2.get(iA00)).onPop.invoke(obj);
            if (i2 < 0) {
                return;
            } else {
                iA00 = i2;
            }
        }
    }
}
