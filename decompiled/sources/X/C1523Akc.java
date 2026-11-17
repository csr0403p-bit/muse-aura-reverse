package X;

/* renamed from: X.Akc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1523Akc extends AbstractC1522Akb {
    public int A00;

    public final void A04() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC0977AKq.A01) {
            C8j3.A1N(jArr);
            C8j3.A1O(this.A03, super.A00);
        }
        this.A00 = C8j3.A0A(super.A00) - this.A01;
    }

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long jA0C = C8j5.A0C(C8j5.A0H(this.A03, i3));
            if (jA0C != 0) {
                return (i3 + (Long.numberOfTrailingZeros(jA0C) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public C1523Akc() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A02(this, 6);
    }

    public static final int A01(C1523Akc c1523Akc, long j) {
        int iA02 = C3cG.A02(j);
        int i = (iA02 ^ (iA02 >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = ((AbstractC1522Akb) c1523Akc).A00;
        int i6 = i5;
        int i7 = i3 & i5;
        int i8 = 0;
        while (true) {
            long[] jArr = c1523Akc.A03;
            long[] jArr2 = jArr;
            long jA0H = C8j5.A0H(jArr, i7);
            long j2 = i4;
            long j3 = (j2 * 72340172838076673L) ^ jA0H;
            for (long jA0L = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); jA0L != 0; jA0L = C8j4.A0L(jA0L)) {
                int iA08 = C8j4.A08(i7, i5, jA0L);
                if (c1523Akc.A02[iA08] == j) {
                    return iA08;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                int iA00 = c1523Akc.A00(i3);
                if (c1523Akc.A00 == 0 && C8j3.A0W(jArr, iA00) != 254) {
                    if (i5 <= 8 || BMp.A00(c1523Akc.A01, i5) > 0) {
                        int iA0B = C8j3.A0B(i5);
                        long[] jArr3 = c1523Akc.A02;
                        A02(c1523Akc, iA0B);
                        jArr2 = c1523Akc.A03;
                        long[] jArr4 = c1523Akc.A02;
                        i6 = ((AbstractC1522Akb) c1523Akc).A00;
                        for (int i9 = 0; i9 < i5; i9++) {
                            if (C8j3.A0W(jArr, i9) < 128) {
                                long j4 = jArr3[i9];
                                int iA002 = c1523Akc.A00(C8j5.A06(j4) >>> 7);
                                int i10 = iA002 >> 3;
                                int i11 = (iA002 & 7) << 3;
                                long j5 = (jArr2[i10] & ((255 << i11) ^ (-1))) | ((r1 & 127) << i11);
                                jArr2[i10] = j5;
                                C8j3.A1P(jArr2, iA002, i6, j5);
                                jArr4[iA002] = j4;
                            }
                        }
                    } else {
                        long[] jArr5 = c1523Akc.A02;
                        int i12 = (i5 + 7) >> 3;
                        for (int i13 = 0; i13 < i12; i13++) {
                            jArr[i13] = C8j5.A0B(jArr[i13] & (-9187201950435737472L));
                        }
                        int length = jArr.length - 1;
                        long jA0X = C8j3.A0X(jArr, length);
                        int i14 = 0;
                        while (i14 != i5) {
                            int i15 = i14 >> 3;
                            int i16 = (i14 & 7) << 3;
                            long j6 = (jArr[i15] >> i16) & 255;
                            if (j6 != 128 && j6 == 254) {
                                int iA06 = C8j5.A06(jArr5[i14]);
                                int i17 = iA06 >>> 7;
                                int iA003 = c1523Akc.A00(i17);
                                int i18 = i17 & i5;
                                if (((iA003 - i18) & i5) / 8 == ((i14 - i18) & i5) / 8) {
                                    jArr[i15] = ((iA06 & 127) << i16) | (jArr[i15] & ((255 << i16) ^ (-1)));
                                } else {
                                    int i19 = iA003 >> 3;
                                    long j7 = jArr[i19];
                                    int i20 = (iA003 & 7) << 3;
                                    int i21 = iA06 & 127;
                                    if (((j7 >> i20) & 255) == 128) {
                                        jArr[i19] = (j7 & ((255 << i20) ^ (-1))) | (i21 << i20);
                                        jArr[i15] = (jArr[i15] & ((255 << i16) ^ (-1))) | (128 << i16);
                                        jArr5[iA003] = jArr5[i14];
                                        jArr5[i14] = 0;
                                    } else {
                                        jArr[i19] = (i21 << i20) | (j7 & ((255 << i20) ^ (-1)));
                                        long j8 = jArr5[iA003];
                                        jArr5[iA003] = jArr5[i14];
                                        jArr5[i14] = j8;
                                        i14--;
                                    }
                                }
                                jArr[length] = (jArr[0] & jA0X) | Long.MIN_VALUE;
                            }
                            i14++;
                        }
                        c1523Akc.A00 = C8j3.A0A(((AbstractC1522Akb) c1523Akc).A00) - c1523Akc.A01;
                    }
                    iA00 = c1523Akc.A00(i3);
                }
                c1523Akc.A01++;
                int i22 = c1523Akc.A00;
                int i23 = iA00 >> 3;
                long j9 = jArr2[i23];
                int i24 = (iA00 & 7) << 3;
                c1523Akc.A00 = i22 - (AnonymousClass002.A1M((((j9 >> i24) & 255) > 128L ? 1 : (((j9 >> i24) & 255) == 128L ? 0 : -1))) ? 1 : 0);
                long j10 = (((255 << i24) ^ (-1)) & j9) | (j2 << i24);
                jArr2[i23] = j10;
                C8j3.A1P(jArr2, iA00, i6, j10);
                return iA00;
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
    }

    public static final void A02(C1523Akc c1523Akc, int i) {
        int iA0C = C8j3.A0C(i);
        ((AbstractC1522Akb) c1523Akc).A00 = iA0C;
        long[] jArrA1Y = C8j3.A1Y(iA0C);
        c1523Akc.A03 = jArrA1Y;
        C8j3.A1O(jArrA1Y, iA0C);
        c1523Akc.A00 = C8j3.A0A(((AbstractC1522Akb) c1523Akc).A00) - c1523Akc.A01;
        c1523Akc.A02 = new long[iA0C];
    }

    public final void A05(long j) {
        int iA0D = C8j3.A0D(AnonymousClass002.A0A(j));
        int i = iA0D & 127;
        int i2 = super.A00;
        int i3 = (iA0D >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A03;
            long jA0H = C8j5.A0H(jArr, i3);
            long j2 = (i * 72340172838076673L) ^ jA0H;
            for (long jA0L = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); jA0L != 0; jA0L = C8j4.A0L(jA0L)) {
                int iA08 = C8j4.A08(i3, i2, jA0L);
                if (this.A02[iA08] == j) {
                    if (iA08 >= 0) {
                        this.A01--;
                        int i5 = iA08 >> 3;
                        int i6 = (iA08 & 7) << 3;
                        C8j3.A1P(jArr, iA08, i2, C8j3.A0Y(jArr, i6, i5, jArr[i5] & ((255 << i6) ^ (-1))));
                        return;
                    }
                    return;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                return;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }
}
