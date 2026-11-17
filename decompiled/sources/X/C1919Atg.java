package X;

/* renamed from: X.Atg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1919Atg implements CharSequence {
    public int A00;
    public int A01;
    public C2021Awa A02;
    public CharSequence A03;

    public final void A01(CharSequence charSequence, int i, int i2, int i3, int i4) {
        StringBuilder sbA0y;
        int i5;
        if (i > i2) {
            sbA0y = C60O.A0y("start=", i);
            sbA0y.append(" > end=");
            sbA0y.append(i2);
        } else if (i3 > i4) {
            sbA0y = C60O.A0y("textStart=", i3);
            sbA0y.append(" > textEnd=");
            sbA0y.append(i4);
        } else if (i < 0) {
            sbA0y = C60O.A0y("start must be non-negative, but was ", i);
        } else {
            if (i3 >= 0) {
                C2021Awa c2021Awa = this.A02;
                int i6 = i4 - i3;
                if (c2021Awa == null) {
                    int iMax = Math.max(255, i6 + 128);
                    char[] cArr = new char[iMax];
                    int iMin = Math.min(i, 64);
                    int iMin2 = Math.min(this.A03.length() - i2, 64);
                    int i7 = i - iMin;
                    A00(this.A03, 0, i7, cArr, i);
                    int i8 = iMax - iMin2;
                    int i9 = iMin2 + i2;
                    A00(this.A03, i8, i2, cArr, i9);
                    A00(charSequence, iMin, i3, cArr, i4);
                    C2021Awa c2021Awa2 = new C2021Awa();
                    c2021Awa2.A00 = iMax;
                    c2021Awa2.A03 = cArr;
                    c2021Awa2.A02 = iMin + i6;
                    c2021Awa2.A01 = i8;
                    this.A02 = c2021Awa2;
                    this.A01 = i7;
                    this.A00 = i9;
                    return;
                }
                int i10 = this.A01;
                int i11 = i - i10;
                int i12 = i2 - i10;
                if (i11 >= 0) {
                    int i13 = c2021Awa.A00;
                    int i14 = c2021Awa.A01;
                    int i15 = c2021Awa.A02;
                    int i16 = i14 - i15;
                    if (i12 <= i13 - i16) {
                        int i17 = i6 - (i12 - i11);
                        if (i17 > i16) {
                            int i18 = i13;
                            do {
                                i18 *= 2;
                            } while (i18 - i13 < i17 - i16);
                            char[] cArr2 = new char[i18];
                            char[] cArr3 = c2021Awa.A03;
                            AnonymousClass003.A0u(cArr3, cArr2);
                            System.arraycopy(cArr3, 0, cArr2, 0, i15);
                            int i19 = c2021Awa.A00;
                            int i20 = c2021Awa.A01;
                            int i21 = i19 - i20;
                            i14 = i18 - i21;
                            char[] cArr4 = c2021Awa.A03;
                            AnonymousClass003.A0u(cArr4, cArr2);
                            System.arraycopy(cArr4, i20, cArr2, i14, (i21 + i20) - i20);
                            c2021Awa.A03 = cArr2;
                            c2021Awa.A00 = i18;
                            c2021Awa.A01 = i14;
                        }
                        int i22 = c2021Awa.A02;
                        if (i11 < i22 && i12 <= i22) {
                            int i23 = i22 - i12;
                            char[] cArr5 = c2021Awa.A03;
                            AnonymousClass003.A0u(cArr5, cArr5);
                            System.arraycopy(cArr5, i12, cArr5, i14 - i23, i22 - i12);
                            c2021Awa.A02 = i11;
                            i5 = c2021Awa.A01 - i23;
                        } else {
                            if (i11 < i22 && i12 >= i22) {
                                c2021Awa.A01 = i12 + (i14 - i22);
                                c2021Awa.A02 = i11;
                                A00(charSequence, i11, i3, c2021Awa.A03, i4);
                                c2021Awa.A02 += i6;
                                return;
                            }
                            int i24 = i14 - i22;
                            int i25 = i11 + i24;
                            i5 = i12 + i24;
                            char[] cArr6 = c2021Awa.A03;
                            AnonymousClass003.A0u(cArr6, cArr6);
                            System.arraycopy(cArr6, i14, cArr6, i22, i25 - i14);
                            i11 = c2021Awa.A02 + (i25 - i14);
                            c2021Awa.A02 = i11;
                        }
                        c2021Awa.A01 = i5;
                        A00(charSequence, i11, i3, c2021Awa.A03, i4);
                        c2021Awa.A02 += i6;
                        return;
                    }
                }
                this.A03 = toString();
                this.A02 = null;
                this.A01 = -1;
                this.A00 = -1;
                A01(charSequence, i, i2, i3, i4);
                return;
            }
            sbA0y = C60O.A0y("textStart must be non-negative, but was ", i3);
        }
        AbstractC1061ATk.A00(sbA0y.toString());
        throw F60.createAndThrow();
    }

    public static final void A00(CharSequence charSequence, int i, int i2, char[] cArr, int i3) {
        if (charSequence instanceof At0) {
            A00(((At0) charSequence).A02, i, i2, cArr, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        CharSequence charSequence;
        int i2;
        C2021Awa c2021Awa = this.A02;
        if (c2021Awa == null || i < (i2 = this.A01)) {
            charSequence = this.A03;
        } else {
            int i3 = c2021Awa.A00;
            int i4 = c2021Awa.A01;
            int i5 = c2021Awa.A02;
            int i6 = i3 - (i4 - i5);
            if (i < i6 + i2) {
                int i7 = i - i2;
                char[] cArr = c2021Awa.A03;
                if (i7 >= i5) {
                    i7 = (i7 - i5) + i4;
                }
                return cArr[i7];
            }
            charSequence = this.A03;
            i -= (i6 - this.A00) + i2;
        }
        return charSequence.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        C2021Awa c2021Awa = this.A02;
        int length = this.A03.length();
        return c2021Awa != null ? (length - (this.A00 - this.A01)) + (c2021Awa.A00 - (c2021Awa.A01 - c2021Awa.A02)) : length;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        C2021Awa c2021Awa = this.A02;
        CharSequence charSequence = this.A03;
        if (c2021Awa == null) {
            return charSequence.toString();
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(charSequence, 0, this.A01);
        sbA0w.append(c2021Awa.A03, 0, c2021Awa.A02);
        char[] cArr = c2021Awa.A03;
        int i = c2021Awa.A01;
        sbA0w.append(cArr, i, c2021Awa.A00 - i);
        CharSequence charSequence2 = this.A03;
        sbA0w.append(charSequence2, this.A00, charSequence2.length());
        return sbA0w.toString();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }
}
