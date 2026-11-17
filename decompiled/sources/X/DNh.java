package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public abstract class DNh<V> extends AbstractCollection<V> {
    public Collection<V> A00;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection; */
    public final DNh A01;
    public final K A02;
    public final Collection<V> A03;
    public final /* synthetic */ AbstractMapBasedMultimap A04;

    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/Collection<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public DNh(final DNh this$0, AbstractMapBasedMultimap key, Object delegate, Collection ancestor) {
        this.A04 = key;
        this.A02 = delegate;
        this.A00 = ancestor;
        this.A01 = this$0;
        this.A03 = this$0 == null ? null : this$0.A00;
    }

    public final void A00() {
        DNh dNh = this.A01;
        if (dNh != null) {
            dNh.A00();
        } else {
            this.A04.A01.put(this.A02, this.A00);
        }
    }

    public final void A01() {
        Collection<V> collection;
        DNh dNh = this.A01;
        if (dNh != null) {
            dNh.A01();
            if (dNh.A00 != this.A03) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.A00.isEmpty() || (collection = this.A04.A01.get(this.A02)) == null) {
                return;
            }
            this.A00 = collection;
        }
    }

    public final void A02() {
        DNh dNh = this.A01;
        if (dNh != null) {
            dNh.A02();
        } else if (this.A00.isEmpty()) {
            this.A04.A01.remove(this.A02);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        A01();
        return this.A00.equals(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V value) {
        A01();
        boolean zIsEmpty = this.A00.isEmpty();
        boolean zAdd = this.A00.add(value);
        if (zAdd) {
            this.A04.A00++;
            if (zIsEmpty) {
                A00();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
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
        return zAddAll;
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
    public final boolean contains(Object o) {
        A01();
        return this.A00.contains(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> c) {
        A01();
        return this.A00.containsAll(c);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        A01();
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        A01();
        return new C5004DNi(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        A01();
        boolean zRemove = this.A00.remove(o);
        if (zRemove) {
            AbstractMapBasedMultimap abstractMapBasedMultimap = this.A04;
            abstractMapBasedMultimap.A00--;
            A02();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> c) {
        if (c.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.A00.removeAll(c);
        if (!zRemoveAll) {
            return zRemoveAll;
        }
        int size2 = this.A00.size();
        this.A04.A00 += size2 - size;
        A02();
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> c) {
        c.getClass();
        int size = size();
        boolean zRetainAll = this.A00.retainAll(c);
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
