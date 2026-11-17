package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class BNt implements Iterator<Integer>, BOA {
    public abstract int A00();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(A00());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
