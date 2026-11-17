package com.google.common.collect;

import X.AbstractC7489Ext;
import X.InterfaceC5026DPa;
import X.InterfaceC7431Evo;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public static final RegularImmutableSortedSet<Comparable> A01 = new RegularImmutableSortedSet<>(ImmutableList.of(), NaturalOrdering.A00);
    public final transient ImmutableList<E> A00;

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        if (o != null) {
            try {
                if (Collections.binarySearch(this.A00, o, this.A01) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            if (!isEmpty()) {
                Comparator<? super E> comparator = this.A01;
                if (!A04(set, comparator)) {
                    return containsAll(set);
                }
                Iterator<E> it = set.iterator();
                try {
                    AbstractC7489Ext<E> it2 = this.A00.iterator();
                    while (it2.hasNext()) {
                        E next = it2.next();
                        E next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                            return false;
                        }
                    }
                } catch (ClassCastException | NoSuchElementException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int A0C(E toElement, boolean inclusive) {
        ImmutableList<E> immutableList = this.A00;
        toElement.getClass();
        int iBinarySearch = Collections.binarySearch(immutableList, toElement, comparator());
        return iBinarySearch >= 0 ? inclusive ? iBinarySearch + 1 : iBinarySearch : iBinarySearch ^ (-1);
    }

    public final int A0D(E fromElement, boolean inclusive) {
        ImmutableList<E> immutableList = this.A00;
        fromElement.getClass();
        int iBinarySearch = Collections.binarySearch(immutableList, fromElement, comparator());
        return iBinarySearch >= 0 ? !inclusive ? iBinarySearch + 1 : iBinarySearch : iBinarySearch ^ (-1);
    }

    public final RegularImmutableSortedSet<E> A0E(int newFromIndex, int newToIndex) {
        return (newFromIndex == 0 && newToIndex == size()) ? this : newFromIndex < newToIndex ? new RegularImmutableSortedSet<>(this.A00.subList(newFromIndex, newToIndex), this.A01) : ImmutableSortedSet.A05(this.A01);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> asList() {
        return this.A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> targets) {
        if (targets instanceof InterfaceC5026DPa) {
            targets = ((InterfaceC5026DPa) targets).A9t();
        }
        if (!A04(targets, comparator()) || targets.size() <= 1) {
            return super.containsAll(targets);
        }
        AbstractC7489Ext<E> it = this.A00.iterator();
        Iterator<?> it2 = targets.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iCompare = this.A01.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        return this.A00.copyIntoArray(dst, offset);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final AbstractC7489Ext<E> iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    public RegularImmutableSortedSet(ImmutableList<E> elements, Comparator<? super E> comparator) {
        super(comparator);
        this.A00 = elements;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Comparator<*>;Ljava/lang/Iterable<*>;)Z */
    public static boolean A04(Iterable comparator, Comparator elements) {
        Comparator<? super E> comparator2;
        elements.getClass();
        comparator.getClass();
        if (comparator instanceof SortedSet) {
            comparator2 = ((SortedSet) comparator).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.A00;
            }
        } else {
            if (!(comparator instanceof InterfaceC7431Evo)) {
                return false;
            }
            comparator2 = ((InterfaceC7431Evo) comparator).comparator();
        }
        return elements.equals(comparator2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.A00.iterator();
    }
}
