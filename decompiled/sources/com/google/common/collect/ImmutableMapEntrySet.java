package com.google.common.collect;

import X.BV7;
import X.BV8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public class EntrySetSerializedForm<K, V> implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableMap<K, V> map;

        public Object readResolve() {
            return BV8.A0h(this.map);
        }

        public EntrySetSerializedForm(ImmutableMap<K, V> map) {
            this.map = map;
        }
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        V v = ImmutableSortedMap.this.get(entry.getKey());
        if (v != null) {
            return BV7.A1X(v, entry.getValue(), false);
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return ImmutableSortedMap.this.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ImmutableSortedMap.this.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new EntrySetSerializedForm(ImmutableSortedMap.this);
    }
}
