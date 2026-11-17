package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AeA<K> extends Ae9<K> {
    public int A00;

    public final void A05() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC0977AKq.A01) {
            C8j3.A1N(jArr);
            C8j3.A1O(this.A03, super.A00);
        }
        AbstractC0903AHf.A04(this.A04, 0, super.A00);
        A02();
    }

    private final int A00(int i) {
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

    public static final int A01(AeA aeA, Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = ((Ae9) aeA).A00;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = aeA.A03;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (C7384Etj.areEqual(aeA.A04[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                int iA00 = aeA.A00(i3);
                if (aeA.A00 == 0) {
                    long[] jArr2 = aeA.A03;
                    if (((jArr2[iA00 >> 3] >> ((iA00 & 7) << 3)) & 255) != 254) {
                        int i10 = ((Ae9) aeA).A00;
                        if (i10 <= 8 || BMp.A01(aeA.A01 * 32, i10 * 25) > 0) {
                            C0918AHu c0918AHu = AbstractC0977AKq.A00;
                            int i11 = i10 != 0 ? (i10 * 2) + 1 : 6;
                            Object[] objArr = aeA.A04;
                            int[] iArr = aeA.A02;
                            aeA.A03(i11);
                            long[] jArr3 = aeA.A03;
                            Object[] objArr2 = aeA.A04;
                            int[] iArr2 = aeA.A02;
                            int i12 = ((Ae9) aeA).A00;
                            for (int i13 = 0; i13 < i10; i13++) {
                                if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                                    Object obj2 = objArr[i13];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                                    int i14 = (iHashCode2 ^ (iHashCode2 >>> 16)) * (-862048943);
                                    int iA002 = aeA.A00((i14 ^ (i14 >>> 16)) >>> 7);
                                    int i15 = iA002 >> 3;
                                    int i16 = (iA002 & 7) << 3;
                                    long j5 = ((r1 & 127) << i16) | (jArr3[i15] & ((255 << i16) ^ (-1)));
                                    jArr3[i15] = j5;
                                    jArr3[(((iA002 - 7) & i12) + (i12 & 7)) >> 3] = j5;
                                    objArr2[iA002] = obj2;
                                    iArr2[iA002] = iArr[i13];
                                }
                            }
                        } else {
                            Object[] objArr3 = aeA.A04;
                            int[] iArr3 = aeA.A02;
                            int i17 = (i10 + 7) >> 3;
                            for (int i18 = 0; i18 < i17; i18++) {
                                long j6 = jArr2[i18] & (-9187201950435737472L);
                                jArr2[i18] = (((-1) ^ j6) + (j6 >>> 7)) & (-72340172838076674L);
                            }
                            int length = jArr2.length - 1;
                            int i19 = length - 1;
                            jArr2[i19] = (jArr2[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[length] = jArr2[0];
                            int i20 = 0;
                            do {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j7 = (jArr2[i21] >> i22) & 255;
                                if (j7 != 128 && j7 == 254) {
                                    Object obj3 = objArr3[i20];
                                    int iHashCode3 = obj3 != null ? obj3.hashCode() : 0;
                                    int i23 = (iHashCode3 ^ (iHashCode3 >>> 16)) * (-862048943);
                                    int i24 = i23 ^ (i23 >>> 16);
                                    int i25 = i24 >>> 7;
                                    int iA003 = aeA.A00(i25);
                                    int i26 = i25 & i10;
                                    if (((iA003 - i26) & i10) / 8 == ((i20 - i26) & i10) / 8) {
                                        jArr2[i21] = ((i24 & 127) << i22) | (jArr2[i21] & ((255 << i22) ^ (-1)));
                                    } else {
                                        int i27 = iA003 >> 3;
                                        long j8 = jArr2[i27];
                                        int i28 = (iA003 & 7) << 3;
                                        int i29 = i24 & 127;
                                        if (((j8 >> i28) & 255) == 128) {
                                            jArr2[i27] = (j8 & ((255 << i28) ^ (-1))) | (i29 << i28);
                                            jArr2[i21] = (jArr2[i21] & ((255 << i22) ^ (-1))) | (128 << i22);
                                            objArr3[iA003] = objArr3[i20];
                                            objArr3[i20] = null;
                                            iArr3[iA003] = iArr3[i20];
                                            iArr3[i20] = 0;
                                        } else {
                                            jArr2[i27] = (i29 << i28) | (j8 & ((255 << i28) ^ (-1)));
                                            Object obj4 = objArr3[iA003];
                                            objArr3[iA003] = objArr3[i20];
                                            objArr3[i20] = obj4;
                                            int i30 = iArr3[iA003];
                                            iArr3[iA003] = iArr3[i20];
                                            iArr3[i20] = i30;
                                            i20--;
                                        }
                                    }
                                    jArr2[length] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                }
                                i20++;
                            } while (i20 != i10);
                            aeA.A02();
                        }
                        iA00 = aeA.A00(i3);
                    }
                }
                aeA.A01++;
                int i31 = aeA.A00;
                long[] jArr4 = aeA.A03;
                int i32 = iA00 >> 3;
                long j9 = jArr4[i32];
                int i33 = (iA00 & 7) << 3;
                aeA.A00 = i31 - (((j9 >> i33) & 255) == 128 ? 1 : 0);
                int i34 = ((Ae9) aeA).A00;
                long j10 = (((255 << i33) ^ (-1)) & j9) | (j2 << i33);
                jArr4[i32] = j10;
                jArr4[(((iA00 - 7) & i34) + (i34 & 7)) >> 3] = j10;
                return iA00 ^ (-1);
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    private final void A02() {
        int i = super.A00;
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A00 = (i == 7 ? 6 : i - (i / 8)) - this.A01;
    }

    private final void A03(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            C0918AHu c0918AHu = AbstractC0977AKq.A00;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        super.A00 = iMax;
        if (iMax == 0) {
            jArr = AbstractC0977AKq.A01;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            jArr = new long[i2];
            Arrays.fill(jArr, 0, i2, -9187201950435737472L);
        }
        this.A03 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & ((-1) ^ j)) | j;
        A02();
        this.A04 = new Object[iMax];
        this.A02 = new int[iMax];
    }

    public final void A06(int i) {
        this.A01--;
        long[] jArr = this.A03;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        C8j3.A1P(jArr, i, super.A00, C8j3.A0Y(jArr, i3, i2, jArr[i2] & ((255 << i3) ^ (-1))));
        this.A04[i] = null;
    }

    public AeA(int i) {
        if (i < 0) {
            throw C60O.A0i("Capacity must be a positive value.");
        }
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A03(i == 7 ? 8 : i + ((i - 1) / 7));
    }

    public final void A07(K k, int i) {
        int iA01 = A01(this, k);
        if (iA01 < 0) {
            iA01 ^= -1;
        }
        this.A04[iA01] = k;
        this.A02[iA01] = i;
    }

    public AeA() {
        this(6);
    }
}
