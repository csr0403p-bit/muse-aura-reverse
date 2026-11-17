package X;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class DNS extends AbstractSet {
    public final /* synthetic */ Set A00;
    public final /* synthetic */ Set A01;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object object) {
        return this.A00.contains(object) && this.A01.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.A00.containsAll(collection) && this.A01.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new DNT(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.A01.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    public DNS() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(E e) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection<? extends E> newElements) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object object) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection<?> oldElements) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw C8j3.A17();
    }

    public DNS(final Set val$set1, final Set val$set2) {
        this.A00 = val$set1;
        this.A01 = val$set2;
    }
}
