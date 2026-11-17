package X;

import java.util.Set;

/* loaded from: classes4.dex */
public final class AGW<E> extends AGU<E> implements Set<E>, AGM {
    public final C0917AHt<E> A00;

    @Override // X.AGU, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.A00.A0B(e);
    }

    @Override // X.AGU, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.A0C(obj);
    }

    public AGW(C0917AHt<E> c0917AHt) {
        super(c0917AHt);
        this.A00 = c0917AHt;
    }
}
