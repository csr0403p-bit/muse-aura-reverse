package X;

import java.util.Arrays;

/* renamed from: X.E3i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6381E3i {
    public static final byte[] A01 = {0, 0, 0, 1};
    public static final float[] A02 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object A03 = C3cG.A0T();
    public static int[] A00 = new int[10];

    public static C6404E4g A04(C6404E4g c6404E4g, E4H e4h, int i, boolean z) {
        int iA03;
        boolean zA06;
        int iA032;
        int i2;
        int[] iArr = new int[6];
        if (z) {
            iA03 = e4h.A03(2);
            zA06 = e4h.A06();
            iA032 = e4h.A03(5);
            int i3 = 0;
            i2 = 0;
            do {
                if (e4h.A06()) {
                    i2 |= 1 << i3;
                }
                i3++;
            } while (i3 < 32);
            int i4 = 0;
            do {
                iArr[i4] = e4h.A03(8);
                i4++;
            } while (i4 < 6);
        } else if (c6404E4g != null) {
            iA03 = c6404E4g.A03;
            zA06 = c6404E4g.A04;
            iA032 = c6404E4g.A02;
            i2 = c6404E4g.A01;
            iArr = c6404E4g.A05;
        } else {
            iA03 = 0;
            zA06 = false;
            iA032 = 0;
            i2 = 0;
        }
        int iA033 = e4h.A03(8);
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            if (e4h.A06()) {
                i5 += 88;
            }
            if (e4h.A06()) {
                i5 += 8;
            }
        }
        e4h.A05(i5);
        if (i > 0) {
            e4h.A05((8 - i) * 2);
        }
        return new C6404E4g(iArr, iA03, iA032, i2, iA033, zA06);
    }

    public static boolean A07(C6154Dwx c6154Dwx, byte[] bArr, int i) {
        int i2;
        int i3;
        String str = c6154Dwx.A0b;
        if (C6xC.A00(str, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) != 0) {
                return true;
            }
            i2 = b & 31;
            if (i2 == 1 || i2 == 9) {
                return false;
            }
            i3 = 14;
        } else {
            if (!C6xC.A00(str, "video/hevc")) {
                return true;
            }
            E5C e5cA03 = A03(new E4H(bArr, 4, i + 4));
            int i4 = e5cA03.A01;
            if (i4 == 35) {
                return false;
            }
            if (i4 > 14 || i4 % 2 != 0) {
                return true;
            }
            i2 = e5cA03.A02;
            i3 = c6154Dwx.A0G - 1;
        }
        return i2 != i3;
    }

    public static int A00(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        if (C6xC.A00(str, "video/avc")) {
            return 1;
        }
        return (C6xC.A00(str, "video/hevc") || AbstractC6161Dx4.A0B(c6154Dwx.A0W, "video/hevc")) ? 2 : 0;
    }

    public static int A01(byte[] bArr, int i) {
        int i2;
        synchronized (A03) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    int[] iArrCopyOf = A00;
                    int length = iArrCopyOf.length;
                    if (length <= i4) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, length * 2);
                        A00 = iArrCopyOf;
                    }
                    iArrCopyOf[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = A00[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(byte[] r8, boolean[] r9, int r10, int r11) {
        /*
            int r5 = r11 - r10
            r7 = 0
            r4 = 1
            boolean r0 = X.C8j3.A1Q(r5)
            X.C1G.A08(r0)
            if (r5 == 0) goto Lab
            boolean r0 = r9[r7]
            if (r0 == 0) goto L1b
            r9[r7] = r7
            r9[r4] = r7
            r0 = 2
            r9[r0] = r7
            int r10 = r10 + (-3)
            return r10
        L1b:
            r3 = 2
            if (r5 <= r4) goto L46
            boolean r0 = r9[r4]
            if (r0 == 0) goto L2e
            r0 = r8[r10]
            if (r0 != r4) goto L2e
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r3
            return r10
        L2e:
            if (r5 <= r3) goto L46
            boolean r0 = r9[r3]
            if (r0 == 0) goto L46
            r0 = r8[r10]
            if (r0 != 0) goto L46
            int r0 = r10 + 1
            r0 = r8[r0]
            if (r0 != r4) goto L46
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r4
            return r10
        L46:
            int r2 = r11 + (-1)
            int r6 = r10 + 2
        L4a:
            if (r6 >= r2) goto L6c
            r1 = r8[r6]
            r0 = r1 & 254(0xfe, float:3.56E-43)
            if (r0 != 0) goto L69
            int r10 = r6 + (-2)
            r0 = r8[r10]
            if (r0 != 0) goto L67
            int r0 = r6 + (-1)
            r0 = r8[r0]
            if (r0 != 0) goto L67
            if (r1 != r4) goto L67
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            return r10
        L67:
            int r6 = r6 + (-2)
        L69:
            int r6 = r6 + 3
            goto L4a
        L6c:
            if (r5 <= r3) goto L9f
            int r0 = r11 + (-3)
            r0 = r8[r0]
            if (r0 != 0) goto L7f
        L74:
            int r0 = r11 + (-2)
            r0 = r8[r0]
            if (r0 != 0) goto L7f
        L7a:
            r1 = r8[r2]
            r0 = 1
            if (r1 == r4) goto L80
        L7f:
            r0 = 0
        L80:
            r9[r7] = r0
            if (r5 <= r4) goto L9a
            int r0 = r11 + (-2)
            r0 = r8[r0]
            if (r0 != 0) goto L8f
        L8a:
            r1 = r8[r2]
            r0 = 1
            if (r1 == 0) goto L90
        L8f:
            r0 = 0
        L90:
            r9[r4] = r0
            r0 = r8[r2]
            if (r0 != 0) goto L97
            r7 = 1
        L97:
            r9[r3] = r7
            return r11
        L9a:
            boolean r0 = r9[r3]
            if (r0 == 0) goto L8f
            goto L8a
        L9f:
            if (r5 != r3) goto La6
            boolean r0 = r9[r3]
            if (r0 == 0) goto L7f
            goto L74
        La6:
            boolean r0 = r9[r4]
            if (r0 == 0) goto L7f
            goto L7a
        Lab:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6381E3i.A02(byte[], boolean[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.E47 A05(X.E45 r41, byte[] r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6381E3i.A05(X.E45, byte[], int, int):X.E47");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[PHI: r1
  0x009d: PHI (r1v39 int) = (r1v37 int), (r1v41 int) binds: [B:28:0x0097, B:30:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C6377E3e A06(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6381E3i.A06(byte[], int, int):X.E3e");
    }

    public static E5C A03(E4H e4h) {
        e4h.A04();
        return new E5C(e4h.A03(6), e4h.A03(6), e4h.A03(3) - 1);
    }
}
