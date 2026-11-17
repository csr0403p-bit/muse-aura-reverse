package com.google.common.collect;

import X.DPG;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class Lists$TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final List<F> fromList;
    public final Function<? super F, ? extends T> function;

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.function.apply(this.fromList.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int index) {
        return new DPG(this, this.fromList.listIterator(index));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return this.function.apply(this.fromList.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int fromIndex, int toIndex) {
        this.fromList.subList(fromIndex, toIndex).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.fromList.size();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<TF;>;Lcom/google/common/base/Function<-TF;+TT;>;)V */
    public Lists$TransformingRandomAccessList(Function fromList, List function) {
        function.getClass();
        this.fromList = function;
        this.function = fromList;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }
}
