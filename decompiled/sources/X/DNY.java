package X;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class DNY<E> extends AbstractCollection<E> {
    public final Predicate<? super E> A00;
    public final Collection<E> A01;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E element) {
        Preconditions.checkArgument(this.A00.apply(element));
        return this.A01.add(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.A01;
        Predicate<? super E> predicate = this.A00;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator<E> it = collection.iterator();
            predicate.getClass();
            while (it.hasNext()) {
                if (predicate.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        predicate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            C00r c00r = (Object) list.get(i);
            if (!predicate.apply(c00r)) {
                if (i > i2) {
                    try {
                        list.set(i2, c00r);
                    } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size <= i) {
                                break;
                            } else if (predicate.apply((Object) list.get(size))) {
                                list.remove(size);
                            }
                        }
                        while (true) {
                            i--;
                            if (i < i2) {
                                return;
                            } else {
                                list.remove(i);
                            }
                        }
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object element) {
        Collection<E> collection = this.A01;
        collection.getClass();
        try {
            if (collection.contains(element)) {
                return this.A00.apply(element);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r0 = false;
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEmpty() {
        /*
            r3 = this;
            java.util.Collection<E> r0 = r3.A01
            com.google.common.base.Predicate<? super E> r3 = r3.A00
            java.util.Iterator r1 = r0.iterator()
            java.lang.String r0 = "predicate"
            com.google.common.base.Preconditions.checkNotNull(r3, r0)
            r2 = 0
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.apply(r0)
            if (r0 == 0) goto L26
            r1 = -1
            r0 = 1
            if (r2 != r1) goto L23
        L22:
            r0 = 0
        L23:
            r0 = r0 ^ 1
            return r0
        L26:
            int r2 = r2 + 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNY.isEmpty():boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.A01.iterator();
        Predicate<? super E> predicate = this.A00;
        it.getClass();
        predicate.getClass();
        return new DNV(predicate, it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(final Collection<?> collection) {
        Iterator<E> it = this.A01.iterator();
        boolean zA1Z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.A00.apply(next)) {
                zA1Z = BV8.A1Z(next, collection, it, zA1Z);
            }
        }
        return zA1Z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(final Collection<?> collection) {
        Iterator<E> it = this.A01.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.A00.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.A00.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Collection<TE;>;Lcom/google/common/base/Predicate<-TE;>;)V */
    public DNY(Predicate unfiltered, Collection predicate) {
        this.A01 = predicate;
        this.A00 = unfiltered;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            Preconditions.checkArgument(this.A00.apply(it.next()));
        }
        return this.A01.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object element) {
        return contains(element) && this.A01.remove(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC7483Exg.A00(this).toArray(tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return AbstractC7483Exg.A00(this).toArray();
    }
}
