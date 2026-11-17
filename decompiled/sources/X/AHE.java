package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public abstract class AHE<E> extends AH7<E> implements InterfaceC0900AHc<E> {
    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.AH7, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // X.InterfaceC0900AHc
    public InterfaceC0900AHc<E> A3L(Collection<? extends E> collection) {
        AHV ahvA5a = A5a();
        ahvA5a.addAll(collection);
        return ahvA5a.A0U();
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return AnonymousClass002.A1P(indexOf(obj), -1);
    }

    @Override // X.AH7, X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return listIterator();
    }
}
