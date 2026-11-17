package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BzU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3143BzU {
    public final List<CA3> A03;
    public Map<String, Integer> A02 = null;
    public Map<Integer, Integer> A01 = null;
    public Map<Integer, C3144BzV> A00 = null;

    public final List<CA3> A00(int i) {
        List<CA3> list;
        Map<Integer, C3144BzV> map;
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = BV4.A0u();
                List<CA3> list2 = this.A03;
                Iterator<CA3> it = list2.iterator();
                int i2 = -1;
                int i3 = -1;
                int i4 = -1;
                while (it.hasNext()) {
                    i3++;
                    int i5 = it.next().A06;
                    if (i5 != i2) {
                        if (i2 >= 0) {
                            Map<Integer, C3144BzV> map2 = this.A00;
                            Integer numValueOf = Integer.valueOf(i2);
                            C3144BzV c3144BzV = new C3144BzV();
                            c3144BzV.A00 = i4;
                            c3144BzV.A01 = i3;
                            map2.put(numValueOf, c3144BzV);
                        }
                        i2 = i5;
                        i4 = i3;
                    }
                }
                if (i2 >= 0) {
                    Map<Integer, C3144BzV> map3 = this.A00;
                    Integer numValueOf2 = Integer.valueOf(i2);
                    int size = list2.size();
                    C3144BzV c3144BzV2 = new C3144BzV();
                    c3144BzV2.A00 = i4;
                    c3144BzV2.A01 = size;
                    map3.put(numValueOf2, c3144BzV2);
                }
            }
            list = this.A03;
            list.size();
            this.A00.size();
            map = this.A00;
        }
        C3144BzV c3144BzV3 = (C3144BzV) BV5.A0f(map, i);
        return c3144BzV3 != null ? list.subList(c3144BzV3.A00, c3144BzV3.A01) : Collections.EMPTY_LIST;
    }

    public C3143BzU(List<CA3> list) {
        this.A03 = BV5.A13(list);
    }
}
