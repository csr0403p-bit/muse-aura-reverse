package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.NoSuchElementException;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class DOA<E> extends AbstractC5011DNy {
    public int A00;
    public final int A01;
    public final ImmutableList<E> A02;

    private final E A00(int index) {
        return this.A02.get(index);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AnonymousClass002.A1N(this.A00);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    public DOA(int size, int position) {
        Preconditions.checkPositionIndex(position, size);
        this.A01 = size;
        this.A00 = position;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.A00;
        this.A00 = i + 1;
        return A00(i);
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw C8j3.A1D();
        }
        int i = this.A00 - 1;
        this.A00 = i;
        return A00(i);
    }

    public DOA(ImmutableList<E> list, int index) {
        this(list.size(), index);
        this.A02 = list;
    }
}
