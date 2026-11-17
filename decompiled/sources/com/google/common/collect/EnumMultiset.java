package com.google.common.collect;

import X.DPj;
import X.F60;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;

/* loaded from: classes5.dex */
public abstract class EnumMultiset<E extends Enum<E>> extends DPj<E> implements Serializable {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream stream) {
        throw F60.createAndThrow();
    }

    private void writeObject(ObjectOutputStream stream) {
        throw F60.createAndThrow();
    }
}
