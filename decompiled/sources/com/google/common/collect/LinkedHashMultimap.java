package com.google.common.collect;

import X.BV8;
import X.DPY;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient ValueEntry<K, V> A01;

    public final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements DPY<K, V> {
        public ValueEntry<K, V> nextInValueBucket;
        public ValueEntry<K, V> predecessorInMultimap;
        public DPY<K, V> predecessorInValueSet;
        public final int smearedValueHash;
        public ValueEntry<K, V> successorInMultimap;
        public DPY<K, V> successorInValueSet;

        @Override // X.DPY
        public final DPY<K, V> ALG() {
            DPY<K, V> dpy = this.successorInValueSet;
            dpy.getClass();
            return dpy;
        }

        /* JADX WARN: Incorrect types in method signature: (TK;TV;ILcom/google/common/collect/LinkedHashMultimap$ValueEntry<TK;TV;>;)V */
        public ValueEntry(ValueEntry key, Object value, Object smearedValueHash, int nextInValueBucket) {
            super(value, smearedValueHash);
            this.smearedValueHash = nextInValueBucket;
            this.nextInValueBucket = key;
        }

        @Override // X.DPY
        public final void AeA(DPY<K, V> entry) {
            this.predecessorInValueSet = entry;
        }

        @Override // X.DPY
        public final void Aes(DPY<K, V> entry) {
            this.successorInValueSet = entry;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        ValueEntry<K, V> valueEntry = new ValueEntry<>(null, null, null, 0);
        this.A01 = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
        this.A00 = 2;
        int i = stream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = stream.readObject();
            compactLinkedHashMap.put(object, A01(object));
        }
        int i3 = stream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = stream.readObject();
            Object object3 = stream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(object2);
            collection.getClass();
            collection.add(object3);
        }
        A04(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
        stream.writeInt(((AbstractMapBasedMultimap) this).A00);
        Iterator<Map.Entry<K, V>> it2 = A05().iterator();
        while (it2.hasNext()) {
            BV8.A1J(stream, it2);
        }
    }

    @Override // com.google.common.collect.AbstractSetMultimap, X.AbstractC5024DOu, X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Collection AAn() {
        return A05();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, X.InterfaceC5023DOs
    public final void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.A01;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
    }
}
