package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DOk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5016DOk<K, V> extends DON<K, Collection<V>> {
    public final transient Map<K, Collection<V>> A00;
    public final /* synthetic */ AbstractMapBasedMultimap A01;

    public C5016DOk(final AbstractMapBasedMultimap this$0, Map<K, Collection<V>> submap) {
        this.A01 = this$0;
        this.A00 = submap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map<K, Collection<V>> map = this.A00;
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A01;
        if (map == abstractMapBasedMultimap.A01) {
            abstractMapBasedMultimap.clear();
            return;
        }
        C5018DOn c5018DOn = new C5018DOn(this);
        while (c5018DOn.hasNext()) {
            c5018DOn.next();
            c5018DOn.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        Map<K, Collection<V>> map = this.A00;
        map.getClass();
        try {
            return map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object object) {
        return this == object || this.A00.equals(object);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object key) {
        Collection<V> collection;
        Map<K, Collection<V>> map = this.A00;
        map.getClass();
        try {
            collection = map.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 == null) {
            return null;
        }
        return this.A01.A02(key, collection2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.DON, java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        return this.A01.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object key) {
        Collection<V> collectionRemove = this.A00.remove(key);
        if (collectionRemove == null) {
            return null;
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A01;
        Collection<V> collectionA00 = abstractMapBasedMultimap.A00();
        collectionA00.addAll(collectionRemove);
        abstractMapBasedMultimap.A00 -= collectionRemove.size();
        collectionRemove.clear();
        return collectionA00;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.A00.toString();
    }

    public final Map.Entry<K, Collection<V>> A01(Map.Entry<K, Collection<V>> entry) {
        K key = entry.getKey();
        return new ImmutableEntry(key, this.A01.A02(key, entry.getValue()));
    }
}
