package X;

import java.util.Iterator;

/* renamed from: X.EzN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7527EzN<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public final T[] A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A01, this.A00);
    }

    @Override // java.util.Iterator
    public final T next() {
        T[] tArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return tArr[i];
    }

    public C7527EzN(T[] tArr) {
        this.A02 = tArr;
        this.A00 = tArr.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
