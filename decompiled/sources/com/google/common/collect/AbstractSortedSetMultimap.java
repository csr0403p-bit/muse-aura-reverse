package com.google.common.collect;

import X.InterfaceC5008DNt;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements InterfaceC5008DNt<K, V> {
    public static final long serialVersionUID = 430848587173315748L;

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: A07 */
    public final /* bridge */ /* synthetic */ Set Aah(Object key) {
        return super.Aah(key);
    }

    public final SortedSet<V> A08(K key) {
        return (SortedSet) super.AC1(key);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Collection Aah(Object key) {
        return super.Aah(key);
    }
}
