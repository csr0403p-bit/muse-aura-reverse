package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.9oF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oF implements Iterator<C9oA>, BOA {
    public int A00;
    public final byte[] A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ C9oA next() {
        int i = this.A00;
        byte[] bArr = this.A01;
        if (i >= bArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new C9oA(bArr[i]);
    }

    public C9oF(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
