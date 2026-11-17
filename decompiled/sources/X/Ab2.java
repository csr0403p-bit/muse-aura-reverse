package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Ab2<V> extends Ab0<V> {
    public int A00;

    public static Ab2 A01() {
        return new Ab2(6);
    }

    public final void A09() {
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
        this.A02 = new int[iMax];
        this.A04 = new Object[iMax];
    }

    public final int A06(int i) {
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
                int iA00 = A00(i4);
                if (this.A00 == 0 && ((jArr[iA00 >> 3] >> ((iA00 & 7) << 3)) & 255) != 254) {
                    if (i6 <= 8 || BMp.A01(this.A01 * 32, i6 * 25) > 0) {
                        C0918AHu c0918AHu = AbstractC0977AKq.A00;
                        int i12 = i6 != 0 ? (i6 * 2) + 1 : 6;
                        int[] iArr = this.A02;
                        Object[] objArr = this.A04;
                        A03(i12);
                        jArr2 = this.A03;
                        int[] iArr2 = this.A02;
                        Object[] objArr2 = this.A04;
                        i7 = super.A00;
                        for (int i13 = 0; i13 < i6; i13++) {
                            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                                int i14 = iArr[i13];
                                int i15 = ((i14 >>> 16) ^ i14) * (-862048943);
                                int iA002 = A00((i15 ^ (i15 >>> 16)) >>> 7);
                                int i16 = iA002 >> 3;
                                int i17 = (iA002 & 7) << 3;
                                long j5 = ((r1 & 127) << i17) | (jArr2[i16] & ((255 << i17) ^ (-1)));
                                jArr2[i16] = j5;
                                jArr2[(((iA002 - 7) & i7) + (i7 & 7)) >> 3] = j5;
                                iArr2[iA002] = i14;
                                objArr2[iA002] = objArr[i13];
                            }
                        }
                    } else {
                        int[] iArr3 = this.A02;
                        Object[] objArr3 = this.A04;
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
                                int iA003 = A00(i27);
                                int i28 = i27 & i6;
                                if (((iA003 - i28) & i6) / 8 == ((i21 - i28) & i6) / 8) {
                                    jArr[i22] = ((i26 & 127) << i23) | (jArr[i22] & ((255 << i23) ^ (-1)));
                                } else {
                                    int i29 = iA003 >> 3;
                                    long j8 = jArr[i29];
                                    int i30 = (iA003 & 7) << 3;
                                    int i31 = i26 & 127;
                                    if (((j8 >> i30) & 255) == 128) {
                                        jArr[i29] = (j8 & ((255 << i30) ^ (-1))) | (i31 << i30);
                                        jArr[i22] = (jArr[i22] & ((255 << i23) ^ (-1))) | (128 << i23);
                                        iArr3[iA003] = iArr3[i21];
                                        iArr3[i21] = 0;
                                        objArr3[iA003] = objArr3[i21];
                                        objArr3[i21] = null;
                                    } else {
                                        jArr[i29] = (i31 << i30) | (j8 & ((255 << i30) ^ (-1)));
                                        int i32 = iArr3[iA003];
                                        iArr3[iA003] = iArr3[i21];
                                        iArr3[i21] = i32;
                                        Object obj = objArr3[iA003];
                                        objArr3[iA003] = objArr3[i21];
                                        objArr3[i21] = obj;
                                        i21--;
                                    }
                                }
                                jArr[length] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                            }
                            i21++;
                        }
                        A02();
                    }
                    iA00 = A00(i4);
                }
                this.A01++;
                int i33 = this.A00;
                int i34 = iA00 >> 3;
                long j9 = jArr2[i34];
                int i35 = (iA00 & 7) << 3;
                this.A00 = i33 - (((j9 >> i35) & 255) == 128 ? 1 : 0);
                long j10 = (((255 << i35) ^ (-1)) & j9) | (j2 << i35);
                jArr2[i34] = j10;
                jArr2[(((iA00 - 7) & i7) + (i7 & 7)) >> 3] = j10;
                return iA00 ^ (-1);
            }
            i9 += 8;
            i8 = (i8 + i9) & i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (((r13 & ((r13 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V A07(int r16) {
        /*
            r15 = this;
            r7 = r16
            int r1 = r16 >>> 16
            r1 = r1 ^ r16
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r0
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
            r6 = r1 & 127(0x7f, float:1.78E-43)
            r8 = r15
            int r5 = r15.A00
            int r16 = r1 >>> 7
            r16 = r16 & r5
            r15 = 0
        L17:
            long[] r3 = r8.A03
            int r2 = r16 >> 3
            r0 = r16 & 7
            int r1 = r0 << 3
            r9 = r3[r2]
            long r9 = r9 >>> r1
            int r0 = r2 + 1
            r13 = r3[r0]
            int r0 = 64 - r1
            long r13 = r13 << r0
            long r3 = (long) r1
            long r1 = -r3
            r0 = 63
            long r1 = r1 >> r0
            long r13 = r13 & r1
            long r13 = r13 | r9
            long r2 = (long) r6
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r9
            long r2 = r2 ^ r13
            long r0 = r2 - r9
            r11 = -1
            long r2 = r2 ^ r11
            long r2 = r2 & r0
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L43:
            long r2 = r2 & r9
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L65
            int r0 = java.lang.Long.numberOfTrailingZeros(r2)
            int r1 = r0 >> 3
            int r1 = r1 + r16
            r1 = r1 & r5
            int[] r0 = r8.A02
            r0 = r0[r1]
            if (r0 != r7) goto L60
            if (r1 < 0) goto L7b
            java.lang.Object r0 = r8.A08(r1)
            return r0
        L60:
            r0 = 1
            long r9 = r2 - r0
            goto L43
        L65:
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r13 ^ r11
            r0 = 6
            long r1 = r1 << r0
            long r13 = r13 & r1
            long r13 = r13 & r3
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 != 0) goto L7b
            int r15 = r15 + 8
            int r16 = r16 + r15
            r16 = r16 & r5
            goto L17
        L7b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ab2.A07(int):java.lang.Object");
    }

    public final V A08(int i) {
        this.A01--;
        long[] jArr = this.A03;
        int i2 = super.A00;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & ((255 << i4) ^ (-1))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.A04;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public Ab2(int i) {
        if (i < 0) {
            throw C60O.A0i("Capacity must be a positive value.");
        }
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A03(i == 7 ? 8 : i + ((i - 1) / 7));
    }

    /* JADX WARN: Incorrect return type in method signature: (ITV;)TV; */
    public final void A0A(int i, Object obj) {
        int iA06 = A06(i);
        if (iA06 < 0) {
            iA06 ^= -1;
        }
        Object[] objArr = this.A04;
        this.A02[iA06] = i;
        objArr[iA06] = obj;
    }

    public final void A0B(int i, V v) {
        int iA06 = A06(i);
        if (iA06 < 0) {
            iA06 ^= -1;
        }
        this.A02[iA06] = i;
        this.A04[iA06] = v;
    }

    public Ab2() {
        this(6);
    }
}
