package com.google.common.collect;

import X.AbstractC7489Ext;
import X.AnonymousClass002;
import X.C5027DPe;
import X.C5030DPp;
import X.C5034DPt;
import X.C8j3;
import X.DNa;
import X.DPD;
import X.DPb;
import X.InterfaceC5026DPa;
import com.google.common.base.Preconditions;
import com.google.common.collect.RegularImmutableMultiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements InterfaceC5026DPa<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableList<E> A00;
    public transient ImmutableSet A01;

    public final class EntrySet extends IndexedImmutableSet {
        public static final long serialVersionUID = 0;

        public EntrySet() {
        }

        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object o) {
            if (!(o instanceof DPD)) {
                return false;
            }
            DPD dpd = (DPD) o;
            return dpd.A00() > 0 && ImmutableMultiset.this.A7Q(dpd.A01()) == dpd.A00();
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.A0B().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    public class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset<E> multiset;

        public Object readResolve() {
            return this.multiset.entrySet();
        }

        public EntrySetSerializedForm(ImmutableMultiset<E> multiset) {
            this.multiset = multiset;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableSet<E> A0B() {
        if (!(this instanceof RegularImmutableMultiset)) {
            return this instanceof RegularImmutableSortedMultiset ? ((RegularImmutableSortedMultiset) this).A02 : ((ImmutableSortedMultiset) this).A0H();
        }
        RegularImmutableMultiset regularImmutableMultiset = (RegularImmutableMultiset) this;
        ImmutableSet<E> immutableSet = regularImmutableMultiset.A00;
        if (immutableSet != null) {
            return immutableSet;
        }
        RegularImmutableMultiset.ElementSet elementSet = new RegularImmutableMultiset.ElementSet();
        regularImmutableMultiset.A00 = elementSet;
        return elementSet;
    }

    @Override // X.InterfaceC5026DPa
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet entrySet = this.A01;
        if (entrySet == null) {
            entrySet = isEmpty() ? RegularImmutableSet.A05 : new EntrySet();
            this.A01 = entrySet;
        }
        return entrySet;
    }

    public final DPD A0D(int i) {
        if (this instanceof RegularImmutableMultiset) {
            C5034DPt<E> c5034DPt = ((RegularImmutableMultiset) this).A01;
            Preconditions.checkElementIndex(i, c5034DPt.A02);
            return new C5030DPp(c5034DPt, i);
        }
        if (!(this instanceof RegularImmutableSortedMultiset)) {
            return (DPD) ((DescendingImmutableSortedMultiset) this).A00.entrySet().asList().reverse().get(i);
        }
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
        E e = regularImmutableSortedMultiset.A02.A00.get(i);
        long[] jArr = regularImmutableSortedMultiset.A03;
        int i2 = regularImmutableSortedMultiset.A01 + i;
        return new Multisets$ImmutableEntry(e, (int) (jArr[i2 + 1] - jArr[i2]));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.A00;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.A00 = immutableListAsList;
        return immutableListAsList;
    }

    @Override // X.InterfaceC5026DPa
    @Deprecated
    public final int AaU(Object element, int occurrences) {
        throw C8j3.A17();
    }

    @Override // X.InterfaceC5026DPa
    @Deprecated
    public final boolean AdC(E element, int oldCount, int newCount) {
        throw C8j3.A17();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object object) {
        return AnonymousClass002.A1N(A7Q(object));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] objArr, int i) {
        AbstractC7489Ext<E> it = entrySet().iterator();
        while (it.hasNext()) {
            DPD dpd = (DPD) it.next();
            Arrays.fill(objArr, i, dpd.A00() + i, dpd.A01());
            i += dpd.A00();
        }
        return i;
    }

    @Override // java.util.Collection
    public final boolean equals(Object object) {
        return DPb.A00(this, object);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return DNa.A00(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final AbstractC7489Ext<E> iterator() {
        return new C5027DPe(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
