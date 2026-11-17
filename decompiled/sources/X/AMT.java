package X;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class AMT<K> {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC0977AKq.A01;
    public Object[] A04 = AbstractC1684AoN.A02;
    public float[] A02 = ANB.A00;

    public final int A03(K k) {
        int i = 0;
        int iA0D = C8j3.A0D(C60R.A01(k));
        int i2 = iA0D & 127;
        int i3 = this.A00;
        int i4 = iA0D >>> 7;
        while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.A03;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (i2 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (C7384Etj.areEqual(this.A04[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
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
            if (r11 == r2) goto L67
            boolean r0 = r11 instanceof X.AMT
            r16 = 0
            if (r0 == 0) goto L66
            X.AMT r11 = (X.AMT) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L66
            java.lang.Object[] r10 = r2.A04
            float[] r9 = r2.A02
            long[] r8 = r2.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L67
            r6 = 0
        L22:
            r14 = r8[r6]
            long r3 = X.C8j5.A0A(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L61
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L3b:
            if (r3 >= r4) goto L5f
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5b
            int r1 = r6 << 3
            int r1 = r1 + r3
            r0 = r10[r1]
            r2 = r9[r1]
            int r1 = r11.A03(r0)
            if (r1 < 0) goto L66
            float[] r0 = r11.A02
            r0 = r0[r1]
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L66
        L5b:
            long r14 = r14 >> r5
            int r3 = r3 + 1
            goto L3b
        L5f:
            if (r4 != r5) goto L67
        L61:
            if (r6 == r7) goto L67
            int r6 = r6 + 1
            goto L22
        L66:
            return r16
        L67:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMT.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[PHI: r15
  0x0049: PHI (r15v3 int) = (r15v2 int), (r15v5 int) binds: [B:6:0x001c, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r15 = this;
            java.lang.Object[] r9 = r15.A04
            float[] r8 = r15.A02
            long[] r10 = r15.A03
            int r0 = r10.length
            int r7 = r0 + (-2)
            r0 = 0
            if (r7 < 0) goto L4f
            r6 = 0
            r15 = 0
        Le:
            r13 = r10[r6]
            long r3 = X.C8j5.A0A(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L27:
            if (r3 >= r4) goto L47
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L43
            int r0 = r6 << 3
            int r0 = r0 + r3
            r1 = r9[r0]
            r0 = r8[r0]
            int r1 = X.C60R.A01(r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            r0 = r0 ^ r1
            int r15 = r15 + r0
        L43:
            long r13 = r13 >> r5
            int r3 = r3 + 1
            goto L27
        L47:
            if (r4 != r5) goto L4e
        L49:
            if (r6 == r7) goto L4e
            int r6 = r6 + 1
            goto Le
        L4e:
            return r15
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMT.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[PHI: r5
  0x006f: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x002e, B:22:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
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
            float[] r9 = r12.A02
            long[] r8 = r12.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L74
            r6 = 0
            r5 = 0
        L1c:
            r17 = r8[r6]
            r3 = -1
            long r3 = r3 ^ r17
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r17
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6f
            int r0 = r6 - r7
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L3b:
            if (r2 >= r3) goto L6d
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L68
            int r1 = r6 << 3
            int r1 = r1 + r2
            r0 = r10[r1]
            r1 = r9[r1]
            if (r0 != r12) goto L52
            java.lang.String r0 = "(this)"
        L52:
            r11.append(r0)
            java.lang.String r0 = "="
            r11.append(r0)
            r11.append(r1)
            int r5 = r5 + 1
            int r0 = r12.A01
            if (r5 >= r0) goto L68
            java.lang.String r0 = ", "
            r11.append(r0)
        L68:
            long r17 = r17 >> r4
            int r2 = r2 + 1
            goto L3b
        L6d:
            if (r3 != r4) goto L74
        L6f:
            if (r6 == r7) goto L74
            int r6 = r6 + 1
            goto L1c
        L74:
            java.lang.String r0 = X.C8j3.A15(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMT.toString():java.lang.String");
    }

    public final float A02(K k) {
        int iA03 = A03(k);
        if (iA03 < 0) {
            throw new NoSuchElementException(AnonymousClass001.A0v(" in the map", C3cG.A0f(k, "There is no key ")));
        }
        return this.A02[iA03];
    }
}
