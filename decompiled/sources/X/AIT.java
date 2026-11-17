package X;

/* loaded from: classes4.dex */
public abstract class AIT<E> {
    public int A00;
    public int A01;
    public long[] A04 = AbstractC0977AKq.A01;
    public Object[] A06 = AbstractC1684AoN.A02;
    public long[] A05 = AIV.A00;
    public int A02 = Integer.MAX_VALUE;
    public int A03 = Integer.MAX_VALUE;

    public static int A03(AIT ait, Object obj, int i) {
        ait.A06[i] = obj;
        long[] jArr = ait.A05;
        int i2 = ait.A02;
        jArr[i] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & i) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((X.C8j4.A0M(r13) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(E r16) {
        /*
            r15 = this;
            r7 = r16
            int r0 = X.C60R.A01(r7)
            int r0 = X.C8j3.A0D(r0)
            r6 = r0 & 127(0x7f, float:1.78E-43)
            r8 = r15
            int r5 = r15.A00
            int r4 = r0 >>> 7
            r4 = r4 & r5
            r16 = 0
        L14:
            long[] r9 = r8.A04
            int r3 = r4 >> 3
            r0 = r4 & 7
            int r2 = r0 << 3
            r0 = r9[r3]
            long r0 = r0 >>> r2
            r15 = 1
            long r13 = X.C8j5.A0I(r9, r3, r2, r0)
            long r1 = (long) r6
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r1 = r1 * r9
            long r1 = r1 ^ r13
            long r11 = r1 - r9
            r9 = -1
            long r1 = r1 ^ r9
            long r1 = r1 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r11
        L38:
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L55
            int r9 = X.C8j4.A08(r4, r5, r1)
            r3 = 0
            java.lang.Object[] r0 = r8.A06
            r0 = r0[r9]
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L50
            if (r9 < 0) goto L65
            return r15
        L50:
            long r1 = X.C8j4.A0L(r1)
            goto L38
        L55:
            r3 = 0
            long r1 = X.C8j4.A0M(r13)
            long r1 = r1 & r11
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L65
            int r16 = r16 + 8
            int r4 = r4 + r16
            r4 = r4 & r5
            goto L14
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIT.A04(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r16) {
        /*
            r15 = this;
            r12 = r16
            r16 = 1
            r2 = r15
            if (r12 == r15) goto L58
            boolean r0 = r12 instanceof X.AIT
            r15 = 0
            if (r0 == 0) goto L4c
            X.AIT r12 = (X.AIT) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L4c
            java.lang.Object[] r11 = r2.A06
            long[] r10 = r2.A04
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L58
            r8 = 0
        L1e:
            r13 = r10[r8]
            long r3 = X.C8j5.A0A(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L53
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L37:
            if (r5 >= r6) goto L51
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
            java.lang.Object r0 = X.C8j3.A11(r11, r8, r5)
            boolean r0 = r12.A04(r0)
            if (r0 != 0) goto L4d
        L4c:
            return r15
        L4d:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L37
        L51:
            if (r6 != r7) goto L58
        L53:
            if (r8 == r9) goto L58
            int r8 = r8 + 1
            goto L1e
        L58:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIT.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[PHI: r14
  0x004a: PHI (r14v4 int) = (r14v3 int), (r14v5 int) binds: [B:6:0x001f, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r15 = this;
            int r0 = r15.A00
            int r14 = r0 * 31
            int r0 = r15.A01
            int r14 = r14 + r0
            java.lang.Object[] r11 = r15.A06
            long[] r10 = r15.A04
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L4f
            r8 = 0
        L11:
            r12 = r10[r8]
            long r3 = X.C8j5.A0A(r12)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L2a:
            if (r5 >= r6) goto L48
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r12
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L44
            java.lang.Object r1 = X.C8j3.A11(r11, r8, r5)
            boolean r0 = X.C7384Etj.areEqual(r1, r15)
            if (r0 != 0) goto L44
            int r0 = X.C60R.A01(r1)
            int r14 = r14 + r0
        L44:
            long r12 = r12 >> r7
            int r5 = r5 + 1
            goto L2a
        L48:
            if (r6 != r7) goto L4f
        L4a:
            if (r8 == r9) goto L4f
            int r8 = r8 + 1
            goto L11
        L4f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIT.hashCode():int");
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        Object[] objArr = this.A06;
        long[] jArr = this.A05;
        int i = this.A03;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                break;
            }
            int iA05 = C8j5.A05(i, jArr);
            Object obj = objArr[i];
            if (i2 != 0) {
                sbA0w.append((CharSequence) ", ");
                if (i2 == -1) {
                    sbA0w.append((CharSequence) "...");
                    break;
                }
            }
            sbA0w.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
            i = iA05;
        }
        sbA0w.append((CharSequence) "]");
        return sbA0w.toString();
    }
}
