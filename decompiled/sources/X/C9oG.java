package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.9oG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oG implements Iterator<C9oE>, BOA {
    public int A00;
    public final short[] A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ C9oE next() {
        int i = this.A00;
        short[] sArr = this.A01;
        if (i >= sArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new C9oE(sArr[i]);
    }

    public C9oG(short[] sArr) {
        this.A01 = sArr;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
