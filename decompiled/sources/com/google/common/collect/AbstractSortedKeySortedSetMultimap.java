package com.google.common.collect;

import java.util.Collection;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    public final SortedMap<K, Collection<V>> A09() {
        return (SortedMap) super.A4n();
    }

    public final SortedSet<K> A0A() {
        return (SortedSet) super.keySet();
    }
}
