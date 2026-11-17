package com.meta.maps;

import X.BOA;
import X.BV4;
import X.C8j3;
import X.F60;
import X.InterfaceC0884AGl;
import com.meta.maps.NativeBase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public abstract class AbstractNativeList extends NativeBase implements List, InterfaceC0884AGl {
    public Integer _size;

    /* loaded from: classes5.dex */
    public final class NativeIterator implements ListIterator, BOA {
        public int index;

        public NativeIterator() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return C8j3.A1Q(this.index);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index + 1;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw C8j3.A17();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            throw BV4.A0a("size");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            hasNext();
            throw null;
        }

        @Override // java.util.ListIterator
        public T previous() {
            if (hasPrevious()) {
                throw BV4.A0a("get");
            }
            throw C8j3.A1D();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw C8j3.A17();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw C8j3.A17();
        }
    }

    @Override // java.util.List
    public abstract void add(int i, T t);

    @Override // java.util.List, java.util.Collection
    public abstract boolean add(T t);

    @Override // java.util.List
    public abstract boolean addAll(int i, Collection<? extends T> collection);

    @Override // java.util.List, java.util.Collection
    public abstract boolean addAll(Collection<? extends T> collection);

    @Override // java.util.List, java.util.Collection
    public abstract void clear();

    @Override // java.util.List, java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.List, java.util.Collection
    public abstract boolean containsAll(Collection<?> collection);

    public abstract int getSize();

    @Override // java.util.List
    public abstract int indexOf(Object obj);

    @Override // java.util.List, java.util.Collection
    public abstract boolean isEmpty();

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public abstract Iterator<T> iterator();

    @Override // java.util.List
    public abstract int lastIndexOf(Object obj);

    @Override // java.util.List
    public abstract ListIterator<T> listIterator();

    @Override // java.util.List
    public abstract ListIterator<T> listIterator(int i);

    public abstract int obtainSize();

    @Override // java.util.List
    public abstract /* bridge */ T remove(int i);

    @Override // java.util.List, java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.List, java.util.Collection
    public abstract boolean removeAll(Collection<?> collection);

    public abstract T removeAt(int i);

    @Override // java.util.List, java.util.Collection
    public abstract boolean retainAll(Collection<?> collection);

    @Override // java.util.List
    public abstract T set(int i, T t);

    @Override // java.util.List, java.util.Collection
    public abstract /* bridge */ int size();

    @Override // java.util.List
    public abstract List<T> subList(int i, int i2);

    @Override // java.util.List, java.util.Collection
    public abstract Object[] toArray();

    @Override // java.util.List, java.util.Collection
    public abstract <T> T[] toArray(T[] tArr);

    public AbstractNativeList(long j, NativeBase.Disposer disposer) {
        throw F60.createAndThrow();
    }

    private final List<Object> toArrayList() {
        throw F60.createAndThrow();
    }
}
