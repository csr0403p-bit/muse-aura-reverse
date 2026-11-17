package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.AGy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0896AGy implements ListIterator, BOA {
    public int A00;
    public final List<T> A01;

    @Override // java.util.ListIterator
    public final void add(T t) {
        List<T> list = this.A01;
        int i = this.A00 + 1;
        this.A00 = i;
        list.add(i, t);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return C8j3.A1Q(this.A00);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        List<T> list = this.A01;
        int i = this.A00 + 1;
        this.A00 = i;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00 + 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator
    public final T previous() {
        List<T> list = this.A01;
        int i = this.A00;
        this.A00 = i - 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.A01.remove(this.A00);
        this.A00--;
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        this.A01.set(this.A00, t);
    }

    public C0896AGy(List<T> list, int i) {
        this.A01 = list;
        this.A00 = i - 1;
    }
}
