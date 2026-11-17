package com.google.common.collect;

import X.AbstractC7489Ext;
import X.BV4;
import X.BV7;
import X.BV8;
import X.C8j3;
import X.C8j4;
import X.DOM;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes5.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    public static final ImmutableSortedMap<Comparable<?>, Object> A03;
    public static final Comparator<?> A04;
    public static final long serialVersionUID = 0;
    public transient ImmutableSortedMap<K, V> A00;
    public final transient ImmutableList<V> A01;
    public final transient RegularImmutableSortedSet<K> A02;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1EntrySet, reason: invalid class name */
    public class C1EntrySet extends ImmutableMapEntrySet<K, V> {
        public C1EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final AbstractC7489Ext<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return asList().iterator();
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> ceilingEntry(K key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> floorEntry(K key) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.A02;
        key.getClass();
        return A00(0, regularImmutableSortedSet.A0C(key, true)).lastEntry();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object toKey) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.A02;
        toKey.getClass();
        return A00(0, regularImmutableSortedSet.A0C(toKey, false));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> higherEntry(K key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lowerEntry(K key) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.A02;
        key.getClass();
        return A00(0, regularImmutableSortedSet.A0C(key, false)).lastEntry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object fromKey, Object toKey) {
        fromKey.getClass();
        toKey.getClass();
        Preconditions.checkArgument(BV7.A1R(comparator().compare(fromKey, toKey)), "expected fromKey <= toKey but %s > %s", fromKey, toKey);
        return A00(0, this.A02.A0C(toKey, false)).tailMap(fromKey, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object fromKey) {
        return tailMap(fromKey, true);
    }

    public class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        public static final long serialVersionUID = 0;
        public final Comparator<? super K> comparator;

        public SerializedForm(ImmutableSortedMap<K, V> sortedMap) {
            super(sortedMap);
            this.comparator = sortedMap.comparator();
        }
    }

    static {
        NaturalOrdering naturalOrdering = NaturalOrdering.A00;
        A04 = naturalOrdering;
        A03 = new ImmutableSortedMap<>(ImmutableList.of(), null, ImmutableSortedSet.A05(naturalOrdering));
    }

    private ImmutableSortedMap<K, V> A00(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == size()) {
            return this;
        }
        if (fromIndex == toIndex) {
            return A02(comparator());
        }
        return new ImmutableSortedMap<>(this.A01.subList(fromIndex, toIndex), null, this.A02.A0E(fromIndex, toIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> tailMap(K fromKey, boolean inclusive) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.A02;
        fromKey.getClass();
        return A00(regularImmutableSortedSet.A0D(fromKey, inclusive), size());
    }

    public static <K, V> ImmutableSortedMap<K, V> A02(Comparator<? super K> comparator) {
        if (NaturalOrdering.A00.equals(comparator)) {
            return (ImmutableSortedMap<K, V>) A03;
        }
        return new ImmutableSortedMap<>(ImmutableList.of(), null, ImmutableSortedSet.A05(comparator));
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return this.A02.comparator();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.A02.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.A00;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (!isEmpty()) {
            return new ImmutableSortedMap(this.A01.reverse(), this, (RegularImmutableSortedSet) this.A02.descendingSet());
        }
        Comparator<? super K> comparator = comparator();
        return A02((comparator instanceof DOM ? (DOM) comparator : new ComparatorOrdering(comparator)).A00());
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return this.A02.first();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object key) {
        int iBinarySearch;
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.A02;
        if (key == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.A00, key, regularImmutableSortedSet.A01);
            } catch (ClassCastException unused) {
            }
            if (iBinarySearch < 0) {
                iBinarySearch = -1;
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.A01.get(iBinarySearch);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
        return this.A02.A0A() || this.A01.A0A();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ ImmutableSet keySet() {
        return this.A02;
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return this.A02.last();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.A02;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A01.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final ImmutableCollection<V> values() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/google/common/collect/RegularImmutableSortedSet<TK;>;Lcom/google/common/collect/ImmutableList<TV;>;Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>;)V */
    public ImmutableSortedMap(ImmutableList keySet, ImmutableSortedMap valueList, RegularImmutableSortedSet descendingMap) {
        this.A02 = descendingMap;
        this.A01 = keySet;
        this.A00 = valueList;
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k) {
        return (K) BV7.A0u(ceilingEntry(k));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? RegularImmutableSet.A05 : new C1EntrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> createKeySet() {
        throw BV4.A0N("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> createValues() {
        throw BV4.A0N("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) C8j4.A0p(BV8.A0h(this).asList());
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k) {
        return (K) BV7.A0u(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k) {
        return (K) BV7.A0u(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) BV8.A0h(this).asList().get(size() - 1);
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k) {
        return (K) BV7.A0u(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object toKey, boolean inclusive) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.A02;
        toKey.getClass();
        return A00(0, regularImmutableSortedSet.A0C(toKey, inclusive));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
        fromKey.getClass();
        toKey.getClass();
        Preconditions.checkArgument(BV7.A1R(comparator().compare(fromKey, toKey)), "expected fromKey <= toKey but %s > %s", fromKey, toKey);
        return A00(0, this.A02.A0C(toKey, toInclusive)).tailMap(fromKey, fromInclusive);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.A01;
    }
}
