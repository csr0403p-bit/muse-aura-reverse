package X;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: X.DOf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5014DOf<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c) {
        return DNa.A04(c, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c) {
        c.getClass();
        return super.retainAll(c);
    }
}
