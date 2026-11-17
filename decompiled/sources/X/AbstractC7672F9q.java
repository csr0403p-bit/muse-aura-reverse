package X;

import java.util.Map;

/* renamed from: X.F9q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7672F9q {
    /* JADX WARN: Incorrect types in method signature: (LX/F9X;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;LX/F9X;)LX/F9X; */
    public static final F9X A00(F9X f9x, F9X f9x2, Map map) {
        Map mapA01 = A01(f9x2.A09, f9x.A09);
        Map mapA012 = A01(f9x2.A03, f9x.A03);
        Map mapA013 = A01(f9x2.A07, f9x.A07);
        Map mapA014 = A01(f9x2.A08, f9x.A08);
        Map mapA015 = A01(f9x2.A06, f9x.A06);
        Map mapA016 = A01(f9x2.A01, f9x.A01);
        Map mapA017 = A01(f9x2.A04, f9x.A04);
        Map<String, Object> map2 = f9x.A05;
        Map<String, Object> map3 = f9x.A02;
        Aei aei = f9x.A00;
        C7384Etj.A0Y(map, 2);
        return new F9X(aei, mapA01, mapA015, map, map2, mapA017, mapA012, mapA013, mapA014, map3, mapA016);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> A01(Map<K, ? extends V> map, Map<K, ? extends V> map2) {
        return map.isEmpty() ? map2 : map2.isEmpty() ? map : AbstractC7609F5w.A0z(map, map2);
    }
}
