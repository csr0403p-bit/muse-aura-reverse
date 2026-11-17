package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DOj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5015DOj<K, V> extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5015DOj(final AbstractMapBasedMultimap this$0, NavigableMap<K, Collection<V>> submap) {
        super(this$0, submap);
        this.A00 = this$0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> ceilingEntry(K key) {
        Map.Entry<K, Collection<V>> entryCeilingEntry = ((NavigableMap) ((SortedMap) this.A00)).ceilingEntry(key);
        if (entryCeilingEntry == null) {
            return null;
        }
        return A01(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).ceilingKey(k);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> descendingMap() {
        return new C5015DOj(this.A00, ((NavigableMap) ((SortedMap) this.A00)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> firstEntry() {
        Map.Entry<K, Collection<V>> entryFirstEntry = ((NavigableMap) ((SortedMap) this.A00)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return A01(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> floorEntry(K key) {
        Map.Entry<K, Collection<V>> entryFloorEntry = ((NavigableMap) ((SortedMap) this.A00)).floorEntry(key);
        if (entryFloorEntry == null) {
            return null;
        }
        return A01(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).floorKey(k);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> headMap(K toKey, boolean inclusive) {
        return new C5015DOj(this.A00, ((NavigableMap) ((SortedMap) this.A00)).headMap(toKey, inclusive));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> higherEntry(K key) {
        Map.Entry<K, Collection<V>> entryHigherEntry = ((NavigableMap) ((SortedMap) this.A00)).higherEntry(key);
        if (entryHigherEntry == null) {
            return null;
        }
        return A01(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).higherKey(k);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> lastEntry() {
        Map.Entry<K, Collection<V>> entryLastEntry = ((NavigableMap) ((SortedMap) this.A00)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return A01(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> lowerEntry(K key) {
        Map.Entry<K, Collection<V>> entryLowerEntry = ((NavigableMap) ((SortedMap) this.A00)).lowerEntry(key);
        if (entryLowerEntry == null) {
            return null;
        }
        return A01(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k) {
        return (K) ((NavigableMap) ((SortedMap) this.A00)).lowerKey(k);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        return new C5015DOj(this.A00, ((NavigableMap) ((SortedMap) this.A00)).subMap(fromKey, fromInclusive, toKey, toInclusive));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> tailMap(K fromKey, boolean inclusive) {
        return new C5015DOj(this.A00, ((NavigableMap) ((SortedMap) this.A00)).tailMap(fromKey, inclusive));
    }

    private final Map.Entry<K, Collection<V>> A00(Iterator<Map.Entry<K, Collection<V>>> entryIterator) {
        if (!entryIterator.hasNext()) {
            return null;
        }
        Map.Entry entryA0l = C3cH.A0l(entryIterator);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        Collection<V> collectionA00 = abstractMapBasedMultimap.A00();
        collectionA00.addAll((Collection) entryA0l.getValue());
        entryIterator.remove();
        return new ImmutableEntry(entryA0l.getKey(), abstractMapBasedMultimap.A03(collectionA00));
    }

    public final /* bridge */ /* synthetic */ SortedSet A02() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.SortedMap, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> pollFirstEntry() {
        return A00(C3cG.A0i(this));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> pollLastEntry() {
        return A00(descendingMap().entrySet().iterator());
    }
}
