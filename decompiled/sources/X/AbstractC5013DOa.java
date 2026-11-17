package X;

import java.util.ListIterator;

/* renamed from: X.DOa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5013DOa<F, T> extends DOZ<F, T> implements ListIterator<T> {
    @Override // java.util.ListIterator
    public final void set(T element) {
        if (0 == 0) {
            throw C8j3.A17();
        }
        throw new NullPointerException("val$nodeItr");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.A00).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.A00).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) A00(((ListIterator) this.A00).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.A00).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void add(T element) {
        throw C8j3.A17();
    }
}
