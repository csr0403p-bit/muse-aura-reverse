package com.google.common.collect;

import X.C8j3;
import X.Eu2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int A00;
    public transient int[] A01;
    public transient int[] A02;
    public transient int A03;

    private void A00(int pred, int succ) {
        if (pred == -2) {
            this.A00 = succ;
        } else {
            int[] iArr = this.A02;
            iArr.getClass();
            iArr[pred] = succ + 1;
        }
        if (succ == -2) {
            this.A03 = pred;
            return;
        }
        int[] iArr2 = this.A01;
        iArr2.getClass();
        iArr2[succ] = pred + 1;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (super.A01 != null) {
            this.A00 = -2;
            this.A03 = -2;
            int[] iArr = this.A01;
            if (iArr != null && this.A02 != null) {
                Arrays.fill(iArr, 0, size(), 0);
                Arrays.fill(this.A02, 0, size(), 0);
            }
            super.clear();
        }
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int A02() {
        int iA02 = super.A02();
        this.A01 = new int[iA02];
        this.A02 = new int[iA02];
        return iA02;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final Set<E> A04() {
        Set<E> setA04 = super.A04();
        this.A01 = null;
        this.A02 = null;
        return setA04;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void A05(int expectedSize) {
        super.A05(expectedSize);
        this.A00 = -2;
        this.A03 = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void A06(int newCapacity) {
        super.A06(newCapacity);
        int[] iArr = this.A01;
        iArr.getClass();
        this.A01 = Arrays.copyOf(iArr, newCapacity);
        int[] iArr2 = this.A02;
        iArr2.getClass();
        this.A02 = Arrays.copyOf(iArr2, newCapacity);
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void A07(int dstIndex, int mask) {
        int iA0K = C8j3.A0K(this);
        super.A07(dstIndex, mask);
        this.A01.getClass();
        A00(r0[dstIndex] - 1, A03(dstIndex));
        if (dstIndex < iA0K) {
            this.A01.getClass();
            A00(r0[iA0K] - 1, dstIndex);
            A00(dstIndex, A03(iA0K));
        }
        int[] iArr = this.A01;
        iArr.getClass();
        iArr[iA0K] = 0;
        int[] iArr2 = this.A02;
        iArr2.getClass();
        iArr2[iA0K] = 0;
    }

    /* JADX WARN: Incorrect types in method signature: (ITE;II)V */
    @Override // com.google.common.collect.CompactHashSet
    public final void A08(Object entryIndex, int object, int hash, int mask) {
        super.A08(entryIndex, object, hash, mask);
        A00(this.A03, object);
        A00(object, -2);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) Eu2.A01(this, tArr);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }
}
