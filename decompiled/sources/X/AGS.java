package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final class AGS<K, V> implements Map<K, V>, BOA {
    public AGP<K, V> A00;
    public AGR<K, V> A01;
    public AGT<K, V> A02;
    public final AbstractC0915AHr<K, V> A03;

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A03.A07(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.A03.A08(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        AGP<K, V> agp = this.A00;
        if (agp != null) {
            return agp;
        }
        AGP<K, V> agp2 = new AGP<>(this.A03);
        this.A00 = agp2;
        return agp2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A03.equals(((AGS) obj).A03);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.A03.A05(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.A03.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A03.A01);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        AGR<K, V> agr = this.A01;
        if (agr != null) {
            return agr;
        }
        AGR<K, V> agr2 = new AGR<>(this.A03);
        this.A01 = agr2;
        return agr2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.A03.A01;
    }

    public final String toString() {
        return this.A03.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        AGT<K, V> agt = this.A02;
        if (agt != null) {
            return agt;
        }
        AGT<K, V> agt2 = new AGT<>(this.A03);
        this.A02 = agt2;
        return agt2;
    }

    public AGS(AbstractC0915AHr<K, V> abstractC0915AHr) {
        this.A03 = abstractC0915AHr;
    }

    @Override // java.util.Map
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw C8j4.A10();
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
    public final V putIfAbsent(K k, V v) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw C8j4.A10();
    }
}
