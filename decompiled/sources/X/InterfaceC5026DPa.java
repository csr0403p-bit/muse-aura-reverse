package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.DPa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5026DPa<E> extends Collection<E> {
    int A7Q(Object element);

    Set<E> A9t();

    int AaU(Object element, int occurrences);

    boolean AdC(E element, int oldCount, int newCount);

    @Override // java.util.Collection
    boolean add(E element);

    @Override // java.util.Collection
    boolean contains(Object element);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> elements);

    Set entrySet();

    @Override // java.util.Collection
    boolean remove(Object element);

    @Override // java.util.Collection
    int size();
}
