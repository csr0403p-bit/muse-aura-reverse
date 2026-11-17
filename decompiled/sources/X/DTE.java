package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DTE<K> extends AbstractSet<K> {
    public final DTL<K, V> A00;
    public final /* synthetic */ DTL A01;

    public DTE(DTL dtl) {
        this.A01 = dtl;
        this.A00 = dtl;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A01.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new DTF(this.A01);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return AnonymousClass002.A1X(this.A00.remove(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.A00.data.keySet().toArray(tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return this.A00.data.keySet().toArray();
    }
}
