package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.AGx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0895AGx implements ListIterator, BOA {
    public final ListIterator<T> A00;
    public final /* synthetic */ C0894AGw<T> A01;

    public C0895AGx(C0894AGw<T> c0894AGw, int i) {
        this.A01 = c0894AGw;
        this.A00 = c0894AGw.A00.listIterator(BHL.A1A(c0894AGw, i));
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        ListIterator<T> listIterator = this.A00;
        listIterator.add(t);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A00.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        return this.A00.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        List list = this.A01;
        return AnonymousClass002.A0E(list) - this.A00.previousIndex();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator
    public final T previous() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        List list = this.A01;
        return AnonymousClass002.A0E(list) - this.A00.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        this.A00.set(t);
    }
}
