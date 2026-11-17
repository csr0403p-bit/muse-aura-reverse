package X;

/* renamed from: X.Dod, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5742Dod {
    public final int A00;
    public final C5414DiA A01;
    public final int[] A02;
    public final int[] A03;
    public final C5414DiA[] A04;
    public final String[] A05;
    public final int[][][] A06;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        r9 = java.lang.Math.max(r9, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(int r13) {
        /*
            r12 = this;
            r10 = 0
            r9 = 0
        L2:
            int r0 = r12.A00
            if (r10 >= r0) goto L45
            int[] r0 = r12.A03
            r0 = r0[r10]
            if (r0 != r13) goto L32
            int[][][] r0 = r12.A06
            r11 = r0[r10]
            int r8 = r11.length
            r7 = 0
            r6 = 0
        L13:
            if (r7 >= r8) goto L2e
            r5 = r11[r7]
            int r4 = r5.length
            r3 = 0
        L19:
            if (r3 >= r4) goto L3d
            r0 = r5[r3]
            r2 = r0 & 7
            r1 = 1
            if (r2 == 0) goto L36
            if (r2 == r1) goto L36
            r0 = 2
            if (r2 == r0) goto L36
            r0 = 3
            if (r2 == r0) goto L35
            r0 = 4
            if (r2 != r0) goto L40
            r6 = 3
        L2e:
            int r9 = java.lang.Math.max(r9, r6)
        L32:
            int r10 = r10 + 1
            goto L2
        L35:
            r1 = 2
        L36:
            int r6 = java.lang.Math.max(r6, r1)
            int r3 = r3 + 1
            goto L19
        L3d:
            int r7 = r7 + 1
            goto L13
        L40:
            java.lang.IllegalStateException r0 = X.BV4.A0T()
            throw r0
        L45:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5742Dod.A00(int):int");
    }

    public C5742Dod(C5414DiA c5414DiA, int[] iArr, int[] iArr2, C5414DiA[] c5414DiAArr, String[] strArr, int[][][] iArr3) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c5414DiAArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c5414DiA;
        this.A00 = iArr.length;
    }
}
