package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AGH extends AIW {
    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<TK;+TV;>;TK;)TV; */
    public static final Object A00(Object obj, Map map) {
        C7384Etj.A0Y(map, 0);
        return AbstractC2258BHp.A0L(obj, map);
    }

    public static final <K, V> Map<K, V> A02(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C7384Etj.A0Y(map, 0);
        C7384Etj.A0Y(map2, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> A05(HxE<? extends K, ? extends V>... hxEArr) {
        C7384Etj.A0Y(hxEArr, 0);
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(hxEArr.length));
        A0G(linkedHashMapA15, hxEArr);
        return linkedHashMapA15;
    }

    public static final <K, V> Map<K, V> A06(Iterable<? extends HxE<? extends K, ? extends V>> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            A0F(iterable, linkedHashMap);
            return A0B(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C9jH.A00;
        }
        if (size == 1) {
            return AIW.A0J((HxE) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AIW.A0H(collection.size()));
        A0F(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;TK;)Ljava/util/Map<TK;TV;>; */
    public static final Map A09(Object obj, Map map) {
        C7384Etj.A0Y(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return A0B(linkedHashMap);
    }

    public static final <K, V> Map<K, V> A0A(Map<? extends K, ? extends V> map) {
        C7384Etj.A0Y(map, 0);
        int size = map.size();
        if (size == 0) {
            return C9jH.A00;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        return Collections.singletonMap(next.getKey(), next.getValue());
    }

    public static final <K, V> Map<K, V> A0C(Map<? extends K, ? extends V> map, HxE<? extends K, ? extends V> hxE) {
        C7384Etj.A0Y(map, 0);
        if (map.isEmpty()) {
            return AIW.A0J(hxE);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(hxE.first, hxE.second);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> A0D(HxE<? extends K, ? extends V>... hxEArr) {
        C7384Etj.A0Y(hxEArr, 0);
        int length = hxEArr.length;
        if (length <= 0) {
            return C9jH.A00;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(length));
        A0G(linkedHashMap, hxEArr);
        return linkedHashMap;
    }

    public static final <K, V> void A0G(Map<? super K, ? super V> map, HxE<? extends K, ? extends V>[] hxEArr) {
        for (HxE<? extends K, ? extends V> hxE : hxEArr) {
            map.put((Object) hxE.first, (Object) hxE.second);
        }
    }

    public static final <K, V> HashMap<K, V> A01(HxE<? extends K, ? extends V>... hxEArr) {
        HashMap<K, V> map = new HashMap<>(AIW.A0H(2231));
        A0G(map, hxEArr);
        return map;
    }

    public static final <K, V> Map<K, V> A0E() {
        return C9jH.A00;
    }

    public static LinkedHashMap A03(Map map, G0U g0u) {
        return A02(map, ANE.A00(g0u));
    }

    public static LinkedHashMap A04(Map map, G0V g0v) {
        return A02(map, ANE.A01(g0v));
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;Ljava/lang/Iterable<+TK;>;)Ljava/util/Map<TK;TV;>; */
    public static final Map A07(Iterable iterable, Map map) {
        AnonymousClass003.A0u(map, iterable);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        AbstractC0882AGj.A0s(iterable, linkedHashMap.keySet());
        return A0B(linkedHashMap);
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;Ljava/lang/Iterable<+LX/HxE<+TK;+TV;>;>;)Ljava/util/Map<TK;TV;>; */
    public static final Map A08(Iterable iterable, Map map) {
        AnonymousClass003.A0u(map, iterable);
        if (map.isEmpty()) {
            return A06(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        A0F(iterable, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> A0B(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return C9jH.A00;
        }
        if (size != 1) {
            return map;
        }
        Map.Entry entryA0l = C3cH.A0l(AnonymousClass002.A0n(map));
        return Collections.singletonMap(entryA0l.getKey(), entryA0l.getValue());
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<-TK;-TV;>;Ljava/lang/Iterable<+LX/HxE<+TK;+TV;>;>;)V */
    public static final void A0F(Iterable iterable, Map map) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            HxE hxE = (HxE) it.next();
            map.put(hxE.first, hxE.second);
        }
    }
}
