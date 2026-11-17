package com.google.common.collect;

import X.AbstractC7489Ext;
import X.DNI;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final RegularImmutableSet<Object> A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient Object[] A01;
    public final transient Object[] A02;
    public final transient int A03;
    public final transient int A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new RegularImmutableSet<>(objArr, objArr, 0, 0, 0);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object target) {
        Object[] objArr = this.A02;
        if (target == null || objArr.length == 0) {
            return false;
        }
        int iA01 = DNI.A01(target.hashCode());
        while (true) {
            int i = iA01 & this.A04;
            Object obj = objArr[i];
            if (obj == null) {
                return false;
            }
            if (obj.equals(target)) {
                return true;
            }
            iA01 = i + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        Object[] objArr = this.A01;
        int i = this.A00;
        System.arraycopy(objArr, 0, dst, offset, i);
        return offset + i;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A03;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public RegularImmutableSet(Object[] elements, Object[] hashCode, int table, int mask, int size) {
        this.A01 = elements;
        this.A03 = table;
        this.A02 = hashCode;
        this.A04 = mask;
        this.A00 = size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final AbstractC7489Ext<E> iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return asList().iterator();
    }
}
