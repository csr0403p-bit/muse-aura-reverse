package X;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates$AndPredicate;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Sets$UnmodifiableNavigableSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public abstract class DNa {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A03(Set<?> s, Object object) {
        if (object == s) {
            return true;
        }
        if (s instanceof Set) {
            Set<?> set = s;
            try {
                if (object.size() == set.size()) {
                    if (object.containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> NavigableSet<E> A01(NavigableSet<E> set) {
        return ((set instanceof ImmutableCollection) || (set instanceof Sets$UnmodifiableNavigableSet)) ? set : new Sets$UnmodifiableNavigableSet(set);
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Object;>(Ljava/util/Set<TE;>;Lcom/google/common/base/Predicate<-TE;>;)Ljava/util/Set<TE;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public static Set A02(Predicate predicate, Set set) {
        Collection collection;
        if (set instanceof SortedSet) {
            Collection collection2 = (SortedSet) set;
            if (collection2 instanceof DNB) {
                DNY dny = (DNY) collection2;
                Predicate<? super E> predicate2 = dny.A00;
                predicate2.getClass();
                predicate.getClass();
                predicate = new Predicates$AndPredicate(Arrays.asList(predicate2, predicate));
                collection2 = dny.A01;
            } else {
                collection2.getClass();
                predicate.getClass();
            }
            return new C4999DNb(predicate, collection2);
        }
        if (set instanceof DNB) {
            DNY dny2 = (DNY) set;
            Predicate<? super E> predicate3 = dny2.A00;
            predicate3.getClass();
            predicate.getClass();
            predicate = new Predicates$AndPredicate(Arrays.asList(predicate3, predicate));
            collection = dny2.A01;
        } else {
            set.getClass();
            predicate.getClass();
            collection = set;
        }
        return new DNB(predicate, collection);
    }

    public static int A00(Set<?> s) {
        Iterator<?> it = s.iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A04(Set<?> set, Collection<?> collection) {
        boolean zRemove;
        set.getClass();
        if (set instanceof InterfaceC5026DPa) {
            set = ((InterfaceC5026DPa) set).A9t();
        }
        if (!(set instanceof Set) || set.size() <= collection.size()) {
            Iterator<?> it = set.iterator();
            zRemove = false;
            while (it.hasNext()) {
                zRemove |= collection.remove(it.next());
            }
        } else {
            Iterator it2 = collection.iterator();
            zRemove = false;
            while (it2.hasNext()) {
                zRemove = BV8.A1Z(it2.next(), set, it2, zRemove);
            }
        }
        return zRemove;
    }
}
