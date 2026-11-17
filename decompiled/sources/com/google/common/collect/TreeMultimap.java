package com.google.common.collect;

import X.DPC;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    public static final long serialVersionUID = 0;
    public transient Comparator<? super K> A00;
    public transient Comparator<? super V> A01;

    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) stream.readObject();
        comparator.getClass();
        this.A00 = comparator;
        Comparator<? super V> comparator2 = (Comparator) stream.readObject();
        comparator2.getClass();
        this.A01 = comparator2;
        A04(new TreeMap(this.A00));
        DPC.A00(this, stream, stream.readInt());
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.A00);
        stream.writeObject(this.A01);
        DPC.A01(this, stream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: A06 */
    public final /* bridge */ /* synthetic */ Set AC1(Object key) {
        return A08(key);
    }

    @Override // X.AbstractC5024DOu, X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Map A4n() {
        return A09();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Collection AC1(Object key) {
        return A08(key);
    }

    @Override // X.AbstractC5024DOu, X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Set keySet() {
        return A0A();
    }
}
