package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9jH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9jH implements Map, Serializable, BOA {
    public static final C9jH A00 = new C9jH();
    public static final long serialVersionUID = 8246714829545688274L;

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    private final Object readResolve() {
        return A00;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return A3q.A00;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return A3q.A00;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C0881AGi.A00;
    }

    @Override // java.util.Map
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw C8j4.A10();
    }
}
