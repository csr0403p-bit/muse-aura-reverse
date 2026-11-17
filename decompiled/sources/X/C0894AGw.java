package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.AGw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0894AGw<T> extends AIH<T> {
    public final List<T> A00;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.A00.add(BHL.A1A(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.A00.get(BHL.A19(this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C0895AGx(this, i);
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return this.A00.set(BHL.A19(this, i), t);
    }

    public C0894AGw(List<T> list) {
        this.A00 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return (ListIterator<T>) listIterator(0);
    }
}
