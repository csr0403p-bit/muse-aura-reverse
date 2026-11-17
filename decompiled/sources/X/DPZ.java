package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class DPZ<E> extends AbstractC5014DOf<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator<E> iterator();

    private final InterfaceC5026DPa<E> A00() {
        return this instanceof DQ0 ? ((DQ0) this).A00 : ((DPi) this).A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        return A00().contains(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> c) {
        return A00().containsAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        return AnonymousClass002.A1N(A00().AaU(o, Integer.MAX_VALUE));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return A00().entrySet().size();
    }
}
