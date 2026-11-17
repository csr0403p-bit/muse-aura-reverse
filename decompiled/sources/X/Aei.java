package X;

/* loaded from: classes4.dex */
public abstract class Aei {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC0977AKq.A01;
    public int[] A02 = Ac1.A00;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if ((X.C8j4.A0M(r15) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(int r18) {
        /*
            r17 = this;
            r9 = r18
            int r1 = r18 >>> 16
            r1 = r1 ^ r18
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r0
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
            r8 = r1 & 127(0x7f, float:1.78E-43)
            r10 = r17
            int r7 = r10.A00
            int r6 = r1 >>> 7
            r6 = r6 & r7
            r18 = 0
        L18:
            long[] r4 = r10.A03
            int r3 = r6 >> 3
            r0 = r6 & 7
            int r2 = r0 << 3
            r0 = r4[r3]
            long r0 = r0 >>> r2
            r17 = 1
            long r15 = X.C8j5.A0I(r4, r3, r2, r0)
            long r4 = (long) r8
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r0
            long r4 = r4 ^ r15
            long r2 = r4 - r0
            r0 = -1
            long r4 = r4 ^ r0
            long r4 = r4 & r2
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r13
        L3d:
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L56
            int r1 = X.C8j4.A08(r6, r7, r4)
            r3 = 0
            int[] r0 = r10.A02
            r0 = r0[r1]
            if (r0 != r9) goto L51
            if (r1 < 0) goto L66
            return r17
        L51:
            long r4 = X.C8j4.A0L(r4)
            goto L3d
        L56:
            r3 = 0
            long r1 = X.C8j4.A0M(r15)
            long r1 = r1 & r13
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L66
            int r18 = r18 + 8
            int r6 = r6 + r18
            r6 = r6 & r7
            goto L18
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Aei.A04(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
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
            if (r12 == r15) goto L59
            boolean r0 = r12 instanceof X.Aei
            r15 = 0
            if (r0 == 0) goto L4d
            X.Aei r12 = (X.Aei) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L4d
            int[] r11 = r2.A02
            long[] r10 = r2.A03
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L59
            r8 = 0
        L1e:
            r13 = r10[r8]
            long r3 = X.C8j5.A0A(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L37:
            if (r5 >= r6) goto L52
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4e
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            boolean r0 = r12.A04(r0)
            if (r0 != 0) goto L4e
        L4d:
            return r15
        L4e:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L37
        L52:
            if (r6 != r7) goto L59
        L54:
            if (r8 == r9) goto L59
            int r8 = r8 + 1
            goto L1e
        L59:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Aei.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[PHI: r14
  0x003c: PHI (r14v3 int) = (r14v2 int), (r14v5 int) binds: [B:6:0x001a, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r14 = this;
            int[] r10 = r14.A02
            long[] r11 = r14.A03
            int r0 = r11.length
            int r9 = r0 + (-2)
            r0 = 0
            if (r9 < 0) goto L42
            r8 = 0
            r14 = 0
        Lc:
            r12 = r11[r8]
            long r3 = X.C8j5.A0A(r12)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3c
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L25:
            if (r5 >= r6) goto L3a
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r12
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L36
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r10[r0]
            int r14 = r14 + r0
        L36:
            long r12 = r12 >> r7
            int r5 = r5 + 1
            goto L25
        L3a:
            if (r6 != r7) goto L41
        L3c:
            if (r8 == r9) goto L41
            int r8 = r8 + 1
            goto Lc
        L41:
            return r14
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Aei.hashCode():int");
    }

    public final String toString() {
        char c;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((C8j5.A0A(j) & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    int iA07 = C8j4.A07(i, length);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iA07) {
                            if (iA07 != 8) {
                                break;
                            }
                        } else {
                            if ((j & 255) < 128) {
                                int i4 = iArr[(i << 3) + i3];
                                if (i2 != 0) {
                                    sbA0w.append((CharSequence) ", ");
                                }
                                c = '\b';
                                if (i2 == -1) {
                                    sbA0w.append((CharSequence) "...");
                                    break loop0;
                                }
                                sbA0w.append(i4);
                                i2++;
                            } else {
                                c = '\b';
                            }
                            j >>= c;
                            i3++;
                        }
                    }
                }
            }
        }
        sbA0w.append((CharSequence) "]");
        return sbA0w.toString();
    }
}
