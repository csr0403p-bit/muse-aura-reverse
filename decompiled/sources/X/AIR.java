package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.network.acs.AcsKeyConfig;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AIR<E> extends AIT<E> {
    public int A00;

    public final void A05() {
        this.A01 = 0;
        long[] jArr = this.A04;
        if (jArr != AbstractC0977AKq.A01) {
            C8j3.A1N(jArr);
            C8j3.A1O(this.A04, super.A00);
        }
        AbstractC0903AHf.A04(this.A06, 0, super.A00);
        long[] jArr2 = this.A05;
        Arrays.fill(jArr2, 0, jArr2.length, AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS);
        this.A02 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A00 = C8j3.A0A(super.A00) - this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(java.util.Collection<? extends E> r18) {
        /*
            r17 = this;
            r10 = 0
            r11 = r18
            X.C7384Etj.A0Y(r11, r10)
            r12 = r17
            java.lang.Object[] r9 = r12.A06
            int r8 = r12.A01
            long[] r7 = r12.A04
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L53
            r5 = 0
        L14:
            r17 = r7[r5]
            long r3 = X.C8j5.A0A(r17)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4e
            int r0 = X.C8j3.A0E(r5, r6)
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L2d:
            if (r2 >= r3) goto L4c
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L47
            int r1 = r5 << 3
            int r1 = r1 + r2
            r0 = r9[r1]
            boolean r0 = X.AbstractC0878AGe.A0k(r11, r0)
            if (r0 != 0) goto L47
            r12.A06(r1)
        L47:
            long r17 = r17 >> r4
            int r2 = r2 + 1
            goto L2d
        L4c:
            if (r3 != r4) goto L53
        L4e:
            if (r5 == r6) goto L53
            int r5 = r5 + 1
            goto L14
        L53:
            int r0 = r12.A01
            if (r8 == r0) goto L58
            r10 = 1
        L58:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIR.A09(java.util.Collection):boolean");
    }

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long jA0C = C8j5.A0C(C8j5.A0H(this.A04, i3));
            if (jA0C != 0) {
                return (i3 + (Long.numberOfTrailingZeros(jA0C) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public static final int A01(AIR air, Object obj) {
        long j;
        int iA01 = C60R.A01(obj);
        int i = (iA01 ^ (iA01 >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = ((AIT) air).A00;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long jA0H = C8j5.A0H(air.A04, i6);
            long j2 = i4;
            long j3 = jA0H ^ (j2 * 72340172838076673L);
            for (long jA0L = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); jA0L != 0; jA0L = C8j4.A0L(jA0L)) {
                int iA08 = C8j4.A08(i6, i5, jA0L);
                if (C7384Etj.areEqual(air.A06[iA08], obj)) {
                    return iA08;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                int iA00 = air.A00(i3);
                if (air.A00 == 0) {
                    long[] jArr = air.A04;
                    if (C8j3.A0W(jArr, iA00) != 254) {
                        int i8 = ((AIT) air).A00;
                        if (i8 <= 8 || BMp.A00(air.A01, i8) > 0) {
                            int iA0B = C8j3.A0B(i8);
                            Object[] objArr = air.A06;
                            long[] jArr2 = air.A05;
                            int[] iArr = new int[i8];
                            A02(air, iA0B);
                            long[] jArr3 = air.A04;
                            Object[] objArr2 = air.A06;
                            long[] jArr4 = air.A05;
                            int i9 = ((AIT) air).A00;
                            for (int i10 = 0; i10 < i8; i10++) {
                                if (C8j3.A0W(jArr, i10) < 128) {
                                    Object obj2 = objArr[i10];
                                    int iA012 = C60R.A01(obj2);
                                    int i11 = (iA012 ^ (iA012 >>> 16)) * (-862048943);
                                    int iA002 = air.A00((i11 ^ (i11 >>> 16)) >>> 7);
                                    int i12 = iA002 >> 3;
                                    int i13 = (iA002 & 7) << 3;
                                    long j4 = (jArr3[i12] & ((255 << i13) ^ (-1))) | ((r1 & 127) << i13);
                                    jArr3[i12] = j4;
                                    C8j3.A1P(jArr3, iA002, i9, j4);
                                    objArr2[iA002] = obj2;
                                    jArr4[iA002] = jArr2[i10];
                                    iArr[i10] = iA002;
                                }
                            }
                            long[] jArr5 = air.A05;
                            int length = jArr5.length;
                            int i14 = 0;
                            while (true) {
                                int i15 = Integer.MAX_VALUE;
                                if (i14 >= length) {
                                    break;
                                }
                                long j5 = jArr5[i14];
                                int i16 = (int) (2147483647L & j5);
                                long j6 = ((j5 & (-4611686018427387904L)) | (((int) ((j5 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r12])) << 31;
                                if (i16 != Integer.MAX_VALUE) {
                                    i15 = iArr[i16];
                                }
                                jArr5[i14] = j6 | i15;
                                i14++;
                            }
                            int i17 = air.A02;
                            if (i17 != Integer.MAX_VALUE) {
                                air.A02 = iArr[i17];
                            }
                            int i18 = air.A03;
                            if (i18 != Integer.MAX_VALUE) {
                                air.A03 = iArr[i18];
                            }
                        } else {
                            Object[] objArr3 = air.A06;
                            long[] jArr6 = air.A05;
                            long[] jArr7 = new long[i8];
                            Arrays.fill(jArr7, 0, i8, 9223372034707292159L);
                            int i19 = (i8 + 7) >> 3;
                            for (int i20 = 0; i20 < i19; i20++) {
                                jArr[i20] = C8j5.A0B(jArr[i20] & (-9187201950435737472L));
                            }
                            int length2 = jArr.length - 1;
                            int i21 = length2 - 1;
                            jArr[i21] = (jArr[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr[length2] = jArr[0];
                            int i22 = 0;
                            do {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j7 = (jArr[i23] >> i24) & 255;
                                if (j7 != 128 && j7 == 254) {
                                    int iA013 = C60R.A01(objArr3[i22]);
                                    int i25 = (iA013 ^ (iA013 >>> 16)) * (-862048943);
                                    int i26 = (i25 ^ (i25 >>> 16)) >>> 7;
                                    int iA003 = air.A00(i26);
                                    int i27 = i26 & i8;
                                    if (((iA003 - i27) & i8) / 8 == ((i22 - i27) & i8) / 8) {
                                        jArr[i23] = ((r16 & 127) << i24) | (jArr[i23] & ((255 << i24) ^ (-1)));
                                        if (jArr7[i22] == 9223372034707292159L) {
                                            long j8 = i22;
                                            jArr7[i22] = j8 | (j8 << 32);
                                        }
                                    } else {
                                        int i28 = iA003 >> 3;
                                        long j9 = jArr[i28];
                                        int i29 = (iA003 & 7) << 3;
                                        long j10 = (j9 >> i29) & 255;
                                        long j11 = j9 & ((255 << i29) ^ (-1));
                                        long j12 = (r16 & 127) << i29;
                                        if (j10 == 128) {
                                            jArr[i28] = j11 | j12;
                                            jArr[i23] = (jArr[i23] & ((255 << i24) ^ (-1))) | (128 << i24);
                                            objArr3[iA003] = objArr3[i22];
                                            objArr3[i22] = null;
                                            jArr6[iA003] = jArr6[i22];
                                            jArr6[i22] = 4611686018427387903L;
                                            int i30 = (int) ((jArr7[i22] >> 32) & 4294967295L);
                                            if (i30 != Integer.MAX_VALUE) {
                                                jArr7[i30] = (jArr7[i30] & (-4294967296L)) | iA003;
                                                j = (jArr7[i22] & 4294967295L) | (-4294967296L);
                                            } else {
                                                j = (2147483647L << 32) | iA003;
                                            }
                                            jArr7[i22] = j;
                                            jArr7[iA003] = 2147483647L | (i22 << 32);
                                        } else {
                                            jArr[i28] = j12 | j11;
                                            Object obj3 = objArr3[iA003];
                                            objArr3[iA003] = objArr3[i22];
                                            objArr3[i22] = obj3;
                                            long j13 = jArr6[iA003];
                                            jArr6[iA003] = jArr6[i22];
                                            jArr6[i22] = j13;
                                            int i31 = (int) ((jArr7[i22] >> 32) & 4294967295L);
                                            if (i31 != Integer.MAX_VALUE) {
                                                long j14 = iA003;
                                                jArr7[i31] = (jArr7[i31] & (-4294967296L)) | j14;
                                                jArr7[i22] = (jArr7[i22] & 4294967295L) | (j14 << 32);
                                            } else {
                                                long j15 = iA003;
                                                jArr7[i22] = j15 | (j15 << 32);
                                                i31 = i22;
                                            }
                                            jArr7[iA003] = (i31 << 32) | i22;
                                            i22--;
                                        }
                                    }
                                    jArr[length2] = jArr[0];
                                }
                                i22++;
                            } while (i22 != i8);
                            air.A00 = C8j3.A0A(((AIT) air).A00) - air.A01;
                            long[] jArr8 = air.A05;
                            int length3 = jArr8.length;
                            int i32 = 0;
                            while (true) {
                                int i33 = Integer.MAX_VALUE;
                                if (i32 >= length3) {
                                    break;
                                }
                                long j16 = jArr8[i32];
                                int i34 = (int) (2147483647L & j16);
                                long j17 = ((j16 & (-4611686018427387904L)) | (((int) ((j16 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr7[r14] & 4294967295L))) << 31;
                                if (i34 != Integer.MAX_VALUE) {
                                    i33 = (int) (4294967295L & jArr7[i34]);
                                }
                                jArr8[i32] = i33 | j17;
                                i32++;
                            }
                            int i35 = air.A02;
                            if (i35 != Integer.MAX_VALUE) {
                                air.A02 = (int) (jArr7[i35] & 4294967295L);
                            }
                            int i36 = air.A03;
                            if (i36 != Integer.MAX_VALUE) {
                                air.A03 = (int) (jArr7[i36] & 4294967295L);
                            }
                        }
                        iA00 = air.A00(i3);
                    }
                }
                air.A01++;
                int i37 = air.A00;
                long[] jArr9 = air.A04;
                int i38 = iA00 >> 3;
                long j18 = jArr9[i38];
                int i39 = (iA00 & 7) << 3;
                air.A00 = i37 - (AnonymousClass002.A1M((((j18 >> i39) & 255) > 128L ? 1 : (((j18 >> i39) & 255) == 128L ? 0 : -1))) ? 1 : 0);
                int i40 = ((AIT) air).A00;
                long j19 = (((255 << i39) ^ (-1)) & j18) | (j2 << i39);
                jArr9[i38] = j19;
                C8j3.A1P(jArr9, iA00, i40, j19);
                return iA00;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final void A06(int i) {
        this.A01--;
        long[] jArr = this.A04;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        C8j3.A1P(jArr, i, super.A00, C8j3.A0Y(jArr, i3, i2, jArr[i2] & ((255 << i3) ^ (-1))));
        this.A06[i] = null;
        long[] jArr2 = this.A05;
        long j = jArr2[i];
        int i4 = (int) ((j >> 31) & 2147483647L);
        int i5 = (int) (j & 2147483647L);
        if (i4 != Integer.MAX_VALUE) {
            jArr2[i4] = (jArr2[i4] & AuraImpressionTimeTracker.UNKNOWN_TIME) | (i5 & 2147483647L);
        } else {
            this.A02 = i5;
        }
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = ((i4 & 2147483647L) << 31) | (jArr2[i5] & (-4611686016279904257L));
        } else {
            this.A03 = i4;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean A07(E e) {
        int i = this.A01;
        int iA01 = A01(this, e);
        int iA03 = AIT.A03(this, e, iA01);
        this.A02 = iA01;
        if (this.A03 == iA03) {
            this.A03 = iA01;
        }
        return AnonymousClass002.A1P(this.A01, i);
    }

    public AIR() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A02(this, 6);
    }

    public static final void A02(AIR air, int i) {
        long[] jArr;
        int iA0C = C8j3.A0C(i);
        ((AIT) air).A00 = iA0C;
        long[] jArrA1Y = C8j3.A1Y(iA0C);
        air.A04 = jArrA1Y;
        C8j3.A1O(jArrA1Y, iA0C);
        air.A00 = C8j3.A0A(((AIT) air).A00) - air.A01;
        air.A06 = iA0C == 0 ? AbstractC1684AoN.A02 : new Object[iA0C];
        if (iA0C == 0) {
            jArr = AIV.A00;
        } else {
            jArr = new long[iA0C];
            Arrays.fill(jArr, 0, iA0C, AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS);
        }
        air.A05 = jArr;
    }

    public final boolean A08(E e) {
        int iA0D = C8j3.A0D(C60R.A01(e));
        int i = iA0D & 127;
        int i2 = super.A00;
        int i3 = (iA0D >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long jA0H = C8j5.A0H(this.A04, i3);
            long j = (i * 72340172838076673L) ^ jA0H;
            for (long jA0L = (j ^ (-1)) & (j - 72340172838076673L) & (-9187201950435737472L); jA0L != 0; jA0L = C8j4.A0L(jA0L)) {
                int iA08 = C8j4.A08(i3, i2, jA0L);
                if (C7384Etj.areEqual(this.A06[iA08], e)) {
                    if (iA08 < 0) {
                        return false;
                    }
                    A06(iA08);
                    return true;
                }
            }
            if ((C8j4.A0M(jA0H) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }
}
