package X;

import com.android.billingclient.u3;

/* loaded from: classes6.dex */
public final class GI5 {
    public int A00;
    public GIQ A01;
    public final int A02;
    public final byte[] A03;

    public static int A00(int i) {
        return A01(i << 3);
    }

    public static void A02(GI5 gi5, int i) throws u3 {
        gi5.A09((i << 3) | 2);
    }

    public static void A03(GI5 gi5, int i, int i2) throws u3 {
        gi5.A09((i << 3) | 5);
        gi5.A07(i2);
    }

    public static void A04(GI5 gi5, int i, long j) throws u3 {
        gi5.A09(i << 3);
        gi5.A0B(j);
    }

    public static void A05(GI5 gi5, int i, long j) throws u3 {
        gi5.A09((i << 3) | 1);
        gi5.A0A(j);
    }

    public final void A06(byte b) throws u3 {
        int i;
        int i2 = this.A00;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.A03[i2] = b;
            this.A00 = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new u3(e, i2, this.A02, 1);
        }
    }

    public final void A07(int i) throws u3 {
        int i2 = this.A00;
        try {
            byte[] bArr = this.A03;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.A00 = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new u3(e, i2, this.A02, 4);
        }
    }

    public final void A08(int i) throws u3 {
        int i2;
        if (i >= 0) {
            A09(i);
            return;
        }
        long j = i;
        int i3 = this.A00;
        try {
            byte[] bArr = this.A03;
            int i4 = i3 + 1;
            try {
                bArr[i3] = (byte) (((int) j) | 128);
                i2 = i3 + 2;
                try {
                    bArr[i4] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i3 + 3;
                    bArr[i2] = (byte) (((int) (j >>> 14)) | 128);
                    i2 = i3 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i3 + 5;
                    bArr[i2] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i3 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i3 + 7;
                        bArr[i7] = -1;
                        i7 = i3 + 8;
                        bArr[i8] = -1;
                        i4 = i3 + 9;
                        bArr[i7] = -1;
                        i3 += 10;
                        bArr[i4] = 1;
                        this.A00 = i3;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i4 = i7;
                        i2 = i4;
                        throw new u3(e, i2, this.A02, 10);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    throw new u3(e, i2, this.A02, 10);
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            i2 = i3;
        }
    }

    public final void A09(int i) throws u3 {
        int i2;
        int i3 = this.A00;
        int i4 = i & (-128);
        byte[] bArr = this.A03;
        int i5 = i3 + 1;
        byte b = (byte) i;
        try {
            if (i4 != 0) {
                bArr[i3] = (byte) (i | 128);
                int i6 = i >>> 7;
                try {
                    if ((i6 & (-128)) == 0) {
                        i3 += 2;
                    } else {
                        int i7 = i3 + 2;
                        try {
                            bArr[i5] = (byte) (i6 | 128);
                            int i8 = i >>> 14;
                            if ((i8 & (-128)) == 0) {
                                i3 += 3;
                                bArr[i7] = (byte) i8;
                                this.A00 = i3;
                                return;
                            }
                            i5 = i3 + 3;
                            bArr[i7] = (byte) (i8 | 128);
                            i6 = i >>> 21;
                            if ((i6 & (-128)) == 0) {
                                i3 += 4;
                            } else {
                                i2 = i3 + 4;
                                try {
                                    bArr[i5] = (byte) (i6 | 128);
                                    i5 = i3 + 5;
                                    bArr[i2] = (byte) (i >>> 28);
                                } catch (IndexOutOfBoundsException e) {
                                    e = e;
                                    throw new u3(e, i2, this.A02, 1);
                                }
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                            i5 = i7;
                            i2 = i5;
                            throw new u3(e, i2, this.A02, 1);
                        }
                    }
                    bArr[i5] = (byte) i6;
                    this.A00 = i3;
                    return;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i5 = i3;
                }
            } else {
                bArr[i3] = b;
            }
            this.A00 = i5;
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    public final void A0A(long j) throws u3 {
        int i = this.A00;
        try {
            AbstractC7611F5y.A0c(j, this.A03, i);
            this.A00 = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new u3(e, i, this.A02, 8);
        }
    }

    public final void A0B(long j) throws u3 {
        int i;
        int i2 = this.A00;
        long j2 = j & (-128);
        byte[] bArr = this.A03;
        try {
            if (j2 == 0) {
                bArr[i2] = (byte) j;
                i = i2 + 1;
            } else {
                bArr[i2] = (byte) (((int) j) | 128);
                long j3 = j >>> 7;
                if ((j3 & (-128)) == 0) {
                    bArr[i2 + 1] = (byte) j3;
                    i = i2 + 2;
                } else {
                    bArr[i2 + 1] = (byte) (((int) j3) | 128);
                    long j4 = j >>> 14;
                    if ((j4 & (-128)) == 0) {
                        bArr[i2 + 2] = (byte) j4;
                        i = i2 + 3;
                    } else {
                        bArr[i2 + 2] = (byte) (((int) j4) | 128);
                        long j5 = j >>> 21;
                        if ((j5 & (-128)) == 0) {
                            bArr[i2 + 3] = (byte) j5;
                            i = i2 + 4;
                        } else {
                            bArr[i2 + 3] = (byte) (((int) j5) | 128);
                            long j6 = j >>> 28;
                            if ((j6 & (-128)) == 0) {
                                bArr[i2 + 4] = (byte) j6;
                                i = i2 + 5;
                            } else {
                                bArr[i2 + 4] = (byte) (((int) j6) | 128);
                                long j7 = j >>> 35;
                                if ((j7 & (-128)) == 0) {
                                    bArr[i2 + 5] = (byte) j7;
                                    i = i2 + 6;
                                } else {
                                    bArr[i2 + 5] = (byte) (((int) j7) | 128);
                                    long j8 = j >>> 42;
                                    if ((j8 & (-128)) == 0) {
                                        bArr[i2 + 6] = (byte) j8;
                                        i = i2 + 7;
                                    } else {
                                        bArr[i2 + 6] = (byte) (((int) j8) | 128);
                                        long j9 = j >>> 49;
                                        if ((j9 & (-128)) == 0) {
                                            bArr[i2 + 7] = (byte) j9;
                                            i = i2 + 8;
                                        } else {
                                            bArr[i2 + 7] = (byte) (((int) j9) | 128);
                                            long j10 = j >>> 56;
                                            if (((-128) & j10) == 0) {
                                                bArr[i2 + 8] = (byte) j10;
                                                i = i2 + 9;
                                            } else {
                                                bArr[i2 + 8] = (byte) (((int) j10) | 128);
                                                bArr[i2 + 9] = (byte) (j >>> 63);
                                                i = i2 + 10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.A00 = i;
        } catch (IndexOutOfBoundsException e) {
            throw new u3(e, i2, this.A02, 1);
        }
    }

    public final void A0D(String str) throws u3 {
        int iA01;
        int i = this.A00;
        try {
            int length = str.length();
            int iA05 = AbstractC7609F5w.A05(length * 3);
            int iA052 = AbstractC7609F5w.A05(length);
            if (iA052 == iA05) {
                int i2 = i + iA052;
                this.A00 = i2;
                byte[] bArr = this.A03;
                iA01 = GEK.A00.A01(str, bArr, i2, bArr.length - i2);
                this.A00 = i;
                A09((iA01 - i) - iA052);
            } else {
                GEI gei = GEK.A00;
                A09(gei.A00(str));
                byte[] bArr2 = this.A03;
                int i3 = this.A00;
                iA01 = gei.A01(str, bArr2, i3, bArr2.length - i3);
            }
            this.A00 = iA01;
        } catch (IndexOutOfBoundsException e) {
            throw new u3("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
        }
    }

    public final void A0E(byte[] bArr, int i, int i2) throws u3 {
        try {
            System.arraycopy(bArr, i, this.A03, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new u3(e, this.A00, this.A02, i2);
        }
    }

    public GI5() {
    }

    public static int A01(int i) {
        return AbstractC7609F5w.A05(i);
    }

    public final void A0C(AbstractC9330GEn abstractC9330GEn, int i) throws u3 {
        byte[] bArr;
        int i2;
        int length;
        A02(this, i);
        A09(abstractC9330GEn.A01());
        if (abstractC9330GEn instanceof C9332GEp) {
            bArr = ((C9332GEp) abstractC9330GEn).d;
            i2 = 0;
            length = bArr.length;
        } else {
            C9331GEo c9331GEo = (C9331GEo) abstractC9330GEn;
            bArr = c9331GEo.d;
            i2 = c9331GEo.e;
            length = c9331GEo.f;
        }
        A0E(bArr, i2, length);
    }

    public GI5(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        throw C8j3.A0v("Array range is invalid. Buffer.length=", ", offset=0, length=", length, i);
    }
}
