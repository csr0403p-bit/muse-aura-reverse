package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.AIk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0933AIk<K, V> extends AbstractC0934AIl<V> implements Collection<V>, InterfaceC0884AGl {
    public final C0954AJh<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new AK2(this.A00);
    }

    public C0933AIk(C0954AJh<K, V> c0954AJh) {
        this.A00 = c0954AJh;
    }

    @Override // X.AbstractC0934AIl, java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw C8j3.A17();
    }
}
