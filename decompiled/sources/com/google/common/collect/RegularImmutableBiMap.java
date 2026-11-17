package com.google.common.collect;

import X.DKL;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap<Object, Object> A05 = new RegularImmutableBiMap<>();
    public final transient RegularImmutableBiMap<V, K> A00;
    public final transient Object[] A01;
    public final transient int A02;
    public final transient int A03;
    public final transient Object A04;

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new RegularImmutableMap.EntrySet(this, this.A01, this.A02, this.A03);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> createKeySet() {
        return new RegularImmutableMap.KeySet(new RegularImmutableMap.KeysOrValuesAsList(this.A01, this.A02, this.A03), this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object obj) {
        V v = (V) RegularImmutableMap.A00(this.A04, obj, this.A01, this.A03, this.A02);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new ImmutableBiMap.SerializedForm(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RegularImmutableBiMap() {
        this.A04 = null;
        this.A01 = new Object[0];
        this.A02 = 0;
        this.A03 = 0;
        this.A00 = this;
    }

    public RegularImmutableBiMap(int alternatingKeysAndValues, Object[] size) {
        int iA00;
        this.A01 = size;
        this.A03 = alternatingKeysAndValues;
        this.A02 = 0;
        if (alternatingKeysAndValues >= 2) {
            iA00 = ImmutableSet.A00(alternatingKeysAndValues);
        } else {
            iA00 = 0;
        }
        Object objA01 = RegularImmutableMap.A01(size, alternatingKeysAndValues, iA00, 0);
        if (!(objA01 instanceof Object[])) {
            this.A04 = objA01;
            objA01 = RegularImmutableMap.A01(size, alternatingKeysAndValues, iA00, 1);
            if (!(objA01 instanceof Object[])) {
                this.A00 = new RegularImmutableBiMap<>(this, objA01, size, alternatingKeysAndValues);
                return;
            }
        }
        throw ((DKL) ((Object[]) objA01)[2]).A00();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;[Ljava/lang/Object;ILcom/google/common/collect/RegularImmutableBiMap<TV;TK;>;)V */
    public RegularImmutableBiMap(RegularImmutableBiMap valueHashTable, Object alternatingKeysAndValues, Object[] size, int inverse) {
        this.A04 = alternatingKeysAndValues;
        this.A01 = size;
        this.A02 = 1;
        this.A03 = inverse;
        this.A00 = valueHashTable;
    }
}
