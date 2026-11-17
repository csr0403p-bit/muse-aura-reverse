package X;

/* loaded from: classes5.dex */
public final class C1C<T> extends AbstractC7489Ext<T> {
    public boolean A00;
    public final T A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.A00;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.A00) {
            throw C8j3.A1D();
        }
        this.A00 = true;
        return this.A01;
    }

    public C1C(T value) {
        this.A01 = value;
    }
}
