package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AIn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0936AIn<K, V> extends AIo<Map.Entry<K, V>, K, V> {
    public final C0954AJh<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C0971AJy(this.A00);
    }

    public C0936AIn(C0954AJh<K, V> c0954AJh) {
        this.A00 = c0954AJh;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j3.A17();
    }
}
