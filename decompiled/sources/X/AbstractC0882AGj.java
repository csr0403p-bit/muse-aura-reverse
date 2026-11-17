package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: X.AGj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0882AGj extends AbstractC06907md {
    public static final <T> T A0q(List<T> list) {
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C60O.A00(list));
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/util/Collection<-TT;>;Ljava/lang/Iterable<+TT;>;)Z */
    public static final void A0r(Iterable iterable, Collection collection) {
        C7384Etj.A0Y(collection, 0);
        C7384Etj.A0Y(iterable, 1);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Iterable<+TT;>;LX/G0U<-TT;Ljava/lang/Boolean;>;)Z */
    public static final void A0t(Iterable iterable, G0U g0u) {
        C7384Etj.A0Y(iterable, 0);
        C7384Etj.A0Y(g0u, 1);
        A0u(iterable, g0u, true);
    }

    public static final <T> boolean A0v(List<T> list, G0U<? super T, Boolean> g0u) {
        C7384Etj.A0Y(list, 0);
        C7384Etj.A0Y(g0u, 1);
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof BOA) || (list instanceof InterfaceC0883AGk)) {
                return A0u(list, g0u, true);
            }
            C0862A6j.A03(list, "kotlin.collections.MutableIterable");
            throw F60.createAndThrow();
        }
        int size = list.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                T t = list.get(i2);
                if (!g0u.invoke(t).booleanValue()) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int size2 = list.size() - 1;
        if (i <= size2) {
            while (true) {
                list.remove(size2);
                if (size2 == i) {
                    break;
                }
                size2--;
            }
        }
        return true;
    }

    public static final <T> T A0p(List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/util/Collection<-TT;>;Ljava/lang/Iterable<+TT;>;)Z */
    public static final void A0s(Iterable iterable, Collection collection) {
        AnonymousClass003.A0u(collection, iterable);
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC0878AGe.A0X(iterable);
        }
        collection.removeAll((Collection) iterable);
    }

    public static final <T> boolean A0u(Iterable<? extends T> iterable, G0U<? super T, Boolean> g0u, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (g0u.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
