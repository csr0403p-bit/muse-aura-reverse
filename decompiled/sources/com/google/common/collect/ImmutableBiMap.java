package com.google.common.collect;

import X.BV4;
import X.F60;
import X.InterfaceC7493Ey1;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* loaded from: classes5.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements InterfaceC7493Ey1<K, V> {
    public static final long serialVersionUID = 912559;

    public class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        public static final long serialVersionUID = 0;
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ ImmutableCollection values() {
        return ((RegularImmutableBiMap) this).A00.keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final /* bridge */ /* synthetic */ ImmutableCollection createValues() {
        throw BV4.A0N("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        throw F60.createAndThrow();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return ((RegularImmutableBiMap) this).A00.keySet();
    }
}
