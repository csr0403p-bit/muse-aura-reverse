package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public abstract class AXH<V> {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC0977AKq.A01;
    public long[] A02 = AbstractC1521Aka.A00;
    public Object[] A04 = AbstractC1684AoN.A02;

    public static InterfaceC2043AxB A00(C1962AvE c1962AvE, C1943Aug c1943Aug) {
        return c1943Aug.A0D.A09.A05(c1962AvE.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r12 = r18
            r18 = 1
            r2 = r17
            if (r12 == r2) goto L6c
            boolean r0 = r12 instanceof X.AXH
            r17 = 0
            if (r0 == 0) goto L5b
            X.AXH r12 = (X.AXH) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L5b
            long[] r11 = r2.A02
            java.lang.Object[] r10 = r2.A04
            long[] r9 = r2.A03
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L6c
            r7 = 0
        L22:
            r15 = r9[r7]
            long r3 = X.C8j5.A0A(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = X.C8j3.A0E(r7, r8)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L3b:
            if (r4 >= r5) goto L65
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L61
            int r0 = r7 << 3
            int r0 = r0 + r4
            r2 = r11[r0]
            r1 = r10[r0]
            java.lang.Object r0 = r12.A05(r2)
            if (r1 != 0) goto L5c
            if (r0 != 0) goto L5b
            boolean r0 = r12.A06(r2)
        L59:
            if (r0 != 0) goto L61
        L5b:
            return r17
        L5c:
            boolean r0 = r1.equals(r0)
            goto L59
        L61:
            long r15 = r15 >> r6
            int r4 = r4 + 1
            goto L3b
        L65:
            if (r5 != r6) goto L6c
        L67:
            if (r7 == r8) goto L6c
            int r7 = r7 + 1
            goto L22
        L6c:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXH.equals(java.lang.Object):boolean");
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
            long[] r10 = r15.A02
            java.lang.Object[] r9 = r15.A04
            long[] r8 = r15.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            r0 = 0
            if (r7 < 0) goto L4f
            r6 = 0
            r15 = 0
        Le:
            r13 = r8[r6]
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
            r1 = r10[r0]
            r0 = r9[r0]
            int r1 = X.AnonymousClass002.A0A(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: X.AXH.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[PHI: r7
  0x0067: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:10:0x002a, B:22:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r14 = r18
            int r0 = r14.A01
            if (r0 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.String r0 = "{"
            java.lang.StringBuilder r13 = X.C60O.A0x(r0)
            long[] r12 = r14.A02
            java.lang.Object[] r11 = r14.A04
            long[] r10 = r14.A03
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L6c
            r8 = 0
            r7 = 0
        L1c:
            r17 = r10[r8]
            long r3 = X.C8j5.A0A(r17)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = X.C8j3.A0E(r8, r9)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L35:
            if (r4 >= r5) goto L65
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L60
            int r0 = r8 << 3
            int r0 = r0 + r4
            r2 = r12[r0]
            r1 = r11[r0]
            r13.append(r2)
            java.lang.String r0 = "="
            r13.append(r0)
            if (r1 != r14) goto L54
            java.lang.String r1 = "(this)"
        L54:
            r13.append(r1)
            int r7 = r7 + 1
            int r0 = r14.A01
            if (r7 >= r0) goto L60
            X.C8j3.A1K(r13)
        L60:
            long r17 = r17 >> r6
            int r4 = r4 + 1
            goto L35
        L65:
            if (r5 != r6) goto L6c
        L67:
            if (r8 == r9) goto L6c
            int r8 = r8 + 1
            goto L1c
        L6c:
            java.lang.String r0 = X.C8j3.A15(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXH.toString():java.lang.String");
    }

    public static C1940Aud A01(MutableState mutableState, Object obj) {
        return (C1940Aud) ((AXH) mutableState.getValue()).A05(((C1941Aue) obj).A02);
    }

    public final V A05(long j) {
        int iA0D = C8j3.A0D(AnonymousClass002.A0A(j));
        int i = iA0D & 127;
        int i2 = this.A00;
        int i3 = (iA0D >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long jA0H = C8j5.A0H(this.A03, i3);
            long j2 = (i * 72340172838076673L) ^ jA0H;
            for (long jA0L = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); jA0L != 0; jA0L = C8j4.A0L(jA0L)) {
                int iA08 = C8j4.A08(i3, i2, jA0L);
                if (this.A02[iA08] == j) {
                    if (iA08 >= 0) {
                        return (V) this.A04[iA08];
                    }
                    return null;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                return null;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if ((X.C8j4.A0M(r14) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(long r18) {
        /*
            r17 = this;
            int r0 = X.AnonymousClass002.A0A(r18)
            int r0 = X.C8j3.A0D(r0)
            r7 = r0 & 127(0x7f, float:1.78E-43)
            r8 = r17
            int r6 = r8.A00
            int r5 = r0 >>> 7
            r5 = r5 & r6
            r17 = 0
        L13:
            long[] r4 = r8.A03
            int r3 = r5 >> 3
            r0 = r5 & 7
            int r2 = r0 << 3
            r0 = r4[r3]
            long r0 = r0 >>> r2
            r16 = 1
            long r14 = X.C8j5.A0I(r4, r3, r2, r0)
            long r3 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r3 = r3 * r0
            long r3 = r3 ^ r14
            long r9 = r3 - r0
            r0 = -1
            long r3 = r3 ^ r0
            long r3 = r3 & r9
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r12
        L38:
            r10 = 0
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L53
            int r10 = X.C8j4.A08(r5, r6, r3)
            r9 = 0
            long[] r0 = r8.A02
            r1 = r0[r10]
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 != 0) goto L4e
            if (r10 < 0) goto L63
            return r16
        L4e:
            long r3 = X.C8j4.A0L(r3)
            goto L38
        L53:
            r9 = 0
            long r1 = X.C8j4.A0M(r14)
            long r1 = r1 & r12
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L63
            int r17 = r17 + 8
            int r5 = r5 + r17
            r5 = r5 & r6
            goto L13
        L63:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXH.A06(long):boolean");
    }
}
