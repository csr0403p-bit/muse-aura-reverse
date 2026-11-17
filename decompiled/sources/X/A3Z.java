package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class A3Z {
    public static final <T, K> Map<K, Integer> A00(A3Y<T, ? extends K> a3y) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator<T> itSourceIterator = a3y.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = a3y.keyOf(itSourceIterator.next());
            Object f1e = linkedHashMapA0j.get(kKeyOf);
            if (f1e == null && !linkedHashMapA0j.containsKey(kKeyOf)) {
                f1e = new F1E();
            }
            F1E f1e2 = (F1E) f1e;
            f1e2.element++;
            linkedHashMapA0j.put(kKeyOf, f1e2);
        }
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0i.next();
            C7384Etj.A0Z(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            if ((entry instanceof BOA) && !(entry instanceof A3a)) {
                C0862A6j.A03(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw F60.createAndThrow();
            }
            entry.setValue(Integer.valueOf(((F1E) entry.getValue()).element));
        }
        return C0862A6j.A01(linkedHashMapA0j);
    }
}
