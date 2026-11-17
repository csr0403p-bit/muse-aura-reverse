package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Gmz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9983Gmz extends AbstractC9979Gmv {
    public byte A00;
    public int A01;
    public byte[] A02;
    public char[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final OutputStream A07;
    public static final byte[] A0A = AbstractC10006Gne.A00(true);
    public static final byte[] A09 = AbstractC10006Gne.A00(false);
    public static final byte[] A0C = {110, 117, 108, 108};
    public static final byte[] A0B = {116, 114, 117, 101};
    public static final byte[] A08 = {102, 97, 108, 115, 101};

    public static final int A04(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i < i2) {
            bArr[i5] = bArr[i];
            i5++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i6 = iMin - i5;
            if (i6 == 0 || (i4 = inputStream.read(bArr, i5, i6)) < 0) {
                break;
            }
            i5 += i4;
        } while (i5 < 3);
        return i5;
    }

    public static void A07(C9983Gmz c9983Gmz, int i, int i2, int i3) {
        if (i3 + ((i - i2) * 6) > c9983Gmz.A05) {
            A05(c9983Gmz);
        }
    }

    public static final void A0L(C9983Gmz c9983Gmz, String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iA02;
        int i7 = i2 + i;
        int i8 = c9983Gmz.A01;
        byte[] bArr = c9983Gmz.A02;
        int[] iArr = ((AbstractC9979Gmv) c9983Gmz).A04;
        while (i < i7) {
            char cCharAt = str.charAt(i);
            if (cCharAt > '\u007f' || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i8] = (byte) cCharAt;
            i++;
            i8++;
        }
        c9983Gmz.A01 = i8;
        if (i < i7) {
            int i9 = ((AbstractC9979Gmv) c9983Gmz).A00;
            A07(c9983Gmz, i7, i, i8);
            int iA022 = c9983Gmz.A01;
            if (i9 == 0) {
                byte[] bArr2 = c9983Gmz.A02;
                int[] iArr2 = ((AbstractC9979Gmv) c9983Gmz).A04;
                while (i < i7) {
                    int i10 = i + 1;
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 <= '\u007f') {
                        i5 = iArr2[cCharAt2];
                        if (i5 == 0) {
                            iA02 = iA022 + 1;
                            bArr2[iA022] = (byte) cCharAt2;
                            iA022 = iA02;
                        } else if (i5 > 0) {
                            i6 = iA022 + 1;
                            bArr2[iA022] = 92;
                            iA022 += 2;
                            bArr2[i6] = (byte) i5;
                        } else {
                            iA022 = c9983Gmz.A01(cCharAt2, iA022);
                        }
                    } else if (cCharAt2 <= '\u07ff') {
                        i6 = iA022 + 1;
                        bArr2[iA022] = (byte) ((cCharAt2 >> 6) | 192);
                        iA022 += 2;
                        i5 = (cCharAt2 & '?') | 128;
                        bArr2[i6] = (byte) i5;
                    } else {
                        if ((cCharAt2 & '\ufc00') == 55296) {
                            if ((((AbstractC9932GlT) c9983Gmz).A00 & EnumC9998GnS.COMBINE_UNICODE_SURROGATES_IN_UTF8._mask) != 0 && i10 < i7) {
                                i += 2;
                                iA022 = c9983Gmz.A00(cCharAt2, str.charAt(i10), iA022);
                            }
                        }
                        iA02 = c9983Gmz.A02(cCharAt2, iA022);
                        iA022 = iA02;
                    }
                    i = i10;
                }
            } else {
                byte[] bArr3 = c9983Gmz.A02;
                int[] iArr3 = ((AbstractC9979Gmv) c9983Gmz).A04;
                int i11 = ((AbstractC9979Gmv) c9983Gmz).A00;
                while (i < i7) {
                    int i12 = i + 1;
                    char cCharAt3 = str.charAt(i);
                    if (cCharAt3 <= '\u007f') {
                        i4 = iArr3[cCharAt3];
                        if (i4 == 0) {
                            bArr3[iA022] = (byte) cCharAt3;
                            i = i12;
                            iA022++;
                        } else {
                            if (i4 > 0) {
                                i3 = iA022 + 1;
                                bArr3[iA022] = 92;
                                iA022 += 2;
                                bArr3[i3] = (byte) i4;
                            }
                            iA022 = c9983Gmz.A01(cCharAt3, iA022);
                        }
                    } else if (cCharAt3 > i11) {
                        iA022 = c9983Gmz.A01(cCharAt3, iA022);
                    } else if (cCharAt3 <= '\u07ff') {
                        i3 = iA022 + 1;
                        bArr3[iA022] = (byte) ((cCharAt3 >> 6) | 192);
                        iA022 += 2;
                        i4 = (cCharAt3 & '?') | 128;
                        bArr3[i3] = (byte) i4;
                    } else {
                        iA022 = c9983Gmz.A02(cCharAt3, iA022);
                    }
                    i = i12;
                }
            }
            c9983Gmz.A01 = iA022;
        }
    }

    public static final void A0N(C9983Gmz c9983Gmz, byte[] bArr) {
        int length = bArr.length;
        if (c9983Gmz.A01 + length > c9983Gmz.A05) {
            A05(c9983Gmz);
            if (length > 512) {
                c9983Gmz.A07.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, c9983Gmz.A02, c9983Gmz.A01, length);
        c9983Gmz.A01 += length;
    }

    public static final void A0O(C9983Gmz c9983Gmz, char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iA02;
        int i7 = i2 + i;
        int i8 = c9983Gmz.A01;
        byte[] bArr = c9983Gmz.A02;
        int[] iArr = ((AbstractC9979Gmv) c9983Gmz).A04;
        while (i < i7) {
            char c = cArr[i];
            if (c > '\u007f' || iArr[c] != 0) {
                break;
            }
            bArr[i8] = (byte) c;
            i++;
            i8++;
        }
        c9983Gmz.A01 = i8;
        if (i < i7) {
            int i9 = ((AbstractC9979Gmv) c9983Gmz).A00;
            A07(c9983Gmz, i7, i, i8);
            int iA022 = c9983Gmz.A01;
            if (i9 == 0) {
                byte[] bArr2 = c9983Gmz.A02;
                int[] iArr2 = ((AbstractC9979Gmv) c9983Gmz).A04;
                while (i < i7) {
                    int i10 = i + 1;
                    char c2 = cArr[i];
                    if (c2 <= '\u007f') {
                        i5 = iArr2[c2];
                        if (i5 == 0) {
                            iA02 = iA022 + 1;
                            bArr2[iA022] = (byte) c2;
                            iA022 = iA02;
                        } else if (i5 > 0) {
                            i6 = iA022 + 1;
                            bArr2[iA022] = 92;
                            iA022 += 2;
                            bArr2[i6] = (byte) i5;
                        } else {
                            iA022 = c9983Gmz.A01(c2, iA022);
                        }
                    } else if (c2 <= '\u07ff') {
                        i6 = iA022 + 1;
                        bArr2[iA022] = (byte) ((c2 >> 6) | 192);
                        iA022 += 2;
                        i5 = (c2 & '?') | 128;
                        bArr2[i6] = (byte) i5;
                    } else {
                        if ((c2 & '\ufc00') == 55296) {
                            if ((((AbstractC9932GlT) c9983Gmz).A00 & EnumC9998GnS.COMBINE_UNICODE_SURROGATES_IN_UTF8._mask) != 0 && i10 < i7) {
                                i += 2;
                                iA022 = c9983Gmz.A00(c2, cArr[i10], iA022);
                            }
                        }
                        iA02 = c9983Gmz.A02(c2, iA022);
                        iA022 = iA02;
                    }
                    i = i10;
                }
            } else {
                byte[] bArr3 = c9983Gmz.A02;
                int[] iArr3 = ((AbstractC9979Gmv) c9983Gmz).A04;
                int i11 = ((AbstractC9979Gmv) c9983Gmz).A00;
                while (i < i7) {
                    int i12 = i + 1;
                    char c3 = cArr[i];
                    if (c3 <= '\u007f') {
                        i4 = iArr3[c3];
                        if (i4 == 0) {
                            bArr3[iA022] = (byte) c3;
                            i = i12;
                            iA022++;
                        } else {
                            if (i4 > 0) {
                                i3 = iA022 + 1;
                                bArr3[iA022] = 92;
                                iA022 += 2;
                                bArr3[i3] = (byte) i4;
                            }
                            iA022 = c9983Gmz.A01(c3, iA022);
                        }
                    } else if (c3 > i11) {
                        iA022 = c9983Gmz.A01(c3, iA022);
                    } else if (c3 <= '\u07ff') {
                        i3 = iA022 + 1;
                        bArr3[iA022] = (byte) ((c3 >> 6) | 192);
                        iA022 += 2;
                        i4 = (c3 & '?') | 128;
                        bArr3[i3] = (byte) i4;
                    } else {
                        iA022 = c9983Gmz.A02(c3, iA022);
                    }
                    i = i12;
                }
            }
            c9983Gmz.A01 = iA022;
        }
    }

    private int A00(char c, char c2, int i) {
        int i2 = ((c & '\u03ff') << 10) + 65536 + (c2 & '\u03ff');
        byte[] bArr = this.A02;
        bArr[i] = (byte) (((i2 >> 18) & 7) + 240);
        bArr[i + 1] = (byte) (((i2 >> 12) & 63) + 128);
        bArr[i + 2] = (byte) (((i2 >> 6) & 63) + 128);
        int i3 = i + 4;
        bArr[i + 3] = (byte) ((i2 & 63) + 128);
        return i3;
    }

    private int A01(int i, int i2) {
        int i3;
        byte[] bArr = this.A02;
        byte[] bArr2 = ((AbstractC9979Gmv) this).A03 ? A0A : A09;
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            bArr[i4] = bArr2[(i5 & 255) >> 4];
            i3 = i2 + 4;
            bArr[i2 + 3] = bArr2[i5 & 15];
            i &= 255;
        } else {
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i2 + 3] = 48;
        }
        bArr[i3] = bArr2[i >> 4];
        int i6 = i3 + 2;
        bArr[i3 + 1] = bArr2[i & 15];
        return i6;
    }

    private final int A02(int i, int i2) {
        int i3;
        int i4;
        byte b;
        byte[] bArr = ((AbstractC9979Gmv) this).A03 ? A0A : A09;
        byte[] bArr2 = this.A02;
        if (i < 55296 || i > 57343) {
            bArr2[i2] = (byte) ((i >> 12) | 224);
            i3 = i2 + 2;
            AbstractC7608F5v.A1B(i >> 6, bArr2, i2 + 1);
            i4 = i2 + 3;
            b = (byte) ((i & 63) | 128);
        } else {
            bArr2[i2] = 92;
            bArr2[i2 + 1] = 117;
            bArr2[i2 + 2] = bArr[(i >> 12) & 15];
            bArr2[i2 + 3] = bArr[(i >> 8) & 15];
            i3 = i2 + 5;
            bArr2[i2 + 4] = bArr[(i >> 4) & 15];
            i4 = i2 + 6;
            b = bArr[i & 15];
        }
        bArr2[i3] = b;
        return i4;
    }

    public static final void A05(C9983Gmz c9983Gmz) {
        int i = c9983Gmz.A01;
        if (i > 0) {
            c9983Gmz.A01 = 0;
            c9983Gmz.A07.write(c9983Gmz.A02, 0, i);
        }
    }

    public static final void A06(C9983Gmz c9983Gmz) {
        if (c9983Gmz.A01 + 4 >= c9983Gmz.A05) {
            A05(c9983Gmz);
        }
        System.arraycopy(A0C, 0, c9983Gmz.A02, c9983Gmz.A01, 4);
        c9983Gmz.A01 += 4;
    }

    public static final void A0K(C9983Gmz c9983Gmz, String str) {
        int i = c9983Gmz.A01;
        int i2 = c9983Gmz.A05;
        if (i >= i2) {
            A05(c9983Gmz);
        }
        byte[] bArr = c9983Gmz.A02;
        int iA09 = AbstractC9919GlE.A09(c9983Gmz);
        byte b = c9983Gmz.A00;
        bArr[iA09] = b;
        c9983Gmz.A0q(str);
        if (c9983Gmz.A01 >= i2) {
            A05(c9983Gmz);
        }
        AbstractC9919GlE.A0E(c9983Gmz, b);
    }

    public static final void A0M(C9983Gmz c9983Gmz, String str, boolean z) {
        if (z) {
            AbstractC9919GlE.A0D(c9983Gmz);
            c9983Gmz.A02[AbstractC9919GlE.A09(c9983Gmz)] = c9983Gmz.A00;
        }
        int length = str.length();
        int i = 0;
        while (length > 0) {
            int iMin = Math.min(c9983Gmz.A06, length);
            if (c9983Gmz.A01 + iMin > c9983Gmz.A05) {
                A05(c9983Gmz);
            }
            A0L(c9983Gmz, str, i, iMin);
            i += iMin;
            length -= iMin;
        }
        if (z) {
            AbstractC9919GlE.A0D(c9983Gmz);
            c9983Gmz.A02[AbstractC9919GlE.A09(c9983Gmz)] = c9983Gmz.A00;
        }
    }

    public C9983Gmz(AbstractC9794GhC abstractC9794GhC, C9984Gn6 c9984Gn6, OutputStream outputStream, char c, int i) {
        super(abstractC9794GhC, c9984Gn6, i);
        this.A07 = outputStream;
        this.A00 = (byte) c;
        boolean zA0z = A0z(EnumC9999GnU.A01._mappedFeature);
        if (c != '\"' || zA0z) {
            ((AbstractC9979Gmv) this).A04 = AbstractC10006Gne.A02(c, zA0z);
        }
        C9984Gn6.A00(c9984Gn6.A03);
        HjR hjR = c9984Gn6.A0C;
        byte[] bArrA00 = HjR.A00(hjR, 1);
        c9984Gn6.A03 = bArrA00;
        this.A02 = bArrA00;
        int length = bArrA00.length;
        this.A05 = length;
        this.A06 = length >> 3;
        C9984Gn6.A00(c9984Gn6.A04);
        char[] cArrA03 = hjR.A03(1, 0);
        c9984Gn6.A04 = cArrA03;
        this.A03 = cArrA03;
        this.A04 = cArrA03.length;
        if (A0z(EnumC9999GnU.A02._mappedFeature)) {
            ((AbstractC9979Gmv) this).A00 = 127;
        }
    }

    public static final int A03(C9983Gmz c9983Gmz, char[] cArr, int i, int i2, int i3) {
        Object[] objArrA1Y;
        String str;
        if (i < 55296 || i > 57343) {
            byte[] bArr = c9983Gmz.A02;
            int i4 = c9983Gmz.A01;
            int i5 = i4 + 1;
            c9983Gmz.A01 = i5;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i4 + 2;
            c9983Gmz.A01 = i6;
            AbstractC7608F5v.A1B(i >> 6, bArr, i5);
            c9983Gmz.A01 = i4 + 3;
            AbstractC7608F5v.A1B(i, bArr, i6);
            return i2;
        }
        if (i2 >= i3 || cArr == null) {
            objArrA1Y = BV5.A1Y(i);
            str = "Split surrogate on writeRaw() input (last character): first character 0x%4x";
        } else {
            char c = cArr[i2];
            if (c >= '\udc00' && c <= '\udfff') {
                int i7 = ((i << 10) + c) - 56613888;
                if (c9983Gmz.A01 + 4 > c9983Gmz.A05) {
                    A05(c9983Gmz);
                }
                byte[] bArr2 = c9983Gmz.A02;
                int i8 = c9983Gmz.A01;
                int i9 = i8 + 1;
                c9983Gmz.A01 = i9;
                bArr2[i8] = (byte) ((i7 >> 18) | 240);
                int i10 = i8 + 2;
                c9983Gmz.A01 = i10;
                AbstractC7608F5v.A1B(i7 >> 12, bArr2, i9);
                int i11 = i8 + 3;
                c9983Gmz.A01 = i11;
                AbstractC7608F5v.A1B(i7 >> 6, bArr2, i10);
                c9983Gmz.A01 = i8 + 4;
                AbstractC7608F5v.A1B(i7, bArr2, i11);
                return i2 + 1;
            }
            objArrA1Y = BV5.A1Z(i, c);
            str = "Incomplete surrogate pair: first char 0x%04X, second 0x%04X";
        }
        throw new JsonGenerationException(c9983Gmz, String.format(str, objArrA1Y));
    }

    @Override // X.AbstractC9932GlT, X.AbstractC9919GlE, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        super.close();
        try {
            if (this.A02 != null && A0z(EnumC9998GnS.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    int i = ((AbstractC10020Gns) ((AbstractC9932GlT) this).A02).A02;
                    if (i != 1) {
                        if (i != 2) {
                            break;
                        } else {
                            A0Q();
                        }
                    } else {
                        A0P();
                    }
                }
            }
            A05(this);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.A01 = 0;
        OutputStream outputStream = this.A07;
        if (outputStream != null) {
            try {
                if (((AbstractC9932GlT) this).A05.A0D || A0z(EnumC9998GnS.AUTO_CLOSE_TARGET)) {
                    outputStream.close();
                } else if (A0z(EnumC9998GnS.FLUSH_PASSED_TO_STREAM)) {
                    outputStream.flush();
                }
            } catch (IOException | RuntimeException e2) {
                if (e != null) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e2, e);
                }
                throw e2;
            }
        }
        byte[] bArr = this.A02;
        if (bArr != null) {
            this.A02 = null;
            C9984Gn6 c9984Gn6 = ((AbstractC9932GlT) this).A05;
            byte[] bArr2 = c9984Gn6.A03;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw C60O.A0i("Trying to release buffer smaller than original");
            }
            c9984Gn6.A03 = null;
            c9984Gn6.A0C.A01(1, bArr);
        }
        char[] cArr = this.A03;
        if (cArr != null) {
            this.A03 = null;
            C9984Gn6 c9984Gn62 = ((AbstractC9932GlT) this).A05;
            char[] cArr2 = c9984Gn62.A04;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw C60O.A0i("Trying to release buffer smaller than original");
            }
            c9984Gn62.A04 = null;
            c9984Gn62.A0C.A02(cArr, 1);
        }
        if (e != null) {
            throw e;
        }
    }
}
