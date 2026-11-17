package com.google.common.collect;

import com.google.common.base.Preconditions;

/* loaded from: classes5.dex */
public class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> A02 = new RegularImmutableList(0, new Object[0]);
    public final transient Object[] A00;
    public final transient int A01;

    @Override // com.google.common.collect.ImmutableCollection
    public final int A07() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int A08() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] A09() {
        return this.A00;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0A() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int dstOff) {
        Object[] objArr = this.A00;
        int i = this.A01;
        System.arraycopy(objArr, 0, dst, dstOff, i);
        return dstOff + i;
    }

    @Override // java.util.List
    public final E get(int i) {
        Preconditions.checkElementIndex(i, this.A01);
        E e = (E) this.A00[i];
        e.getClass();
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    public RegularImmutableList(int array, Object[] size) {
        this.A00 = size;
        this.A01 = array;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
