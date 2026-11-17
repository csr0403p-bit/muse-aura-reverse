package X;

import java.util.Arrays;

/* renamed from: X.AHt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0917AHt<E> extends AbstractC0916AHs<E> {
    public int A00;

    public final void A06() {
        this.A01 = 0;
        long[] jArr = this.A03;
        if (jArr != AbstractC0977AKq.A01) {
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            long[] jArr2 = this.A03;
            int i = super.A00;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & ((-1) ^ j)) | j;
        }
        AbstractC0903AHf.A04(this.A04, 0, super.A00);
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if ((X.C8j4.A0M(r10) & (-9187201950435737472L)) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(E r14) {
        /*
            r13 = this;
            r12 = 0
            int r0 = X.C60R.A01(r14)
            int r0 = X.C8j3.A0D(r0)
            r7 = r0 & 127(0x7f, float:1.78E-43)
            int r6 = r13.A00
            int r5 = r0 >>> 7
        Lf:
            r5 = r5 & r6
            long[] r0 = r13.A03
            long r10 = X.C8j5.A0H(r0, r5)
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r10
            long r8 = r2 - r0
            r0 = -1
            long r2 = r2 ^ r0
            long r2 = r2 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L29:
            long r2 = r2 & r8
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L49
            int r1 = X.C8j4.A08(r5, r6, r2)
            java.lang.Object[] r0 = r13.A04
            r0 = r0[r1]
            boolean r0 = X.C7384Etj.areEqual(r0, r14)
            if (r0 == 0) goto L44
            if (r1 < 0) goto L43
            r13.A07(r1)
        L43:
            return
        L44:
            r0 = 1
            long r8 = r2 - r0
            goto L29
        L49:
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = X.C8j4.A0M(r10)
            long r1 = r1 & r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L43
            int r12 = r12 + 8
            int r5 = r5 + r12
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0917AHt.A09(java.lang.Object):void");
    }

    public final boolean A0A(Iterable<? extends E> iterable) {
        int i = this.A01;
        for (E e : iterable) {
            this.A04[A01(this, e)] = e;
        }
        return i != this.A01;
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

    public static final int A01(C0917AHt c0917AHt, Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = ((AbstractC0916AHs) c0917AHt).A00;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = c0917AHt.A03;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (C7384Etj.areEqual(c0917AHt.A04[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                int iA00 = c0917AHt.A00(i3);
                if (c0917AHt.A00 == 0) {
                    long[] jArr2 = c0917AHt.A03;
                    if (((jArr2[iA00 >> 3] >> ((iA00 & 7) << 3)) & 255) != 254) {
                        int i10 = ((AbstractC0916AHs) c0917AHt).A00;
                        if (i10 <= 8 || BMp.A01(c0917AHt.A01 * 32, i10 * 25) > 0) {
                            C0918AHu c0918AHu = AbstractC0977AKq.A00;
                            int i11 = i10 != 0 ? (i10 * 2) + 1 : 6;
                            Object[] objArr = c0917AHt.A04;
                            c0917AHt.A04(i11);
                            long[] jArr3 = c0917AHt.A03;
                            Object[] objArr2 = c0917AHt.A04;
                            int i12 = ((AbstractC0916AHs) c0917AHt).A00;
                            for (int i13 = 0; i13 < i10; i13++) {
                                if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                                    Object obj2 = objArr[i13];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                                    int i14 = (iHashCode2 ^ (iHashCode2 >>> 16)) * (-862048943);
                                    int iA002 = c0917AHt.A00((i14 ^ (i14 >>> 16)) >>> 7);
                                    int i15 = iA002 >> 3;
                                    int i16 = (iA002 & 7) << 3;
                                    long j5 = (jArr3[i15] & ((255 << i16) ^ (-1))) | ((r1 & 127) << i16);
                                    jArr3[i15] = j5;
                                    jArr3[(((iA002 - 7) & i12) + (i12 & 7)) >> 3] = j5;
                                    objArr2[iA002] = obj2;
                                }
                            }
                        } else {
                            Object[] objArr3 = c0917AHt.A04;
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
                                    int iA003 = c0917AHt.A00(i25);
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
                                        } else {
                                            jArr2[i27] = (i29 << i28) | (j8 & ((255 << i28) ^ (-1)));
                                            Object obj4 = objArr3[iA003];
                                            objArr3[iA003] = objArr3[i20];
                                            objArr3[i20] = obj4;
                                            i20--;
                                        }
                                    }
                                    jArr2[length] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                }
                                i20++;
                            } while (i20 != i10);
                            c0917AHt.A03();
                        }
                        iA00 = c0917AHt.A00(i3);
                    }
                }
                c0917AHt.A01++;
                int i30 = c0917AHt.A00;
                long[] jArr4 = c0917AHt.A03;
                int i31 = iA00 >> 3;
                long j9 = jArr4[i31];
                int i32 = (iA00 & 7) << 3;
                c0917AHt.A00 = i30 - (((j9 >> i32) & 255) == 128 ? 1 : 0);
                int i33 = ((AbstractC0916AHs) c0917AHt).A00;
                long j10 = (((255 << i32) ^ (-1)) & j9) | (j2 << i32);
                jArr4[i31] = j10;
                jArr4[(((iA00 - 7) & i33) + (i33 & 7)) >> 3] = j10;
                return iA00;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public static C0917AHt A02() {
        C0917AHt<Object> c0917AHt = HsU.A00;
        return new C0917AHt(6);
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
        }
        this.A03 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & ((-1) ^ j)) | j;
        A03();
        this.A04 = iMax == 0 ? AbstractC1684AoN.A02 : new Object[iMax];
    }

    public final void A07(int i) {
        this.A01--;
        long[] jArr = this.A03;
        int i2 = super.A00;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & ((255 << i4) ^ (-1))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.A04[i] = null;
    }

    public final void A08(AbstractC0916AHs<E> abstractC0916AHs) {
        Object[] objArr = abstractC0916AHs.A04;
        long[] jArr = abstractC0916AHs.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i3];
                        this.A04[A01(this, obj)] = obj;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
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

    public final boolean A0B(E e) {
        int i = this.A01;
        this.A04[A01(this, e)] = e;
        return this.A01 != i;
    }

    public final boolean A0C(E e) {
        int iHashCode = e != null ? e.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = super.A00;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (C7384Etj.areEqual(this.A04[iNumberOfTrailingZeros], e)) {
                    if (iNumberOfTrailingZeros < 0) {
                        return false;
                    }
                    A07(iNumberOfTrailingZeros);
                    return true;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public C0917AHt(int i) {
        if (i < 0) {
            throw C60O.A0i("Capacity must be a positive value.");
        }
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A04(i == 7 ? 8 : i + ((i - 1) / 7));
    }

    public C0917AHt() {
        this(6);
    }
}
