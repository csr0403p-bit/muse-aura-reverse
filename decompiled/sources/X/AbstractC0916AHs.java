package X;

import java.util.Set;

/* renamed from: X.AHs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0916AHs<E> {
    public int A00;
    public int A01;
    public Set<E> A02;
    public long[] A03 = AbstractC0977AKq.A01;
    public Object[] A04 = AbstractC1684AoN.A02;

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
    public final boolean A05(E r20) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0916AHs.A05(java.lang.Object):boolean");
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
            boolean r0 = r12 instanceof X.AbstractC0916AHs
            r15 = 0
            if (r0 == 0) goto L4c
            X.AHs r12 = (X.AbstractC0916AHs) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L4c
            java.lang.Object[] r11 = r2.A04
            long[] r10 = r2.A03
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
            boolean r0 = r12.A05(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0916AHs.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[PHI: r14
  0x003f: PHI (r14v3 int) = (r14v2 int), (r14v5 int) binds: [B:6:0x001a, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r14 = this;
            java.lang.Object[] r10 = r14.A04
            long[] r11 = r14.A03
            int r0 = r11.length
            int r9 = r0 + (-2)
            r0 = 0
            if (r9 < 0) goto L45
            r8 = 0
            r14 = 0
        Lc:
            r12 = r11[r8]
            long r3 = X.C8j5.A0A(r12)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3f
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L25:
            if (r5 >= r6) goto L3d
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r12
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L39
            java.lang.Object r0 = X.C8j3.A11(r10, r8, r5)
            int r0 = X.C60R.A01(r0)
            int r14 = r14 + r0
        L39:
            long r12 = r12 >> r7
            int r5 = r5 + 1
            goto L25
        L3d:
            if (r6 != r7) goto L44
        L3f:
            if (r8 == r9) goto L44
            int r8 = r8 + 1
            goto Lc
        L44:
            return r14
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0916AHs.hashCode():int");
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        Object[] objArr = this.A04;
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
                                Object objA11 = C8j3.A11(objArr, i, i3);
                                if (i2 != 0) {
                                    sbA0w.append((CharSequence) ", ");
                                    if (i2 == -1) {
                                        sbA0w.append((CharSequence) "...");
                                        break loop0;
                                    }
                                }
                                sbA0w.append((CharSequence) (objA11 == this ? "(this)" : String.valueOf(objA11)));
                                i2++;
                            }
                            j >>= 8;
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
