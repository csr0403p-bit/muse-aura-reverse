package com.google.common.collect;

import X.C8j3;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient int A00;
    public transient int A01;
    public transient long[] A02;
    public final boolean accessOrder;

    public CompactLinkedHashMap(int i) {
        super(i);
        this.accessOrder = false;
    }

    public static void A00(CompactLinkedHashMap compactLinkedHashMap, int i, int i2) {
        if (i == -2) {
            compactLinkedHashMap.A00 = i2;
        } else {
            long[] jArr = compactLinkedHashMap.A02;
            jArr.getClass();
            long jA0V = C8j3.A0V(i2 + 1, jArr[i] & (-4294967296L));
            long[] jArr2 = compactLinkedHashMap.A02;
            jArr2.getClass();
            jArr2[i] = jA0V;
        }
        if (i2 == -2) {
            compactLinkedHashMap.A01 = i;
            return;
        }
        long[] jArr3 = compactLinkedHashMap.A02;
        jArr3.getClass();
        long j = (jArr3[i2] & 4294967295L) | ((i + 1) << 32);
        long[] jArr4 = compactLinkedHashMap.A02;
        jArr4.getClass();
        jArr4[i2] = j;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (super.A02 != null) {
            this.A00 = -2;
            this.A01 = -2;
            long[] jArr = this.A02;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0L);
            }
            super.clear();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int A03() {
        int iA03 = super.A03();
        this.A02 = new long[iA03];
        return iA03;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final Map<K, V> A05() {
        Map<K, V> mapA05 = super.A05();
        this.A02 = null;
        return mapA05;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A08(int expectedSize) {
        super.A08(expectedSize);
        this.A00 = -2;
        this.A01 = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A09(int newCapacity) {
        super.A09(newCapacity);
        long[] jArr = this.A02;
        jArr.getClass();
        this.A02 = Arrays.copyOf(jArr, newCapacity);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void A0A(int dstIndex, int mask) {
        int size = size() - 1;
        super.A0A(dstIndex, mask);
        this.A02.getClass();
        A00(this, ((int) (r0[dstIndex] >>> 32)) - 1, A04(dstIndex));
        if (dstIndex < size) {
            this.A02.getClass();
            A00(this, ((int) (r0[size] >>> 32)) - 1, dstIndex);
            A00(this, dstIndex, A04(size));
        }
        long[] jArr = this.A02;
        jArr.getClass();
        jArr[size] = 0;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;II)V */
    @Override // com.google.common.collect.CompactHashMap
    public final void A0B(Object entryIndex, int key, Object value, int hash, int mask) {
        super.A0B(entryIndex, key, value, hash, mask);
        A00(this, this.A01, key);
        A00(this, key, -2);
    }

    public CompactLinkedHashMap() {
        this(3);
    }
}
