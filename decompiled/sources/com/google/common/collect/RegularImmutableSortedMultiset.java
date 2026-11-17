package com.google.common.collect;

import X.DPD;
import X.DQ1;
import X.DX6;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient int A00;
    public final transient int A01;
    public final transient RegularImmutableSortedSet<E> A02;
    public final transient long[] A03;
    public static final long[] A05 = {0};
    public static final ImmutableSortedMultiset<?> A04 = new RegularImmutableSortedMultiset(NaturalOrdering.A00);

    public static final ImmutableSortedMultiset A00(RegularImmutableSortedMultiset regularImmutableSortedMultiset, int i, int i2) {
        int i3 = regularImmutableSortedMultiset.A00;
        Preconditions.checkPositionIndexes(i, i2, i3);
        if (i != i2) {
            return (i == 0 && i2 == i3) ? regularImmutableSortedMultiset : new RegularImmutableSortedMultiset(regularImmutableSortedMultiset.A02.A0E(i, i2), regularImmutableSortedMultiset.A03, regularImmutableSortedMultiset.A01 + i, i2 - i);
        }
        Comparator<? super E> comparator = regularImmutableSortedMultiset.A0H().comparator();
        return NaturalOrdering.A00.equals(comparator) ? A04 : new RegularImmutableSortedMultiset(comparator);
    }

    @Override // X.InterfaceC5026DPa
    public final int A7Q(Object element) {
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.A02;
        if (element == null) {
            return 0;
        }
        try {
            int iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.A00, element, regularImmutableSortedSet.A01);
            if (iBinarySearch < 0) {
                return 0;
            }
            long[] jArr = this.A03;
            int i = this.A01 + iBinarySearch;
            return (int) (jArr[i + 1] - jArr[i]);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    @Override // X.DQ1
    /* renamed from: A9s */
    public final /* bridge */ /* synthetic */ NavigableSet A9t() {
        return this.A02;
    }

    @Override // X.InterfaceC5026DPa
    public final /* bridge */ /* synthetic */ Set A9t() {
        return this.A02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final int size() {
        long[] jArr = this.A03;
        int i = this.A01;
        return DX6.A01(jArr[this.A00 + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }

    public RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.A02 = ImmutableSortedSet.A05(comparator);
        this.A03 = A05;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // X.DQ1
    public final DPD ABd() {
        if (isEmpty()) {
            return null;
        }
        return A0D(0);
    }

    @Override // X.DQ1
    public final /* bridge */ /* synthetic */ DQ1 ANM(BoundType upperBound, Object boundType) {
        return A0F(upperBound, boundType);
    }

    @Override // X.DQ1
    public final DPD APT() {
        if (isEmpty()) {
            return null;
        }
        return A0D(this.A00 - 1);
    }

    @Override // X.DQ1
    public final /* bridge */ /* synthetic */ DQ1 Agk(BoundType lowerBound, Object boundType) {
        return A0G(lowerBound, boundType);
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> elementSet, long[] cumulativeCounts, int offset, int length) {
        this.A02 = elementSet;
        this.A03 = cumulativeCounts;
        this.A01 = offset;
        this.A00 = length;
    }
}
