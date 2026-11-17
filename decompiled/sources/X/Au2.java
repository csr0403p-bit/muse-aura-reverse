package X;

/* loaded from: classes4.dex */
public final class Au2 {
    public int A00;
    public int[] A01 = new int[30];

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        return X.AbstractC1815ArZ.A00(r3, r4 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r4 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        return X.AbstractC1815ArZ.A00(r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
    
        if (r1 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(int r2, int r3, int r4, int r5, boolean r6) {
        /*
            r1 = r5
            if (r6 == 0) goto L5
            r1 = r4
            r4 = r5
        L5:
            if (r2 >= r3) goto Lc
            long r0 = X.AbstractC1815ArZ.A00(r2, r2)
            return r0
        Lc:
            if (r2 != r3) goto L16
            if (r1 != 0) goto L1c
        L10:
            int r4 = r4 + r3
            long r0 = X.AbstractC1815ArZ.A00(r3, r4)
            return r0
        L16:
            int r0 = r3 + r1
            if (r2 >= r0) goto L21
            if (r4 != 0) goto L10
        L1c:
            long r0 = X.AbstractC1815ArZ.A00(r3, r3)
            return r0
        L21:
            int r2 = r2 - r1
            int r2 = r2 + r4
            long r0 = X.AbstractC1815ArZ.A00(r2, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Au2.A00(int, int, int, int, boolean):long");
    }

    public static final long A01(Au2 au2, int i, boolean z) {
        int i2;
        int[] iArr = au2.A01;
        int i3 = au2.A00;
        if (i3 >= 0) {
            int iMin = i;
            if (z) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i4 * 3;
                    int i6 = iArr[i5];
                    int i7 = iArr[i5 + 1];
                    int i8 = iArr[i5 + 2];
                    long jA00 = A00(iMin, i6, i7, i8, true);
                    long jA002 = A00(i, i6, i7, i8, true);
                    iMin = Math.min((int) (jA00 >> 32), (int) (jA002 >> 32));
                    i = Math.max(AnonymousClass002.A09(jA00), AnonymousClass002.A09(jA002));
                }
            } else {
                for (int i9 = i3 - 1; -1 < i9; i9--) {
                    int i10 = i9 * 3;
                    int i11 = iArr[i10];
                    int i12 = iArr[i10 + 1];
                    int i13 = iArr[i10 + 2];
                    long jA003 = A00(iMin, i11, i12, i13, false);
                    long jA004 = A00(i, i11, i12, i13, false);
                    iMin = Math.min((int) (jA003 >> 32), (int) (jA004 >> 32));
                    i = Math.max(AnonymousClass002.A09(jA003), AnonymousClass002.A09(jA004));
                }
            }
            i2 = i;
            i = iMin;
        } else {
            i2 = i;
        }
        return AbstractC1815ArZ.A00(i, i2);
    }
}
