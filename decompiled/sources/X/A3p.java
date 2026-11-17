package X;

import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class A3p implements ListIterator, BOA {
    public static final A3p A00 = new A3p();

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        throw C8j3.A1D();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        throw C8j3.A1D();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw C8j4.A10();
    }
}
