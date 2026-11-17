package com.google.common.collect;

import X.BV7;
import X.C8j3;
import X.C8j4;
import X.DOF;
import X.Eu2;
import X.InterfaceC7431Evo;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, InterfaceC7431Evo<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedSet<E> A00;
    public final transient Comparator<? super E> A01;

    public class SerializedForm<E> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Comparator<? super E> comparator;
        public final Object[] elements;

        public Object readResolve() {
            DOF dof = new DOF(this.comparator);
            dof.A04(this.elements);
            return DOF.A00(dof);
        }

        /* JADX WARN: Incorrect types in method signature: (Ljava/util/Comparator<-TE;>;[Ljava/lang/Object;)V */
        public SerializedForm(Object[] comparator, Comparator elements) {
            this.comparator = elements;
            this.elements = comparator;
        }
    }

    public static <E> RegularImmutableSortedSet<E> A05(Comparator<? super E> comparator) {
        if (NaturalOrdering.A00.equals(comparator)) {
            return (RegularImmutableSortedSet<E>) RegularImmutableSortedSet.A01;
        }
        RegularImmutableSortedSet<Comparable> regularImmutableSortedSet = RegularImmutableSortedSet.A01;
        return new RegularImmutableSortedSet<>(ImmutableList.of(), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Object;>(Ljava/util/Comparator<-TE;>;I[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static RegularImmutableSortedSet A06(Comparator comparator, Object[] n, int contents) {
        if (contents == 0) {
            return A05(comparator);
        }
        Eu2.A00(contents, n);
        Arrays.sort(n, 0, contents, comparator);
        int i = 1;
        for (int i2 = 1; i2 < contents; i2++) {
            Object obj = n[i2];
            if (comparator.compare(obj, n[i - 1]) != 0) {
                n[i] = obj;
                i++;
            }
        }
        Arrays.fill(n, i, contents, (Object) null);
        if (i < n.length / 2) {
            n = Arrays.copyOf(n, i);
        }
        RegularImmutableSortedSet<Comparable> regularImmutableSortedSet = RegularImmutableSortedSet.A01;
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(n, i), comparator);
    }

    private void readObject(ObjectInputStream unused) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSetA05 = this.A00;
        if (immutableSortedSetA05 == null) {
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(regularImmutableSortedSet.A01);
            immutableSortedSetA05 = regularImmutableSortedSet.isEmpty() ? A05(comparatorReverseOrder) : new RegularImmutableSortedSet<>(regularImmutableSortedSet.A00.reverse(), comparatorReverseOrder);
            this.A00 = immutableSortedSetA05;
            immutableSortedSetA05.A00 = this;
        }
        return immutableSortedSetA05;
    }

    @Override // java.util.NavigableSet
    public final E ceiling(E e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int iA0D = regularImmutableSortedSet.A0D(e, true);
        if (iA0D == regularImmutableSortedSet.size()) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(iA0D);
    }

    @Override // java.util.SortedSet, X.InterfaceC7431Evo
    public final Comparator<? super E> comparator() {
        return this.A01;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return ((RegularImmutableSortedSet) this).A00.reverse().iterator();
    }

    @Override // java.util.SortedSet
    public final E first() {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        if (regularImmutableSortedSet.isEmpty()) {
            throw C8j3.A1D();
        }
        return (E) C8j4.A0p(regularImmutableSortedSet.A00);
    }

    @Override // java.util.NavigableSet
    public final E floor(E e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int iA0C = regularImmutableSortedSet.A0C(e, true) - 1;
        if (iA0C == -1) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(iA0C);
    }

    @Override // java.util.NavigableSet
    public final E higher(E e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int iA0D = regularImmutableSortedSet.A0D(e, false);
        if (iA0D == regularImmutableSortedSet.size()) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(iA0D);
    }

    @Override // java.util.SortedSet
    public final E last() {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        if (regularImmutableSortedSet.isEmpty()) {
            throw C8j3.A1D();
        }
        return regularImmutableSortedSet.A00.get(C8j3.A0K(regularImmutableSortedSet));
    }

    @Override // java.util.NavigableSet
    public final E lower(E e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int iA0C = regularImmutableSortedSet.A0C(e, false) - 1;
        if (iA0C == -1) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(iA0C);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(), this.A01);
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.A01 = comparator;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object toElement) {
        toElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0E(0, regularImmutableSortedSet.A0C(toElement, false));
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object fromElement, Object toElement) {
        fromElement.getClass();
        toElement.getClass();
        Preconditions.checkArgument(BV7.A1R(this.A01.compare(fromElement, toElement)));
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet<E> regularImmutableSortedSetA0E = regularImmutableSortedSet.A0E(regularImmutableSortedSet.A0D(fromElement, true), regularImmutableSortedSet.size());
        return regularImmutableSortedSetA0E.A0E(0, regularImmutableSortedSetA0E.A0C(toElement, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object fromElement) {
        fromElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0E(regularImmutableSortedSet.A0D(fromElement, true), regularImmutableSortedSet.size());
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet headSet(Object toElement, boolean inclusive) {
        toElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0E(0, regularImmutableSortedSet.A0C(toElement, inclusive));
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        fromElement.getClass();
        toElement.getClass();
        Preconditions.checkArgument(BV7.A1R(this.A01.compare(fromElement, toElement)));
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet<E> regularImmutableSortedSetA0E = regularImmutableSortedSet.A0E(regularImmutableSortedSet.A0D(fromElement, fromInclusive), regularImmutableSortedSet.size());
        return regularImmutableSortedSetA0E.A0E(0, regularImmutableSortedSetA0E.A0C(toElement, toInclusive));
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet tailSet(Object fromElement, boolean inclusive) {
        fromElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0E(regularImmutableSortedSet.A0D(fromElement, inclusive), regularImmutableSortedSet.size());
    }
}
