package com.google.common.collect;

import X.InterfaceC5009DNu;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements InterfaceC5009DNu<K, V> {
    public static final long serialVersionUID = 7431625294878419160L;

    public final Set<Map.Entry<K, V>> A05() {
        return (Set) super.AAn();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, X.InterfaceC5023DOs
    /* renamed from: A06, reason: merged with bridge method [inline-methods] */
    public Set<V> AC1(K key) {
        return (Set) super.AC1(key);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, X.InterfaceC5023DOs
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public Set<V> Aah(Object key) {
        return (Set) super.Aah(key);
    }

    @Override // X.AbstractC5024DOu, X.InterfaceC5023DOs
    public /* bridge */ /* synthetic */ Collection AAn() {
        return super.AAn();
    }
}
