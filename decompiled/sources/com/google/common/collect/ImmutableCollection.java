package com.google.common.collect;

import X.AbstractC7489Ext;
import X.BV4;
import X.BV7;
import X.C8j3;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableMultiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes5.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] A00 = BV4.A1W();
    public static final long serialVersionUID = 912559;

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object object);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract AbstractC7489Ext<E> iterator();

    public abstract Object writeReplace();

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public int A07() {
        if (this instanceof RegularImmutableSortedSet) {
            return ((RegularImmutableSortedSet) this).A00.A07();
        }
        if (this instanceof RegularImmutableSet) {
            return ((RegularImmutableSet) this).A00;
        }
        throw C8j3.A17();
    }

    public int A08() {
        if (this instanceof RegularImmutableSortedSet) {
            return ((RegularImmutableSortedSet) this).A00.A08();
        }
        if (this instanceof RegularImmutableSet) {
            return 0;
        }
        throw C8j3.A17();
    }

    public Object[] A09() {
        if (this instanceof RegularImmutableSortedSet) {
            return ((RegularImmutableSortedSet) this).A00.A09();
        }
        if (this instanceof RegularImmutableSet) {
            return ((RegularImmutableSet) this).A01;
        }
        return null;
    }

    public boolean A0A() {
        ImmutableCollection immutableCollection;
        if (this instanceof SingletonImmutableSet) {
            return false;
        }
        if (this instanceof RegularImmutableSortedSet) {
            immutableCollection = ((RegularImmutableSortedSet) this).A00;
        } else {
            if (this instanceof RegularImmutableSet) {
                return false;
            }
            if ((this instanceof RegularImmutableMap.KeySet) || (this instanceof RegularImmutableMap.EntrySet) || (this instanceof RegularImmutableMultiset.ElementSet)) {
                return true;
            }
            if (this instanceof ImmutableMultiset.EntrySet) {
                immutableCollection = ImmutableMultiset.this;
            } else {
                if (this instanceof ImmutableMapEntrySet) {
                    return ImmutableSortedMap.this.isPartialView();
                }
                if (this instanceof RegularImmutableMultiset) {
                    return false;
                }
                if (this instanceof RegularImmutableSortedMultiset) {
                    RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
                    return regularImmutableSortedMultiset.A01 > 0 || regularImmutableSortedMultiset.A00 < regularImmutableSortedMultiset.A03.length - 1;
                }
                immutableCollection = ((DescendingImmutableSortedMultiset) this).A00;
            }
        }
        return immutableCollection.A0A();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> newElements) {
        throw C8j3.A17();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.of() : ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw C8j3.A17();
    }

    public int copyIntoArray(Object[] dst, int offset) {
        AbstractC7489Ext<E> it = iterator();
        while (it.hasNext()) {
            dst[offset] = it.next();
            offset++;
        }
        return offset;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object object) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> oldElements) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] objArrA09 = A09();
            if (objArrA09 != null) {
                return (T[]) Arrays.copyOfRange(objArrA09, A08(), A07(), tArr.getClass());
            }
            if (length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        } else {
            BV7.A1P(tArr, length, size);
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }
}
