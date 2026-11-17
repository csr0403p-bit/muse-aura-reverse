package com.google.common.collect;

import X.F60;
import X.InterfaceC5010DNv;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes5.dex */
public abstract class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements InterfaceC5010DNv<K, V> {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream stream) {
        throw F60.createAndThrow();
    }

    private void writeObject(ObjectOutputStream stream) {
        throw F60.createAndThrow();
    }
}
