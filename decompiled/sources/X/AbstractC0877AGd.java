package X;

import java.util.Set;

/* renamed from: X.AGd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0877AGd<K, V, E> implements Set<E>, AGM {
    public final C0981AMm<K, V> A00;

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public AbstractC0877AGd(C0981AMm<K, V> c0981AMm) {
        this.A00 = c0981AMm;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
