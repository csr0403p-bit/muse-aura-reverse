package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class FFO {
    public final void A01() {
        C7782FEm c7782FEmA01;
        C7782FEm c7782FEmA012;
        if (!(this instanceof FR6)) {
            RecyclerView recyclerView = ((C8096FTc) this).A00;
            recyclerView.A12(null);
            recyclerView.A13.A0C = true;
            recyclerView.A14(true);
            if (recyclerView.A0B.A04.size() <= 0) {
                recyclerView.requestLayout();
                return;
            }
            return;
        }
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager = ((FR6) this).A00;
        List<Integer> list = stickyItemsLinearLayoutManager.A05;
        list.clear();
        Map<Integer, Integer> map = stickyItemsLinearLayoutManager.A09;
        map.clear();
        List<Integer> list2 = stickyItemsLinearLayoutManager.A04;
        list2.clear();
        Map<Integer, Integer> map2 = stickyItemsLinearLayoutManager.A08;
        map2.clear();
        FFL<?> ffl = stickyItemsLinearLayoutManager.A02;
        int size = ffl != null ? ffl.A03.size() : 0;
        int i = ((LinearLayoutManager) stickyItemsLinearLayoutManager).A01 == 1 ? ((FTN) stickyItemsLinearLayoutManager).A00 : ((FTN) stickyItemsLinearLayoutManager).A03;
        List<FR7> list3 = stickyItemsLinearLayoutManager.A07;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list3);
        Iterator<FR7> it = list3.iterator();
        while (it.hasNext()) {
            C60Q.A1P(arrayListA0m, it.next().A00);
        }
        Set setA0f = AbstractC0878AGe.A0f(arrayListA0m);
        List<FR7> list4 = stickyItemsLinearLayoutManager.A06;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list4);
        Iterator<FR7> it2 = list4.iterator();
        while (it2.hasNext()) {
            C60Q.A1P(arrayListA0m2, it2.next().A00);
        }
        Set setA0f2 = AbstractC0878AGe.A0f(arrayListA0m2);
        for (int i2 = 0; i2 < size; i2++) {
            FFL<?> ffl2 = stickyItemsLinearLayoutManager.A02;
            if (ffl2 == null || (c7782FEmA012 = FFL.A01(ffl2, i2)) == null || FF8.A01(c7782FEmA012.A01) != C79.A00) {
                FFL<?> ffl3 = stickyItemsLinearLayoutManager.A02;
                if (ffl3 != null && (c7782FEmA01 = FFL.A01(ffl3, i2)) != null && FF8.A01(c7782FEmA01.A01) == C79.A01) {
                    Integer numValueOf = Integer.valueOf(i2);
                    list2.add(numValueOf);
                    BV4.A1H(numValueOf, map2, FF8.A00(stickyItemsLinearLayoutManager.A02, i2, i));
                    setA0f2.remove(numValueOf);
                }
            } else {
                Integer numValueOf2 = Integer.valueOf(i2);
                list.add(numValueOf2);
                BV4.A1H(numValueOf2, map, FF8.A00(stickyItemsLinearLayoutManager.A02, i2, i));
                setA0f.remove(numValueOf2);
            }
        }
        if (!list3.isEmpty() && !setA0f.isEmpty()) {
            StickyItemsLinearLayoutManager.A07(null, stickyItemsLinearLayoutManager);
        }
        if (list4.isEmpty() || setA0f2.isEmpty()) {
            return;
        }
        StickyItemsLinearLayoutManager.A06(null, stickyItemsLinearLayoutManager);
    }
}
