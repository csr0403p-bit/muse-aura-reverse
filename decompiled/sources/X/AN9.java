package X;

/* loaded from: classes4.dex */
public abstract class AN9 {
    public int A00;
    public long[] A02 = AbstractC0977AKq.A01;
    public float[] A01 = ANB.A00;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if ((X.C8j4.A0M(r18) & (-9187201950435737472L)) != 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r27) {
        /*
            r26 = this;
            r13 = r27
            r27 = 1
            r1 = r26
            if (r13 == r1) goto Lac
            boolean r0 = r13 instanceof X.AN9
            r26 = 0
            if (r0 == 0) goto Lab
            X.AN9 r13 = (X.AN9) r13
            float[] r12 = r1.A01
            long[] r11 = r1.A02
            int r0 = r11.length
            int r10 = r0 + (-2)
            if (r10 < 0) goto Lac
            r9 = 0
        L1a:
            r24 = r11[r9]
            r22 = -1
            long r3 = r22 ^ r24
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r24
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto La5
            int r0 = X.C8j3.A0E(r9, r10)
            r8 = 8
            int r7 = 8 - r0
            r6 = 0
        L37:
            if (r6 >= r7) goto La3
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r24
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L89
            int r0 = r9 << 3
            int r0 = r0 + r6
            r21 = r12[r0]
            int r0 = java.lang.Float.floatToIntBits(r21)
            int r0 = X.C8j3.A0D(r0)
            r5 = r0 & 127(0x7f, float:1.78E-43)
            int r4 = r13.A00
            int r3 = r0 >>> 7
            r3 = r3 & r4
            r20 = 0
        L59:
            long[] r0 = r13.A02
            long r18 = X.C8j5.A0H(r0, r3)
            long r0 = (long) r5
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r16
            long r0 = r0 ^ r18
            long r14 = r0 - r16
            long r0 = r0 ^ r22
            long r0 = r0 & r14
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r16
        L75:
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L93
            int r14 = X.C8j4.A08(r3, r4, r0)
            float[] r2 = r13.A01
            r2 = r2[r14]
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 != 0) goto L8e
            if (r14 < 0) goto Lab
        L89:
            long r24 = r24 >> r8
            int r6 = r6 + 1
            goto L37
        L8e:
            long r0 = X.C8j4.A0L(r0)
            goto L75
        L93:
            long r1 = X.C8j4.A0M(r18)
            long r1 = r1 & r16
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 != 0) goto Lab
            int r20 = r20 + 8
            int r3 = r3 + r20
            r3 = r3 & r4
            goto L59
        La3:
            if (r7 != r8) goto Lac
        La5:
            if (r9 == r10) goto Lac
            int r9 = r9 + 1
            goto L1a
        Lab:
            return r26
        Lac:
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AN9.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[PHI: r8
  0x003f: PHI (r8v2 int) = (r8v1 int), (r8v4 int) binds: [B:6:0x001a, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r14 = this;
            float[] r11 = r14.A01
            long[] r12 = r14.A02
            int r0 = r12.length
            int r10 = r0 + (-2)
            r0 = 0
            if (r10 < 0) goto L45
            r9 = 0
            r8 = 0
        Lc:
            r13 = r12[r9]
            long r3 = X.C8j5.A0A(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3f
            int r0 = X.C8j3.A0E(r9, r10)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L25:
            if (r5 >= r6) goto L3d
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L39
            int r0 = r9 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            int r8 = X.C8j4.A06(r8, r0)
        L39:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L25
        L3d:
            if (r6 != r7) goto L44
        L3f:
            if (r9 == r10) goto L44
            int r9 = r9 + 1
            goto Lc
        L44:
            return r8
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AN9.hashCode():int");
    }

    public final String toString() {
        char c;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        float[] fArr = this.A01;
        long[] jArr = this.A02;
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
                                float f = fArr[(i << 3) + i3];
                                if (i2 != 0) {
                                    sbA0w.append((CharSequence) ", ");
                                }
                                c = '\b';
                                if (i2 == -1) {
                                    sbA0w.append((CharSequence) "...");
                                    break loop0;
                                }
                                sbA0w.append(f);
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
