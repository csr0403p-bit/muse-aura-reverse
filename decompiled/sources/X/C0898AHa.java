package X;

/* renamed from: X.AHa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0898AHa<T> extends AHZ<T> {
    public final T[] A00;

    public C0898AHa(T[] tArr, int i, int i2) {
        super.A00 = i;
        this.A01 = i2;
        this.A00 = tArr;
    }

    @Override // X.AHZ, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        T[] tArr = this.A00;
        int i = super.A00;
        super.A00 = i + 1;
        return tArr[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw C8j3.A1D();
        }
        T[] tArr = this.A00;
        int i = super.A00 - 1;
        super.A00 = i;
        return tArr[i];
    }
}
