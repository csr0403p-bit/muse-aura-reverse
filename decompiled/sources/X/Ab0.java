package X;

/* loaded from: classes4.dex */
public abstract class Ab0<V> {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC0977AKq.A01;
    public int[] A02 = Ac1.A00;
    public Object[] A04 = AbstractC1684AoN.A02;

    public final V A04(int i) {
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.A02[iNumberOfTrailingZeros] == i) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return (V) this.A04[iNumberOfTrailingZeros];
                    }
                    return null;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return null;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        if (((r16 & ((r16 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(int r20) {
        /*
            r19 = this;
            r8 = r20
            int r1 = r20 >>> 16
            r1 = r1 ^ r20
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r0
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
            r7 = r1 & 127(0x7f, float:1.78E-43)
            r9 = r19
            int r6 = r9.A00
            int r20 = r1 >>> 7
            r20 = r20 & r6
            r19 = 0
        L19:
            long[] r3 = r9.A03
            int r2 = r20 >> 3
            r0 = r20 & 7
            int r1 = r0 << 3
            r10 = r3[r2]
            long r10 = r10 >>> r1
            r18 = 1
            int r0 = r2 + 1
            r16 = r3[r0]
            int r0 = 64 - r1
            long r16 = r16 << r0
            long r3 = (long) r1
            long r1 = -r3
            r0 = 63
            long r1 = r1 >> r0
            long r16 = r16 & r1
            long r16 = r16 | r10
            long r4 = (long) r7
            r2 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r2
            long r4 = r4 ^ r16
            long r0 = r4 - r2
            r14 = -1
            long r4 = r4 ^ r14
            long r4 = r4 & r0
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r12
        L4c:
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L6b
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r1 = r0 >> 3
            int r1 = r1 + r20
            r1 = r1 & r6
            r3 = 0
            int[] r0 = r9.A02
            r0 = r0[r1]
            if (r0 != r8) goto L65
            if (r1 < 0) goto L7f
            return r18
        L65:
            r2 = 1
            long r0 = r4 - r2
            long r4 = r4 & r0
            goto L4c
        L6b:
            r3 = 0
            long r1 = r16 ^ r14
            r0 = 6
            long r1 = r1 << r0
            long r16 = r16 & r1
            long r16 = r16 & r12
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L7f
            int r19 = r19 + 8
            int r20 = r20 + r19
            r20 = r20 & r6
            goto L19
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ab0.A05(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
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
            if (r11 == r2) goto L6c
            boolean r0 = r11 instanceof X.Ab0
            r16 = 0
            if (r0 == 0) goto L5b
            X.Ab0 r11 = (X.Ab0) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L5b
            int[] r10 = r2.A02
            java.lang.Object[] r9 = r2.A04
            long[] r8 = r2.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L6c
            r6 = 0
        L22:
            r14 = r8[r6]
            long r3 = X.C8j5.A0A(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L3b:
            if (r3 >= r4) goto L65
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L61
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r10[r0]
            r1 = r9[r0]
            java.lang.Object r0 = r11.A04(r2)
            if (r1 != 0) goto L5c
            if (r0 != 0) goto L5b
            boolean r0 = r11.A05(r2)
        L59:
            if (r0 != 0) goto L61
        L5b:
            return r16
        L5c:
            boolean r0 = r1.equals(r0)
            goto L59
        L61:
            long r14 = r14 >> r5
            int r3 = r3 + 1
            goto L3b
        L65:
            if (r4 != r5) goto L6c
        L67:
            if (r6 == r7) goto L6c
            int r6 = r6 + 1
            goto L22
        L6c:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ab0.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r15
  0x0045: PHI (r15v3 int) = (r15v2 int), (r15v5 int) binds: [B:6:0x001c, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r15 = this;
            int[] r10 = r15.A02
            java.lang.Object[] r9 = r15.A04
            long[] r8 = r15.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            r0 = 0
            if (r7 < 0) goto L4b
            r6 = 0
            r15 = 0
        Le:
            r13 = r8[r6]
            long r3 = X.C8j5.A0A(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L45
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L27:
            if (r3 >= r4) goto L43
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3f
            int r0 = r6 << 3
            int r0 = r0 + r3
            r1 = r10[r0]
            r0 = r9[r0]
            int r0 = X.C60R.A01(r0)
            r0 = r0 ^ r1
            int r15 = r15 + r0
        L3f:
            long r13 = r13 >> r5
            int r3 = r3 + 1
            goto L27
        L43:
            if (r4 != r5) goto L4a
        L45:
            if (r6 == r7) goto L4a
            int r6 = r6 + 1
            goto Le
        L4a:
            return r15
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ab0.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[PHI: r5
  0x0067: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x002a, B:22:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r12 = r18
            int r0 = r12.A01
            if (r0 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.String r0 = "{"
            java.lang.StringBuilder r11 = X.C60O.A0x(r0)
            int[] r10 = r12.A02
            java.lang.Object[] r9 = r12.A04
            long[] r8 = r12.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L6c
            r6 = 0
            r5 = 0
        L1c:
            r17 = r8[r6]
            long r3 = X.C8j5.A0A(r17)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = X.C8j3.A0E(r6, r7)
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L35:
            if (r2 >= r3) goto L65
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L60
            int r1 = r6 << 3
            int r1 = r1 + r2
            r0 = r10[r1]
            r1 = r9[r1]
            r11.append(r0)
            java.lang.String r0 = "="
            r11.append(r0)
            if (r1 != r12) goto L54
            java.lang.String r1 = "(this)"
        L54:
            r11.append(r1)
            int r5 = r5 + 1
            int r0 = r12.A01
            if (r5 >= r0) goto L60
            X.C8j3.A1K(r11)
        L60:
            long r17 = r17 >> r4
            int r2 = r2 + 1
            goto L35
        L65:
            if (r3 != r4) goto L6c
        L67:
            if (r6 == r7) goto L6c
            int r6 = r6 + 1
            goto L1c
        L6c:
            java.lang.String r0 = X.C8j3.A15(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ab0.toString():java.lang.String");
    }
}
