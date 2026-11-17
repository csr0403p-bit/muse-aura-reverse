package X;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* renamed from: X.DNb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4999DNb<E> extends DNB<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public final Comparator<? super E> comparator() {
        return ((SortedSet) this.A01).comparator();
    }

    @Override // java.util.SortedSet
    public final E first() {
        Iterator<E> it = this.A01.iterator();
        Predicate<? super E> predicate = this.A00;
        it.getClass();
        predicate.getClass();
        while (it.hasNext()) {
            E next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw C8j3.A1D();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(E toElement) {
        return new C4999DNb(this.A00, ((SortedSet) this.A01).headSet(toElement));
    }

    @Override // java.util.SortedSet
    public final E last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.A01;
        while (true) {
            E e = (Object) sortedSetHeadSet.last();
            if (this.A00.apply(e)) {
                return e;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(e);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(E fromElement, E toElement) {
        return new C4999DNb(this.A00, ((SortedSet) this.A01).subSet(fromElement, toElement));
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(E fromElement) {
        return new C4999DNb(this.A00, ((SortedSet) this.A01).tailSet(fromElement));
    }
}
