package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.DQj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractConcurrentMapC5042DQj<K, V> extends DNC<K, V> implements ConcurrentMap<K, V> {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K key, V value) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.putIfAbsent(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object key, Object value) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.remove(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K key, V value) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.replace(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K key, V oldValue, V newValue) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.replace(key, oldValue, newValue);
    }
}
