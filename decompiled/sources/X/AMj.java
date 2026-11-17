package X;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AMj implements ListIterator, BOA {
    public final /* synthetic */ AMf<T> A00;
    public final /* synthetic */ F1E A01;

    /* JADX WARN: Incorrect types in method signature: (LX/F1E;LX/AMf<TT;>;)V */
    public AMj(AMf aMf, F1E f1e) {
        this.A01 = f1e;
        this.A00 = aMf;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw C3cG.A0Q("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A01.element < this.A00.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return C8j3.A1Q(this.A01.element);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        F1E f1e = this.A01;
        int i = f1e.element + 1;
        List list = this.A00;
        AMg.A01(i, list.size());
        f1e.element = i;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A01.element + 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator
    public final T previous() {
        F1E f1e = this.A01;
        int i = f1e.element;
        List list = this.A00;
        AMg.A01(i, list.size());
        f1e.element = i - 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A01.element;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        throw C3cG.A0Q("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw C3cG.A0Q("Cannot modify a state list through an iterator");
    }
}
