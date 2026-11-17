package X;

/* renamed from: X.Abv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1142Abv {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A03;
    public long[] A04 = AbstractC0977AKq.A01;

    public final int A02(int i) {
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A04;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.A02[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r17) {
        /*
            r16 = this;
            r11 = r17
            r17 = 1
            r2 = r16
            if (r11 == r2) goto L65
            boolean r0 = r11 instanceof X.AbstractC1142Abv
            r16 = 0
            if (r0 == 0) goto L59
            X.Abv r11 = (X.AbstractC1142Abv) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L59
            int[] r10 = r2.A02
            int[] r9 = r2.A03
            long[] r8 = r2.A04
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L65
            r6 = 0
        L22:
            r14 = r8[r6]
            long r3 = X.C8j5.A0A(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L60
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L3b:
            if (r3 >= r4) goto L5e
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r1 = r6 << 3
            int r1 = r1 + r3
            r0 = r10[r1]
            r2 = r9[r1]
            int r1 = r11.A02(r0)
            if (r1 < 0) goto L59
            int[] r0 = r11.A03
            r0 = r0[r1]
            if (r2 == r0) goto L5a
        L59:
            return r16
        L5a:
            long r14 = r14 >> r5
            int r3 = r3 + 1
            goto L3b
        L5e:
            if (r4 != r5) goto L65
        L60:
            if (r6 == r7) goto L65
            int r6 = r6 + 1
            goto L22
        L65:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1142Abv.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[PHI: r15
  0x0041: PHI (r15v3 int) = (r15v2 int), (r15v5 int) binds: [B:6:0x001c, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r15 = this;
            int[] r11 = r15.A02
            int[] r10 = r15.A03
            long[] r12 = r15.A04
            int r0 = r12.length
            int r9 = r0 + (-2)
            r0 = 0
            if (r9 < 0) goto L47
            r8 = 0
            r15 = 0
        Le:
            r13 = r12[r8]
            long r3 = X.C8j5.A0A(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L41
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L27:
            if (r5 >= r6) goto L3f
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3b
            int r0 = r8 << 3
            int r0 = r0 + r5
            r1 = r11[r0]
            r0 = r10[r0]
            r0 = r0 ^ r1
            int r15 = r15 + r0
        L3b:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L27
        L3f:
            if (r6 != r7) goto L46
        L41:
            if (r8 == r9) goto L46
            int r8 = r8 + 1
            goto Le
        L46:
            return r15
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1142Abv.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[PHI: r5
  0x0061: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x002a, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r1 = r18
            int r12 = r1.A01
            if (r12 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.String r0 = "{"
            java.lang.StringBuilder r11 = X.C60O.A0x(r0)
            int[] r10 = r1.A02
            int[] r9 = r1.A03
            long[] r8 = r1.A04
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L66
            r6 = 0
            r5 = 0
        L1c:
            r17 = r8[r6]
            long r3 = X.C8j5.A0A(r17)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L61
            int r0 = X.C8j3.A0E(r6, r7)
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L35:
            if (r2 >= r3) goto L5f
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r1 = r6 << 3
            int r1 = r1 + r2
            r0 = r10[r1]
            r1 = r9[r1]
            r11.append(r0)
            java.lang.String r0 = "="
            r11.append(r0)
            r11.append(r1)
            int r5 = r5 + 1
            if (r5 >= r12) goto L5a
            X.C8j3.A1K(r11)
        L5a:
            long r17 = r17 >> r4
            int r2 = r2 + 1
            goto L35
        L5f:
            if (r3 != r4) goto L66
        L61:
            if (r6 == r7) goto L66
            int r6 = r6 + 1
            goto L1c
        L66:
            java.lang.String r0 = X.C8j3.A15(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1142Abv.toString():java.lang.String");
    }

    public AbstractC1142Abv() {
        int[] iArr = Ac1.A00;
        this.A02 = iArr;
        this.A03 = iArr;
    }
}
