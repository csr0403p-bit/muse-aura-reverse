package com.google.common.collect;

import X.AbstractC5000DNc;
import X.AbstractC7489Ext;
import X.C1D;
import X.C8j3;
import X.DNa;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public final class Sets$UnmodifiableNavigableSet<E> extends AbstractC5000DNc<E> implements NavigableSet<E>, Serializable {
    public static final long serialVersionUID = 0;
    public transient Sets$UnmodifiableNavigableSet<E> A00;
    public final NavigableSet<E> delegate;
    public final SortedSet<E> unmodifiableDelegate;

    @Override // java.util.NavigableSet
    public final E ceiling(E e) {
        return this.delegate.ceiling(e);
    }

    @Override // java.util.NavigableSet
    public final Iterator<E> descendingIterator() {
        Iterator<E> itDescendingIterator = this.delegate.descendingIterator();
        itDescendingIterator.getClass();
        return itDescendingIterator instanceof AbstractC7489Ext ? itDescendingIterator : new C1D(itDescendingIterator);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> descendingSet() {
        Sets$UnmodifiableNavigableSet<E> sets$UnmodifiableNavigableSet = this.A00;
        if (sets$UnmodifiableNavigableSet != null) {
            return sets$UnmodifiableNavigableSet;
        }
        Sets$UnmodifiableNavigableSet<E> sets$UnmodifiableNavigableSet2 = new Sets$UnmodifiableNavigableSet<>(this.delegate.descendingSet());
        this.A00 = sets$UnmodifiableNavigableSet2;
        sets$UnmodifiableNavigableSet2.A00 = this;
        return sets$UnmodifiableNavigableSet2;
    }

    @Override // java.util.NavigableSet
    public final E floor(E e) {
        return this.delegate.floor(e);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> headSet(E toElement, boolean inclusive) {
        return DNa.A01(this.delegate.headSet(toElement, inclusive));
    }

    @Override // java.util.NavigableSet
    public final E higher(E e) {
        return this.delegate.higher(e);
    }

    @Override // java.util.NavigableSet
    public final E lower(E e) {
        return this.delegate.lower(e);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return DNa.A01(this.delegate.subSet(fromElement, fromInclusive, toElement, toInclusive));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        return DNa.A01(this.delegate.tailSet(fromElement, inclusive));
    }

    public Sets$UnmodifiableNavigableSet(NavigableSet<E> delegate) {
        delegate.getClass();
        this.delegate = delegate;
        this.unmodifiableDelegate = Collections.unmodifiableSortedSet(delegate);
    }

    @Override // java.util.NavigableSet
    public final E pollFirst() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableSet
    public final E pollLast() {
        throw C8j3.A17();
    }
}
