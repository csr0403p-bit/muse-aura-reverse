package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class BBJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Ab2<Aeh> A0C;
    public ArrayList<BCR> A0D;
    public HashMap A0E;
    public boolean A0F;
    public int[] A0G;
    public Object[] A0H;
    public C1119Aaj A0I;
    public Ab2<C0912AHo<Object>> A0J;
    public final AKU A0K;
    public final BBW A0L;
    public final AKU A0M;
    public final AKU A0N;

    public static final int A00(C1119Aaj c1119Aaj) {
        int iA01;
        int iA012 = c1119Aaj.A01(0);
        while (c1119Aaj.A00 != 0 && c1119Aaj.A01(0) == iA012) {
            int i = c1119Aaj.A00;
            if (i == 0) {
                throw new NoSuchElementException("IntList is empty.");
            }
            c1119Aaj.A04(0, c1119Aaj.A01[i - 1]);
            c1119Aaj.A03(c1119Aaj.A00 - 1);
            int i2 = c1119Aaj.A00;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iA013 = c1119Aaj.A01(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iA014 = c1119Aaj.A01(i6);
                if (i5 >= i2 || (iA01 = c1119Aaj.A01(i5)) <= iA014) {
                    if (iA014 > iA013) {
                        c1119Aaj.A04(i4, iA014);
                        c1119Aaj.A04(i6, iA013);
                        i4 = i6;
                    }
                } else if (iA01 > iA013) {
                    c1119Aaj.A04(i4, iA01);
                    c1119Aaj.A04(i5, iA013);
                    i4 = i5;
                }
            }
        }
        return iA012;
    }

    public static final boolean A0J(BBJ bbj, int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<BCR> arrayList = bbj.A0D;
            A0B(bbj, i);
            if (!arrayList.isEmpty()) {
                HashMap map = bbj.A0E;
                int i3 = i2 + i;
                int length = (bbj.A0G.length / 5) - bbj.A04;
                ArrayList<BCR> arrayList2 = bbj.A0D;
                int iA00 = BCA.A00(arrayList2, i3, length);
                if (iA00 < 0) {
                    iA00 = -(iA00 + 1);
                }
                if (iA00 >= arrayList2.size()) {
                    iA00--;
                }
                int i4 = iA00 + 1;
                int i5 = 0;
                while (iA00 >= 0) {
                    BCR bcr = bbj.A0D.get(iA00);
                    int iA0L = bbj.A0L(bcr);
                    if (iA0L < i) {
                        break;
                    }
                    if (iA0L < i3) {
                        bcr.A00 = Integer.MIN_VALUE;
                        if (map != null) {
                            map.remove(bcr);
                        }
                        if (i5 == 0) {
                            i5 = iA00 + 1;
                        }
                        i4 = iA00;
                    }
                    iA00--;
                }
                if (i4 < i5) {
                    z = true;
                    bbj.A0D.subList(i4, i5).clear();
                }
            }
            bbj.A05 = i;
            bbj.A04 += i2;
            int i6 = bbj.A0A;
            if (i6 > i) {
                bbj.A0A = Math.max(i, i6 - i2);
            }
            int i7 = bbj.A01;
            if (i7 >= i) {
                bbj.A01 = i7 - i2;
            }
            int i8 = bbj.A08;
            if (i8 >= 0 && (bbj.A0G[(A02(bbj, i8) * 5) + 1] & 67108864) != 0) {
                A0C(bbj, i8);
            }
        }
        return z;
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/BBW;IZ)Ljava/util/List<LX/BCR;>; */
    public final void A0Z(BBW bbw, int i) {
        if (this.A06 <= 0) {
            BBL.A01("Check failed");
            throw F60.createAndThrow();
        }
        if (i == 0 && this.A00 == 0 && this.A0L.A00 == 0) {
            int[] iArr = bbw.A08;
            int i2 = iArr[3];
            int i3 = bbw.A00;
            if (i2 == i3) {
                int[] iArr2 = this.A0G;
                Object[] objArr = this.A0H;
                ArrayList<BCR> arrayList = this.A0D;
                HashMap map = this.A0E;
                Ab2<Aeh> ab2 = this.A0C;
                Object[] objArr2 = bbw.A09;
                int i4 = bbw.A02;
                HashMap map2 = bbw.A06;
                Ab2<Aeh> ab22 = bbw.A04;
                this.A0G = iArr;
                this.A0H = objArr2;
                this.A0D = bbw.A05;
                this.A05 = i3;
                this.A04 = (iArr.length / 5) - i3;
                this.A0B = i4;
                this.A09 = objArr2.length - i4;
                this.A0A = i3;
                this.A0E = map2;
                this.A0C = ab22;
                bbw.A08 = iArr2;
                bbw.A00 = 0;
                bbw.A09 = objArr;
                bbw.A02 = 0;
                bbw.A05 = arrayList;
                bbw.A06 = map;
                bbw.A04 = ab2;
                return;
            }
        }
        BBJ bbjA02 = bbw.A02();
        try {
            A06(bbjA02, this, i, true, true, false);
            bbjA02.A0c(true);
        } catch (Throwable th) {
            bbjA02.A0c(false);
            throw th;
        }
    }

    public final void A0c(boolean z) {
        this.A0F = true;
        if (z && this.A0N.A00 == 0) {
            A0B(this, (this.A0G.length / 5) - this.A04);
            A0E(this, this.A0H.length - this.A09, this.A05);
            int i = this.A0B;
            AbstractC0903AHf.A04(this.A0H, i, this.A09 + i);
            A08(this);
        }
        BBW bbw = this.A0L;
        int[] iArr = this.A0G;
        int i2 = this.A05;
        Object[] objArr = this.A0H;
        int i3 = this.A0B;
        ArrayList<BCR> arrayList = this.A0D;
        HashMap map = this.A0E;
        Ab2<Aeh> ab2 = this.A0C;
        if (!bbw.A07) {
            throw C60O.A0i("Unexpected writer close()");
        }
        bbw.A07 = false;
        bbw.A08 = iArr;
        bbw.A00 = i2;
        bbw.A09 = objArr;
        bbw.A02 = i3;
        bbw.A05 = arrayList;
        bbw.A06 = map;
        bbw.A04 = ab2;
    }

    public static final int A01(BBJ bbj, int i) {
        return i + (bbj.A09 * (i < bbj.A0B ? 0 : 1));
    }

    public static final int A02(BBJ bbj, int i) {
        return i + (bbj.A04 * (i < bbj.A05 ? 0 : 1));
    }

    public static final int A03(BBJ bbj, int[] iArr, int i) {
        if (i >= bbj.A0G.length / 5) {
            return bbj.A0H.length - bbj.A09;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (bbj.A0H.length - bbj.A09) + i2 + 1 : i2;
    }

    public static final int A05(BBJ bbj, int[] iArr, int i) {
        if (i >= bbj.A0G.length / 5) {
            return bbj.A0H.length - bbj.A09;
        }
        int i2 = i * 5;
        int iBitCount = iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
        return iBitCount < 0 ? (bbj.A0H.length - bbj.A09) + iBitCount + 1 : iBitCount;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BBJ;ILX/BBJ;ZZZ)Ljava/util/List<LX/BCR;>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.AbstractCollection, java.util.ArrayList, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A06(X.BBJ r22, X.BBJ r23, int r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBJ.A06(X.BBJ, X.BBJ, int, boolean, boolean, boolean):java.util.List");
    }

    public static final void A07(C1119Aaj c1119Aaj, int i) {
        if (c1119Aaj.A00 == 0 || !(c1119Aaj.A01(0) == i || c1119Aaj.A01(c1119Aaj.A00 - 1) == i)) {
            int i2 = c1119Aaj.A00;
            c1119Aaj.A02(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA01 = c1119Aaj.A01(i3);
                if (i <= iA01) {
                    break;
                }
                c1119Aaj.A04(i2, iA01);
                i2 = i3;
            }
            c1119Aaj.A04(i2, i);
        }
    }

    public static final void A08(BBJ bbj) {
        int i;
        C1119Aaj c1119Aaj = bbj.A0I;
        if (c1119Aaj != null) {
            while (c1119Aaj.A00 != 0) {
                int iA00 = A00(c1119Aaj);
                int iA02 = A02(bbj, iA00);
                int i2 = iA00 + 1;
                int[] iArr = bbj.A0G;
                int i3 = iA00 + iArr[(iA02 * 5) + 3];
                while (true) {
                    if (i2 >= i3) {
                        i = 0;
                        break;
                    }
                    i = 1;
                    if ((iArr[(A02(bbj, i2) * 5) + 1] & 201326592) != 0) {
                        break;
                    } else {
                        i2 += iArr[(A02(bbj, i2) * 5) + 3];
                    }
                }
                int i4 = (iA02 * 5) + 1;
                int i5 = iArr[i4];
                if (((67108864 & i5) == 0 ? 0 : 1) != i) {
                    iArr[i4] = (i << 26) | (i5 & (-67108865));
                    int iA04 = A04(bbj, iArr, iA00);
                    if (iA04 >= 0) {
                        A07(c1119Aaj, iA04);
                    }
                }
            }
        }
    }

    public static final void A09(BBJ bbj, int i) {
        if (i > 0) {
            int i2 = bbj.A00;
            A0B(bbj, i2);
            int i3 = bbj.A05;
            int i4 = bbj.A04;
            int[] iArr = bbj.A0G;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                System.arraycopy(iArr, 0, iArr2, 0, i3 * 5);
                int i7 = (i4 + i3) * 5;
                System.arraycopy(iArr, i7, iArr2, (i3 + i6) * 5, (length * 5) - i7);
                bbj.A0G = iArr2;
                iArr = iArr2;
                i4 = i6;
            }
            int i8 = bbj.A01;
            if (i8 >= i3) {
                bbj.A01 = i8 + i;
            }
            int i9 = i3 + i;
            bbj.A05 = i9;
            bbj.A04 = i4 - i;
            int iA03 = i5 > 0 ? A03(bbj, iArr, A02(bbj, i2 + i)) : 0;
            int i10 = bbj.A0A;
            int i11 = i10 >= i3 ? bbj.A0B : 0;
            int i12 = bbj.A09;
            int length2 = bbj.A0H.length;
            if (iA03 > i11) {
                iA03 = -(((length2 - i12) - iA03) + 1);
            }
            for (int i13 = i3; i13 < i9; i13++) {
                iArr[(i13 * 5) + 4] = iA03;
            }
            if (i10 >= i3) {
                bbj.A0A = i10 + i;
            }
        }
    }

    public static final void A0B(BBJ bbj, int i) {
        BCR bcr;
        int i2;
        BCR bcr2;
        int i3;
        int i4;
        int i5 = bbj.A04;
        int i6 = bbj.A05;
        if (i6 != i) {
            if (!bbj.A0D.isEmpty()) {
                int length = (bbj.A0G.length / 5) - bbj.A04;
                ArrayList<BCR> arrayList = bbj.A0D;
                if (i6 < i) {
                    int iA00 = BCA.A00(arrayList, i6, length);
                    if (iA00 < 0) {
                        iA00 = -(iA00 + 1);
                    }
                    while (iA00 < arrayList.size() && (i3 = (bcr2 = arrayList.get(iA00)).A00) < 0 && (i4 = i3 + length) < i) {
                        bcr2.A00 = i4;
                        iA00++;
                    }
                } else {
                    int iA002 = BCA.A00(arrayList, i, length);
                    if (iA002 < 0) {
                        iA002 = -(iA002 + 1);
                    }
                    while (iA002 < arrayList.size() && (i2 = (bcr = arrayList.get(iA002)).A00) >= 0) {
                        bcr.A00 = -(length - i2);
                        iA002++;
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = bbj.A0G;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC0903AHf.A03(iArr, iArr, i8 + i7, i7, i9);
                } else {
                    AbstractC0903AHf.A03(iArr, iArr, i9, i9 + i8, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int[] iArr2 = bbj.A0G;
            int length2 = iArr2.length / 5;
            if (i6 >= length2) {
                BBL.A01("Check failed");
                throw F60.createAndThrow();
            }
            while (i6 < length2) {
                int i10 = (i6 * 5) + 2;
                int i11 = iArr2[i10];
                int i12 = i11 > -2 ? i11 : ((length2 - bbj.A04) + i11) - (-2);
                if (i12 >= i) {
                    i12 = -(((length2 - bbj.A04) - i12) + 2);
                }
                if (i12 != i11) {
                    iArr2[i10] = i12;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        bbj.A05 = i;
    }

    public static final void A0C(BBJ bbj, int i) {
        if (i >= 0) {
            C1119Aaj c1119Aaj = bbj.A0I;
            if (c1119Aaj == null) {
                c1119Aaj = new C1119Aaj(16);
                bbj.A0I = c1119Aaj;
            }
            A07(c1119Aaj, i);
        }
    }

    public static final void A0D(BBJ bbj, int i, int i2) {
        if (i > 0) {
            A0E(bbj, bbj.A02, i2);
            int i3 = bbj.A0B;
            int i4 = bbj.A09;
            if (i4 < i) {
                Object[] objArr = bbj.A0H;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                bbj.A0H = objArr2;
                i4 = i7;
            }
            int i9 = bbj.A03;
            if (i9 >= i3) {
                bbj.A03 = i9 + i;
            }
            bbj.A0B = i3 + i;
            bbj.A09 = i4 - i;
        }
    }

    public static final void A0E(BBJ bbj, int i, int i2) {
        String str;
        int i3 = bbj.A09;
        int i4 = bbj.A0B;
        int i5 = bbj.A0A;
        if (i4 != i) {
            Object[] objArr = bbj.A0H;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int[] iArr = bbj.A0G;
        int length = iArr.length / 5;
        int i7 = bbj.A04;
        int iMin = Math.min(i2 + 1, length - i7);
        if (i5 != iMin) {
            int length2 = bbj.A0H.length - i3;
            if (iMin < i5) {
                int iA02 = A02(bbj, iMin);
                int iA022 = A02(bbj, i5);
                int i8 = bbj.A05;
                while (iA02 < iA022) {
                    int i9 = (iA02 * 5) + 4;
                    int i10 = iArr[i9];
                    if (i10 < 0) {
                        str = "Unexpected anchor value, expected a positive anchor";
                        BBL.A01(str);
                        throw F60.createAndThrow();
                    }
                    iArr[i9] = -((length2 - i10) + 1);
                    iA02++;
                    if (iA02 == i8) {
                        iA02 += i7;
                    }
                }
                bbj.A0A = iMin;
            } else {
                int iA023 = A02(bbj, i5);
                int iA024 = A02(bbj, iMin);
                while (iA023 < iA024) {
                    int i11 = (iA023 * 5) + 4;
                    int i12 = iArr[i11];
                    if (i12 >= 0) {
                        str = "Unexpected anchor value, expected a negative anchor";
                        BBL.A01(str);
                        throw F60.createAndThrow();
                    }
                    iArr[i11] = i12 + length2 + 1;
                    iA023++;
                    if (iA023 == bbj.A05) {
                        iA023 += i7;
                    }
                }
                bbj.A0A = iMin;
            }
        }
        bbj.A0B = i;
    }

    public static final void A0F(BBJ bbj, int i, int i2, int i3) {
        if (i >= bbj.A05) {
            i = -((((bbj.A0G.length / 5) - bbj.A04) - i) + 2);
        }
        while (i3 < i2) {
            int[] iArr = bbj.A0G;
            int iA02 = A02(bbj, i3) * 5;
            iArr[iA02 + 2] = i;
            int i4 = iArr[iA02 + 3] + i3;
            A0F(bbj, i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public static final void A0G(BBJ bbj, int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = bbj.A09;
            int i5 = i + i2;
            A0E(bbj, i5, i3);
            bbj.A0B = i;
            bbj.A09 = i4 + i2;
            AbstractC0903AHf.A04(bbj.A0H, i, i5);
            int i6 = bbj.A03;
            if (i6 >= i) {
                bbj.A03 = i6 - i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(X.BBJ r12, java.lang.Object r13, java.lang.Object r14, int r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBJ.A0I(X.BBJ, java.lang.Object, java.lang.Object, int, boolean):void");
    }

    public final int A0K() {
        int i = this.A00;
        int iA02 = A02(this, i);
        int[] iArr = this.A0G;
        int i2 = iA02 * 5;
        int i3 = i + iArr[i2 + 3];
        this.A00 = i3;
        this.A02 = A03(this, iArr, A02(this, i3));
        int i4 = iArr[i2 + 1];
        if ((1073741824 & i4) == 0) {
            return i4 & 67108863;
        }
        return 1;
    }

    public final int A0L(BCR bcr) {
        int i = bcr.A00;
        return i < 0 ? ((this.A0G.length / 5) - this.A04) + i : i;
    }

    public final BCR A0M(int i) {
        ArrayList<BCR> arrayList = this.A0D;
        int length = (this.A0G.length / 5) - this.A04;
        int iA00 = BCA.A00(arrayList, i, length);
        if (iA00 >= 0) {
            return arrayList.get(iA00);
        }
        if (i > this.A05) {
            i = -(length - i);
        }
        BCR bcr = new BCR();
        bcr.A00 = i;
        arrayList.add(-(iA00 + 1), bcr);
        return bcr;
    }

    public final void A0Q() {
        int i = this.A06;
        this.A06 = i + 1;
        if (i == 0) {
            this.A0K.A00(((this.A0G.length / 5) - this.A04) - this.A01);
        }
    }

    public final void A0R() {
        String str;
        int i;
        C0912AHo<Object> c0912AHoA04;
        boolean z = this.A06 > 0;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A08;
        int iA02 = A02(this, i4);
        int i5 = this.A07;
        int i6 = i2 - i4;
        int[] iArr = this.A0G;
        int i7 = iA02 * 5;
        int i8 = i7 + 1;
        int i9 = iArr[i8];
        boolean z2 = (i9 & 1073741824) != 0;
        if (z) {
            Ab2<C0912AHo<Object>> ab2 = this.A0J;
            if (ab2 != null && (c0912AHoA04 = ab2.A04(i4)) != null) {
                Object[] objArr = c0912AHoA04.A01;
                int i10 = ((AbstractC0913AHp) c0912AHoA04).A00;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object obj = objArr[i11];
                    if (this.A06 > 0) {
                        A0D(this, 1, this.A08);
                    }
                    int i12 = this.A02 + 1;
                    this.A02 = i12;
                    if (i12 <= this.A03) {
                        this.A0H[A01(this, i12 - 1)] = obj;
                    } else {
                        str = "Writing to an invalid slot";
                    }
                }
                ab2.A07(i4);
            }
            int[] iArr2 = this.A0G;
            iArr2[i7 + 3] = i6;
            iArr2[i8] = i5 | (iArr2[i8] & (-67108864));
            AKU aku = this.A0M;
            int[] iArr3 = aku.A01;
            int i13 = aku.A00 - 1;
            aku.A00 = i13;
            int i14 = iArr3[i13];
            if (z2) {
                i5 = 1;
            }
            this.A07 = i14 + i5;
            int iA04 = A04(this, iArr2, i4);
            this.A08 = iA04;
            int length = iA04 < 0 ? (iArr2.length / 5) - this.A04 : A02(this, iA04 + 1);
            int iA03 = length >= 0 ? A03(this, iArr2, length) : 0;
            this.A02 = iA03;
            this.A03 = iA03;
            return;
        }
        if (i2 == i3) {
            int i15 = i7 + 3;
            int i16 = iArr[i15];
            int i17 = i9 & 67108863;
            iArr[i15] = i6;
            iArr[i8] = i5 | (iArr[i8] & (-67108864));
            AKU aku2 = this.A0N;
            int[] iArr4 = aku2.A01;
            int i18 = aku2.A00 - 1;
            aku2.A00 = i18;
            int i19 = iArr4[i18];
            int length2 = (iArr.length / 5) - this.A04;
            AKU aku3 = this.A0K;
            int[] iArr5 = aku3.A01;
            int i20 = aku3.A00 - 1;
            aku3.A00 = i20;
            this.A01 = length2 - iArr5[i20];
            this.A08 = i19;
            int iA042 = A04(this, iArr, i4);
            AKU aku4 = this.A0M;
            int[] iArr6 = aku4.A01;
            int i21 = aku4.A00 - 1;
            aku4.A00 = i21;
            int i22 = iArr6[i21];
            this.A07 = i22;
            if (iA042 == i19) {
                i = i22 + (z2 ? 0 : i5 - i17);
            } else {
                int i23 = i6 - i16;
                int i24 = i5 - i17;
                if (z2) {
                    i24 = 0;
                }
                if (i23 != 0 || i24 != 0) {
                    while (iA042 != 0 && iA042 != i19 && (i24 != 0 || i23 != 0)) {
                        int iA022 = A02(this, iA042);
                        if (i23 != 0) {
                            int i25 = (iA022 * 5) + 3;
                            iArr[i25] = iArr[i25] + i23;
                        }
                        if (i24 != 0) {
                            int i26 = (iA022 * 5) + 1;
                            int i27 = iArr[i26];
                            iArr[i26] = ((i27 & 67108863) + i24) | (i27 & (-67108864));
                        }
                        if ((iArr[(iA022 * 5) + 1] & 1073741824) != 0) {
                            i24 = 0;
                        }
                        iA042 = A04(this, iArr, iA042);
                    }
                }
                i = i22 + i24;
            }
            this.A07 = i;
            return;
        }
        str = "Expected to be at the end of a group";
        BBL.A01(str);
        throw F60.createAndThrow();
    }

    public final void A0S() {
        int i = this.A06;
        if (i > 0) {
            int i2 = i - 1;
            this.A06 = i2;
            if (i2 != 0) {
                return;
            }
            if (this.A0M.A00 == this.A0N.A00) {
                int length = (this.A0G.length / 5) - this.A04;
                AKU aku = this.A0K;
                int[] iArr = aku.A01;
                int i3 = aku.A00 - 1;
                aku.A00 = i3;
                this.A01 = length - iArr[i3];
                return;
            }
            BBL.A01("startGroup/endGroup mismatch while inserting");
        } else {
            AK7.A00("Unbalanced begin/end insert");
        }
        throw F60.createAndThrow();
    }

    public final void A0T() {
        int i = this.A01;
        this.A00 = i;
        this.A02 = A03(this, this.A0G, A02(this, i));
    }

    public final void A0U() {
        if (this.A06 != 0) {
            BBL.A01("Key must be supplied when inserting");
            throw F60.createAndThrow();
        }
        Object obj = C78N.A00;
        A0I(this, obj, obj, 0, false);
    }

    public final void A0V(int i) {
        String string;
        if (i < 0) {
            string = "Cannot seek backwards";
        } else {
            if (this.A06 > 0) {
                AK7.A00("Cannot call seek() while inserting");
                throw F60.createAndThrow();
            }
            if (i == 0) {
                return;
            }
            int i2 = this.A00 + i;
            int i3 = this.A08;
            if (i2 >= i3 && i2 <= this.A01) {
                this.A00 = i2;
                int iA03 = A03(this, this.A0G, A02(this, i2));
                this.A02 = iA03;
                this.A03 = iA03;
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot seek outside the current group (");
            sb.append(i3);
            sb.append('-');
            sb.append(this.A01);
            sb.append(')');
            string = sb.toString();
        }
        BBL.A01(string);
        throw F60.createAndThrow();
    }

    public final void A0W(int i) {
        String strA0T;
        if (this.A06 <= 0) {
            int i2 = this.A08;
            if (i2 == i) {
                return;
            }
            if (i >= i2 && i < this.A01) {
                int i3 = this.A00;
                int i4 = this.A02;
                int i5 = this.A03;
                this.A00 = i;
                A0U();
                this.A00 = i3;
                this.A02 = i4;
                this.A03 = i5;
                return;
            }
            strA0T = FGI.A0T("Started group at ", " must be a subgroup of the group at ", i, i2);
        } else {
            strA0T = "Cannot call ensureStarted() while inserting";
        }
        BBL.A01(strA0T);
        throw F60.createAndThrow();
    }

    public final void A0X(int i) {
        int length;
        ArrayList<BCR> arrayList;
        int iA00;
        BCR bcr;
        HashMap map = this.A0E;
        if (map == null || i < 0 || i >= (length = (this.A0G.length / 5) - this.A04) || (iA00 = BCA.A00((arrayList = this.A0D), i, length)) < 0 || (bcr = arrayList.get(iA00)) == null) {
            return;
        }
        map.get(bcr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("Index must be between 0 and size");
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y(int r17, X.G0V<? super java.lang.Integer, java.lang.Object, kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBJ.A0Y(int, X.G0V):void");
    }

    public final void A0a(Object obj) {
        if (this.A06 > 0) {
            if (this.A02 != this.A0B) {
                Ab2<C0912AHo<Object>> ab2 = this.A0J;
                if (ab2 == null) {
                    ab2 = new Ab2<>(6);
                }
                this.A0J = ab2;
                int i = this.A08;
                C0912AHo<Object> c0912AHoA04 = ab2.A04(i);
                if (c0912AHoA04 == null) {
                    c0912AHoA04 = new C0912AHo<>(16);
                    ab2.A0B(i, c0912AHoA04);
                }
                c0912AHoA04.A09(obj);
                return;
            }
            A0D(this, 1, this.A08);
        }
        int i2 = this.A02 + 1;
        this.A02 = i2;
        if (i2 <= this.A03) {
            this.A0H[A01(this, i2 - 1)] = obj;
        } else {
            BBL.A01("Writing to an invalid slot");
            throw F60.createAndThrow();
        }
    }

    public final void A0b(Object obj) {
        int iA02 = A02(this, this.A00);
        int[] iArr = this.A0G;
        int i = iArr[(iA02 * 5) + 1];
        if ((268435456 & i) != 0) {
            this.A0H[A01(this, A03(this, iArr, iA02) + Integer.bitCount(i >> 29))] = obj;
        } else {
            BBL.A01("Updating the data of a group that was not created with a data slot");
            throw F60.createAndThrow();
        }
    }

    public final boolean A0d() {
        if (this.A06 != 0) {
            BBL.A01("Cannot remove group while inserting");
            throw F60.createAndThrow();
        }
        int i = this.A00;
        int i2 = this.A02;
        int iA03 = A03(this, this.A0G, A02(this, i));
        int iA0K = A0K();
        A0X(this.A08);
        C1119Aaj c1119Aaj = this.A0I;
        if (c1119Aaj != null) {
            while (c1119Aaj.A00 != 0) {
                if (c1119Aaj.A00 != 0) {
                    if (c1119Aaj.A01[0] < i) {
                        break;
                    }
                    A00(c1119Aaj);
                } else {
                    throw new NoSuchElementException("IntList is empty.");
                }
            }
        }
        boolean zA0J = A0J(this, i, this.A00 - i);
        A0G(this, iA03, this.A02 - iA03, i - 1);
        this.A00 = i;
        this.A02 = i2;
        this.A07 -= iA0K;
        return zA0J;
    }

    public final boolean A0e(int i) {
        return (this.A0G[(A02(this, i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean A0f(int i, int i2) {
        int length;
        if (i2 == this.A08) {
            length = this.A01;
        } else {
            AKU aku = this.A0N;
            int i3 = aku.A00;
            int i4 = i3 - 1;
            if (i2 <= (i4 >= 0 ? aku.A01[i4] : 0)) {
                int[] iArr = aku.A01;
                int iMin = Math.min(iArr.length, i3);
                int i5 = 0;
                while (true) {
                    if (i5 >= iMin) {
                        break;
                    }
                    if (iArr[i5] != i2) {
                        i5++;
                    } else if (i5 >= 0) {
                        length = ((this.A0G.length / 5) - this.A04) - this.A0K.A01[i5];
                    }
                }
                length = this.A0G[(A02(this, i2) * 5) + 3] + i2;
            } else {
                length = this.A0G[(A02(this, i2) * 5) + 3] + i2;
            }
        }
        return i > i2 && i < length;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SlotWriter(current = ");
        sbA0x.append(this.A00);
        sbA0x.append(" end=");
        sbA0x.append(this.A01);
        sbA0x.append(" size = ");
        int length = this.A0G.length / 5;
        int i = this.A04;
        sbA0x.append(length - i);
        sbA0x.append(" gap=");
        int i2 = this.A05;
        sbA0x.append(i2);
        sbA0x.append('-');
        return C8j5.A0X(sbA0x, i2 + i);
    }

    public BBJ(BBW bbw) {
        this.A0L = bbw;
        int[] iArr = bbw.A08;
        this.A0G = iArr;
        Object[] objArr = bbw.A09;
        this.A0H = objArr;
        this.A0D = bbw.A05;
        this.A0E = bbw.A06;
        this.A0C = bbw.A04;
        int i = bbw.A00;
        this.A05 = i;
        this.A04 = (iArr.length / 5) - i;
        int i2 = bbw.A02;
        this.A0B = i2;
        this.A09 = objArr.length - i2;
        this.A0A = i;
        this.A0N = new AKU();
        this.A0K = new AKU();
        this.A0M = new AKU();
        this.A01 = i;
        this.A08 = -1;
    }

    public static final int A04(BBJ bbj, int[] iArr, int i) {
        int i2 = iArr[(A02(bbj, i) * 5) + 2];
        return i2 <= -2 ? (((bbj.A0G.length / 5) - bbj.A04) + i2) - (-2) : i2;
    }

    public static final void A0A(BBJ bbj, int i) {
        int iA02 = A02(bbj, i);
        int[] iArr = bbj.A0G;
        int i2 = (iA02 * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = 134217728 | (i3 & (-134217729));
            iArr[i2] = i4;
            if ((i4 & 67108864) == 0) {
                A0C(bbj, A04(bbj, iArr, i));
            }
        }
    }

    public static final void A0H(BBJ bbj, Object obj, int i) {
        int iA02 = A02(bbj, i);
        int[] iArr = bbj.A0G;
        if (iA02 >= iArr.length || (iArr[(iA02 * 5) + 1] & 1073741824) == 0) {
            BBL.A01(FGI.A0I("Updating the node of a group at ", i, " that was not created with as a node group"));
            throw F60.createAndThrow();
        }
        bbj.A0H[A01(bbj, A03(bbj, iArr, iA02))] = obj;
    }

    public final Object A0N(int i) {
        int iA02 = A02(this, i);
        int[] iArr = this.A0G;
        int i2 = iA02 * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.A0H[iArr[i2 + 4] + Integer.bitCount(i3 >> 30)];
        }
        return null;
    }

    public final Object A0O(int i) {
        int iA02 = A02(this, i);
        int[] iArr = this.A0G;
        if ((iArr[(iA02 * 5) + 1] & 1073741824) != 0) {
            return this.A0H[A01(this, A03(this, iArr, iA02))];
        }
        return null;
    }

    public final Object A0P(Object obj, int i, int i2) {
        int iA02 = A02(this, i);
        int[] iArr = this.A0G;
        int iA05 = A05(this, iArr, iA02);
        int iA03 = A03(this, iArr, A02(this, i + 1));
        int i3 = iA05 + i2;
        if (i3 < iA05 || i3 >= iA03) {
            BBL.A01(FGI.A0T("Write to an invalid slot index ", " for group ", i2, i));
            throw F60.createAndThrow();
        }
        int iA01 = A01(this, i3);
        Object[] objArr = this.A0H;
        Object obj2 = objArr[iA01];
        objArr[iA01] = obj;
        return obj2;
    }
}
