package X;

/* renamed from: X.AHb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0899AHb<E> extends AHZ<E> {
    public final E A00;

    public C0899AHb(E e, int i) {
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
