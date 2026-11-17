package com.google.common.collect;

import X.DPF;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public class Lists$TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final List<F> fromList;
    public final Function<? super F, ? extends T> function;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(final int index) {
        return new DPF(this, this.fromList.listIterator(index));
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
    public Lists$TransformingSequentialList(Function fromList, List function) {
        function.getClass();
        this.fromList = function;
        this.function = fromList;
    }
}
