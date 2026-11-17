package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Gn5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public int[] A08;
    public String[] A09;
    public final int A0A;
    public final Gn5 A0B;
    public final AtomicReference<C10047GoR> A0C;
    public final HlK A0D;
    public final boolean A0E;

    private final int A01(int[] iArr, int i) {
        if (i < 4) {
            throw C60O.A0i("qlen is too short, needs to be at least 4");
        }
        int i2 = iArr[0] ^ this.A0A;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        int i6 = 3;
        do {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
            i6++;
        } while (i6 < i);
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return (i9 << 5) ^ i9;
    }

    public final String A07(int[] iArr, int i) {
        if (i < 4) {
            return i != 1 ? i != 2 ? i != 3 ? "" : A05(iArr[0], iArr[1], iArr[2]) : A04(iArr[0], iArr[1]) : A03(iArr[0]);
        }
        int iA01 = A01(iArr, i);
        int i2 = this.A01;
        int i3 = ((i2 - 1) & iA01) << 2;
        int[] iArr2 = this.A08;
        int i4 = iArr2[i3 + 3];
        if (iA01 == iArr2[i3] && i4 == i) {
            if (A02(iArr, i, iArr2[i3 + 1])) {
                return this.A09[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.A03 + ((i3 >> 3) << 2);
        int i6 = iArr2[i5 + 3];
        if (iA01 == iArr2[i5] && i6 == i && A02(iArr, i, iArr2[i5 + 1])) {
            return this.A09[i5 >> 2];
        }
        int i7 = this.A06;
        int i8 = this.A05;
        int i9 = i7 + ((i3 >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (true) {
            if (i9 >= i10) {
                i9 = (i2 << 3) - i2;
                while (i9 < this.A04) {
                    if (iA01 != iArr2[i9] || i != iArr2[i9 + 3] || !A02(iArr, i, iArr2[i9 + 1])) {
                        i9 += 4;
                    }
                }
                return null;
            }
            int i11 = iArr2[i9 + 3];
            if (iA01 == iArr2[i9] && i == i11) {
                if (A02(iArr, i, iArr2[i9 + 1])) {
                    break;
                }
            } else if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        return this.A09[i9 >> 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(int r16) throws com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gn5.A00(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A02(int[] r9, int r10, int r11) {
        /*
            r8 = this;
            int[] r5 = r8.A08
            r8 = 1
            r7 = 0
            switch(r10) {
                case 4: goto L1a;
                case 5: goto L1c;
                case 6: goto L1e;
                case 7: goto L20;
                case 8: goto L22;
                default: goto L7;
            }
        L7:
            r4 = 0
            r0 = 0
        L9:
            int r3 = r0 + 1
            r2 = r9[r0]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L16
            if (r3 < r10) goto L17
            r4 = 1
        L16:
            return r4
        L17:
            r0 = r3
            r11 = r1
            goto L9
        L1a:
            r6 = 0
            goto L4d
        L1c:
            r3 = 0
            goto L42
        L1e:
            r4 = 0
            goto L37
        L20:
            r0 = 0
            goto L2c
        L22:
            r2 = r9[r7]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
            r0 = 1
        L2c:
            int r4 = r0 + 1
            r2 = r9[r0]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
        L37:
            int r3 = r4 + 1
            r2 = r9[r4]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
        L42:
            int r6 = r3 + 1
            r2 = r9[r3]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
        L4d:
            int r4 = r6 + 1
            r1 = r9[r6]
            int r3 = r11 + 1
            r0 = r5[r11]
            if (r1 != r0) goto L72
            int r2 = r6 + 2
            r1 = r9[r4]
            int r4 = r11 + 2
            r0 = r5[r3]
            if (r1 != r0) goto L72
            int r3 = r6 + 3
            r1 = r9[r2]
            int r2 = r11 + 3
            r0 = r5[r4]
            if (r1 != r0) goto L72
            r1 = r9[r3]
            r0 = r5[r2]
            if (r1 != r0) goto L72
            return r8
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gn5.A02(int[], int, int):boolean");
    }

    public final String A03(int i) {
        String[] strArr;
        int i2;
        int i3 = i ^ this.A0A;
        int i4 = i3 + (i3 >>> 16);
        int i5 = i4 ^ (i4 << 3);
        int i6 = this.A01;
        int i7 = ((i5 + (i5 >>> 12)) & (i6 - 1)) << 2;
        int[] iArr = this.A08;
        int i8 = iArr[i7 + 3];
        if (i8 == 1) {
            if (iArr[i7] == i) {
                strArr = this.A09;
                i2 = i7 >> 2;
            }
            return strArr[i2];
        }
        if (i8 == 0) {
            return null;
        }
        int i9 = this.A03 + ((i7 >> 3) << 2);
        int i10 = iArr[i9 + 3];
        if (i10 == 1) {
            if (iArr[i9] != i) {
            }
            strArr = this.A09;
            i2 = i9 >> 2;
            return strArr[i2];
        }
        if (i10 == 0) {
            return null;
        }
        int i11 = this.A06;
        int i12 = this.A05;
        i9 = i11 + ((i7 >> (i12 + 2)) << i12);
        int i13 = (1 << i12) + i9;
        while (true) {
            if (i9 >= i13) {
                i9 = (i6 << 3) - i6;
                while (i9 < this.A04) {
                    if (i != iArr[i9] || 1 != iArr[i9 + 3]) {
                        i9 += 4;
                    }
                }
                return null;
            }
            int i14 = iArr[i9 + 3];
            if (i == iArr[i9] && 1 == i14) {
                break;
            }
            if (i14 == 0) {
                return null;
            }
            i9 += 4;
        }
    }

    public final String A04(int i, int i2) {
        String[] strArr;
        int i3;
        int i4 = i + (i >>> 15);
        int i5 = ((i4 ^ (i4 >>> 9)) + (i2 * 33)) ^ this.A0A;
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        int i8 = this.A01;
        int i9 = ((i7 + (i7 << 3)) & (i8 - 1)) << 2;
        int[] iArr = this.A08;
        int i10 = iArr[i9 + 3];
        if (i10 == 2) {
            if (i == iArr[i9] && i2 == iArr[i9 + 1]) {
                strArr = this.A09;
                i3 = i9 >> 2;
            }
            return strArr[i3];
        }
        if (i10 == 0) {
            return null;
        }
        int i11 = this.A03 + ((i9 >> 3) << 2);
        int i12 = iArr[i11 + 3];
        if (i12 == 2) {
            if (i != iArr[i11] || i2 != iArr[i11 + 1]) {
            }
            strArr = this.A09;
            i3 = i11 >> 2;
            return strArr[i3];
        }
        if (i12 == 0) {
            return null;
        }
        int i13 = this.A06;
        int i14 = this.A05;
        i11 = i13 + ((i9 >> (i14 + 2)) << i14);
        int i15 = (1 << i14) + i11;
        while (true) {
            if (i11 >= i15) {
                i11 = (i8 << 3) - i8;
                while (i11 < this.A04) {
                    if (i != iArr[i11] || i2 != iArr[i11 + 1] || 2 != iArr[i11 + 3]) {
                        i11 += 4;
                    }
                }
                return null;
            }
            int i16 = iArr[i11 + 3];
            if (i == iArr[i11] && i2 == iArr[i11 + 1] && 2 == i16) {
                break;
            }
            if (i16 == 0) {
                return null;
            }
            i11 += 4;
        }
    }

    public final String A05(int i, int i2, int i3) {
        String[] strArr;
        int i4;
        int i5 = i ^ this.A0A;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i2) * 33;
        int i7 = (i6 + (i6 >>> 15)) ^ i3;
        int i8 = i7 + (i7 >>> 4);
        int i9 = i8 + (i8 >>> 15);
        int i10 = this.A01;
        int i11 = ((i9 ^ (i9 << 9)) & (i10 - 1)) << 2;
        int[] iArr = this.A08;
        int i12 = iArr[i11 + 3];
        if (i12 == 3) {
            if (i == iArr[i11] && iArr[i11 + 1] == i2 && iArr[i11 + 2] == i3) {
                strArr = this.A09;
                i4 = i11 >> 2;
            }
            return strArr[i4];
        }
        if (i12 == 0) {
            return null;
        }
        int i13 = this.A03 + ((i11 >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 3) {
            if (i != iArr[i13] || iArr[i13 + 1] != i2 || iArr[i13 + 2] != i3) {
            }
            strArr = this.A09;
            i4 = i13 >> 2;
            return strArr[i4];
        }
        if (i14 == 0) {
            return null;
        }
        int i15 = this.A06;
        int i16 = this.A05;
        i13 = i15 + ((i11 >> (i16 + 2)) << i16);
        int i17 = (1 << i16) + i13;
        while (true) {
            if (i13 >= i17) {
                i13 = (i10 << 3) - i10;
                while (i13 < this.A04) {
                    if (i != iArr[i13] || i2 != iArr[i13 + 1] || i3 != iArr[i13 + 2] || 3 != iArr[i13 + 3]) {
                        i13 += 4;
                    }
                }
                return null;
            }
            int i18 = iArr[i13 + 3];
            if (i == iArr[i13] && i2 == iArr[i13 + 1] && i3 == iArr[i13 + 2] && 3 == i18) {
                break;
            }
            if (i18 == 0) {
                return null;
            }
            i13 += 4;
        }
        strArr = this.A09;
        i4 = i13 >> 2;
        return strArr[i4];
    }

    public final String A06(String str, int[] iArr, int i) {
        int iA00;
        if (this.A07) {
            if (this.A0B == null) {
                if (this.A00 == 0) {
                    throw C3cG.A0Q("Internal error: Cannot add names to Root symbol table");
                }
                throw C3cG.A0Q("Internal error: Cannot add names to Placeholder symbol table");
            }
            int[] iArr2 = this.A08;
            this.A08 = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.A09;
            this.A09 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.A07 = false;
        }
        HlK hlK = this.A0D;
        if (hlK != null) {
            str = hlK.A00(str);
        }
        if (i == 1) {
            int i2 = iArr[0] ^ this.A0A;
            int i3 = i2 + (i2 >>> 16);
            int i4 = i3 ^ (i3 << 3);
            iA00 = A00(i4 + (i4 >>> 12));
            int[] iArr3 = this.A08;
            iArr3[iA00] = iArr[0];
            iArr3[iA00 + 3] = 1;
        } else if (i == 2) {
            int i5 = iArr[0];
            int i6 = i5 + (i5 >>> 15);
            int i7 = ((i6 ^ (i6 >>> 9)) + (iArr[1] * 33)) ^ this.A0A;
            int i8 = i7 + (i7 >>> 16);
            int i9 = i8 ^ (i8 >>> 4);
            iA00 = A00(i9 + (i9 << 3));
            int[] iArr4 = this.A08;
            iArr4[iA00] = iArr[0];
            iArr4[iA00 + 1] = iArr[1];
            iArr4[iA00 + 3] = 2;
        } else if (i != 3) {
            int iA01 = A01(iArr, i);
            iA00 = A00(iA01);
            int[] iArrCopyOf = this.A08;
            iArrCopyOf[iA00] = iA01;
            int i10 = this.A02;
            int i11 = i10 + i;
            int length = iArrCopyOf.length;
            if (i11 > length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, length + BV5.A02(4096, this.A01, i11 - length));
                this.A08 = iArrCopyOf;
            }
            System.arraycopy(iArr, 0, iArrCopyOf, i10, i);
            this.A02 += i;
            int[] iArr5 = this.A08;
            iArr5[iA00 + 1] = i10;
            iArr5[iA00 + 3] = i;
        } else {
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = i12 ^ this.A0A;
            int i16 = (((i15 + (i15 >>> 9)) * 31) + i13) * 33;
            int i17 = (i16 + (i16 >>> 15)) ^ i14;
            int i18 = i17 + (i17 >>> 4);
            int i19 = i18 + (i18 >>> 15);
            iA00 = A00(i19 ^ (i19 << 9));
            int[] iArr6 = this.A08;
            iArr6[iA00] = iArr[0];
            iArr6[iA00 + 1] = iArr[1];
            iArr6[iA00 + 2] = iArr[2];
            iArr6[iA00 + 3] = 3;
        }
        this.A09[iA00 >> 2] = str;
        this.A00++;
        return str;
    }

    public final String toString() {
        int i = this.A03;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.A08[i3] != 0) {
                i2++;
            }
        }
        int i4 = this.A06;
        int i5 = 0;
        for (int i6 = i + 3; i6 < i4; i6 += 4) {
            if (this.A08[i6] != 0) {
                i5++;
            }
        }
        int i7 = i4 + 3;
        int i8 = this.A01;
        int i9 = i8 + i7;
        int i10 = 0;
        while (i7 < i9) {
            if (this.A08[i7] != 0) {
                i10++;
            }
            i7 += 4;
        }
        int i11 = (this.A04 - ((i8 << 3) - i8)) >> 2;
        int i12 = i8 << 3;
        int i13 = 0;
        for (int i14 = 3; i14 < i12; i14 += 4) {
            if (this.A08[i14] != 0) {
                i13++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C60Q.A0e(this), Integer.valueOf(this.A00), Integer.valueOf(i8), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i2 + i5 + i10 + i11), Integer.valueOf(i13));
    }

    public Gn5(int i) {
        this.A0B = null;
        this.A00 = 0;
        this.A07 = true;
        this.A0A = i;
        this.A0D = null;
        this.A0E = true;
        this.A0C = BV4.A16(new C10047GoR(new int[512], new String[128]));
    }

    public Gn5(C10047GoR c10047GoR, Gn5 gn5, int i, boolean z, boolean z2) {
        HlK hlK;
        this.A0B = gn5;
        this.A0A = i;
        if (z) {
            hlK = HlK.A00;
        } else {
            hlK = null;
        }
        this.A0D = hlK;
        this.A0E = z2;
        this.A0C = null;
        this.A00 = c10047GoR.A00;
        int i2 = c10047GoR.A02;
        this.A01 = i2;
        int i3 = i2 << 2;
        this.A03 = i3;
        this.A06 = i3 + (i3 >> 1);
        this.A05 = c10047GoR.A04;
        this.A08 = c10047GoR.A05;
        this.A09 = c10047GoR.A06;
        this.A04 = c10047GoR.A03;
        this.A02 = c10047GoR.A01;
        this.A07 = true;
    }
}
