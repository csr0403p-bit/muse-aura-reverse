package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class F3E<T> implements Iterator<T>, BOA {
    public int A00;
    public final T[] A01;

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A18(C8j2.A00(0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public F3E(T[] tArr) {
        this.A01 = tArr;
    }
}
