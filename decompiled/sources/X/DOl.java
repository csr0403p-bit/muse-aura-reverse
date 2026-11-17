package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DOl<K> extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DOl(final AbstractMapBasedMultimap this$0, NavigableMap<K, Collection<V>> subMap) {
        super(this$0, subMap);
        this.A00 = this$0;
    }

    @Override // java.util.NavigableSet
    public final K ceiling(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).ceilingKey(k);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> descendingSet() {
        return new DOl(this.A00, ((NavigableMap) ((SortedMap) this.A00)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final K floor(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).floorKey(k);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> headSet(K toElement, boolean inclusive) {
        return new DOl(this.A00, ((NavigableMap) ((SortedMap) this.A00)).headMap(toElement, inclusive));
    }

    @Override // java.util.NavigableSet
    public final K higher(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).higherKey(k);
    }

    @Override // java.util.NavigableSet
    public final K lower(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).lowerKey(k);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> subSet(K fromElement, boolean fromInclusive, K toElement, boolean toInclusive) {
        return new DOl(this.A00, ((NavigableMap) ((SortedMap) this.A00)).subMap(fromElement, fromInclusive, toElement, toInclusive));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> tailSet(K fromElement, boolean inclusive) {
        return new DOl(this.A00, ((NavigableMap) ((SortedMap) this.A00)).tailMap(fromElement, inclusive));
    }

    @Override // java.util.NavigableSet
    public final Iterator<K> descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final K pollFirst() {
        return (K) BV8.A0r(iterator());
    }

    @Override // java.util.NavigableSet
    public final K pollLast() {
        return (K) BV8.A0r(descendingIterator());
    }
}
