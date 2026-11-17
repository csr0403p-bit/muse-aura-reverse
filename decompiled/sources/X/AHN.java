package X;

/* loaded from: classes4.dex */
public final class AHN<T> extends AHP<T> {
    public final AHO<T> A00;
    public final T[] A01;

    public AHN(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        AnonymousClass003.A0u(objArr, tArr);
        super.A00 = i;
        super.A01 = i2;
        this.A01 = tArr;
        int i4 = (i2 - 1) & (-32);
        this.A00 = new AHO<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw C8j3.A1D();
        }
        int i = super.A00;
        AHO<T> aho = this.A00;
        int i2 = ((AHP) aho).A01;
        if (i <= i2) {
            super.A00 = i - 1;
            return aho.previous();
        }
        T[] tArr = this.A01;
        int i3 = i - 1;
        super.A00 = i3;
        return tArr[i3 - i2];
    }
}
