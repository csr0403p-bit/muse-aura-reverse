package X;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class DQ0<E> extends DPZ implements NavigableSet<E>, SortedSet {
    public final DQ1<E> A00;

    @Override // java.util.NavigableSet
    public final E ceiling(E e) {
        DPD dpdABd = this.A00.Agk(BoundType.CLOSED, e).ABd();
        if (dpdABd == null) {
            return null;
        }
        return (E) dpdABd.A01();
    }

    @Override // java.util.SortedSet
    public final Comparator<? super E> comparator() {
        return this.A00.comparator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> descendingSet() {
        return new DQ0(this.A00.A8u());
    }

    @Override // java.util.SortedSet
    public final E first() {
        DPD dpdABd = this.A00.ABd();
        if (dpdABd != null) {
            return (E) dpdABd.A01();
        }
        throw C8j3.A1D();
    }

    @Override // java.util.NavigableSet
    public final E floor(E e) {
        DPD dpdAPT = this.A00.ANM(BoundType.CLOSED, e).APT();
        if (dpdAPT == null) {
            return null;
        }
        return (E) dpdAPT.A01();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet<E> headSet(E toElement) {
        return this.A00.ANM(BoundType.OPEN, toElement).A9t();
    }

    @Override // java.util.NavigableSet
    public final E higher(E e) {
        DPD dpdABd = this.A00.Agk(BoundType.OPEN, e).ABd();
        if (dpdABd == null) {
            return null;
        }
        return (E) dpdABd.A01();
    }

    @Override // X.DPZ, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new F4E(this.A00.entrySet().iterator(), 2);
    }

    @Override // java.util.SortedSet
    public final E last() {
        DPD dpdAPT = this.A00.APT();
        if (dpdAPT != null) {
            return (E) dpdAPT.A01();
        }
        throw C8j3.A1D();
    }

    @Override // java.util.NavigableSet
    public final E lower(E e) {
        DPD dpdAPT = this.A00.ANM(BoundType.OPEN, e).APT();
        if (dpdAPT == null) {
            return null;
        }
        return (E) dpdAPT.A01();
    }

    @Override // java.util.NavigableSet
    public final E pollFirst() {
        DPD dpdAY1 = this.A00.AY1();
        if (dpdAY1 == null) {
            return null;
        }
        return (E) dpdAY1.A01();
    }

    @Override // java.util.NavigableSet
    public final E pollLast() {
        DPD dpdAY2 = this.A00.AY2();
        if (dpdAY2 == null) {
            return null;
        }
        return (E) dpdAY2.A01();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet<E> subSet(E fromElement, E toElement) {
        return this.A00.AgY(BoundType.CLOSED, BoundType.OPEN, fromElement, toElement).A9t();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet<E> tailSet(E fromElement) {
        return this.A00.Agk(BoundType.CLOSED, fromElement).A9t();
    }

    public DQ0(DQ1<E> multiset) {
        this.A00 = multiset;
    }

    @Override // java.util.NavigableSet
    public final Iterator<E> descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> headSet(E toElement, boolean inclusive) {
        BoundType boundType;
        DQ1<E> dq1 = this.A00;
        if (inclusive) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        return new DQ0(dq1.ANM(boundType, toElement));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        BoundType boundType;
        BoundType boundType2;
        DQ1<E> dq1 = this.A00;
        if (fromInclusive) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        if (toInclusive) {
            boundType2 = BoundType.CLOSED;
        } else {
            boundType2 = BoundType.OPEN;
        }
        return new DQ0(dq1.AgY(boundType, boundType2, fromElement, toElement));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        BoundType boundType;
        DQ1<E> dq1 = this.A00;
        if (inclusive) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        return new DQ0(dq1.Agk(boundType, fromElement));
    }
}
