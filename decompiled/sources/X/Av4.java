package X;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class Av4 {
    public int A00;
    public int A01;
    public long[] A04 = AbstractC0977AKq.A01;
    public long[] A03 = AbstractC1521Aka.A00;
    public int[] A02 = Ac1.A00;

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
            boolean r0 = r11 instanceof X.Av4
            r16 = 0
            if (r0 == 0) goto L59
            X.Av4 r11 = (X.Av4) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L59
            long[] r10 = r2.A03
            int[] r9 = r2.A02
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
            int r2 = r6 << 3
            int r2 = r2 + r3
            r0 = r10[r2]
            r2 = r9[r2]
            int r1 = A00(r11, r0)
            if (r1 < 0) goto L59
            int[] r0 = r11.A02
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
        throw new UnsupportedOperationException("Method not decompiled: X.Av4.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[PHI: r16
  0x0049: PHI (r16v3 int) = (r16v2 int), (r16v5 int) binds: [B:6:0x001f, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r16 = this;
            r0 = r16
            long[] r11 = r0.A03
            int[] r10 = r0.A02
            long[] r9 = r0.A04
            int r0 = r9.length
            int r8 = r0 + (-2)
            r0 = 0
            if (r8 < 0) goto L4f
            r7 = 0
            r16 = 0
        L11:
            r14 = r9[r7]
            long r3 = X.C8j5.A0A(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            int r0 = X.C8j3.A0E(r7, r8)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L2a:
            if (r4 >= r5) goto L47
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L43
            int r0 = r7 << 3
            int r0 = r0 + r4
            r2 = r11[r0]
            r1 = r10[r0]
            int r0 = X.AnonymousClass002.A0A(r2)
            r1 = r1 ^ r0
            int r16 = r16 + r1
        L43:
            long r14 = r14 >> r6
            int r4 = r4 + 1
            goto L2a
        L47:
            if (r5 != r6) goto L4e
        L49:
            if (r7 == r8) goto L4e
            int r7 = r7 + 1
            goto L11
        L4e:
            return r16
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Av4.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[PHI: r7
  0x0061: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:10:0x002a, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r1 = r18
            int r14 = r1.A01
            if (r14 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.String r0 = "{"
            java.lang.StringBuilder r13 = X.C60O.A0x(r0)
            long[] r12 = r1.A03
            int[] r11 = r1.A02
            long[] r10 = r1.A04
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L66
            r8 = 0
            r7 = 0
        L1c:
            r17 = r10[r8]
            long r3 = X.C8j5.A0A(r17)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L61
            int r0 = X.C8j3.A0E(r8, r9)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L35:
            if (r4 >= r5) goto L5f
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r0 = r8 << 3
            int r0 = r0 + r4
            r2 = r12[r0]
            r1 = r11[r0]
            r13.append(r2)
            java.lang.String r0 = "="
            r13.append(r0)
            r13.append(r1)
            int r7 = r7 + 1
            if (r7 >= r14) goto L5a
            X.C8j3.A1K(r13)
        L5a:
            long r17 = r17 >> r6
            int r4 = r4 + 1
            goto L35
        L5f:
            if (r5 != r6) goto L66
        L61:
            if (r8 == r9) goto L66
            int r8 = r8 + 1
            goto L1c
        L66:
            java.lang.String r0 = X.C8j3.A15(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Av4.toString():java.lang.String");
    }

    public static final int A00(Av4 av4, long j) {
        int iA0D = C8j3.A0D(AnonymousClass002.A0A(j));
        int i = iA0D & 127;
        int i2 = av4.A00;
        int i3 = (iA0D >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long jA0H = C8j5.A0H(av4.A04, i3);
            long j2 = (i * 72340172838076673L) ^ jA0H;
            for (long jA0L = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); jA0L != 0; jA0L = C8j4.A0L(jA0L)) {
                int iA08 = C8j4.A08(i3, i2, jA0L);
                if (av4.A03[iA08] == j) {
                    return iA08;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int A03(long j) {
        int iA00 = A00(this, j);
        if (iA00 < 0) {
            throw new NoSuchElementException(FGI.A0B(j, "Cannot find value for key "));
        }
        return this.A02[iA00];
    }
}
