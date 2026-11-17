package com.google.common.collect;

import X.AbstractC7489Ext;
import X.AnonymousClass002;
import X.BV6;
import X.BV7;
import X.DKL;
import X.DNI;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap<Object, Object> A03 = new RegularImmutableMap(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;
    public final transient Object A02;

    public class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient int A00;
        public final transient int A01;
        public final transient Object[] A02;
        public final transient ImmutableMap<K, V> A03;

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                return BV7.A1X(value, this.A03.get(key), false);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.A01;
        }

        public EntrySet(ImmutableMap<K, V> map, Object[] alternatingKeysAndValues, int keyOffset, int size) {
            this.A03 = map;
            this.A02 = alternatingKeysAndValues;
            this.A00 = keyOffset;
            this.A01 = size;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(Object[] dst, int offset) {
            return asList().copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final AbstractC7489Ext<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return asList().iterator();
        }
    }

    public final class KeySet<K> extends ImmutableSet<K> {
        public final transient ImmutableList<K> A00;
        public final transient ImmutableMap<K, ?> A01;

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList<K> asList() {
            return this.A00;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            return AnonymousClass002.A1X(this.A01.get(object));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(Object[] dst, int offset) {
            return this.A00.copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final AbstractC7489Ext<K> iterator() {
            return this.A00.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.A01.size();
        }

        /* JADX WARN: Incorrect types in method signature: (Lcom/google/common/collect/ImmutableMap<TK;*>;Lcom/google/common/collect/ImmutableList<TK;>;)V */
        public KeySet(ImmutableList map, ImmutableMap list) {
            this.A01 = list;
            this.A00 = map;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return this.A00.iterator();
        }
    }

    public final class KeysOrValuesAsList extends ImmutableList<Object> {
        public final transient int A00;
        public final transient int A01;
        public final transient Object[] A02;

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0A() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int index) {
            Preconditions.checkElementIndex(index, this.A01);
            return BV6.A0n(this.A02, (index * 2) + this.A00);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.A01;
        }

        public KeysOrValuesAsList(Object[] alternatingKeysAndValues, int offset, int size) {
            this.A02 = alternatingKeysAndValues;
            this.A00 = offset;
            this.A01 = size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static Object A00(Object hashTableObject, Object alternatingKeysAndValues, Object[] size, int keyOffset, int key) {
        int i;
        if (alternatingKeysAndValues == null) {
            return null;
        }
        if (keyOffset == 1) {
            if (BV6.A0n(size, key).equals(alternatingKeysAndValues)) {
                return BV6.A0n(size, key ^ 1);
            }
            return null;
        }
        if (hashTableObject == null) {
            return null;
        }
        if (hashTableObject instanceof byte[]) {
            byte[] bArr = (byte[]) hashTableObject;
            int length = bArr.length - 1;
            int iA01 = DNI.A01(alternatingKeysAndValues.hashCode());
            while (true) {
                int i2 = iA01 & length;
                i = bArr[i2] & 255;
                if (i == 255) {
                    return null;
                }
                if (alternatingKeysAndValues.equals(size[i])) {
                    break;
                }
                iA01 = i2 + 1;
            }
        } else if (hashTableObject instanceof short[]) {
            short[] sArr = (short[]) hashTableObject;
            int length2 = sArr.length - 1;
            int iA012 = DNI.A01(alternatingKeysAndValues.hashCode());
            while (true) {
                int i3 = iA012 & length2;
                i = sArr[i3] & 65535;
                if (i == 65535) {
                    return null;
                }
                if (alternatingKeysAndValues.equals(size[i])) {
                    break;
                }
                iA012 = i3 + 1;
            }
        } else {
            int[] iArr = (int[]) hashTableObject;
            int length3 = iArr.length - 1;
            int iA013 = DNI.A01(alternatingKeysAndValues.hashCode());
            while (true) {
                int i4 = iA013 & length3;
                i = iArr[i4];
                if (i == -1) {
                    return null;
                }
                if (alternatingKeysAndValues.equals(size[i])) {
                    break;
                }
                iA013 = i4 + 1;
            }
        }
        return size[i ^ 1];
    }

    public static Object A01(Object[] alternatingKeysAndValues, int n, int tableSize, int keyOffset) {
        int i;
        Object[] objArr;
        DKL dkl = null;
        if (n == 1) {
            alternatingKeysAndValues[keyOffset].getClass();
            alternatingKeysAndValues[keyOffset ^ 1].getClass();
            return null;
        }
        int i2 = tableSize - 1;
        if (tableSize <= 128) {
            byte[] bArr = new byte[tableSize];
            Arrays.fill(bArr, (byte) -1);
            i = 0;
            for (int i3 = 0; i3 < n; i3++) {
                int i4 = (i3 * 2) + keyOffset;
                int i5 = (i * 2) + keyOffset;
                Object objA0n = BV6.A0n(alternatingKeysAndValues, i4);
                Object objA0n2 = BV6.A0n(alternatingKeysAndValues, i4 ^ 1);
                int iA01 = DNI.A01(objA0n.hashCode());
                while (true) {
                    int i6 = iA01 & i2;
                    int i7 = bArr[i6] & 255;
                    if (i7 == 255) {
                        bArr[i6] = (byte) i5;
                        if (i < i3) {
                            alternatingKeysAndValues[i5] = objA0n;
                            alternatingKeysAndValues[i5 ^ 1] = objA0n2;
                        }
                        i++;
                    } else {
                        if (objA0n.equals(alternatingKeysAndValues[i7])) {
                            int i8 = i7 ^ 1;
                            dkl = new DKL(objA0n, objA0n2, BV6.A0n(alternatingKeysAndValues, i8));
                            alternatingKeysAndValues[i8] = objA0n2;
                            break;
                        }
                        iA01 = i6 + 1;
                    }
                }
            }
            if (i == n) {
                return bArr;
            }
            objArr = new Object[3];
            objArr[0] = bArr;
        } else {
            if (tableSize > 32768) {
                int[] iArr = new int[tableSize];
                Arrays.fill(iArr, -1);
                int i9 = 0;
                for (int i10 = 0; i10 < n; i10++) {
                    int i11 = (i10 * 2) + keyOffset;
                    int i12 = (i9 * 2) + keyOffset;
                    Object objA0n3 = BV6.A0n(alternatingKeysAndValues, i11);
                    Object objA0n4 = BV6.A0n(alternatingKeysAndValues, i11 ^ 1);
                    int iA012 = DNI.A01(objA0n3.hashCode());
                    while (true) {
                        int i13 = iA012 & i2;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            iArr[i13] = i12;
                            if (i9 < i10) {
                                alternatingKeysAndValues[i12] = objA0n3;
                                alternatingKeysAndValues[i12 ^ 1] = objA0n4;
                            }
                            i9++;
                        } else {
                            if (objA0n3.equals(alternatingKeysAndValues[i14])) {
                                int i15 = i14 ^ 1;
                                dkl = new DKL(objA0n3, objA0n4, BV6.A0n(alternatingKeysAndValues, i15));
                                alternatingKeysAndValues[i15] = objA0n4;
                                break;
                            }
                            iA012 = i13 + 1;
                        }
                    }
                }
                return i9 == n ? iArr : new Object[]{iArr, Integer.valueOf(i9), dkl};
            }
            short[] sArr = new short[tableSize];
            Arrays.fill(sArr, (short) -1);
            i = 0;
            for (int i16 = 0; i16 < n; i16++) {
                int i17 = (i16 * 2) + keyOffset;
                int i18 = (i * 2) + keyOffset;
                Object objA0n5 = BV6.A0n(alternatingKeysAndValues, i17);
                Object objA0n6 = BV6.A0n(alternatingKeysAndValues, i17 ^ 1);
                int iA013 = DNI.A01(objA0n5.hashCode());
                while (true) {
                    int i19 = iA013 & i2;
                    int i20 = sArr[i19] & 65535;
                    if (i20 == 65535) {
                        sArr[i19] = (short) i18;
                        if (i < i16) {
                            alternatingKeysAndValues[i18] = objA0n5;
                            alternatingKeysAndValues[i18 ^ 1] = objA0n6;
                        }
                        i++;
                    } else {
                        if (objA0n5.equals(alternatingKeysAndValues[i20])) {
                            int i21 = i20 ^ 1;
                            dkl = new DKL(objA0n5, objA0n6, BV6.A0n(alternatingKeysAndValues, i21));
                            alternatingKeysAndValues[i21] = objA0n6;
                            break;
                        }
                        iA013 = i19 + 1;
                    }
                }
            }
            if (i == n) {
                return sArr;
            }
            objArr = new Object[3];
            objArr[0] = sArr;
        }
        objArr[1] = Integer.valueOf(i);
        objArr[2] = dkl;
        return objArr;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.A00, 0, this.A01);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> createKeySet() {
        return new KeySet(new KeysOrValuesAsList(this.A00, 0, this.A01), this);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.A00, 1, this.A01);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object obj) {
        V v = (V) A00(this.A02, obj, this.A00, this.A01, 0);
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
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new ImmutableMap.SerializedForm(this);
    }

    public RegularImmutableMap(Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.A02 = hashTable;
        this.A00 = alternatingKeysAndValues;
        this.A01 = size;
    }
}
