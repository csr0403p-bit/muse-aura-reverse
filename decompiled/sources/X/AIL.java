package X;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class AIL implements ListIterator, BOA {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final AII<E> A03;

    private final void A00() {
        if (((AbstractList) this.A03).modCount != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.A01;
        AII<E> aii = this.A03;
        AII aii2 = AII.A00;
        return i < aii.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AnonymousClass002.A1N(this.A01);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A01;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A01 - 1;
    }

    public AIL(AII<E> aii, int i) {
        this.A03 = aii;
        this.A01 = i;
        this.A00 = ((AbstractList) aii).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        A00();
        AII<E> aii = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        aii.add(i, e);
        this.A02 = -1;
        this.A00 = ((AbstractList) aii).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        A00();
        int i = this.A01;
        AII<E> aii = this.A03;
        AII aii2 = AII.A00;
        if (i >= aii.length) {
            throw new NoSuchElementException();
        }
        this.A01 = i + 1;
        this.A02 = i;
        return aii.backing[i];
    }

    @Override // java.util.ListIterator
    public final E previous() {
        A00();
        int i = this.A01;
        if (i <= 0) {
            throw C8j3.A1D();
        }
        int i2 = i - 1;
        this.A01 = i2;
        this.A02 = i2;
        AII<E> aii = this.A03;
        AII aii2 = AII.A00;
        return aii.backing[i2];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        A00();
        int i = this.A02;
        if (i == -1) {
            throw C3cG.A0Q("Call next() or previous() before removing element from the iterator.");
        }
        AII<E> aii = this.A03;
        aii.A0S(i);
        this.A01 = this.A02;
        this.A02 = -1;
        this.A00 = ((AbstractList) aii).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        A00();
        int i = this.A02;
        if (i == -1) {
            throw C3cG.A0Q("Call next() or previous() before replacing element from the iterator.");
        }
        this.A03.set(i, e);
    }
}
