package com.google.common.collect;

import X.DPC;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes5.dex */
public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    public static final long serialVersionUID = 0;
    public transient int A00;

    public HashMultimap() {
        CompactHashMap compactHashMap = new CompactHashMap(12);
        Preconditions.checkArgument(compactHashMap.isEmpty());
        ((AbstractMapBasedMultimap) this).A01 = compactHashMap;
        this.A00 = 2;
        this.A00 = 2;
    }

    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.A00 = 2;
        int i = stream.readInt();
        A04(new CompactHashMap(12));
        DPC.A00(this, stream, i);
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        DPC.A01(this, stream);
    }
}
