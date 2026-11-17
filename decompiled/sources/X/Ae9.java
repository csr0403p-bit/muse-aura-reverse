package X;

/* loaded from: classes4.dex */
public abstract class Ae9<K> {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC0977AKq.A01;
    public Object[] A04 = AbstractC1684AoN.A02;
    public int[] A02 = Ac1.A00;

    public final int A04(K k) {
        int i = 0;
        int iHashCode = k != null ? k.hashCode() : 0;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.A00;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.A03;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (C7384Etj.areEqual(this.A04[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i6 = i7 + i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
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
            if (r11 == r2) goto L69
            boolean r0 = r11 instanceof X.Ae9
            r16 = 0
            if (r0 == 0) goto L5d
            X.Ae9 r11 = (X.Ae9) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L5d
            java.lang.Object[] r10 = r2.A04
            int[] r9 = r2.A02
            long[] r8 = r2.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L69
            r6 = 0
        L22:
            r14 = r8[r6]
            r3 = -1
            long r3 = r3 ^ r14
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r14
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L64
            int r0 = r6 - r7
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L3f:
            if (r3 >= r4) goto L62
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5e
            int r1 = r6 << 3
            int r1 = r1 + r3
            r0 = r10[r1]
            r2 = r9[r1]
            int r1 = r11.A04(r0)
            if (r1 < 0) goto L5d
            int[] r0 = r11.A02
            r0 = r0[r1]
            if (r2 == r0) goto L5e
        L5d:
            return r16
        L5e:
            long r14 = r14 >> r5
            int r3 = r3 + 1
            goto L3f
        L62:
            if (r4 != r5) goto L69
        L64:
            if (r6 == r7) goto L69
            int r6 = r6 + 1
            goto L22
        L69:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ae9.equals(java.lang.Object):boolean");
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
            java.lang.Object[] r10 = r15.A04
            int[] r9 = r15.A02
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
            int r1 = r6 << 3
            int r1 = r1 + r3
            r0 = r10[r1]
            r1 = r9[r1]
            int r0 = X.C60R.A01(r0)
            r1 = r1 ^ r0
            int r15 = r15 + r1
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
        throw new UnsupportedOperationException("Method not decompiled: X.Ae9.hashCode():int");
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
            java.lang.Object[] r10 = r12.A04
            int[] r9 = r12.A02
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
            if (r0 != r12) goto L4c
            java.lang.String r0 = "(this)"
        L4c:
            r11.append(r0)
            java.lang.String r0 = "="
            r11.append(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: X.Ae9.toString():java.lang.String");
    }
}
