package com.google.common.collect;

import X.AbstractC3830CfJ;
import X.AbstractC5011DNy;
import X.AbstractC7483Exg;
import X.AbstractC7489Ext;
import X.BV7;
import X.BV8;
import X.C3cG;
import X.C8j3;
import X.DOA;
import X.DOI;
import X.DOJ;
import X.Eu2;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public static final AbstractC5011DNy<Object> EMPTY_ITR = new DOA(RegularImmutableList.A02, 0);
    public static final long serialVersionUID = -889275714;

    public final class Builder<E> extends DOI<E> {
        @Override // X.DOJ
        public ImmutableList<E> build() {
            this.A01 = true;
            return ImmutableList.asImmutableList(this.A02, this.A00);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.common.collect.ImmutableList.Builder<E> addAll(java.lang.Iterable<? extends E> r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Collection
                if (r0 == 0) goto L1f
                r2 = r4
                java.util.Collection r2 = (java.util.Collection) r2
                int r0 = r2.size()
                X.DOI.A01(r3, r0)
                boolean r0 = r2 instanceof com.google.common.collect.ImmutableCollection
                if (r0 == 0) goto L1f
                com.google.common.collect.ImmutableCollection r2 = (com.google.common.collect.ImmutableCollection) r2
                java.lang.Object[] r1 = r3.A02
                int r0 = r3.A00
                int r0 = r2.copyIntoArray(r1, r0)
                r3.A00 = r0
            L1e:
                return r3
            L1f:
                java.util.Iterator r1 = r4.iterator()
            L23:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L1e
                java.lang.Object r0 = r1.next()
                r3.add(r0)
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableList.Builder.addAll(java.lang.Iterable):com.google.common.collect.ImmutableList$Builder");
        }

        public Builder(int capacity) {
            AbstractC3830CfJ.A00(capacity, "initialCapacity");
            this.A02 = new Object[capacity];
            this.A00 = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.DOI, X.DOJ
        public /* bridge */ /* synthetic */ DOI add(Object element) {
            add((Builder<E>) element);
            return this;
        }

        public Builder() {
            this(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.DOI, X.DOJ
        public /* bridge */ /* synthetic */ DOJ add(Object element) {
            add((Builder<E>) element);
            return this;
        }

        public Builder<E> addAll(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                add((Builder<E>) elements.next());
            }
            return this;
        }

        @Override // X.DOI, X.DOJ
        public Builder<E> add(E... elements) {
            super.add((Object[]) elements);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.DOI, X.DOJ
        public /* bridge */ /* synthetic */ DOJ add(Object[] elements) {
            add(elements);
            return this;
        }

        @Override // X.DOI, X.DOJ
        public Builder<E> add(E element) {
            super.add((Builder<E>) element);
            return this;
        }
    }

    public class ReverseImmutableList<E> extends ImmutableList<E> {
        public final transient ImmutableList<E> A00;

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0A() {
            return this.A00.A0A();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            return this.A00.contains(object);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object object) {
            int iLastIndexOf = this.A00.lastIndexOf(object);
            if (iLastIndexOf >= 0) {
                return A00(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object object) {
            int iIndexOf = this.A00.indexOf(object);
            if (iIndexOf >= 0) {
                return A00(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList<E> reverse() {
            return this.A00;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.A00.size();
        }

        public ReverseImmutableList(ImmutableList<E> backingList) {
            this.A00 = backingList;
        }

        private int A00(int index) {
            return C8j3.A0K(this) - index;
        }

        private int A01(int index) {
            return size() - index;
        }

        @Override // java.util.List
        public final E get(int index) {
            Preconditions.checkElementIndex(index, size());
            return this.A00.get(A00(index));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ImmutableList<E> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            return this.A00.subList(A01(toIndex), A01(fromIndex)).reverse();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }
    }

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public Object readResolve() {
            return ImmutableList.copyOf(this.elements);
        }

        public SerializedForm(Object[] elements) {
            this.elements = elements;
        }
    }

    public class SubList extends ImmutableList<E> {
        public final transient int A00;
        public final transient int A01;

        public SubList(int offset, int length) {
            this.A01 = offset;
            this.A00 = length;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int A07() {
            return ImmutableList.this.A08() + this.A01 + this.A00;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int A08() {
            return ImmutableList.this.A08() + this.A01;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] A09() {
            return ImmutableList.this.A09();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0A() {
            return true;
        }

        @Override // java.util.List
        public final E get(int index) {
            Preconditions.checkElementIndex(index, this.A00);
            return ImmutableList.this.get(index + this.A01);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.A00;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ImmutableList<E> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, this.A00);
            ImmutableList immutableList = ImmutableList.this;
            int i = this.A01;
            return immutableList.subList(fromIndex + i, toIndex + i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] elements) {
        return asImmutableList(elements, elements.length);
    }

    public static <E> ImmutableList<E> construct(Object... elements) {
        Eu2.A00(elements.length, elements);
        return asImmutableList(elements);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    public ImmutableList<E> subListUnchecked(int fromIndex, int toIndex) {
        return new SubList(fromIndex, toIndex - fromIndex);
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int expectedSize) {
        AbstractC3830CfJ.A00(expectedSize, "expectedSize");
        return new Builder<>(expectedSize);
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        Collection collectionA0h;
        if (elements instanceof Collection) {
            collectionA0h = (Collection) elements;
        } else {
            Iterator<? extends E> it = elements.iterator();
            collectionA0h = C3cG.A0h();
            AbstractC7483Exg.A01(collectionA0h, it);
        }
        Object[] array = collectionA0h.toArray();
        Eu2.A00(array.length, array);
        Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                        return false;
                    }
                }
                return !it2.hasNext();
            }
            for (int i = 0; i < size; i++) {
                if (!Objects.equal(get(i), list.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.List
    public int indexOf(Object object) {
        if (object != null) {
            if (this instanceof RandomAccess) {
                int size = size();
                for (int i = 0; i < size; i++) {
                    if (BV7.A1Y(object, this, i)) {
                        return i;
                    }
                }
            } else {
                ListIterator listIterator = listIterator();
                while (listIterator.hasNext()) {
                    if (Objects.equal(object, listIterator.next())) {
                        return listIterator.previousIndex();
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object object) {
        if (object == null) {
            return -1;
        }
        if (!(this instanceof RandomAccess)) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (Objects.equal(object, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        }
        int size = size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!BV7.A1Y(object, this, size));
        return size;
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return of();
        }
        E next = elements.next();
        if (!elements.hasNext()) {
            return of((Object) next);
        }
        Builder builder = new Builder();
        builder.add((Builder) next);
        builder.addAll(elements);
        return builder.build();
    }

    public static <E> ImmutableList<E> of(E e1) {
        return construct(e1);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int index, E element) {
        throw C8j3.A17();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw C8j3.A17();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object object) {
        return C8j3.A1Q(indexOf(object));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] dst, int offset) {
        int size = size();
        for (int i = 0; i < size; i++) {
            dst[offset + i] = get(i);
        }
        return offset + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iA0C = 1;
        for (int i = 0; i < size; i++) {
            iA0C = BV8.A0C(this, iA0C, i);
        }
        return iA0C;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public AbstractC7489Ext<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public AbstractC5011DNy<E> listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        return isEmpty() ? (AbstractC5011DNy<E>) EMPTY_ITR : new DOA(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int index) {
        throw C8j3.A17();
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int index, E element) {
        throw C8j3.A17();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int fromIndex, int toIndex) {
        Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        return i == size() ? this : i == 0 ? of() : subListUnchecked(fromIndex, toIndex);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] elements, int length) {
        if (length == 0) {
            return of();
        }
        return new RegularImmutableList(length, elements);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> elements) {
        if (elements instanceof ImmutableCollection) {
            ImmutableList<E> immutableListAsList = ((ImmutableCollection) elements).asList();
            if (immutableListAsList.A0A()) {
                return asImmutableList(immutableListAsList.toArray());
            }
            return immutableListAsList;
        }
        return construct(elements.toArray());
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3) {
        return construct(e1, e2, e3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> ImmutableList<E> copyOf(E[] elements) {
        if (elements.length == 0) {
            return of();
        }
        return construct((Object[]) elements.clone());
    }

    @Override // java.util.List
    public AbstractC5011DNy<E> listIterator() {
        return listIterator(0);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... others) {
        Object[] objArr = new Object[192];
        objArr[0] = "Blues";
        objArr[1] = "Classic Rock";
        objArr[2] = "Country";
        objArr[3] = "Dance";
        objArr[4] = "Disco";
        objArr[5] = "Funk";
        objArr[6] = "Grunge";
        objArr[7] = "Hip-Hop";
        objArr[8] = "Jazz";
        objArr[9] = "Metal";
        objArr[10] = "New Age";
        objArr[11] = "Oldies";
        System.arraycopy(others, 0, objArr, 12, 180);
        return construct(objArr);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return copyOf((Collection) elements);
        }
        return copyOf(elements.iterator());
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5) {
        return construct(e1, e2, e3, e4, e5);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
        return construct(e1, e2, e3, e4, e5, e6);
    }

    public static <E> ImmutableList<E> of(E e1, E e2) {
        return construct(e1, e2);
    }

    public static <E> ImmutableList<E> of() {
        return (ImmutableList<E>) RegularImmutableList.A02;
    }
}
