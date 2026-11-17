package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.9oH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oH implements Iterator<FKC>, BOA {
    public int A00;
    public final int[] A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ FKC next() {
        int i = this.A00;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new FKC(iArr[i]);
    }

    public C9oH(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
