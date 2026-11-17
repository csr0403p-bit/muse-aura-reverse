package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class AJ0<K, V> implements Map<K, V>, BOA {
    public abstract int A05();

    @Override // java.util.Map
    public abstract boolean containsKey(Object obj);

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
                    if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
                        for (Map.Entry<K, V> entry : setEntrySet) {
                            if (entry != null) {
                                K key = entry.getKey();
                                V value = entry.getValue();
                                V v = get(key);
                                if (!C7384Etj.areEqual(value, v) || (v == null && !containsKey(key))) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    public Collection<V> A02() {
        return this instanceof C0953AJg ? new AK0((C0953AJg) this) : new AJB((C0952AJf) this);
    }

    public Set<Map.Entry<K, V>> A03() {
        return this instanceof C0953AJg ? new AJ1((C0953AJg) this) : new AJ3((C0952AJf) this);
    }

    public Set<K> A04() {
        return this instanceof C0952AJf ? new AJ5((C0952AJf) this) : new C0947AJa((C0959AJm) this);
    }

    @Override // java.util.Map
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = setEntrySet.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(C3cH.A0l(it).getValue(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return A03();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return A04();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A05();
    }

    public final String toString() {
        return AbstractC0878AGe.A0L(", ", "{", "}", entrySet(), C2297BSx.A00(this, 43));
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return A02();
    }
}
