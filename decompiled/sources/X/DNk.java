package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public class DNk<V> extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V */
    public DNk(final DNh this$0, AbstractMapBasedMultimap key, Object delegate, List ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = key;
    }

    @Override // java.util.List
    public final void add(int index, V element) {
        A01();
        boolean zIsEmpty = this.A00.isEmpty();
        ((List) this.A00).add(index, element);
        this.A00.A00++;
        if (zIsEmpty) {
            A00();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int index, Collection<? extends V> c) {
        if (c.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.A00).addAll(index, c);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.A00.size();
        this.A00.A00 += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        A00();
        return zAddAll;
    }

    @Override // java.util.List
    public final V get(int i) {
        A01();
        return (V) ((List) this.A00).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object o) {
        A01();
        return ((List) this.A00).indexOf(o);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object o) {
        A01();
        return ((List) this.A00).lastIndexOf(o);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator(int index) {
        A01();
        return new DNj(this, index);
    }

    @Override // java.util.List
    public final V remove(int i) {
        A01();
        V v = (V) ((List) this.A00).remove(i);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        abstractMapBasedMultimap.A00--;
        A02();
        return v;
    }

    @Override // java.util.List
    public final V set(int i, V v) {
        A01();
        return (V) ((List) this.A00).set(i, v);
    }

    @Override // java.util.List
    public final List<V> subList(int fromIndex, int toIndex) {
        A01();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        List listSubList = ((List) this.A00).subList(fromIndex, toIndex);
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return listSubList instanceof RandomAccess ? new DNm(dNh, abstractMapBasedMultimap, k, listSubList) : new DNk(dNh, abstractMapBasedMultimap, k, listSubList);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        A01();
        return new DNj(this);
    }
}
