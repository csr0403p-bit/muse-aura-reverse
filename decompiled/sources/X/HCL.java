package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class HCL implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ HCD A03;

    public /* synthetic */ HCL(HCD hcd) {
        this.A03 = hcd;
        this.A00 = hcd.A00;
        this.A01 = hcd.isEmpty() ? -1 : 0;
        this.A02 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1Q(this.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object next() {
        /*
            r4 = this;
            X.HCD r3 = r4.A03
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L4a
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L45
            int r2 = r4.A01
            r4.A02 = r2
            boolean r0 = r4 instanceof X.HCS
            if (r0 == 0) goto L2e
            r0 = r4
            X.HCS r0 = (X.HCS) r0
            X.HCD r0 = r0.A00
            java.lang.Object[] r0 = r0.A05
        L1d:
            r0.getClass()
            r0 = r0[r2]
        L22:
            int r1 = r4.A01
            int r2 = r1 + 1
            int r1 = r3.A01
            if (r2 < r1) goto L2b
            r2 = -1
        L2b:
            r4.A01 = r2
            return r0
        L2e:
            boolean r0 = r4 instanceof X.HCV
            if (r0 == 0) goto L3d
            r0 = r4
            X.HCV r0 = (X.HCV) r0
            X.HCD r1 = r0.A00
            X.HCJ r0 = new X.HCJ
            r0.<init>(r1, r2)
            goto L22
        L3d:
            r0 = r4
            X.HCR r0 = (X.HCR) r0
            X.HCD r0 = r0.A00
            java.lang.Object[] r0 = r0.A04
            goto L1d
        L45:
            java.util.NoSuchElementException r0 = X.C8j3.A1D()
            throw r0
        L4a:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCL.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public final void remove() {
        HCD hcd = this.A03;
        int i = hcd.A00;
        int i2 = this.A00;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.A02;
        boolean zA1Q = C8j3.A1Q(i3);
        String strA00 = BV3.A00(10);
        if (!zA1Q) {
            throw C3cG.A0Q(strA00);
        }
        this.A00 = i2 + 32;
        Object[] objArr = hcd.A04;
        objArr.getClass();
        hcd.remove(objArr[i3]);
        this.A01--;
        this.A02 = -1;
    }
}
