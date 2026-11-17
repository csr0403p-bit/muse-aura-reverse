package X;

import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.AIs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0939AIs<K, V> extends AbstractC0935AIm {
    public final C0958AJl<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        C0958AJl<K, V> c0958AJl = this.A00;
        V v = c0958AJl.get(entry.getKey());
        Object value = entry.getValue();
        return v != null ? v.equals(value) : value == null && c0958AJl.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new AJQ(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        return this.A00.remove(entry.getKey(), entry.getValue());
    }

    public C0939AIs(C0958AJl<K, V> c0958AJl) {
        this.A00 = c0958AJl;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j3.A17();
    }

    public C0939AIs() {
    }
}
