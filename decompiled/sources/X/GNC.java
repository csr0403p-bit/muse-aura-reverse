package X;

import java.util.ListIterator;

/* loaded from: classes6.dex */
public final class GNC extends G4e implements ListIterator {
    public int A00;
    public final int A01;
    public final GNE A02;

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01);
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

    public GNC(GNE gne, int i) {
        int size = gne.size();
        if (i > size) {
            throw BV6.A0g(AbstractC3790CeZ.A01(i, size, "index"));
        }
        this.A01 = size;
        this.A00 = i;
        this.A02 = gne;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        int i = this.A00;
        this.A00 = i + 1;
        return this.A02.get(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw C8j3.A1D();
        }
        int i = this.A00 - 1;
        this.A00 = i;
        return this.A02.get(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw C8j3.A17();
    }
}
