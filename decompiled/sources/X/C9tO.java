package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.9tO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9tO implements Iterator<C9314GDq>, BOA {
    public int A00;
    public final long[] A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ C9314GDq next() {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i >= jArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new C9314GDq(jArr[i]);
    }

    public C9tO(long[] jArr) {
        this.A01 = jArr;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
