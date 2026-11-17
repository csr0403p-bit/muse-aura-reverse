package X;

/* renamed from: X.Atf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1918Atf {
    public int A00;
    public int A01;
    public C2024Awd A02;
    public String A03;

    public final int A00() {
        C2024Awd c2024Awd = this.A02;
        int length = this.A03.length();
        return c2024Awd != null ? (length - (this.A00 - this.A01)) + (c2024Awd.A00 - (c2024Awd.A01 - c2024Awd.A02)) : length;
    }

    public final void A01(int i, int i2, String str) {
        StringBuilder sbA0y;
        int i3;
        if (i > i2) {
            sbA0y = C60O.A0y("start index must be less than or equal to end index: ", i);
            sbA0y.append(" > ");
            sbA0y.append(i2);
        } else {
            if (i >= 0) {
                C2024Awd c2024Awd = this.A02;
                if (c2024Awd == null) {
                    int length = str.length();
                    int iMax = Math.max(255, length + 128);
                    char[] cArr = new char[iMax];
                    int iMin = Math.min(i, 64);
                    String str2 = this.A03;
                    int iMin2 = Math.min(str2.length() - i2, 64);
                    int i4 = i - iMin;
                    str2.getChars(i4, i, cArr, 0);
                    String str3 = this.A03;
                    int i5 = iMax - iMin2;
                    int i6 = iMin2 + i2;
                    C7384Etj.A0Z(str3, "null cannot be cast to non-null type java.lang.String");
                    str3.getChars(i2, i6, cArr, i5);
                    str.getChars(0, length, cArr, iMin);
                    C2024Awd c2024Awd2 = new C2024Awd();
                    c2024Awd2.A00 = iMax;
                    c2024Awd2.A03 = cArr;
                    c2024Awd2.A02 = iMin + length;
                    c2024Awd2.A01 = i5;
                    this.A02 = c2024Awd2;
                    this.A01 = i4;
                    this.A00 = i6;
                    return;
                }
                int i7 = this.A01;
                int i8 = i - i7;
                int i9 = i2 - i7;
                if (i8 >= 0) {
                    int i10 = c2024Awd.A00;
                    int i11 = c2024Awd.A01;
                    int i12 = c2024Awd.A02;
                    int i13 = i11 - i12;
                    if (i9 <= i10 - i13) {
                        int length2 = str.length();
                        int i14 = length2 - (i9 - i8);
                        if (i14 > i13) {
                            int i15 = i14 - i13;
                            int i16 = i10;
                            do {
                                i16 *= 2;
                            } while (i16 - i10 < i15);
                            char[] cArr2 = new char[i16];
                            char[] cArr3 = c2024Awd.A03;
                            AnonymousClass003.A0u(cArr3, cArr2);
                            System.arraycopy(cArr3, 0, cArr2, 0, i12);
                            int i17 = c2024Awd.A00;
                            int i18 = c2024Awd.A01;
                            int i19 = i17 - i18;
                            i11 = i16 - i19;
                            char[] cArr4 = c2024Awd.A03;
                            AnonymousClass003.A0u(cArr4, cArr2);
                            System.arraycopy(cArr4, i18, cArr2, i11, (i19 + i18) - i18);
                            c2024Awd.A03 = cArr2;
                            c2024Awd.A00 = i16;
                            c2024Awd.A01 = i11;
                        }
                        int i20 = c2024Awd.A02;
                        if (i8 < i20 && i9 <= i20) {
                            int i21 = i20 - i9;
                            char[] cArr5 = c2024Awd.A03;
                            AnonymousClass003.A0u(cArr5, cArr5);
                            System.arraycopy(cArr5, i9, cArr5, i11 - i21, i20 - i9);
                            c2024Awd.A02 = i8;
                            i3 = c2024Awd.A01 - i21;
                        } else {
                            if (i8 < i20 && i9 >= i20) {
                                c2024Awd.A01 = i9 + (i11 - i20);
                                c2024Awd.A02 = i8;
                                str.getChars(0, length2, c2024Awd.A03, i8);
                                c2024Awd.A02 += length2;
                                return;
                            }
                            int i22 = i11 - i20;
                            int i23 = i8 + i22;
                            i3 = i9 + i22;
                            char[] cArr6 = c2024Awd.A03;
                            AnonymousClass003.A0u(cArr6, cArr6);
                            System.arraycopy(cArr6, i11, cArr6, i20, i23 - i11);
                            i8 = c2024Awd.A02 + (i23 - i11);
                            c2024Awd.A02 = i8;
                        }
                        c2024Awd.A01 = i3;
                        str.getChars(0, length2, c2024Awd.A03, i8);
                        c2024Awd.A02 += length2;
                        return;
                    }
                }
                this.A03 = toString();
                this.A02 = null;
                this.A01 = -1;
                this.A00 = -1;
                A01(i, i2, str);
                return;
            }
            sbA0y = C60O.A0y("start must be non-negative, but was ", i);
        }
        throw C60O.A0i(sbA0y.toString());
    }

    public final String toString() {
        C2024Awd c2024Awd = this.A02;
        String str = this.A03;
        if (c2024Awd == null) {
            return str;
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) str, 0, this.A01);
        sbA0w.append(c2024Awd.A03, 0, c2024Awd.A02);
        char[] cArr = c2024Awd.A03;
        int i = c2024Awd.A01;
        sbA0w.append(cArr, i, c2024Awd.A00 - i);
        String str2 = this.A03;
        sbA0w.append((CharSequence) str2, this.A00, str2.length());
        return sbA0w.toString();
    }
}
