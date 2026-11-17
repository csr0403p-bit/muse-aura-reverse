package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DOs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5023DOs<K, V> {
    Map<K, Collection<V>> A4n();

    Collection<Map.Entry<K, V>> AAn();

    Collection<V> AC1(K key);

    /* JADX WARN: Incorrect return type in method signature: (TK;TV;)Z */
    void AYl(Object key, Object value);

    Collection<V> Aah(Object key);

    void clear();

    boolean containsKey(Object key);

    boolean isEmpty();

    Set<K> keySet();

    int size();
}
