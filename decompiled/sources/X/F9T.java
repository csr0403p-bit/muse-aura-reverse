package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class F9T {
    public final F6w A00;
    public final Integer A01;
    public final List<F9S> A02;
    public final List<F97> A03;
    public final List<F96> A04;
    public final List<F8L> A05;
    public final List A06;
    public final Map<String, Object> A07;
    public final Map<String, C7616F6s> A08;
    public final Map<String, FDW> A09;

    public F9T() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public F9T(F6w f6w, Integer num, List list, List list2, List list3, List list4, List list5, Map map, Map map2, Map map3) {
        this.A06 = list == null ? Collections.EMPTY_LIST : list;
        this.A08 = map == null ? Collections.EMPTY_MAP : map;
        this.A03 = list2 == null ? Collections.EMPTY_LIST : list2;
        this.A02 = list3 == null ? Collections.EMPTY_LIST : list3;
        this.A04 = list4 == null ? Collections.EMPTY_LIST : list4;
        this.A00 = f6w;
        this.A09 = map2 == null ? Collections.EMPTY_MAP : map2;
        this.A05 = list5 == null ? Collections.EMPTY_LIST : list5;
        this.A01 = num;
        this.A07 = map3 == null ? Collections.EMPTY_MAP : map3;
    }
}
