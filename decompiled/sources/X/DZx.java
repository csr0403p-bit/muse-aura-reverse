package X;

import com.facebook.acra.util.UrlEncodingWriter;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class DZx {
    public int A00;
    public int A01;
    public int A02;
    public DZo A03;
    public ByteBuffer A04;

    public static int A01(DZx dZx, int i) {
        int i2 = i + dZx.A00;
        return i2 + dZx.A04.getInt(i2);
    }

    public static void A05(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (b2 > -65 || (((b << 28) + (b2 + 112)) >> 30) != 0 || b3 > -65 || b4 > -65) {
            throw C60O.A0i("Invalid UTF-8");
        }
        int i2 = ((b & 7) << 18) | ((b2 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE) << 12) | ((b3 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE) << 6) | (b4 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void A06(char[] cArr, byte b, byte b2, byte b3, int i) {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw C60O.A0i("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE) << 6) | (b3 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE));
    }

    public final int A07(int i) {
        if (i < this.A01) {
            return this.A04.getShort(this.A02 + i);
        }
        return 0;
    }

    public final void A0A(int i, ByteBuffer byteBuffer) {
        short s;
        this.A04 = byteBuffer;
        if (byteBuffer != null) {
            this.A00 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.A02 = i2;
            s = this.A04.getShort(i2);
        } else {
            s = 0;
            this.A00 = 0;
            this.A02 = 0;
        }
        this.A01 = s;
    }

    public DZx() {
        DZo dZo = DZo.A00;
        if (dZo == null) {
            dZo = new DZo();
            DZo.A00 = dZo;
        }
        this.A03 = dZo;
    }

    public static int A00(DZx dZx, int i) {
        int iA07 = dZx.A07(i);
        if (iA07 != 0) {
            return dZx.A09(iA07);
        }
        return 0;
    }

    public static int A02(DZx dZx, int i) {
        int iA07 = dZx.A07(i);
        if (iA07 != 0) {
            return dZx.A04.getInt(iA07 + dZx.A00);
        }
        return 0;
    }

    public static String A03(ByteBuffer byteBuffer, int i) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        if (!byteBuffer.hasArray()) {
            if ((i4 | i3 | ((byteBuffer.limit() - i4) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i3)));
            }
            int i5 = i4 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i4 < i5) {
                byte b = byteBuffer.get(i4);
                if (b < 0) {
                    break;
                }
                i4++;
                cArr[i6] = (char) b;
                i6++;
            }
            while (true) {
                int i7 = i6;
                while (i4 < i5) {
                    int i8 = i4 + 1;
                    byte b2 = byteBuffer.get(i4);
                    if (b2 >= 0) {
                        int i9 = i7 + 1;
                        cArr[i7] = (char) b2;
                        while (i8 < i5) {
                            byte b3 = byteBuffer.get(i8);
                            if (b3 < 0) {
                                break;
                            }
                            i8++;
                            cArr[i9] = (char) b3;
                            i9++;
                        }
                        i7 = i9;
                        i4 = i8;
                    } else if (C8j3.A1T(b2, -32)) {
                        if (i8 >= i5) {
                            throw C60O.A0i("Invalid UTF-8");
                        }
                        i4 += 2;
                        byte b4 = byteBuffer.get(i8);
                        i6 = i7 + 1;
                        if (b2 < -62) {
                            throw C60O.A0i("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                        }
                        if (b4 > -65) {
                            throw C60O.A0i("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                        }
                        cArr[i7] = (char) (((b2 & 31) << 6) | (b4 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE));
                    } else if (b2 < -16) {
                        if (i8 >= i5 - 1) {
                            throw C60O.A0i("Invalid UTF-8");
                        }
                        int i10 = i4 + 2;
                        i4 += 3;
                        i6 = i7 + 1;
                        A06(cArr, b2, byteBuffer.get(i8), byteBuffer.get(i10), i7);
                    } else {
                        if (i8 >= i5 - 2) {
                            throw C60O.A0i("Invalid UTF-8");
                        }
                        byte b5 = byteBuffer.get(i8);
                        int i11 = i4 + 3;
                        byte b6 = byteBuffer.get(i4 + 2);
                        i4 += 4;
                        A05(cArr, b2, b5, b6, byteBuffer.get(i11), i7);
                        i7 += 2;
                    }
                }
                return new String(cArr, 0, i7);
            }
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + i4;
        int length = bArrArray.length;
        if ((iArrayOffset | i3 | ((length - iArrayOffset) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format(AbstractC7606F5t.A00(37), Integer.valueOf(length), Integer.valueOf(iArrayOffset), Integer.valueOf(i3)));
        }
        int i12 = iArrayOffset + i3;
        char[] cArr2 = new char[i3];
        int i13 = 0;
        while (iArrayOffset < i12) {
            byte b7 = bArrArray[iArrayOffset];
            if (b7 < 0) {
                break;
            }
            iArrayOffset++;
            cArr2[i13] = (char) b7;
            i13++;
        }
        while (true) {
            int i14 = i13;
            while (iArrayOffset < i12) {
                int i15 = iArrayOffset + 1;
                byte b8 = bArrArray[iArrayOffset];
                if (b8 >= 0) {
                    int i16 = i14 + 1;
                    cArr2[i14] = (char) b8;
                    while (i15 < i12) {
                        byte b9 = bArrArray[i15];
                        if (b9 < 0) {
                            break;
                        }
                        i15++;
                        cArr2[i16] = (char) b9;
                        i16++;
                    }
                    i14 = i16;
                    iArrayOffset = i15;
                } else if (C8j3.A1T(b8, -32)) {
                    if (i15 >= i12) {
                        throw C60O.A0i("Invalid UTF-8");
                    }
                    iArrayOffset += 2;
                    byte b10 = bArrArray[i15];
                    i13 = i14 + 1;
                    if (b8 < -62) {
                        throw C60O.A0i("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                    }
                    if (b10 > -65) {
                        throw C60O.A0i("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                    }
                    cArr2[i14] = (char) (((b8 & 31) << 6) | (b10 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE));
                } else if (b8 < -16) {
                    if (i15 >= i12 - 1) {
                        throw C60O.A0i("Invalid UTF-8");
                    }
                    int i17 = iArrayOffset + 2;
                    iArrayOffset += 3;
                    i13 = i14 + 1;
                    A06(cArr2, b8, bArrArray[i15], bArrArray[i17], i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw C60O.A0i("Invalid UTF-8");
                    }
                    byte b11 = bArrArray[i15];
                    int i18 = iArrayOffset + 3;
                    byte b12 = bArrArray[iArrayOffset + 2];
                    iArrayOffset += 4;
                    A05(cArr2, b8, b11, b12, bArrArray[i18], i14);
                    i14 += 2;
                }
            }
            return new String(cArr2, 0, i14);
        }
    }

    public static void A04(DZx dZx, DZx dZx2, int i, int i2) {
        int iA08 = dZx.A08(i) + (i2 * 4);
        dZx2.A0A(iA08 + dZx.A04.getInt(iA08), dZx.A04);
    }

    private final int A08(int i) {
        return A01(this, i) + 4;
    }

    public final int A09(int i) {
        return this.A04.getInt(A01(this, i));
    }
}
