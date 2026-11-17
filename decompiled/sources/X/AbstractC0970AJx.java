package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AJx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0970AJx<K, V> extends AbstractMap<K, V> implements Map<K, V>, InterfaceC0863A6k {
    public abstract /* bridge */ int A01();

    @Override // java.util.AbstractMap, java.util.Map
    public abstract V put(K k, V v);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return this instanceof C0954AJh ? new C0936AIn((C0954AJh) this) : this instanceof C0955AJi ? new AIp((C0955AJi) this) : new C0939AIs((C0958AJl) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return this instanceof C0954AJh ? new C0932AIj((C0954AJh) this) : this instanceof C0955AJi ? new AJ6((C0955AJi) this) : new AJM((C0958AJl) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return this instanceof C0954AJh ? new C0933AIk((C0954AJh) this) : this instanceof C0955AJi ? new AJA((C0955AJi) this) : new AJN((C0958AJl) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return A01();
    }
}
