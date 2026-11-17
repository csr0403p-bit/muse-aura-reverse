package X;

import java.util.Arrays;

/* renamed from: X.AHu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0918AHu<K, V> extends AbstractC0915AHr<K, V> {
    public int A00;

    public final void A0D() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC0977AKq.A01) {
            C8j3.A1N(jArr);
            C8j3.A1O(this.A03, super.A00);
        }
        AbstractC0903AHf.A04(this.A05, 0, super.A00);
        AbstractC0903AHf.A04(this.A04, 0, super.A00);
        A03();
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

    public static C0918AHu A02() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        return new C0918AHu(6);
    }

    private final void A03() {
        int i = super.A00;
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A00 = (i == 7 ? 6 : i - (i / 8)) - this.A01;
    }

    private final void A04(int i) {
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
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i3] = (jArr[i3] & ((-1) ^ j)) | j;
        }
        this.A03 = jArr;
        A03();
        this.A04 = iMax == 0 ? AbstractC1684AoN.A02 : new Object[iMax];
        this.A05 = iMax == 0 ? AbstractC1684AoN.A02 : new Object[iMax];
    }

    public final int A09(K k) {
        int iHashCode = k != null ? k.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = super.A00;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (C7384Etj.areEqual(this.A04[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                int iA01 = A01(i3);
                if (this.A00 == 0) {
                    long[] jArr2 = this.A03;
                    if (((jArr2[iA01 >> 3] >> ((iA01 & 7) << 3)) & 255) != 254) {
                        int i10 = super.A00;
                        if (i10 <= 8 || BMp.A01(this.A01 * 32, i10 * 25) > 0) {
                            C0918AHu c0918AHu = AbstractC0977AKq.A00;
                            int i11 = i10 != 0 ? (i10 * 2) + 1 : 6;
                            Object[] objArr = this.A04;
                            Object[] objArr2 = this.A05;
                            A04(i11);
                            long[] jArr3 = this.A03;
                            Object[] objArr3 = this.A04;
                            Object[] objArr4 = this.A05;
                            int i12 = super.A00;
                            for (int i13 = 0; i13 < i10; i13++) {
                                if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                                    Object obj = objArr[i13];
                                    int iHashCode2 = obj != null ? obj.hashCode() : 0;
                                    int i14 = (iHashCode2 ^ (iHashCode2 >>> 16)) * (-862048943);
                                    int iA012 = A01((i14 ^ (i14 >>> 16)) >>> 7);
                                    int i15 = iA012 >> 3;
                                    int i16 = (iA012 & 7) << 3;
                                    long j5 = ((r1 & 127) << i16) | (jArr3[i15] & ((255 << i16) ^ (-1)));
                                    jArr3[i15] = j5;
                                    jArr3[(((iA012 - 7) & i12) + (i12 & 7)) >> 3] = j5;
                                    objArr3[iA012] = obj;
                                    objArr4[iA012] = objArr2[i13];
                                }
                            }
                        } else {
                            Object[] objArr5 = this.A04;
                            Object[] objArr6 = this.A05;
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
                                    Object obj2 = objArr5[i20];
                                    int iHashCode3 = obj2 != null ? obj2.hashCode() : 0;
                                    int i23 = (iHashCode3 ^ (iHashCode3 >>> 16)) * (-862048943);
                                    int i24 = i23 ^ (i23 >>> 16);
                                    int i25 = i24 >>> 7;
                                    int iA013 = A01(i25);
                                    int i26 = i25 & i10;
                                    if (((iA013 - i26) & i10) / 8 == ((i20 - i26) & i10) / 8) {
                                        jArr2[i21] = ((i24 & 127) << i22) | (((255 << i22) ^ (-1)) & jArr2[i21]);
                                    } else {
                                        int i27 = iA013 >> 3;
                                        long j8 = jArr2[i27];
                                        int i28 = (iA013 & 7) << 3;
                                        int i29 = i24 & 127;
                                        if (((j8 >> i28) & 255) == 128) {
                                            jArr2[i27] = (j8 & ((255 << i28) ^ (-1))) | (i29 << i28);
                                            jArr2[i21] = (jArr2[i21] & ((255 << i22) ^ (-1))) | (128 << i22);
                                            objArr5[iA013] = objArr5[i20];
                                            objArr5[i20] = null;
                                            objArr6[iA013] = objArr6[i20];
                                            objArr6[i20] = null;
                                        } else {
                                            jArr2[i27] = (i29 << i28) | (j8 & ((255 << i28) ^ (-1)));
                                            Object obj3 = objArr5[iA013];
                                            objArr5[iA013] = objArr5[i20];
                                            objArr5[i20] = obj3;
                                            Object obj4 = objArr6[iA013];
                                            objArr6[iA013] = objArr6[i20];
                                            objArr6[i20] = obj4;
                                            i20--;
                                        }
                                    }
                                    jArr2[length] = jArr2[0];
                                }
                                i20++;
                            } while (i20 != i10);
                            A03();
                        }
                        iA01 = A01(i3);
                    }
                }
                this.A01++;
                int i30 = this.A00;
                long[] jArr4 = this.A03;
                int i31 = iA01 >> 3;
                long j9 = jArr4[i31];
                int i32 = (iA01 & 7) << 3;
                this.A00 = i30 - (((j9 >> i32) & 255) == 128 ? 1 : 0);
                int i33 = super.A00;
                long j10 = (((255 << i32) ^ (-1)) & j9) | (j2 << i32);
                jArr4[i31] = j10;
                jArr4[(((iA01 - 7) & i33) + (i33 & 7)) >> 3] = j10;
                return iA01 ^ (-1);
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final V A0A(int i) {
        this.A01--;
        long[] jArr = this.A03;
        int i2 = super.A00;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & ((255 << i4) ^ (-1))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.A04[i] = null;
        Object[] objArr = this.A05;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (((r13 & ((r13 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V A0B(K r18) {
        /*
            r17 = this;
            r16 = 0
            r7 = r18
            int r0 = X.C60R.A01(r7)
            int r0 = X.C8j3.A0D(r0)
            r6 = r0 & 127(0x7f, float:1.78E-43)
            r8 = r17
            int r5 = r8.A00
            int r15 = r0 >>> 7
        L14:
            r15 = r15 & r5
            long[] r3 = r8.A03
            int r2 = r15 >> 3
            r0 = r15 & 7
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
        L41:
            long r2 = r2 & r9
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L66
            int r0 = java.lang.Long.numberOfTrailingZeros(r2)
            int r1 = r0 >> 3
            int r1 = r1 + r15
            r1 = r1 & r5
            java.lang.Object[] r0 = r8.A04
            r0 = r0[r1]
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L61
            if (r1 < 0) goto L7a
            java.lang.Object r0 = r8.A0A(r1)
            return r0
        L61:
            r0 = 1
            long r9 = r2 - r0
            goto L41
        L66:
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r13 ^ r11
            r0 = 6
            long r1 = r1 << r0
            long r13 = r13 & r1
            long r13 = r13 & r3
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 != 0) goto L7a
            int r16 = r16 + 8
            int r15 = r15 + r16
            goto L14
        L7a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0918AHu.A0B(java.lang.Object):java.lang.Object");
    }

    public C0918AHu(int i) {
        if (i < 0) {
            throw C60O.A0i("Capacity must be a positive value.");
        }
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A04(i == 7 ? 8 : i + ((i - 1) / 7));
    }

    public final V A0C(K k, V v) {
        int iA09 = A09(k);
        if (iA09 < 0) {
            iA09 ^= -1;
        }
        Object[] objArr = this.A05;
        V v2 = (V) objArr[iA09];
        this.A04[iA09] = k;
        objArr[iA09] = v;
        return v2;
    }

    public final void A0E(K k, V v) {
        int iA09 = A09(k);
        if (iA09 < 0) {
            iA09 ^= -1;
        }
        this.A04[iA09] = k;
        this.A05[iA09] = v;
    }

    public C0918AHu() {
        this(6);
    }
}
