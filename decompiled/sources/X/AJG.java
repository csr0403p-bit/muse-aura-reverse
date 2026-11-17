package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class AJG<K, V, T> implements Iterator<T>, BOA {
    public int A00;
    public boolean A01;
    public final AJH<K, V, T>[] A02;

    public AJG(C0956AJj<K, V> c0956AJj, AJH<K, V, T>[] ajhArr) {
        C7384Etj.A0Y(c0956AJj, 0);
        this.A02 = ajhArr;
        this.A01 = true;
        AJH<K, V, T> ajh = ajhArr[0];
        Object[] objArr = c0956AJj.A02;
        int iBitCount = Integer.bitCount(c0956AJj.A00) * 2;
        ajh.A02 = objArr;
        ajh.A00 = iBitCount;
        ajh.A01 = 0;
        this.A00 = 0;
        A02();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0955AJi<K, V> c0955AJi;
        if (!(this instanceof AJF)) {
            throw C8j4.A10();
        }
        AJF ajf = (AJF) this;
        if (!ajf.A02) {
            throw new IllegalStateException();
        }
        if (ajf.hasNext()) {
            Object objA03 = ajf.A03();
            c0955AJi = ajf.A03;
            C0862A6j.A01(c0955AJi).remove(ajf.A01);
            AJF.A00(objA03, ajf, c0955AJi.A04, C8j4.A0C(objA03), 0, C8j4.A0C(ajf.A01), true);
        } else {
            c0955AJi = ajf.A03;
            C0862A6j.A01(c0955AJi).remove(ajf.A01);
        }
        ajf.A01 = null;
        ajf.A02 = false;
        ajf.A00 = c0955AJi.A00;
    }

    private final int A01(int i) {
        AJH<K, V, T> ajh;
        Object[] objArr;
        int iBitCount;
        AJH<K, V, T>[] ajhArr = this.A02;
        AJH<K, V, T> ajh2 = ajhArr[i];
        int i2 = ajh2.A01;
        if (i2 < ajh2.A00) {
            return i;
        }
        Object[] objArr2 = ajh2.A02;
        if (i2 >= objArr2.length) {
            return -1;
        }
        Object obj = objArr2[i2];
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C0956AJj c0956AJj = (C0956AJj) obj;
        if (i == 6) {
            ajh = ajhArr[7];
            objArr = c0956AJj.A02;
            iBitCount = objArr.length;
        } else {
            ajh = ajhArr[i + 1];
            objArr = c0956AJj.A02;
            iBitCount = Integer.bitCount(c0956AJj.A00) * 2;
        }
        ajh.A02 = objArr;
        ajh.A00 = iBitCount;
        ajh.A01 = 0;
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
            X.AJH<K, V, T>[] r5 = r7.A02
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
            X.AJj r0 = X.C0956AJj.A04
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
        throw new UnsupportedOperationException("Method not decompiled: X.AJG.A02():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }

    public final K A03() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        AJH<K, V, T> ajh = this.A02[this.A00];
        return (K) ajh.A02[ajh.A01];
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        T next = this.A02[this.A00].next();
        A02();
        return next;
    }
}
