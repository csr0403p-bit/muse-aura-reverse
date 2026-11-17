package X;

/* renamed from: X.CeM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3779CeM extends F0L {
    public int A00;
    public final int A01;
    public final AbstractC3777CeK A02;

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

    public C3779CeM(AbstractC3777CeK abstractC3777CeK, int i) {
        int size = abstractC3777CeK.size();
        if (i > size) {
            throw BV6.A0g(AbstractC3788CeW.A00(i, size, "index"));
        }
        this.A01 = size;
        this.A00 = i;
        this.A02 = abstractC3777CeK;
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
}
