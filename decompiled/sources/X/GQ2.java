package X;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GQ2<T> implements Iterator<T>, Iterable<T> {
    public int A00 = 0;
    public final T[] A01;

    public static GQ2 A00(AbstractC9905Gkl abstractC9905Gkl) {
        return new GQ2(abstractC9905Gkl._factoryConfig._additionalDeserializers);
    }

    public static GQ2 A01(Object[] objArr) {
        return new GQ2(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01.length);
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.A00;
        T[] tArr = this.A01;
        if (i >= tArr.length) {
            throw C8j3.A1D();
        }
        this.A00 = i + 1;
        return tArr[i];
    }

    public GQ2(T[] tArr) {
        this.A01 = tArr;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
