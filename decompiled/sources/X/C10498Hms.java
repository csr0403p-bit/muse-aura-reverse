package X;

import java.io.CharConversionException;
import java.io.Reader;

/* renamed from: X.Hms, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10498Hms extends Reader {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;
    public char A04 = 0;
    public char[] A05;
    public final C9984Gn6 A06;
    public final boolean A07;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Reader
    public final int read() {
        char[] cArr = this.A05;
        if (cArr == null) {
            cArr = new char[1];
            this.A05 = cArr;
        }
        if (read(cArr, 0, 1) < 1) {
            return -1;
        }
        return this.A05[0];
    }

    public C10498Hms(C9984Gn6 c9984Gn6, byte[] bArr, int i, int i2, boolean z) {
        this.A06 = c9984Gn6;
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = z;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws CharConversionException {
        int i3;
        int iA0K;
        int iA0C;
        int i4;
        byte[] bArr = this.A03;
        if (bArr != null) {
            if (i2 < 1) {
                return i2;
            }
            if (i >= 0 && (i3 = i + i2) <= cArr.length) {
                char c = this.A04;
                if (c != 0) {
                    iA0K = i + 1;
                    cArr[i] = c;
                    this.A04 = (char) 0;
                } else {
                    int i5 = this.A01 - this.A02;
                    if (i5 < 4) {
                        if (i5 != 0) {
                            int i6 = this.A00;
                            StringBuilder sbA0w = C60O.A0w();
                            AbstractC7607F5u.A1P("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", ", needed ", sbA0w, i5, 4);
                            AbstractC7607F5u.A1P(", at char #", ", byte #", sbA0w, i6, i5);
                            throw new CharConversionException(AnonymousClass001.A0v(")", sbA0w));
                        }
                    } else {
                        iA0K = i;
                    }
                }
                int i7 = this.A01 - 4;
                while (true) {
                    if (iA0K < i3) {
                        int i8 = this.A02;
                        if (i8 > i7) {
                            break;
                        }
                        boolean z = this.A07;
                        byte b = bArr[i8];
                        if (z) {
                            i4 = (b << 8) | (bArr[i8 + 1] & 255);
                            iA0C = (bArr[i8 + 3] & 255) | ((bArr[i8 + 2] & 255) << 8);
                        } else {
                            iA0C = AbstractC7608F5v.A0C(bArr, i8 + 1, b & 255);
                            i4 = (bArr[i8 + 3] << 8) | (bArr[i8 + 2] & 255);
                        }
                        int i9 = i8 + 4;
                        this.A02 = i9;
                        if (i4 != 0) {
                            int i10 = 65535 & i4;
                            int i11 = ((i10 - 1) << 16) | iA0C;
                            if (i10 > 16) {
                                String str = String.format(" (above 0x%08x)", BV5.A1Y(1114111));
                                int i12 = i9 - 1;
                                int i13 = this.A00;
                                StringBuilder sbA0x = C60O.A0x("Invalid UTF-32 character 0x");
                                BV4.A1N(sbA0x, i11);
                                sbA0x.append(str);
                                sbA0x.append(" at char #");
                                sbA0x.append(i13 + (iA0K - i));
                                throw new CharConversionException(AbstractC7610F5x.A0x(", byte #", sbA0x, i12));
                            }
                            int i14 = iA0K + 1;
                            cArr[iA0K] = (char) ((i11 >> 10) + 55296);
                            iA0C = 56320 | (i11 & 1023);
                            if (i14 >= i3) {
                                this.A04 = (char) i11;
                                iA0K = i14;
                                break;
                            }
                            iA0K = i14;
                        }
                        iA0K = AbstractC7607F5u.A0K(cArr, iA0K, iA0C);
                    } else {
                        break;
                    }
                }
                int i15 = iA0K - i;
                this.A00 += i15;
                return i15;
            }
            throw AbstractC7609F5w.A0j("read(buf,%d,%d), cbuf[%d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)});
        }
        return -1;
    }
}
