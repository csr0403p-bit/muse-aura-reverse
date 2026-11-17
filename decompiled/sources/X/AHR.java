package X;

/* loaded from: classes4.dex */
public final class AHR<E> extends AHP<E> {
    public final E A00;

    public AHR(E e, int i) {
        super.A00 = i;
        this.A01 = 1;
        this.A00 = e;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw C8j3.A1D();
        }
        super.A00--;
        return this.A00;
    }
}
