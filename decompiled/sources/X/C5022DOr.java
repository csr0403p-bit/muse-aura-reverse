package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.DOr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5022DOr<K, V> extends DON<K, Collection<V>> {
    public final InterfaceC5023DOs<K, V> A00;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        return this.A00.containsKey(key);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // X.DON, java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.keySet().size();
    }

    public C5022DOr(InterfaceC5023DOs<K, V> multimap) {
        this.A00 = multimap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object key) {
        if (containsKey(key)) {
            return this.A00.AC1(key);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object key) {
        if (containsKey(key)) {
            return this.A00.Aah(key);
        }
        return null;
    }
}
