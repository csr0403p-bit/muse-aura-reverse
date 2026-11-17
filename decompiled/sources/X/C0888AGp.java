package X;

import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: X.AGp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0888AGp<T> extends AH7<T> implements RandomAccess {
    public int A00;
    public int A01;
    public final int A02;
    public final Object[] A03;

    public C0888AGp(int i, Object[] objArr) {
        C7384Etj.A0Y(objArr, 0);
        this.A03 = objArr;
        if (i < 0) {
            throw C60O.A0i(FGI.A0H("ring buffer filled size should not be negative but it is ", i));
        }
        int length = objArr.length;
        if (i > length) {
            throw C8j3.A0v("ring buffer filled size: ", " cannot be larger than the buffer size: ", i, length);
        }
        this.A02 = length;
        this.A00 = i;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        C7384Etj.A0Y(tArr, 0);
        if (tArr.length < size()) {
            tArr = (T[]) C8j3.A1a(tArr, size());
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.A01; i2 < size && i3 < this.A02; i3++) {
            tArr[i2] = this.A03[i3];
            i2++;
        }
        while (i2 < size) {
            tArr[i2] = this.A03[i];
            i2++;
            i++;
        }
        if (size < tArr.length) {
            tArr[size] = null;
        }
        return tArr;
    }

    public final void A0E(int i) {
        if (i < 0) {
            throw C60O.A0i(FGI.A0H("n shouldn't be negative but it is ", i));
        }
        if (i > size()) {
            throw C8j3.A0v("n shouldn't be greater than the buffer size: n = ", ", size = ", i, size());
        }
        if (i > 0) {
            int i2 = this.A01;
            int i3 = this.A02;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.A03;
            if (i2 > i4) {
                AbstractC0903AHf.A04(objArr, i2, i3);
                AbstractC0903AHf.A04(objArr, 0, i4);
            } else {
                AbstractC0903AHf.A04(objArr, i2, i4);
            }
            this.A01 = i4;
            this.A00 = size() - i;
        }
    }

    @Override // X.AH7, X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C0889AGq(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC0890AGr, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
