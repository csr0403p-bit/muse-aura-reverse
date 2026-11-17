package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class DNC<K, V> extends AbstractC3450CNv implements Map<K, V> {
    private final Map<K, V> A00() {
        if (!(this instanceof AbstractConcurrentMapC5042DQj)) {
            return (Map<K, V>) ((DND) this).A00;
        }
        AbstractConcurrentMapC5042DQj abstractConcurrentMapC5042DQj = (AbstractConcurrentMapC5042DQj) this;
        if (abstractConcurrentMapC5042DQj instanceof MapMakerInternalMap.AbstractSerializationProxy) {
            return ((MapMakerInternalMap.AbstractSerializationProxy) abstractConcurrentMapC5042DQj).A00;
        }
        throw F60.createAndThrow();
    }

    @Override // java.util.Map
    public final boolean containsValue(Object value) {
        if (!(this instanceof DND)) {
            return A00().containsValue(value);
        }
        F4E f4e = new F4E(entrySet().iterator(), 1);
        if (value == null) {
            while (f4e.hasNext()) {
                if (f4e.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (f4e.hasNext()) {
            if (value.equals(f4e.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean equals(Object object) {
        return object == this || A00().equals(object);
    }

    @Override // java.util.Map
    public final void clear() {
        A00().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return A00().containsKey(key);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return A00().entrySet();
    }

    @Override // java.util.Map
    public V get(Object key) {
        return A00().get(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return A00().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return A00().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return A00().keySet();
    }

    @Override // java.util.Map
    public final V put(K key, V value) {
        return A00().put(key, value);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        A00().putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object key) {
        return A00().remove(key);
    }

    @Override // java.util.Map
    public int size() {
        return A00().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return A00().values();
    }
}
