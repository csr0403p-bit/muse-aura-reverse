package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class AJU<K, V, T> implements Iterator<T>, BOA {
    public int A00;
    public boolean A01 = true;
    public final AJV<K, V, T>[] A02;

    private final int A01(int i) {
        AJV<K, V, T> ajv;
        Object[] objArr;
        int iBitCount;
        AJV<K, V, T>[] ajvArr = this.A02;
        AJV<K, V, T> ajv2 = ajvArr[i];
        int i2 = ajv2.A01;
        if (i2 < ajv2.A00) {
            return i;
        }
        Object[] objArr2 = ajv2.A02;
        if (i2 >= objArr2.length) {
            return -1;
        }
        Object obj = objArr2[i2];
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C0957AJk c0957AJk = (C0957AJk) obj;
        if (i == 6) {
            ajv = ajvArr[7];
            objArr = c0957AJk.A02;
            iBitCount = objArr.length;
        } else {
            ajv = ajvArr[i + 1];
            objArr = c0957AJk.A02;
            iBitCount = Integer.bitCount(c0957AJk.A00) * 2;
        }
        ajv.A02 = objArr;
        ajv.A00 = iBitCount;
        ajv.A01 = 0;
        return A01(i + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            r7 = this;
            X.AJV<K, V, T>[] r5 = r7.A02
            int r4 = r7.A00
            r0 = r5[r4]
            int r1 = r0.A01
            int r0 = r0.A00
            if (r1 >= r0) goto Ld
            return
        Ld:
            r3 = 0
            r6 = -1
            if (r6 >= r4) goto L48
            int r0 = r7.A01(r4)
            if (r0 != r6) goto L28
            r2 = r5[r4]
            int r1 = r2.A01
            java.lang.Object[] r0 = r2.A02
            int r0 = r0.length
            if (r1 >= r0) goto L2d
            int r0 = r1 + 1
            r2.A01 = r0
            int r0 = r7.A01(r4)
        L28:
            if (r0 == r6) goto L2d
            r7.A00 = r0
            return
        L2d:
            if (r4 <= 0) goto L39
            int r0 = r4 + (-1)
            r1 = r5[r0]
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
        L39:
            r1 = r5[r4]
            X.AJk r0 = X.C0957AJk.A04
            java.lang.Object[] r0 = r0.A02
            r1.A02 = r0
            r1.A00 = r3
            r1.A01 = r3
            int r4 = r4 + (-1)
            goto Ld
        L48:
            r7.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJU.A02():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0958AJl<K, V> c0958AJl;
        if (!(this instanceof AJT)) {
            throw C8j4.A10();
        }
        AJT ajt = (AJT) this;
        if (!ajt.A02) {
            throw new IllegalStateException();
        }
        if (ajt.hasNext()) {
            Object objA03 = ajt.A03();
            c0958AJl = ajt.A03;
            C0862A6j.A01(c0958AJl).remove(ajt.A01);
            AJT.A00(ajt, c0958AJl.A01, objA03, C60R.A01(objA03), 0);
        } else {
            c0958AJl = ajt.A03;
            C0862A6j.A01(c0958AJl).remove(ajt.A01);
        }
        ajt.A01 = null;
        ajt.A02 = false;
        ajt.A00 = c0958AJl.A00;
    }

    public AJU(C0957AJk<K, V> c0957AJk, AJV<K, V, T>[] ajvArr) {
        this.A02 = ajvArr;
        AJV<K, V, T> ajv = ajvArr[0];
        Object[] objArr = c0957AJk.A02;
        int iBitCount = Integer.bitCount(c0957AJk.A00) * 2;
        ajv.A02 = objArr;
        ajv.A00 = iBitCount;
        ajv.A01 = 0;
        this.A00 = 0;
        A02();
    }

    public final K A03() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        AJV<K, V, T> ajv = this.A02[this.A00];
        return (K) ajv.A02[ajv.A01];
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T next = this.A02[this.A00].next();
        A02();
        return next;
    }
}
