package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AXI<V> extends AXH<V> {
    public int A00;

    public final void A09() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC0977AKq.A01) {
            C8j3.A1N(jArr);
            C8j3.A1O(this.A03, super.A00);
        }
        AbstractC0903AHf.A04(this.A04, 0, super.A00);
        A03();
    }

    private final int A02(int i) {
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

    private final void A03() {
        int i = super.A00;
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A00 = (i == 7 ? 6 : i - (i / 8)) - this.A01;
    }

    public static final void A04(AXI axi, int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            C0918AHu c0918AHu = AbstractC0977AKq.A00;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        ((AXH) axi).A00 = iMax;
        if (iMax == 0) {
            jArr = AbstractC0977AKq.A01;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            jArr = new long[i2];
            Arrays.fill(jArr, 0, i2, -9187201950435737472L);
        }
        axi.A03 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & ((-1) ^ j)) | j;
        axi.A03();
        axi.A02 = new long[iMax];
        axi.A04 = new Object[iMax];
    }

    public AXI() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A04(this, 6);
    }

    public final int A07(long j) {
        int iA02 = C3cG.A02(j);
        int i = (iA02 ^ (iA02 >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = super.A00;
        int i6 = i5;
        int i7 = i3 & i5;
        int i8 = 0;
        while (true) {
            long[] jArr = this.A03;
            long[] jArr2 = jArr;
            long jA0H = C8j5.A0H(jArr, i7);
            long j2 = i4;
            long j3 = (j2 * 72340172838076673L) ^ jA0H;
            for (long jA0L = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); jA0L != 0; jA0L = C8j4.A0L(jA0L)) {
                int iA08 = C8j4.A08(i7, i5, jA0L);
                if (this.A02[iA08] == j) {
                    return iA08;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                int iA022 = A02(i3);
                if (this.A00 == 0 && C8j3.A0W(jArr, iA022) != 254) {
                    if (i5 <= 8 || BMp.A00(this.A01, i5) > 0) {
                        int iA0B = C8j3.A0B(i5);
                        long[] jArr3 = this.A02;
                        Object[] objArr = this.A04;
                        A04(this, iA0B);
                        jArr2 = this.A03;
                        long[] jArr4 = this.A02;
                        Object[] objArr2 = this.A04;
                        i6 = super.A00;
                        for (int i9 = 0; i9 < i5; i9++) {
                            if (C8j3.A0W(jArr, i9) < 128) {
                                long j4 = jArr3[i9];
                                int iA023 = A02(C8j5.A06(j4) >>> 7);
                                int i10 = iA023 >> 3;
                                int i11 = (iA023 & 7) << 3;
                                long j5 = (jArr2[i10] & ((255 << i11) ^ (-1))) | ((r1 & 127) << i11);
                                jArr2[i10] = j5;
                                C8j3.A1P(jArr2, iA023, i6, j5);
                                jArr4[iA023] = j4;
                                objArr2[iA023] = objArr[i9];
                            }
                        }
                    } else {
                        long[] jArr5 = this.A02;
                        Object[] objArr3 = this.A04;
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
                                int iA024 = A02(i17);
                                int i18 = i17 & i5;
                                if (((iA024 - i18) & i5) / 8 == ((i14 - i18) & i5) / 8) {
                                    jArr[i15] = ((iA06 & 127) << i16) | (jArr[i15] & ((255 << i16) ^ (-1)));
                                } else {
                                    int i19 = iA024 >> 3;
                                    long j7 = jArr[i19];
                                    int i20 = (iA024 & 7) << 3;
                                    int i21 = iA06 & 127;
                                    if (((j7 >> i20) & 255) == 128) {
                                        jArr[i19] = (j7 & ((255 << i20) ^ (-1))) | (i21 << i20);
                                        jArr[i15] = (jArr[i15] & ((255 << i16) ^ (-1))) | (128 << i16);
                                        jArr5[iA024] = jArr5[i14];
                                        jArr5[i14] = 0;
                                        objArr3[iA024] = objArr3[i14];
                                        objArr3[i14] = null;
                                    } else {
                                        jArr[i19] = (i21 << i20) | (j7 & ((255 << i20) ^ (-1)));
                                        long j8 = jArr5[iA024];
                                        jArr5[iA024] = jArr5[i14];
                                        jArr5[i14] = j8;
                                        Object obj = objArr3[iA024];
                                        objArr3[iA024] = objArr3[i14];
                                        objArr3[i14] = obj;
                                        i14--;
                                    }
                                }
                                jArr[length] = (jArr[0] & jA0X) | Long.MIN_VALUE;
                            }
                            i14++;
                        }
                        A03();
                    }
                    iA022 = A02(i3);
                }
                this.A01++;
                int i22 = this.A00;
                int i23 = iA022 >> 3;
                long j9 = jArr2[i23];
                int i24 = (iA022 & 7) << 3;
                this.A00 = i22 - (AnonymousClass002.A1M((((j9 >> i24) & 255) > 128L ? 1 : (((j9 >> i24) & 255) == 128L ? 0 : -1))) ? 1 : 0);
                long j10 = (((255 << i24) ^ (-1)) & j9) | (j2 << i24);
                jArr2[i23] = j10;
                C8j3.A1P(jArr2, iA022, i6, j10);
                return iA022 ^ (-1);
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
    }

    public final V A08(long j) {
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
                    if (iA08 < 0) {
                        return null;
                    }
                    this.A01--;
                    int i5 = iA08 >> 3;
                    int i6 = (iA08 & 7) << 3;
                    C8j3.A1P(jArr, iA08, i2, C8j3.A0Y(jArr, i6, i5, jArr[i5] & ((255 << i6) ^ (-1))));
                    Object[] objArr = this.A04;
                    V v = (V) objArr[iA08];
                    objArr[iA08] = null;
                    return v;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                return null;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void A0A(long j, V v) {
        int iA07 = A07(j);
        if (iA07 < 0) {
            iA07 ^= -1;
        }
        this.A02[iA07] = j;
        this.A04[iA07] = v;
    }

    /* JADX WARN: Incorrect return type in method signature: (JTV;)TV; */
    public final void A0B(Object obj, long j) {
        int iA07 = A07(j);
        if (iA07 < 0) {
            iA07 ^= -1;
        }
        Object[] objArr = this.A04;
        this.A02[iA07] = j;
        objArr[iA07] = obj;
    }
}
