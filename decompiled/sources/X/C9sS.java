package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;

/* renamed from: X.9sS, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sS {
    public int A00;
    public String A01;
    public final C9sb A03 = new C9sb();
    public StringBuilder A02 = new StringBuilder();

    public abstract byte A05();

    public abstract int A07();

    public abstract int A08(int i);

    public abstract CharSequence A0A();

    public abstract String A0E();

    public final String A0G(CharSequence charSequence, int i, int i2) {
        String string;
        String string2;
        int i3;
        char c;
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                A0M(i, i2);
                int iA08 = A08(i2 + 1);
                if (iA08 != -1) {
                    CharSequence charSequenceA0A = A0A();
                    int iA00 = iA08 + 1;
                    char cCharAt2 = charSequenceA0A.charAt(iA08);
                    if (cCharAt2 == 'u') {
                        iA00 = A00(charSequenceA0A, iA00);
                    } else if (cCharAt2 >= 'u' || (c = C9t7.A01[cCharAt2]) == 0) {
                        StringBuilder sb = new StringBuilder("Invalid escaped char '");
                        sb.append(cCharAt2);
                        sb.append('\'');
                        string2 = sb.toString();
                    } else {
                        this.A02.append(c);
                    }
                    i = A08(iA00);
                    if (i == -1) {
                        A0N("Unexpected EOF", "", -1);
                        throw F60.createAndThrow();
                    }
                    i2 = i;
                    z = true;
                    cCharAt = charSequence.charAt(i2);
                } else {
                    string2 = "Expected escape sequence to continue, got EOF";
                }
                i3 = this.A00;
                A0N(string2, "", i3);
                throw F60.createAndThrow();
            }
            i2++;
            if (i2 >= charSequence.length()) {
                A0M(i, i2);
                i = A08(i2);
                if (i == -1) {
                    string2 = "Unexpected EOF";
                    i3 = -1;
                    A0N(string2, "", i3);
                    throw F60.createAndThrow();
                }
                i2 = i;
                z = true;
                cCharAt = charSequence.charAt(i2);
            } else {
                continue;
                cCharAt = charSequence.charAt(i2);
            }
        }
        if (z) {
            A0M(i, i2);
            StringBuilder sb2 = this.A02;
            string = sb2.toString();
            sb2.setLength(0);
        } else {
            string = A0F(i, i2);
        }
        this.A00 = i2 + 1;
        return string;
    }

    public abstract void A0L(char c);

    public abstract boolean A0P();

    private final int A00(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.A02.append((char) ((A01(charSequence, i) << 12) + (A01(charSequence, i + 1) << 8) + (A01(charSequence, i + 2) << 4) + A01(charSequence, i + 3)));
            return i2;
        }
        this.A00 = i;
        A0I();
        if (this.A00 + 4 < charSequence.length()) {
            return A00(charSequence, this.A00);
        }
        A0N("Unexpected EOF during unicode escape", "", this.A00);
        throw F60.createAndThrow();
    }

    public static final boolean A03(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        r2 = "Unexpected symbol '-' in numeric literal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r1 = new java.lang.StringBuilder("Unexpected symbol '");
        r1.append(r11);
        r0 = "' in numeric literal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b0, code lost:
    
        r1.append(r0);
        r2 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        if (r2 == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bb, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        if (r10 == r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00be, code lost:
    
        if (r15 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        if (r10 == (r2 - 1)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
    
        if (r17 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        if (r1 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        if (r4.charAt(r2) != '\"') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        r17.A00 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
    
        if (r16 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        if (r14 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d9, code lost:
    
        r0 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00db, code lost:
    
        r3 = r3 * java.lang.Math.pow(10.0d, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e4, code lost:
    
        if (r3 > 9.223372036854776E18d) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ea, code lost:
    
        if (r3 < (-9.223372036854776E18d)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f2, code lost:
    
        if (java.lang.Math.floor(r3) != r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
    
        r6 = (long) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f5, code lost:
    
        if (r15 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f7, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f8, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fe, code lost:
    
        if (r6 == Long.MIN_VALUE) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0101, code lost:
    
        return -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0102, code lost:
    
        r1 = new java.lang.StringBuilder("Can't convert ");
        r1.append(r3);
        r1.append(" to Long");
        r2 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0119, code lost:
    
        r2 = "Expected closing quotation mark";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011c, code lost:
    
        r2 = "Expected numeric literal";
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b8 A[EDGE_INSN: B:96:0x00b8->B:52:0x00b8 BREAK  A[LOOP:0: B:12:0x0031->B:23:0x004c, LOOP_LABEL: LOOP:0: B:12:0x0031->B:23:0x004c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A09() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sS.A09():long");
    }

    public final String A0B() {
        String str = this.A01;
        if (str == null) {
            return A0E();
        }
        this.A01 = null;
        return str;
    }

    public final String A0C() {
        String string;
        String str = this.A01;
        if (str != null) {
            this.A01 = null;
            return str;
        }
        int iA07 = A07();
        CharSequence charSequenceA0A = A0A();
        if (iA07 >= charSequenceA0A.length() || iA07 == -1) {
            A0N("EOF", "", iA07);
        } else {
            byte bA00 = C9t0.A00(charSequenceA0A.charAt(iA07));
            if (bA00 == 1) {
                return A0B();
            }
            if (bA00 == 0) {
                boolean z = false;
                while (C9t0.A00(charSequenceA0A.charAt(iA07)) == 0) {
                    iA07++;
                    if (iA07 >= charSequenceA0A.length()) {
                        A0M(this.A00, iA07);
                        int iA08 = A08(iA07);
                        if (iA08 == -1) {
                            this.A00 = iA07;
                            A0M(0, 0);
                            StringBuilder sb = this.A02;
                            String string2 = sb.toString();
                            sb.setLength(0);
                            return string2;
                        }
                        iA07 = iA08;
                        z = true;
                    }
                }
                int i = this.A00;
                if (z) {
                    A0M(i, iA07);
                    StringBuilder sb2 = this.A02;
                    string = sb2.toString();
                    sb2.setLength(0);
                } else {
                    string = A0F(i, iA07);
                }
                this.A00 = iA07;
                return string;
            }
            A0N(FGI.A0E("Expected beginning of the string, but got ", charSequenceA0A.charAt(iA07)), "", this.A00);
        }
        throw F60.createAndThrow();
    }

    public void A0I() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(char r7) {
        /*
            r6 = this;
            int r2 = r6.A00
            if (r2 <= 0) goto L15
            r0 = 34
            if (r7 != r0) goto L15
            int r0 = r2 + (-1)
            r6.A00 = r0     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r6.A0C()     // Catch: java.lang.Throwable -> L11
            goto L43
        L11:
            r0 = move-exception
            r6.A00 = r2
            throw r0
        L15:
            byte r0 = X.C9t0.A00(r7)
            java.lang.String r5 = X.C9t0.A01(r0)
            int r4 = r2 + (-1)
            java.lang.CharSequence r1 = r6.A0A()
            int r0 = r1.length()
            if (r2 == r0) goto L5b
            if (r4 < 0) goto L5b
            char r0 = r1.charAt(r4)
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L33:
            java.lang.String r2 = "Expected "
            java.lang.String r1 = ", but had '"
            java.lang.String r0 = "' instead"
            java.lang.String r1 = X.FGI.A0h(r2, r5, r1, r3, r0)
            java.lang.String r0 = ""
            r6.A0N(r1, r0, r4)
            goto L56
        L43:
            r6.A00 = r2
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            int r2 = r2 + (-1)
            java.lang.String r1 = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value."
            java.lang.String r0 = "Expected string literal but 'null' literal was found"
            r6.A0N(r0, r1, r2)
        L56:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L5b:
            java.lang.String r3 = "EOF"
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sS.A0K(char):void");
    }

    public void A0M(int i, int i2) {
        this.A02.append(A0A(), i, i2);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("JsonReader(source='");
        sbA0x.append((Object) A0A());
        sbA0x.append("', currentPosition=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    private final int A01(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt) {
            if (cCharAt < ':') {
                return cCharAt - '0';
            }
            if ('a' <= cCharAt) {
                if (cCharAt < 'g') {
                    return cCharAt - 'W';
                }
            } else if ('A' <= cCharAt && cCharAt < 'G') {
                return cCharAt - '7';
            }
        }
        A0N(FGI.A0O("Invalid toHexChar char '", "' in unicode escape", cCharAt), "", this.A00);
        throw F60.createAndThrow();
    }

    public static final void A02(String str, C9sS c9sS, int i) {
        String strA0N;
        CharSequence charSequenceA0A = c9sS.A0A();
        int length = charSequenceA0A.length() - i;
        int length2 = str.length();
        if (length >= length2) {
            for (int i2 = 0; i2 < length2; i2++) {
                if (str.charAt(i2) != (charSequenceA0A.charAt(i + i2) | ' ')) {
                    strA0N = FGI.A0N("Expected valid boolean literal prefix, but had '", c9sS.A0C(), '\'');
                }
            }
            c9sS.A00 = i + length2;
            return;
        }
        strA0N = "Unexpected end of boolean literal";
        c9sS.A0N(strA0N, "", c9sS.A00);
        throw F60.createAndThrow();
    }

    public byte A04() {
        CharSequence charSequenceA0A = A0A();
        int i = this.A00;
        while (true) {
            int iA08 = A08(i);
            if (iA08 == -1) {
                this.A00 = iA08;
                return (byte) 10;
            }
            char cCharAt = charSequenceA0A.charAt(iA08);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.A00 = iA08;
                return C9t0.A00(cCharAt);
            }
            i = iA08 + 1;
        }
    }

    public final byte A06(byte b) {
        byte bA05 = A05();
        if (bA05 == b) {
            return bA05;
        }
        String strA01 = C9t0.A01(b);
        int i = this.A00;
        int i2 = i - 1;
        CharSequence charSequenceA0A = A0A();
        A0N(FGI.A0h("Expected ", strA01, ", but had '", (i == charSequenceA0A.length() || i2 < 0) ? "EOF" : String.valueOf(charSequenceA0A.charAt(i2)), "' instead"), "", i2);
        throw F60.createAndThrow();
    }

    public final String A0D() {
        String strA0C = A0C();
        if (!HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strA0C) || A0A().charAt(this.A00 - 1) == '\"') {
            return strA0C;
        }
        A0N("Unexpected 'null' value instead of string literal", "", this.A00);
        throw F60.createAndThrow();
    }

    public String A0F(int i, int i2) {
        return A0A().subSequence(i, i2).toString();
    }

    public final String A0H(boolean z) {
        String strA0B;
        byte bA04 = A04();
        if (!z) {
            if (bA04 == 1) {
                strA0B = A0B();
                this.A01 = strA0B;
                return strA0B;
            }
            return null;
        }
        if (bA04 == 1 || bA04 == 0) {
            strA0B = A0C();
            this.A01 = strA0B;
            return strA0B;
        }
        return null;
    }

    public final void A0J() {
        if (A05() == 10) {
            return;
        }
        A0N(FGI.A0O("Expected EOF after parsing, but had ", " instead", A0A().charAt(this.A00 - 1)), "", this.A00);
        throw F60.createAndThrow();
    }

    public final void A0N(String str, String str2, int i) {
        AnonymousClass003.A0v(str, str2);
        throw C9rA.A02(A0A(), FGI.A0d(str, " at path: ", this.A03.A00(), str2.length() == 0 ? "" : FGI.A0M(PairsDiscretionDocument.TERMINATOR, str2)), i);
    }

    public final boolean A0O() {
        int iA07 = A07();
        CharSequence charSequenceA0A = A0A();
        if (iA07 >= charSequenceA0A.length() || iA07 == -1 || charSequenceA0A.charAt(iA07) != ',') {
            return false;
        }
        this.A00++;
        return true;
    }

    public final boolean A0Q(boolean z) {
        int iA08 = A08(A07());
        CharSequence charSequenceA0A = A0A();
        int length = charSequenceA0A.length() - iA08;
        if (length >= 4 && iA08 != -1) {
            int i = 0;
            while (true) {
                if (HatchCcvLoggingKt.NO_POSTAL_FIELD.charAt(i) != charSequenceA0A.charAt(iA08 + i)) {
                    break;
                }
                i++;
                if (i >= 4) {
                    if (length <= 4 || C9t0.A00(charSequenceA0A.charAt(iA08 + 4)) != 0) {
                        if (!z) {
                            return true;
                        }
                        this.A00 = iA08 + 4;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
