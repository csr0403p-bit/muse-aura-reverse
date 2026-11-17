package com.google.common.collect;

import X.DPD;
import X.DQ1;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient ImmutableSortedMultiset<E> A00;

    @Override // X.InterfaceC5026DPa
    public final int A7Q(Object element) {
        return this.A00.A7Q(element);
    }

    @Override // X.DQ1
    public final DPD ABd() {
        return this.A00.APT();
    }

    @Override // X.DQ1
    public final DPD APT() {
        return this.A00.ABd();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final int size() {
        return this.A00.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> forward) {
        this.A00 = forward;
    }

    @Override // X.DQ1
    /* renamed from: A9s */
    public final /* bridge */ /* synthetic */ NavigableSet A9t() {
        return A0H();
    }

    @Override // X.InterfaceC5026DPa
    public final /* bridge */ /* synthetic */ Set A9t() {
        return A0H();
    }

    @Override // X.DQ1
    public final /* bridge */ /* synthetic */ DQ1 ANM(BoundType upperBound, Object boundType) {
        return A0F(upperBound, boundType);
    }

    @Override // X.DQ1
    public final /* bridge */ /* synthetic */ DQ1 Agk(BoundType lowerBound, Object boundType) {
        return A0G(lowerBound, boundType);
    }
}
