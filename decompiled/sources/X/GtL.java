package X;

import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GtL implements AutoCloseable {
    public int A00;
    public int A02;
    public int A03;
    public Reader A05;
    public boolean A07;
    public static final C7318Ekj<String[]> A0B = new C7318Ekj<>(new C8927Ftj(2));
    public static final C7318Ekj<char[]> A0A = new C7318Ekj<>(new C8927Ftj(3));
    public int A04 = 0;
    public int A01 = -1;
    public C10307GuI A06 = null;
    public char[] A08 = A0A.A00();
    public String[] A09 = A0B.A00();

    public static void A02(GtL gtL) {
        Arrays.fill(gtL.A08, (char) 0);
        A0A.A01(gtL.A08);
        gtL.A08 = null;
        A0B.A01(gtL.A09);
    }

    public static String A00(GtL gtL, int i, int i2) {
        gtL.A02 = i2;
        return i2 > i ? A01(gtL.A08, gtL.A09, i, i2 - i) : "";
    }

    public static String A01(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        for (int i5 = i; i5 < i3; i5++) {
            i4 = (i4 * 31) + cArr[i5];
        }
        int i6 = i4 & 511;
        String str = strArr[i6];
        if (str != null) {
            int i7 = i;
            int i8 = i2;
            if (i2 == str.length()) {
                int i9 = 0;
                while (true) {
                    int i10 = i8 - 1;
                    if (i8 == 0) {
                        return str;
                    }
                    int i11 = i7 + 1;
                    int i12 = i9 + 1;
                    if (cArr[i7] != str.charAt(i9)) {
                        break;
                    }
                    i7 = i11;
                    i8 = i10;
                    i9 = i12;
                }
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r5.A07 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.GtL r5) throws java.io.IOException {
        /*
            boolean r0 = r5.A07
            if (r0 != 0) goto L55
            int r3 = r5.A02
            int r0 = r5.A04
            if (r3 < r0) goto L55
            int r0 = r5.A01
            r4 = -1
            if (r0 != r4) goto L55
            int r0 = r5.A03
            int r0 = r0 + r3
            r5.A03 = r0
            int r2 = r5.A00
            int r2 = r2 - r3
            r5.A00 = r2
            r1 = 0
            if (r2 <= 0) goto L21
            char[] r0 = r5.A08
            java.lang.System.arraycopy(r0, r3, r0, r1, r2)
        L21:
            r5.A02 = r1
        L23:
            int r3 = r5.A00
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 >= r0) goto L48
            java.io.Reader r2 = r5.A05     // Catch: java.io.IOException -> L41
            char[] r1 = r5.A08     // Catch: java.io.IOException -> L41
            int r0 = r1.length     // Catch: java.io.IOException -> L41
            int r0 = r0 - r3
            int r1 = r2.read(r1, r3, r0)     // Catch: java.io.IOException -> L41
            if (r1 != r4) goto L39
            r0 = 1
            r5.A07 = r0     // Catch: java.io.IOException -> L41
            goto L48
        L39:
            if (r1 == 0) goto L48
            int r0 = r5.A00     // Catch: java.io.IOException -> L41
            int r0 = r0 + r1
            r5.A00 = r0     // Catch: java.io.IOException -> L41
            goto L23
        L41:
            r1 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r1)
            throw r0
        L48:
            int r1 = r5.A00
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.min(r1, r0)
            r5.A04 = r0
            A04(r5)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GtL.A03(X.GtL):void");
    }

    public static void A04(GtL gtL) {
        if (gtL.A06 != null) {
            for (int i = gtL.A02; i < gtL.A00; i++) {
                if (gtL.A08[i] == '\n') {
                    int i2 = gtL.A03 + 1 + i;
                    C10307GuI c10307GuI = gtL.A06;
                    int i3 = c10307GuI.A00;
                    if (i3 == 0 || i2 > c10307GuI.A01[i3 - 1]) {
                        int i4 = i3 + 1;
                        int[] iArrCopyOf = c10307GuI.A01;
                        int length = iArrCopyOf.length;
                        if (length < i4) {
                            int i5 = length * 2;
                            if (length == 0) {
                                i5 = 16;
                            }
                            if (i5 >= i4) {
                                i4 = i5;
                            }
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
                            c10307GuI.A01 = iArrCopyOf;
                        }
                        int i6 = c10307GuI.A00;
                        c10307GuI.A00 = i6 + 1;
                        iArrCopyOf[i6] = i2;
                    }
                }
            }
        }
    }

    public final int A07() {
        return this.A03 + Math.min(this.A02, this.A00);
    }

    public final void A0D() {
        int i = this.A01;
        if (i == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.A02 = i;
        this.A01 = -1;
    }

    public final void A0E() {
        int i = this.A02;
        if (i < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.A02 = i - 1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Reader reader = this.A05;
        if (reader != null) {
            try {
                reader.close();
                this.A05 = null;
                A02(this);
            } catch (IOException unused) {
                this.A05 = null;
                A02(this);
            } catch (Throwable th) {
                this.A05 = null;
                A02(this);
                this.A09 = null;
                this.A06 = null;
                throw th;
            }
            this.A09 = null;
            this.A06 = null;
        }
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A02;
        int i3 = i - i2;
        return i3 < 0 ? "" : new String(this.A08, i2, i3);
    }

    public GtL(Reader reader) throws IOException {
        this.A05 = reader;
        A03(this);
    }

    public final char A05() throws IOException {
        A03(this);
        int i = this.A02;
        char c = i >= this.A00 ? '\uffff' : this.A08[i];
        this.A02 = i + 1;
        return c;
    }

    public final char A06() throws IOException {
        A03(this);
        int i = this.A02;
        if (i >= this.A00) {
            return '\uffff';
        }
        return this.A08[i];
    }

    public final String A08() throws IOException {
        A03(this);
        int i = this.A02;
        int i2 = this.A00;
        char[] cArr = this.A08;
        int i3 = i;
        while (i3 < i2 && Gt5.A05(cArr[i3])) {
            i3++;
        }
        return AbstractC7610F5x.A11(this, cArr, i3, i);
    }

    public final String A09() throws IOException {
        A03(this);
        char[] cArr = this.A08;
        String[] strArr = this.A09;
        int i = this.A02;
        String strA01 = A01(cArr, strArr, i, this.A00 - i);
        this.A02 = this.A00;
        return strA01;
    }

    public final String A0A() {
        int i;
        int i2;
        int iA07 = A07();
        C10307GuI c10307GuI = this.A06;
        if (c10307GuI == null) {
            i = 1;
        } else if (iA07 < 0) {
            i = -1;
        } else {
            int iBinarySearch = Arrays.binarySearch(c10307GuI.A01, 0, c10307GuI.A00, iA07);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            i = iBinarySearch + 2;
        }
        int iA072 = A07();
        C10307GuI c10307GuI2 = this.A06;
        if (c10307GuI2 == null) {
            i2 = iA072 + 1;
        } else if (iA072 < 0) {
            i2 = -1;
        } else {
            int iBinarySearch2 = Arrays.binarySearch(c10307GuI2.A01, 0, c10307GuI2.A00, iA072);
            if (iBinarySearch2 >= 0 || (-iBinarySearch2) - 2 != -1) {
                iA072 -= c10307GuI2.A01[iBinarySearch2];
            }
            i2 = iA072 + 1;
        }
        return FGI.A07(i, i2, ":");
    }

    public final String A0B(char c) throws IOException {
        A03(this);
        int i = this.A02;
        while (true) {
            if (i >= this.A00) {
                break;
            }
            char[] cArr = this.A08;
            if (c == cArr[i]) {
                int i2 = i - i;
                if (i2 != -1) {
                    String strA01 = A01(cArr, this.A09, i, i2);
                    this.A02 += i2;
                    return strA01;
                }
            } else {
                i++;
            }
        }
        return A09();
    }

    public final String A0C(char c, char c2, char c3) throws IOException {
        A03(this);
        int i = this.A02;
        int i2 = this.A00;
        char[] cArr = this.A08;
        int i3 = i;
        while (i3 < i2) {
            char c4 = cArr[i3];
            if (c4 == c || c4 == c2 || c4 == c3) {
                break;
            }
            i3++;
        }
        return A00(this, i, i3);
    }

    public final boolean A0F() throws IOException {
        A03(this);
        return BV5.A1P(this.A02, this.A00);
    }

    public final boolean A0G() {
        if (A0F()) {
            return false;
        }
        return Gt5.A05(this.A08[this.A02]);
    }

    public final boolean A0H(char c) {
        return !A0F() && this.A08[this.A02] == c;
    }

    public final boolean A0I(String str) throws IOException {
        A03(this);
        A03(this);
        int length = str.length();
        int i = this.A00;
        int i2 = this.A02;
        if (length > i - i2) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            char[] cArr = this.A08;
            i2 = this.A02;
            if (cCharAt != cArr[i2 + i3]) {
                return false;
            }
        }
        this.A02 = i2 + length;
        return true;
    }

    public final boolean A0J(String str) {
        if (!A0K(str)) {
            return false;
        }
        this.A02 += str.length();
        return true;
    }

    public final boolean A0K(String str) throws IOException {
        A03(this);
        int length = str.length();
        int i = this.A00;
        int i2 = this.A02;
        if (length <= i - i2) {
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                char c = this.A08[i2 + i3];
                if (cCharAt == c || Character.toUpperCase(cCharAt) == Character.toUpperCase(c)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0L(char... cArr) throws IOException {
        if (A0F()) {
            return false;
        }
        A03(this);
        char c = this.A08[this.A02];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
