package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class BGK extends BLW {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> A01(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        C7384Etj.A0Y(iterable, 0);
        C7384Etj.A0Y(set, 1);
        if (set instanceof Collection) {
            size = iterable.size() + set.size();
        } else {
            size = iterable.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AIW.A0H(size));
        linkedHashSet.addAll(iterable);
        AbstractC0882AGj.A0r(set, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/util/Set<+TT;>;TT;)Ljava/util/Set<TT;>; */
    public static final LinkedHashSet A02(Object obj, Set set) {
        C7384Etj.A0Y(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(AIW.A0H(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/util/Set<+TT;>;TT;)Ljava/util/Set<TT;>; */
    public static final Set A04(Object obj, Set set) {
        C7384Etj.A0Y(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(AIW.A0H(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            if (z || !C7384Etj.areEqual(obj2, obj)) {
                linkedHashSet.add(obj2);
            } else {
                z = true;
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> A03(Set<? extends T> set, Iterable<? extends T> iterable) {
        AnonymousClass003.A0u(iterable, set);
        if (!(set instanceof Collection)) {
            set = (Set<? extends T>) AbstractC0878AGe.A0X(set);
        }
        Set<? extends T> set2 = set;
        if (set2.isEmpty()) {
            return AbstractC0878AGe.A0g(iterable);
        }
        if (!(set2 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) iterable);
            linkedHashSet.removeAll(set2);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (Object obj : iterable) {
            if (!set2.contains(obj)) {
                linkedHashSetA0k.add(obj);
            }
        }
        return linkedHashSetA0k;
    }
}
