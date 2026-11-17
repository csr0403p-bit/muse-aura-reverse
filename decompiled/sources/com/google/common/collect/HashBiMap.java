package com.google.common.collect;

import X.F60;
import X.InterfaceC7493Ey1;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;

/* loaded from: classes5.dex */
public abstract class HashBiMap<K, V> extends AbstractMap<K, V> implements InterfaceC7493Ey1<K, V>, Serializable {
    private void readObject(ObjectInputStream stream) {
        throw F60.createAndThrow();
    }

    private void writeObject(ObjectOutputStream stream) {
        throw F60.createAndThrow();
    }
}
