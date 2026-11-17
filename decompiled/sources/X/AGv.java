package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes4.dex */
public final class AGv<T> implements ListIterator<T>, BOA {
    public final ListIterator<T> A00;
    public final /* synthetic */ C0893AGu<T> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public AGv(C0893AGu<? extends T> c0893AGu, int i) {
        this.A01 = c0893AGu;
        this.A00 = c0893AGu.A00.listIterator(BHL.A1A(c0893AGu, i));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A00.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        return this.A00.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        C0893AGu<T> c0893AGu = this.A01;
        return AnonymousClass002.A0E(c0893AGu) - this.A00.previousIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        C0893AGu<T> c0893AGu = this.A01;
        return AnonymousClass002.A0E(c0893AGu) - this.A00.nextIndex();
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw C8j4.A10();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw C8j4.A10();
    }
}
