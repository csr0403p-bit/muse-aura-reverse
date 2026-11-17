package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.AGz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0897AGz implements ListIterator, BOA {
    public int A00;
    public final List<T> A01;

    @Override // java.util.ListIterator
    public final void add(T t) {
        this.A01.add(this.A00, t);
        this.A00++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AnonymousClass002.A1N(this.A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        List<T> list = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.A00 - 1;
        this.A00 = i;
        return this.A01.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.A00 - 1;
        this.A00 = i;
        this.A01.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        this.A01.set(this.A00, t);
    }

    public C0897AGz(List<T> list, int i) {
        this.A01 = list;
        this.A00 = i;
    }
}
