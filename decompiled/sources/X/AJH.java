package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class AJH<K, V, T> implements Iterator<T>, BOA {
    public int A00;
    public int A01;
    public Object[] A02 = C0956AJj.A04.A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A01, this.A00);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
