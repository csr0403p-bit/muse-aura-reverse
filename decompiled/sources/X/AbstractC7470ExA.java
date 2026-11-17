package X;

import java.util.Iterator;

/* renamed from: X.ExA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7470ExA<T> implements Iterator<T>, BOA {
    public int A00;
    public T A01;

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A18(C8j2.A00(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A00() {
        /*
            r7 = this;
            X.CEZ r7 = (X.CEZ) r7
        L2:
            java.util.ArrayDeque<X.CEc> r3 = r7.A00
            java.lang.Object r5 = r3.peek()
            X.CEc r5 = (X.AbstractC3323CEc) r5
            if (r5 != 0) goto L10
            r0 = 2
        Ld:
            r7.A00 = r0
            return
        L10:
            boolean r0 = r5 instanceof X.C3322CEb
            if (r0 == 0) goto L42
            r6 = r5
            X.CEb r6 = (X.C3322CEb) r6
            boolean r0 = r6.A00
            if (r0 != 0) goto L75
            r0 = 1
            r6.A00 = r0
        L1e:
            java.io.File r2 = r6.A00
        L20:
            if (r2 == 0) goto L75
            java.io.File r0 = r5.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L71
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L71
            int r1 = r3.size()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r0) goto L71
            X.CEa r0 = new X.CEa
            r0.<init>(r2, r7)
            r3.push(r0)
            goto L2
        L42:
            r6 = r5
            X.CEa r6 = (X.C3321CEa) r6
            boolean r0 = r6.A01
            r4 = 1
            if (r0 != 0) goto L5a
            java.io.File[] r0 = r6.A03
            if (r0 != 0) goto L5a
            java.io.File r0 = r6.A00
            java.io.File[] r0 = r0.listFiles()
            r6.A03 = r0
            if (r0 != 0) goto L5a
            r6.A01 = r4
        L5a:
            java.io.File[] r2 = r6.A03
            if (r2 == 0) goto L6a
            int r1 = r6.A00
            int r0 = r2.length
            if (r1 >= r0) goto L6a
            int r0 = r1 + 1
            r6.A00 = r0
            r2 = r2[r1]
            goto L20
        L6a:
            boolean r0 = r6.A02
            if (r0 != 0) goto L75
            r6.A02 = r4
            goto L1e
        L71:
            r7.A01 = r2
            r0 = 1
            goto Ld
        L75:
            r3.pop()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7470ExA.A00():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00;
        if (i == 0) {
            this.A00 = 3;
            A00();
            if (this.A00 == 1) {
                return true;
            }
        } else {
            if (i == 1) {
                return true;
            }
            if (i != 2) {
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r4.A00 == 1) goto L8;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T next() {
        /*
            r4 = this;
            int r3 = r4.A00
            r2 = 1
            r1 = 0
            if (r3 == r2) goto L13
            r0 = 2
            if (r3 == r0) goto L18
            r0 = 3
            r4.A00 = r0
            r4.A00()
            int r0 = r4.A00
            if (r0 != r2) goto L18
        L13:
            r4.A00 = r1
            T r0 = r4.A01
            return r0
        L18:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7470ExA.next():java.lang.Object");
    }
}
