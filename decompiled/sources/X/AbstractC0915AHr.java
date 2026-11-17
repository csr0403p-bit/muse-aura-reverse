package X;

import java.util.Map;

/* renamed from: X.AHr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0915AHr<K, V> {
    public int A00;
    public int A01;
    public Map<K, ? extends V> A02;
    public long[] A03 = AbstractC0977AKq.A01;
    public Object[] A04;
    public Object[] A05;

    public static boolean A00(C0919AHv c0919AHv, Object obj) {
        return c0919AHv.A03.A07(obj);
    }

    public final V A05(K k) {
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
                    if (iNumberOfTrailingZeros >= 0) {
                        return (V) this.A05[iNumberOfTrailingZeros];
                    }
                    return null;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return null;
            }
            i += 8;
            i6 = i7 + i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if (((r16 & ((r16 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(K r20) {
        /*
            r19 = this;
            r8 = r20
            if (r20 == 0) goto L88
            int r1 = r8.hashCode()
        L8:
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
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
        L1e:
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
        L51:
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L74
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r1 = r0 >> 3
            int r1 = r1 + r20
            r1 = r1 & r6
            r3 = 0
            java.lang.Object[] r0 = r9.A04
            r0 = r0[r1]
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto L6e
            if (r1 < 0) goto L8b
            return r18
        L6e:
            r2 = 1
            long r0 = r4 - r2
            long r4 = r4 & r0
            goto L51
        L74:
            r3 = 0
            long r1 = r16 ^ r14
            r0 = 6
            long r1 = r1 << r0
            long r16 = r16 & r1
            long r16 = r16 & r12
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L8b
            int r19 = r19 + 8
            int r20 = r20 + r19
            r20 = r20 & r6
            goto L1e
        L88:
            r1 = 0
            goto L8
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0915AHr.A06(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if (((r16 & ((r16 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A07(K r20) {
        /*
            r19 = this;
            r8 = r20
            if (r20 == 0) goto L88
            int r1 = r8.hashCode()
        L8:
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
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
        L1e:
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
        L51:
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L74
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r1 = r0 >> 3
            int r1 = r1 + r20
            r1 = r1 & r6
            r3 = 0
            java.lang.Object[] r0 = r9.A04
            r0 = r0[r1]
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto L6e
            if (r1 < 0) goto L8b
            return r18
        L6e:
            r2 = 1
            long r0 = r4 - r2
            long r4 = r4 & r0
            goto L51
        L74:
            r3 = 0
            long r1 = r16 ^ r14
            r0 = 6
            long r1 = r1 << r0
            long r16 = r16 & r1
            long r16 = r16 & r12
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L8b
            int r19 = r19 + 8
            int r20 = r20 + r19
            r20 = r20 & r6
            goto L1e
        L88:
            r1 = 0
            goto L8
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0915AHr.A07(java.lang.Object):boolean");
    }

    public final boolean A08(V v) {
        Object[] objArr = this.A05;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128 && C7384Etj.areEqual(v, C8j3.A11(objArr, i, i2))) {
                        return true;
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            boolean r0 = r11 instanceof X.AbstractC0915AHr
            r16 = 0
            if (r0 == 0) goto L5b
            X.AHr r11 = (X.AbstractC0915AHr) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L5b
            java.lang.Object[] r10 = r2.A04
            java.lang.Object[] r9 = r2.A05
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
            java.lang.Object r0 = r11.A05(r2)
            if (r1 != 0) goto L5c
            if (r0 != 0) goto L5b
            boolean r0 = r11.A07(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0915AHr.equals(java.lang.Object):boolean");
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
            java.lang.Object[] r8 = r15.A05
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
            int r0 = X.C60R.A01(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0915AHr.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[PHI: r6
  0x006b: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:10:0x002a, B:25:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r13 = r17
            int r0 = r13.A01
            if (r0 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.String r0 = "{"
            java.lang.StringBuilder r12 = X.C60O.A0x(r0)
            java.lang.Object[] r11 = r13.A04
            java.lang.Object[] r10 = r13.A05
            long[] r9 = r13.A03
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L70
            r7 = 0
            r6 = 0
        L1c:
            r16 = r9[r7]
            long r3 = X.C8j5.A0A(r16)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            int r0 = X.C8j3.A0E(r7, r8)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L35:
            if (r3 >= r4) goto L69
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r16
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r1 = r7 << 3
            int r1 = r1 + r3
            r0 = r11[r1]
            r2 = r10[r1]
            java.lang.String r1 = "(this)"
            if (r0 != r13) goto L4d
            r0 = r1
        L4d:
            r12.append(r0)
            java.lang.String r0 = "="
            r12.append(r0)
            if (r2 != r13) goto L58
            r2 = r1
        L58:
            r12.append(r2)
            int r6 = r6 + 1
            int r0 = r13.A01
            if (r6 >= r0) goto L64
            X.C8j3.A1K(r12)
        L64:
            long r16 = r16 >> r5
            int r3 = r3 + 1
            goto L35
        L69:
            if (r4 != r5) goto L70
        L6b:
            if (r7 == r8) goto L70
            int r7 = r7 + 1
            goto L1c
        L70:
            java.lang.String r0 = X.C8j3.A15(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0915AHr.toString():java.lang.String");
    }

    public AbstractC0915AHr() {
        Object[] objArr = AbstractC1684AoN.A02;
        this.A04 = objArr;
        this.A05 = objArr;
    }
}
