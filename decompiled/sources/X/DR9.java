package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class DR9 extends AbstractCollection {
    public Collection A00;
    public final DR9 A01;
    public final Object A02;
    public final Collection A03;
    public final /* synthetic */ AbstractC3759Cdw A04;

    public DR9(DR9 dr9, AbstractC3759Cdw abstractC3759Cdw, Object obj, Collection collection) {
        this.A04 = abstractC3759Cdw;
        this.A02 = obj;
        this.A00 = collection;
        this.A01 = dr9;
        this.A03 = dr9 == null ? null : dr9.A00;
    }

    public final void A00() {
        DR9 dr9 = this.A01;
        if (dr9 != null) {
            dr9.A00();
        } else {
            this.A04.A01.put(this.A02, this.A00);
        }
    }

    public final void A01() {
        Collection collection;
        DR9 dr9 = this.A01;
        if (dr9 != null) {
            dr9.A01();
            if (dr9.A00 != this.A03) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.A00.isEmpty() || (collection = (Collection) this.A04.A01.get(this.A02)) == null) {
                return;
            }
            this.A00 = collection;
        }
    }

    public final void A02() {
        DR9 dr9 = this.A01;
        if (dr9 != null) {
            dr9.A02();
        } else if (this.A00.isEmpty()) {
            this.A04.A01.remove(this.A02);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        A01();
        return this.A00.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        A01();
        boolean zIsEmpty = this.A00.isEmpty();
        boolean zAdd = this.A00.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        this.A04.A00++;
        if (!zIsEmpty) {
            return zAdd;
        }
        A00();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.A00.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.A00.size();
        this.A04.A00 += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        A00();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size != 0) {
            this.A00.clear();
            this.A04.A00 -= size;
            A02();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        A01();
        return this.A00.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        A01();
        return this.A00.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        A01();
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        A01();
        return new DRB(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        A01();
        boolean zRemove = this.A00.remove(obj);
        if (zRemove) {
            AbstractC3759Cdw abstractC3759Cdw = this.A04;
            abstractC3759Cdw.A00--;
            A02();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.A00.removeAll(collection);
        if (!zRemoveAll) {
            return zRemoveAll;
        }
        int size2 = this.A00.size();
        this.A04.A00 += size2 - size;
        A02();
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.A00.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.A00.size();
            this.A04.A00 += size2 - size;
            A02();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        A01();
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        A01();
        return this.A00.toString();
    }
}
