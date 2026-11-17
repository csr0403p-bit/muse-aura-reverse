package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class Multimaps$CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
    public static final long serialVersionUID = 0;
    public transient Supplier<? extends List<V>> A00;

    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        object.getClass();
        this.A00 = (Supplier) object;
        Object object2 = stream.readObject();
        object2.getClass();
        A04((Map) object2);
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.A00);
        stream.writeObject(((AbstractMapBasedMultimap) this).A01);
    }
}
