package com.google.common.collect;

import X.AbstractC7489Ext;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        return asList().copyIntoArray(dst, offset);
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
