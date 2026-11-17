package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cdu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3757Cdu extends AbstractC7401Euf {
    public final Map A00;
    public final /* synthetic */ AbstractC3759Cdw A01;

    public C3757Cdu(AbstractC3759Cdw abstractC3759Cdw, Map map) {
        this.A01 = abstractC3759Cdw;
        map.getClass();
        this.A00 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.A00.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.A00.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3758Cdv(this, AnonymousClass002.A0n(this.A00));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.A00.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.A01.A00 -= size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
