package com.google.common.collect;

import X.AbstractC7489Ext;
import X.C1C;
import X.FGI;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    public final transient E A00;

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> asList() {
        return ImmutableList.of((Object) this.A00);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object target) {
        return this.A00.equals(target);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        dst[offset] = this.A00;
        return offset + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final AbstractC7489Ext<E> iterator() {
        return new C1C(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return FGI.A0N("[", this.A00.toString(), ']');
    }

    public SingletonImmutableSet(E element) {
        element.getClass();
        this.A00 = element;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C1C(this.A00);
    }
}
