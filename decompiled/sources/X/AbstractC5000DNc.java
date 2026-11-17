package X;

import com.google.common.collect.Sets$UnmodifiableNavigableSet;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: X.DNc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5000DNc<E> extends AbstractC5001DNd<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public final Comparator<? super E> comparator() {
        return ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate.comparator();
    }

    @Override // java.util.SortedSet
    public final E first() {
        return ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate.first();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(E toElement) {
        return ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate.headSet(toElement);
    }

    @Override // java.util.SortedSet
    public final E last() {
        return ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate.last();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(E fromElement, E toElement) {
        return ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate.subSet(fromElement, toElement);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(E fromElement) {
        return ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate.tailSet(fromElement);
    }
}
