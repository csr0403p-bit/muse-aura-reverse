package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AIt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0940AIt<E> implements Iterator<E>, BOA {
    public int A00;
    public Object A01;
    public final Map<E, AKS> A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A02.size());
    }

    public C0940AIt(Object obj, Map<E, AKS> map) {
        this.A01 = obj;
        this.A02 = map;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        E e = (E) this.A01;
        this.A00++;
        AKS aks = this.A02.get(e);
        if (aks == null) {
            throw new ConcurrentModificationException(AnonymousClass001.A0v(") has changed after it was added to the persistent set.", C3cG.A0f(e, "Hash code of an element (")));
        }
        this.A01 = aks.A00;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
