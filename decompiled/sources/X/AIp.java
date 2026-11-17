package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AIp<K, V> extends AIo<Map.Entry<K, V>, K, V> {
    public final C0955AJi<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new AJC(this.A00);
    }

    public AIp(C0955AJi<K, V> c0955AJi) {
        this.A00 = c0955AJi;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j3.A17();
    }
}
