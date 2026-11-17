package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EQV extends LinkedHashMap<Class<?>, String> {
    public final /* synthetic */ EQa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQV(EQa eQa) {
        super(16, 0.75f, true);
        this.this$0 = eQa;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return super.containsKey(obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return super.containsValue(obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof Class) {
            return super.get(obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof Class) ? obj2 : super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof Class) {
            return super.remove(obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Class<?>, String>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Class<?>> keySet() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Class<?>, String> entry) {
        return C8j4.A1V(size(), 512);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<String> values() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Class) || !(obj2 instanceof String)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
