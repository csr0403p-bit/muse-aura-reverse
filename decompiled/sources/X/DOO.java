package X;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableEntry;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DOO<K, V> extends DON<K, V> {
    public final Predicate<? super Map.Entry<K, V>> A00;
    public final Map<K, V> A01;

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        Map<K, V> map = this.A01;
        if (map.containsKey(key)) {
            if (this.A00.apply(new ImmutableEntry(key, map.get(key)))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object key) {
        V v = this.A01.get(key);
        if (v == null || !this.A00.apply(new ImmutableEntry(key, v))) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K key, V value) {
        Preconditions.checkArgument(this.A00.apply(new ImmutableEntry(key, value)));
        return this.A01.put(key, value);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<TK;TV;>;Lcom/google/common/base/Predicate<-Ljava/util/Map$Entry<TK;TV;>;>;)V */
    public DOO(Predicate unfiltered, Map predicate) {
        this.A01 = predicate;
        this.A00 = unfiltered;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Preconditions.checkArgument(this.A00.apply(new ImmutableEntry(entryA0l.getKey(), entryA0l.getValue())));
        }
        this.A01.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object key) {
        if (containsKey(key)) {
            return this.A01.remove(key);
        }
        return null;
    }
}
