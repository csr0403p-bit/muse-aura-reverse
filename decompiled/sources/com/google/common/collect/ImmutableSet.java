package com.google.common.collect;

import X.BV6;
import X.BV8;
import X.C5034DPt;
import X.DNI;
import X.DNa;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableMultiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableList<E> A00;

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public Object readResolve() {
            return ImmutableSet.A02(this.elements);
        }

        public SerializedForm(Object[] elements) {
            this.elements = elements;
        }
    }

    public static int A00(int setSize) {
        int iHighestOneBit;
        int iMax = Math.max(setSize, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            Preconditions.checkArgument(iMax < 1073741824, "collection too large");
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> A02(E[] elements) {
        int length = elements.length;
        return length != 0 ? length != 1 ? A03((Object[]) elements.clone(), length) : new SingletonImmutableSet(elements[0]) : RegularImmutableSet.A05;
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Object;>(I[Ljava/lang/Object;)Lcom/google/common/collect/ImmutableSet<TE;>; */
    public static ImmutableSet A03(Object[] n, int elements) {
        Object objA0n;
        Object[] objArrCopyOf = n;
        if (elements == 0) {
            return RegularImmutableSet.A05;
        }
        if (elements != 1) {
            int iA00 = A00(elements);
            Object[] objArr = new Object[iA00];
            int i = iA00 - 1;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < elements; i4++) {
                Object obj = objArrCopyOf[i4];
                if (obj == null) {
                    throw BV8.A0n(i4);
                }
                int iHashCode = obj.hashCode();
                int iA01 = DNI.A01(iHashCode);
                while (true) {
                    int i5 = iA01 & i;
                    Object obj2 = objArr[i5];
                    if (obj2 == null) {
                        objArrCopyOf[i3] = obj;
                        objArr[i5] = obj;
                        i2 += iHashCode;
                        i3++;
                        break;
                    }
                    if (!obj2.equals(obj)) {
                        iA01++;
                    }
                }
            }
            Arrays.fill(objArrCopyOf, i3, elements, (Object) null);
            if (i3 != 1) {
                if (A00(i3) < iA00 / 2) {
                    return A03(objArrCopyOf, i3);
                }
                int length = objArrCopyOf.length;
                if (i3 < (length >> 1) + (length >> 2)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                }
                return new RegularImmutableSet(objArrCopyOf, objArr, i2, i, i3);
            }
            objA0n = BV6.A0n(objArrCopyOf, 0);
        } else {
            objA0n = BV6.A0n(n, 0);
        }
        return new SingletonImmutableSet(objA0n);
    }

    public static <E> ImmutableSet<E> A01(Collection<? extends E> elements) {
        if ((elements instanceof ImmutableSet) && !(elements instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) elements;
            if (!immutableSet.A0A()) {
                return immutableSet;
            }
        }
        Object[] array = elements.toArray();
        return A03(array, array.length);
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableListAsImmutableList = this.A00;
        if (immutableListAsImmutableList == null) {
            if (this instanceof RegularImmutableSet) {
                RegularImmutableSet regularImmutableSet = (RegularImmutableSet) this;
                immutableListAsImmutableList = ImmutableList.asImmutableList(regularImmutableSet.A01, regularImmutableSet.A00);
            } else if (this instanceof RegularImmutableMap.EntrySet) {
                final RegularImmutableMap.EntrySet entrySet = (RegularImmutableMap.EntrySet) this;
                immutableListAsImmutableList = (ImmutableList<E>) new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.List
                    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                    public final Map.Entry<K, V> get(int index) {
                        Preconditions.checkElementIndex(index, EntrySet.this.A01);
                        EntrySet entrySet2 = EntrySet.this;
                        int i = index * 2;
                        Object objA0n = BV6.A0n(entrySet2.A02, entrySet2.A00 + i);
                        EntrySet entrySet3 = EntrySet.this;
                        return new AbstractMap.SimpleImmutableEntry(objA0n, BV6.A0n(entrySet3.A02, i + (entrySet3.A00 ^ 1)));
                    }

                    @Override // com.google.common.collect.ImmutableCollection
                    public final boolean A0A() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return EntrySet.this.A01;
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    public Object writeReplace() {
                        return super.writeReplace();
                    }
                };
            } else if (this instanceof IndexedImmutableSet) {
                final IndexedImmutableSet indexedImmutableSet = (IndexedImmutableSet) this;
                immutableListAsImmutableList = new ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.1
                    @Override // com.google.common.collect.ImmutableCollection
                    public final boolean A0A() {
                        return IndexedImmutableSet.this.A0A();
                    }

                    @Override // java.util.List
                    public final E get(int i) {
                        IndexedImmutableSet indexedImmutableSet2 = IndexedImmutableSet.this;
                        if (!(indexedImmutableSet2 instanceof RegularImmutableMultiset.ElementSet)) {
                            return (E) ((ImmutableMultiset.EntrySet) indexedImmutableSet2).this$0.A0D(i);
                        }
                        C5034DPt<E> c5034DPt = ((RegularImmutableMultiset.ElementSet) indexedImmutableSet2).this$0.A01;
                        Preconditions.checkElementIndex(i, c5034DPt.A02);
                        return (E) c5034DPt.A07[i];
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return IndexedImmutableSet.this.size();
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    public Object writeReplace() {
                        return super.writeReplace();
                    }
                };
            } else if (this instanceof ImmutableSortedMap.C1EntrySet) {
                final ImmutableSortedMap.C1EntrySet c1EntrySet = (ImmutableSortedMap.C1EntrySet) this;
                immutableListAsImmutableList = (ImmutableList<E>) new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.List
                    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                    public final Map.Entry<K, V> get(int index) {
                        ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.this;
                        ImmutableSortedMap<Comparable<?>, Object> immutableSortedMap2 = ImmutableSortedMap.A03;
                        return new AbstractMap.SimpleImmutableEntry(immutableSortedMap.A02.A00.get(index), ImmutableSortedMap.this.A01.get(index));
                    }

                    @Override // com.google.common.collect.ImmutableCollection
                    public final boolean A0A() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return ImmutableSortedMap.this.size();
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    public Object writeReplace() {
                        return super.writeReplace();
                    }
                };
            } else {
                immutableListAsImmutableList = ImmutableList.asImmutableList(toArray());
            }
            this.A00 = immutableListAsImmutableList;
        }
        return immutableListAsImmutableList;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof ImmutableSet) && (this instanceof RegularImmutableSet) && (((ImmutableSet) object) instanceof RegularImmutableSet) && hashCode() != object.hashCode()) {
            return false;
        }
        return DNa.A03(object, this);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return DNa.A00(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
