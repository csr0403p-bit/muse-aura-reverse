package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.DNf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5002DNf<V> extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/NavigableSet<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V */
    public C5002DNf(final DNh this$0, AbstractMapBasedMultimap key, Object delegate, NavigableSet ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = key;
    }

    @Override // java.util.NavigableSet
    public final V ceiling(V v) {
        return (V) ((NavigableSet) ((SortedSet) this.A00)).ceiling(v);
    }

    @Override // java.util.NavigableSet
    public final Iterator<V> descendingIterator() {
        return new C5004DNi(this, ((NavigableSet) ((SortedSet) this.A00)).descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<V> descendingSet() {
        NavigableSet navigableSetDescendingSet = ((NavigableSet) ((SortedSet) this.A00)).descendingSet();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return new C5002DNf(dNh, abstractMapBasedMultimap, k, navigableSetDescendingSet);
    }

    @Override // java.util.NavigableSet
    public final V floor(V v) {
        return (V) ((NavigableSet) ((SortedSet) this.A00)).floor(v);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<V> headSet(V toElement, boolean inclusive) {
        NavigableSet navigableSetHeadSet = ((NavigableSet) ((SortedSet) this.A00)).headSet(toElement, inclusive);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return new C5002DNf(dNh, abstractMapBasedMultimap, k, navigableSetHeadSet);
    }

    @Override // java.util.NavigableSet
    public final V higher(V v) {
        return (V) ((NavigableSet) ((SortedSet) this.A00)).higher(v);
    }

    @Override // java.util.NavigableSet
    public final V lower(V v) {
        return (V) ((NavigableSet) ((SortedSet) this.A00)).lower(v);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<V> subSet(V fromElement, boolean fromInclusive, V toElement, boolean toInclusive) {
        NavigableSet navigableSetSubSet = ((NavigableSet) ((SortedSet) this.A00)).subSet(fromElement, fromInclusive, toElement, toInclusive);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return new C5002DNf(dNh, abstractMapBasedMultimap, k, navigableSetSubSet);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<V> tailSet(V fromElement, boolean inclusive) {
        NavigableSet navigableSetTailSet = ((NavigableSet) ((SortedSet) this.A00)).tailSet(fromElement, inclusive);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return new C5002DNf(dNh, abstractMapBasedMultimap, k, navigableSetTailSet);
    }

    @Override // java.util.NavigableSet
    public final V pollFirst() {
        return (V) BV8.A0r(iterator());
    }

    @Override // java.util.NavigableSet
    public final V pollLast() {
        return (V) BV8.A0r(descendingIterator());
    }
}
