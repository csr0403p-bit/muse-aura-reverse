package X;

/* loaded from: classes4.dex */
public final class Aeh extends Aei {
    public int A00;

    public final void A05() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC0977AKq.A01) {
            C8j3.A1N(jArr);
            C8j3.A1O(this.A03, super.A00);
        }
        this.A00 = C8j3.A0A(super.A00) - this.A01;
    }

    private final int A00(int i) {
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = super.A00;
        int i7 = i6;
        int i8 = i4 & i6;
        int i9 = 0;
        while (true) {
            long[] jArr = this.A03;
            long[] jArr2 = jArr;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = i5;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i8) & i6;
                if (this.A02[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                int iA01 = A01(i4);
                if (this.A00 == 0 && ((jArr[iA01 >> 3] >> ((iA01 & 7) << 3)) & 255) != 254) {
                    if (i6 <= 8 || BMp.A01(this.A01 * 32, i6 * 25) > 0) {
                        C0918AHu c0918AHu = AbstractC0977AKq.A00;
                        int i12 = i6 != 0 ? (i6 * 2) + 1 : 6;
                        int[] iArr = this.A02;
                        A02(i12);
                        jArr2 = this.A03;
                        int[] iArr2 = this.A02;
                        i7 = super.A00;
                        for (int i13 = 0; i13 < i6; i13++) {
                            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                                int i14 = iArr[i13];
                                int i15 = ((i14 >>> 16) ^ i14) * (-862048943);
                                int iA012 = A01((i15 ^ (i15 >>> 16)) >>> 7);
                                int i16 = iA012 >> 3;
                                int i17 = (iA012 & 7) << 3;
                                long j5 = (jArr2[i16] & ((255 << i17) ^ (-1))) | ((r1 & 127) << i17);
                                jArr2[i16] = j5;
                                jArr2[(((iA012 - 7) & i7) + (i7 & 7)) >> 3] = j5;
                                iArr2[iA012] = i14;
                            }
                        }
                    } else {
                        int[] iArr3 = this.A02;
                        int i18 = (i6 + 7) >> 3;
                        for (int i19 = 0; i19 < i18; i19++) {
                            long j6 = jArr[i19] & (-9187201950435737472L);
                            jArr[i19] = (((-1) ^ j6) + (j6 >>> 7)) & (-72340172838076674L);
                        }
                        int length = jArr.length - 1;
                        int i20 = length - 1;
                        jArr[i20] = (jArr[i20] & 72057594037927935L) | (-72057594037927936L);
                        jArr[length] = jArr[0];
                        int i21 = 0;
                        while (i21 != i6) {
                            int i22 = i21 >> 3;
                            int i23 = (i21 & 7) << 3;
                            long j7 = (jArr[i22] >> i23) & 255;
                            if (j7 != 128 && j7 == 254) {
                                int i24 = iArr3[i21];
                                int i25 = (i24 ^ (i24 >>> 16)) * (-862048943);
                                int i26 = i25 ^ (i25 >>> 16);
                                int i27 = i26 >>> 7;
                                int iA013 = A01(i27);
                                int i28 = i27 & i6;
                                if (((iA013 - i28) & i6) / 8 == ((i21 - i28) & i6) / 8) {
                                    jArr[i22] = ((i26 & 127) << i23) | (jArr[i22] & ((255 << i23) ^ (-1)));
                                } else {
                                    int i29 = iA013 >> 3;
                                    long j8 = jArr[i29];
                                    int i30 = (iA013 & 7) << 3;
                                    int i31 = i26 & 127;
                                    if (((j8 >> i30) & 255) == 128) {
                                        jArr[i29] = (j8 & ((255 << i30) ^ (-1))) | (i31 << i30);
                                        jArr[i22] = (jArr[i22] & ((255 << i23) ^ (-1))) | (128 << i23);
                                        iArr3[iA013] = iArr3[i21];
                                        iArr3[i21] = 0;
                                    } else {
                                        jArr[i29] = (i31 << i30) | (j8 & ((255 << i30) ^ (-1)));
                                        int i32 = iArr3[iA013];
                                        iArr3[iA013] = iArr3[i21];
                                        iArr3[i21] = i32;
                                        i21--;
                                    }
                                }
                                jArr[length] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                            }
                            i21++;
                        }
                        this.A00 = C8j3.A0A(super.A00) - this.A01;
                    }
                    iA01 = A01(i4);
                }
                this.A01++;
                int i33 = this.A00;
                int i34 = iA01 >> 3;
                long j9 = jArr2[i34];
                int i35 = (iA01 & 7) << 3;
                this.A00 = i33 - (((j9 >> i35) & 255) == 128 ? 1 : 0);
                long j10 = (((255 << i35) ^ (-1)) & j9) | (j2 << i35);
                jArr2[i34] = j10;
                jArr2[(((iA01 - 7) & i7) + (i7 & 7)) >> 3] = j10;
                return iA01;
            }
            i9 += 8;
            i8 = (i8 + i9) & i6;
        }
    }

    private final int A01(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & (((-1) ^ j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public static final void A03(Aeh aeh, int i) {
        aeh.A01--;
        long[] jArr = aeh.A03;
        int i2 = ((Aei) aeh).A00;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & ((255 << i4) ^ (-1))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final void A06(Aei aei) {
        int[] iArr = aei.A02;
        long[] jArr = aei.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        int i3 = iArr[(i << 3) + i2];
                        this.A02[A00(i3)] = i3;
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean A07(int i) {
        int i2 = this.A01;
        this.A02[A00(i)] = i;
        return this.A01 != i2;
    }

    public final boolean A08(int i) {
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = super.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.A02[iNumberOfTrailingZeros] == i) {
                    if (iNumberOfTrailingZeros < 0) {
                        return false;
                    }
                    A03(this, iNumberOfTrailingZeros);
                    return true;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public Aeh(int i) {
        if (i < 0) {
            throw C60O.A0i("Capacity must be a positive value.");
        }
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A02(i == 7 ? 8 : i + ((i - 1) / 7));
    }

    private final void A02(int i) {
        int iA0C = C8j3.A0C(i);
        super.A00 = iA0C;
        long[] jArrA1Y = C8j3.A1Y(iA0C);
        this.A03 = jArrA1Y;
        C8j3.A1O(jArrA1Y, iA0C);
        this.A00 = C8j3.A0A(super.A00) - this.A01;
        this.A02 = new int[iA0C];
    }

    public Aeh() {
        this(6);
    }
}
