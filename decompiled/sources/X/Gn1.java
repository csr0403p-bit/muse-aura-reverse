package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Gn1 implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient char[] A00;
    public final transient int[] A01;
    public final transient byte[] A02;
    public final int _maxLineLength;
    public final String _name;
    public final char _paddingChar;
    public final HjV _paddingReadBehaviour;
    public final boolean _writePadding;

    public final String A06(byte[] bArr) {
        char c;
        int length = bArr.length;
        StringBuilder sbA0p = BV4.A0p((length >> 2) + length + (length >> 3));
        int i = this._maxLineLength >> 2;
        int i2 = length - 3;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = i3 + 2;
            int i5 = ((bArr[i3 + 1] & 255) | (bArr[i3] << 8)) << 8;
            i3 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            char[] cArr = this.A00;
            sbA0p.append(cArr[(i6 >> 18) & 63]);
            sbA0p.append(cArr[(i6 >> 12) & 63]);
            sbA0p.append(cArr[(i6 >> 6) & 63]);
            sbA0p.append(cArr[i6 & 63]);
            i--;
            if (i <= 0) {
                sbA0p.append('\\');
                sbA0p.append('n');
                i = i;
            }
        }
        int i7 = length - i3;
        if (i7 > 0) {
            int i8 = i3 + 1;
            int iA0C = bArr[i3] << 16;
            if (i7 == 2) {
                iA0C = AbstractC7608F5v.A0C(bArr, i8, iA0C);
            }
            char[] cArr2 = this.A00;
            sbA0p.append(cArr2[(iA0C >> 18) & 63]);
            sbA0p.append(cArr2[(iA0C >> 12) & 63]);
            if (this._writePadding) {
                sbA0p.append(i7 == 2 ? cArr2[(iA0C >> 6) & 63] : this._paddingChar);
                c = this._paddingChar;
            } else if (i7 == 2) {
                c = cArr2[(iA0C >> 6) & 63];
            }
            sbA0p.append(c);
        }
        return sbA0p.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                Gn1 gn1 = (Gn1) obj;
                if (gn1._paddingChar != this._paddingChar || gn1._maxLineLength != this._maxLineLength || gn1._writePadding != this._writePadding || gn1._paddingReadBehaviour != this._paddingReadBehaviour || !this._name.equals(gn1._name)) {
                }
            }
            return false;
        }
        return true;
    }

    private final void A00(String str, char c, int i) {
        String str2;
        StringBuilder sbA0x;
        if (c <= ' ') {
            sbA0x = C60O.A0x("Illegal white space character (code 0x");
            BV4.A1N(sbA0x, c);
            sbA0x.append(") as character #");
            sbA0x.append(i + 1);
            str2 = " of 4-char base64 unit: can only used between units";
        } else {
            char c2 = this._paddingChar;
            if (c == c2) {
                sbA0x = AbstractC7608F5v.A0y("Unexpected padding character ('", c2);
                sbA0x.append("') as character #");
                sbA0x.append(i + 1);
                str2 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else {
                str2 = ") in base64 content";
                if (!Character.isDefined(c) || Character.isISOControl(c)) {
                    sbA0x = C60O.A0x("Illegal character (code 0x");
                } else {
                    sbA0x = AbstractC7608F5v.A0y("Illegal character '", c);
                    sbA0x.append("' (code 0x");
                }
                BV4.A1N(sbA0x, c);
            }
        }
        String strA0v = AnonymousClass001.A0v(str2, sbA0x);
        if (str != null) {
            strA0v = FGI.A0U(strA0v, ": ", str);
        }
        throw C60O.A0i(strA0v);
    }

    public final int A01(char c) {
        if (c <= '\u007f') {
            return this.A01[c];
        }
        return -1;
    }

    public final int A02(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.A02;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        bArr[i3 + 1] = bArr2[(i >> 12) & 63];
        if (!this._writePadding) {
            if (i2 != 2) {
                return i4;
            }
            int i5 = i3 + 3;
            bArr[i4] = bArr2[(i >> 6) & 63];
            return i5;
        }
        byte b = (byte) this._paddingChar;
        int i6 = i3 + 3;
        bArr[i4] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
        int i7 = i3 + 4;
        bArr[i6] = b;
        return i7;
    }

    public final int A03(int i, char[] cArr, int i2) {
        char[] cArr2 = this.A00;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        int i3 = i2 + 4;
        cArr[i2 + 3] = cArr2[i & 63];
        return i3;
    }

    public final int A04(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.A02;
        bArr[i2] = bArr2[(i >> 18) & 63];
        bArr[i2 + 1] = bArr2[(i >> 12) & 63];
        bArr[i2 + 2] = bArr2[(i >> 6) & 63];
        int i3 = i2 + 4;
        bArr[i2 + 3] = bArr2[i & 63];
        return i3;
    }

    public final int A05(char[] cArr, int i, int i2, int i3) {
        char[] cArr2 = this.A00;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (this._writePadding) {
            int i5 = i3 + 3;
            cArr[i4] = i2 == 2 ? cArr2[(i >> 6) & 63] : this._paddingChar;
            int i6 = i3 + 4;
            cArr[i5] = this._paddingChar;
            return i6;
        }
        if (i2 != 2) {
            return i4;
        }
        int i7 = i3 + 3;
        cArr[i4] = cArr2[(i >> 6) & 63];
        return i7;
    }

    public final int hashCode() {
        return this._name.hashCode();
    }

    public Object readResolve() {
        String str = this._name;
        Gn1 gn1 = AbstractC10054GoZ.A00;
        if (!gn1._name.equals(str)) {
            gn1 = AbstractC10054GoZ.A01;
            if (!gn1._name.equals(str)) {
                gn1 = AbstractC10054GoZ.A03;
                if (!gn1._name.equals(str)) {
                    gn1 = AbstractC10054GoZ.A02;
                    if (!gn1._name.equals(str)) {
                        throw C60Q.A0U("No Base64Variant with name ", str == null ? "<null>" : FGI.A0U("'", str, "'"));
                    }
                }
            }
        }
        boolean z = this._writePadding;
        if (z == gn1._writePadding && this._paddingChar == gn1._paddingChar && this._paddingReadBehaviour == gn1._paddingReadBehaviour && this._maxLineLength == gn1._maxLineLength) {
            return gn1;
        }
        return new Gn1(this._paddingReadBehaviour, gn1, str, this._paddingChar, this._maxLineLength, z);
    }

    public final String toString() {
        return this._name;
    }

    public Gn1(String str, String str2, char c, int i, boolean z) {
        int[] iArr;
        HjV hjV;
        int[] iArr2 = new int[128];
        this.A01 = iArr2;
        char[] cArr = new char[64];
        this.A00 = cArr;
        this.A02 = new byte[64];
        this._name = str;
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length != 64) {
            throw BV5.A0S("Base64Alphabet length must be exactly 64 (was ", ")", length);
        }
        int i2 = 0;
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr2, -1);
        do {
            char c2 = this.A00[i2];
            this.A02[i2] = (byte) c2;
            iArr = this.A01;
            iArr[c2] = i2;
            i2++;
        } while (i2 < length);
        if (z) {
            iArr[c] = -2;
            hjV = HjV.PADDING_REQUIRED;
        } else {
            hjV = HjV.PADDING_FORBIDDEN;
        }
        this._paddingReadBehaviour = hjV;
    }

    public final void A07(C9964Gmb c9964Gmb, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ') {
                int iA01 = A01(cCharAt);
                if (iA01 >= 0) {
                    if (i2 < length) {
                        int i3 = i + 2;
                        char cCharAt2 = str.charAt(i2);
                        int iA012 = A01(cCharAt2);
                        if (iA012 < 0) {
                            A00(null, cCharAt2, 1);
                        } else {
                            int i4 = (iA01 << 6) | iA012;
                            if (i3 < length) {
                                int i5 = i + 3;
                                char cCharAt3 = str.charAt(i3);
                                int iA013 = A01(cCharAt3);
                                if (iA013 >= 0) {
                                    int i6 = (i4 << 6) | iA013;
                                    if (i5 < length) {
                                        i += 4;
                                        char cCharAt4 = str.charAt(i5);
                                        int iA014 = A01(cCharAt4);
                                        if (iA014 >= 0) {
                                            c9964Gmb.A03((i6 << 6) | iA014);
                                        } else if (iA014 != -2) {
                                            A00(null, cCharAt4, 3);
                                        } else {
                                            if (this._paddingReadBehaviour == HjV.PADDING_FORBIDDEN) {
                                                throw BV5.A0T("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", new Object[]{this._name});
                                            }
                                            c9964Gmb.A04(i6 >> 2);
                                        }
                                    } else if (this._paddingReadBehaviour != HjV.PADDING_REQUIRED) {
                                        c9964Gmb.A04(i6 >> 2);
                                        return;
                                    }
                                } else if (iA013 != -2) {
                                    A00(null, cCharAt3, 2);
                                } else {
                                    if (this._paddingReadBehaviour == HjV.PADDING_FORBIDDEN) {
                                        throw BV5.A0T("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", new Object[]{this._name});
                                    }
                                    if (i5 < length) {
                                        i += 4;
                                        char cCharAt5 = str.charAt(i5);
                                        char c = this._paddingChar;
                                        if (cCharAt5 == c) {
                                            c9964Gmb.A02(i4 >> 4);
                                        } else {
                                            A00(FGI.A0O("expected padding character '", "'", c), cCharAt5, 3);
                                        }
                                    }
                                }
                            } else if (this._paddingReadBehaviour != HjV.PADDING_REQUIRED) {
                                c9964Gmb.A02(i4 >> 4);
                                return;
                            }
                        }
                    }
                    throw BV5.A0T("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", new Object[]{this._name, Character.valueOf(this._paddingChar)});
                }
                A00(null, cCharAt, 0);
                throw F60.createAndThrow();
            }
            i = i2;
        }
    }

    public Gn1(HjV hjV, Gn1 gn1, String str, char c, int i, boolean z) {
        int[] iArr = new int[128];
        this.A01 = iArr;
        char[] cArr = new char[64];
        this.A00 = cArr;
        byte[] bArr = new byte[64];
        this.A02 = bArr;
        this._name = str;
        byte[] bArr2 = gn1.A02;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = gn1.A00;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = gn1.A01;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        this._paddingReadBehaviour = hjV;
    }
}
