package X;

/* renamed from: X.Akb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1522Akb {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC0977AKq.A01;
    public long[] A02 = AbstractC1521Aka.A00;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r16
            r16 = 1
            r2 = r15
            if (r10 == r15) goto L59
            boolean r0 = r10 instanceof X.AbstractC1522Akb
            r15 = 0
            if (r0 == 0) goto L4d
            X.Akb r10 = (X.AbstractC1522Akb) r10
            int r1 = r10.A01
            int r0 = r2.A01
            if (r1 != r0) goto L4d
            long[] r9 = r2.A02
            long[] r8 = r2.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L59
            r6 = 0
        L1e:
            r13 = r8[r6]
            long r3 = X.C8j5.A0A(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L37:
            if (r3 >= r4) goto L52
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4e
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r9[r0]
            boolean r0 = r10.A03(r0)
            if (r0 != 0) goto L4e
        L4d:
            return r15
        L4e:
            long r13 = r13 >> r5
            int r3 = r3 + 1
            goto L37
        L52:
            if (r4 != r5) goto L59
        L54:
            if (r6 == r7) goto L59
            int r6 = r6 + 1
            goto L1e
        L59:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1522Akb.equals(java.lang.Object):boolean");
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
            long[] r11 = r14.A02
            long[] r12 = r14.A03
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
            int r8 = X.AnonymousClass006.A05(r0, r8)
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1522Akb.hashCode():int");
    }

    public final String toString() {
        char c;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        long[] jArr = this.A02;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
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
                                long j2 = jArr[(i << 3) + i3];
                                if (i2 != 0) {
                                    sbA0w.append((CharSequence) ", ");
                                }
                                c = '\b';
                                if (i2 == -1) {
                                    sbA0w.append((CharSequence) "...");
                                    break loop0;
                                }
                                sbA0w.append(j2);
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
    public final boolean A03(long r18) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1522Akb.A03(long):boolean");
    }
}
