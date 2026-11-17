package com.google.common.collect;

import X.DPA;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ImmutableEntry<K, V> extends DPA<K, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final K key;
    public final V value;

    public ImmutableEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
