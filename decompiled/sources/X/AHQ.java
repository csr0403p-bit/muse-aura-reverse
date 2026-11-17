package X;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class AHQ<T> extends AHP<T> {
    public final T[] A00;

    public AHQ(T[] tArr, int i, int i2) {
        C7384Etj.A0Y(tArr, 0);
        super.A00 = i;
        this.A01 = i2;
        this.A00 = tArr;
    }

    @Override // X.AHP, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
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
