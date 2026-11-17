package com.google.common.collect;

import X.AnonymousClass002;
import X.BV7;
import X.C5035DPu;
import X.C8j3;
import X.DOM;
import X.DPD;
import X.DQ1;
import X.F60;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes5.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements DQ1<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedMultiset<E> A00;

    public final class SerializedForm<E> implements Serializable {
        public final Comparator<? super E> comparator;
        public final int[] counts;
        public final E[] elements;

        public Object readResolve() {
            int length = this.elements.length;
            C5035DPu c5035DPu = new C5035DPu(this.comparator);
            for (int i = 0; i < length; i++) {
                c5035DPu.A05(this.elements[i], this.counts[i]);
            }
            return c5035DPu.build();
        }

        public SerializedForm(DQ1<E> dq1) {
            this.comparator = dq1.comparator();
            int size = dq1.entrySet().size();
            this.elements = (E[]) new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (DPD dpd : dq1.entrySet()) {
                ((E[]) this.elements)[i] = dpd.A01();
                this.counts[i] = dpd.A00();
                i++;
            }
        }
    }

    private final ImmutableSortedMultiset<E> A0E() {
        DescendingImmutableSortedMultiset descendingImmutableSortedMultiset;
        if (this instanceof DescendingImmutableSortedMultiset) {
            return ((DescendingImmutableSortedMultiset) this).A00;
        }
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.A00;
        if (immutableSortedMultiset != null) {
            return immutableSortedMultiset;
        }
        if (isEmpty()) {
            Comparator<? super E> comparator = A0H().comparator();
            DOM domA00 = (comparator instanceof DOM ? (DOM) comparator : new ComparatorOrdering(comparator)).A00();
            descendingImmutableSortedMultiset = NaturalOrdering.A00.equals(domA00) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.A04 : new RegularImmutableSortedMultiset(domA00);
        } else {
            descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
        }
        this.A00 = descendingImmutableSortedMultiset;
        return descendingImmutableSortedMultiset;
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public final ImmutableSortedMultiset A0F(BoundType upperBound, Object boundType) {
        if (!(this instanceof RegularImmutableSortedMultiset)) {
            return ((DescendingImmutableSortedMultiset) this).A00.A0G(upperBound, boundType).A0E();
        }
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
        RegularImmutableSortedSet<E> regularImmutableSortedSet = regularImmutableSortedMultiset.A02;
        upperBound.getClass();
        return RegularImmutableSortedMultiset.A00(regularImmutableSortedMultiset, 0, regularImmutableSortedSet.A0C(boundType, AnonymousClass002.A1Z(upperBound, BoundType.CLOSED)));
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public final ImmutableSortedMultiset A0G(BoundType lowerBound, Object boundType) {
        if (!(this instanceof RegularImmutableSortedMultiset)) {
            return ((DescendingImmutableSortedMultiset) this).A00.A0F(lowerBound, boundType).A0E();
        }
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
        RegularImmutableSortedSet<E> regularImmutableSortedSet = regularImmutableSortedMultiset.A02;
        lowerBound.getClass();
        return RegularImmutableSortedMultiset.A00(regularImmutableSortedMultiset, regularImmutableSortedSet.A0D(boundType, AnonymousClass002.A1Z(lowerBound, BoundType.CLOSED)), regularImmutableSortedMultiset.A00);
    }

    public final ImmutableSortedSet<E> A0H() {
        return this instanceof RegularImmutableSortedMultiset ? ((RegularImmutableSortedMultiset) this).A02 : ((DescendingImmutableSortedMultiset) this).A00.A0H().descendingSet();
    }

    @Override // X.DQ1
    public final /* bridge */ /* synthetic */ DQ1 A8u() {
        return this instanceof DescendingImmutableSortedMultiset ? ((DescendingImmutableSortedMultiset) this).A00 : A0E();
    }

    @Override // X.DQ1
    @Deprecated
    public final DPD AY1() {
        throw C8j3.A17();
    }

    @Override // X.DQ1
    @Deprecated
    public final DPD AY2() {
        throw C8j3.A17();
    }

    @Override // X.DQ1
    public final /* bridge */ /* synthetic */ DQ1 AgY(BoundType lowerBound, BoundType lowerBoundType, Object upperBound, Object upperBoundType) {
        Preconditions.checkArgument(BV7.A1R(A0H().comparator().compare(upperBound, upperBoundType)), "Expected lowerBound <= upperBound but %s > %s", upperBound, upperBoundType);
        return A0G(lowerBound, upperBound).A0F(lowerBoundType, upperBoundType);
    }

    @Override // X.DQ1, X.InterfaceC7431Evo
    public final Comparator<? super E> comparator() {
        return A0H().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        throw F60.createAndThrow();
    }
}
