package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Eug, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7402Eug {
    public static final AtomicInteger A00 = BV4.A13(Integer.MIN_VALUE);
    public static volatile Map<Integer, List<Integer>> A01;

    public static Map<Integer, List<Integer>> A00() {
        Map<Integer, List<Integer>> map;
        Map<Integer, List<Integer>> map2 = A01;
        if (map2 != null) {
            return map2;
        }
        synchronized (C7402Eug.class) {
            Map<Integer, List<Integer>> map3 = A01;
            map = map3;
            if (map3 == null) {
                HashMap mapA0u = BV4.A0u();
                mapA0u.put(1, Collections.synchronizedList(C60O.A11(1)));
                mapA0u.put(BV4.A0X(), Collections.synchronizedList(C60O.A11(3)));
                A01(mapA0u, 3, 1);
                A01(mapA0u, 4, 1);
                A01(mapA0u, 5, 1);
                A01(mapA0u, 6, 3);
                A01(mapA0u, 7, 1);
                A01(mapA0u, 8, 1);
                A01 = mapA0u;
                map = mapA0u;
            }
        }
        return map;
    }

    public static void A01(AbstractMap abstractMap, int i, int i2) {
        abstractMap.put(Integer.valueOf(i), Collections.synchronizedList(new ArrayList(i2)));
    }
}
