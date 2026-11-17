package X;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class Gn2 {
    public static final char[] A0B = new char[0];
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public ArrayList<char[]> A05;
    public boolean A06;
    public char[] A07;
    public char[] A08;
    public char[] A09;
    public final HjR A0A;

    public static final void A00(int i, int i2) {
        throw C3cG.A0Q(FGI.A0J("TextBuffer overrun: size reached (", i + i2, ") exceeds maximum of 2147483647"));
    }

    public static void A01(Gn2 gn2) {
        gn2.A06 = false;
        gn2.A05.clear();
        gn2.A03 = 0;
        gn2.A00 = 0;
    }

    public final void A08() {
        char[] cArr;
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
        this.A08 = null;
        this.A09 = null;
        if (this.A06) {
            A01(this);
        }
        HjR hjR = this.A0A;
        if (hjR == null || (cArr = this.A07) == null) {
            return;
        }
        this.A07 = null;
        hjR.A02(cArr, 2);
    }

    public final void A0C(char[] cArr, int i, int i2) {
        this.A04 = null;
        this.A09 = null;
        this.A08 = cArr;
        this.A02 = i;
        this.A01 = i2;
        if (this.A06) {
            A01(this);
        }
    }

    public final char[] A0E() {
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
        this.A08 = null;
        this.A04 = null;
        this.A09 = null;
        if (this.A06) {
            A01(this);
        }
        char[] cArr = this.A07;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrA04 = A04(this, 0);
        this.A07 = cArrA04;
        return cArrA04;
    }

    public static void A02(Gn2 gn2) {
        ArrayList<char[]> arrayListA0h = gn2.A05;
        if (arrayListA0h == null) {
            arrayListA0h = C3cG.A0h();
            gn2.A05 = arrayListA0h;
        }
        char[] cArr = gn2.A07;
        gn2.A06 = true;
        arrayListA0h.add(cArr);
        int i = gn2.A03;
        int length = cArr.length;
        int i2 = i + length;
        gn2.A03 = i2;
        if (i2 < 0) {
            A00(i2 - length, length);
            throw F60.createAndThrow();
        }
        gn2.A00 = 0;
        int i3 = length + (length >> 1);
        if (i3 < 500) {
            i3 = 500;
        } else if (i3 > 65536) {
            i3 = 65536;
        }
        gn2.A07 = new char[i3];
    }

    public static void A03(Gn2 gn2, int i) {
        int i2 = gn2.A01;
        gn2.A01 = 0;
        char[] cArr = gn2.A08;
        gn2.A08 = null;
        int i3 = gn2.A02;
        gn2.A02 = -1;
        int i4 = i + i2;
        char[] cArrA04 = gn2.A07;
        if (cArrA04 == null || i4 > cArrA04.length) {
            cArrA04 = A04(gn2, i4);
            gn2.A07 = cArrA04;
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, cArrA04, 0, i2);
        }
        gn2.A03 = 0;
        gn2.A00 = i2;
    }

    public static char[] A04(Gn2 gn2, int i) {
        HjR hjR = gn2.A0A;
        return hjR != null ? hjR.A03(2, i) : new char[Math.max(i, 500)];
    }

    public final int A05() {
        if (this.A02 >= 0) {
            return this.A01;
        }
        char[] cArr = this.A09;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.A04;
        return str != null ? str.length() : this.A03 + this.A00;
    }

    public final int A06(boolean z) {
        int iA06;
        char[] cArr;
        int i = this.A02;
        if (i < 0 || (cArr = this.A08) == null) {
            char[] cArr2 = this.A07;
            if (!z) {
                return HlV.A06(cArr2, 0, this.A00);
            }
            iA06 = HlV.A06(cArr2, 1, this.A00 - 1);
        } else {
            int i2 = this.A01;
            if (!z) {
                return HlV.A06(cArr, i, i2);
            }
            iA06 = HlV.A06(cArr, i + 1, i2 - 1);
        }
        return -iA06;
    }

    public final String A07() throws StreamConstraintsException {
        String string = this.A04;
        if (string == null) {
            char[] cArr = this.A09;
            if (cArr != null) {
                string = new String(cArr);
            } else {
                int i = this.A02;
                string = "";
                if (i >= 0) {
                    int i2 = this.A01;
                    if (i2 >= 1) {
                        A09(i2);
                        string = new String(this.A08, i, i2);
                    }
                } else {
                    int i3 = this.A03;
                    int i4 = this.A00;
                    if (i3 != 0) {
                        int i5 = i3 + i4;
                        if (i5 < 0) {
                            A00(i3, i4);
                            throw F60.createAndThrow();
                        }
                        A09(i5);
                        StringBuilder sbA0p = BV4.A0p(i5);
                        ArrayList<char[]> arrayList = this.A05;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                char[] cArr2 = this.A05.get(i6);
                                sbA0p.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sbA0p.append(this.A07, 0, this.A00);
                        string = sbA0p.toString();
                    } else if (i4 != 0) {
                        A09(i4);
                        string = new String(this.A07, 0, i4);
                    }
                }
            }
            this.A04 = string;
        }
        return string;
    }

    public final void A09(int i) throws StreamConstraintsException {
        int i2;
        if (!(this instanceof C10093GpH) || i <= (i2 = ((C10093GpH) this).A00._maxStringLen)) {
            return;
        }
        C10002GnY.A00("String value length (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Integer.valueOf(i), Integer.valueOf(i2), "getMaxStringLength"));
        throw F60.createAndThrow();
    }

    public final void A0A(String str, int i, int i2) throws StreamConstraintsException {
        if (this.A02 >= 0) {
            A03(this, i2);
        }
        this.A04 = null;
        this.A09 = null;
        char[] cArr = this.A07;
        int length = cArr.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.A00 += i2;
            return;
        }
        int i5 = this.A03 + i3 + i2;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        A09(i5);
        if (i4 > 0) {
            int i6 = i + i4;
            str.getChars(i, i6, cArr, i3);
            i2 -= i4;
            i = i6;
        }
        while (true) {
            A02(this);
            char[] cArr2 = this.A07;
            int iMin = Math.min(cArr2.length, i2);
            int i7 = i + iMin;
            str.getChars(i, i7, cArr2, 0);
            this.A00 += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i7;
            }
        }
    }

    public final void A0B(char[] cArr, int i, int i2) throws StreamConstraintsException {
        if (this.A02 >= 0) {
            A03(this, i2);
        }
        this.A04 = null;
        this.A09 = null;
        char[] cArr2 = this.A07;
        int length = cArr2.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.A00 += i2;
            return;
        }
        int i5 = this.A03 + i3 + i2;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        A09(i5);
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            A02(this);
            char[] cArr3 = this.A07;
            int iMin = Math.min(cArr3.length, i2);
            System.arraycopy(cArr, i, cArr3, 0, iMin);
            this.A00 += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final char[] A0D() {
        int i;
        char[] cArrCopyOf = this.A09;
        if (cArrCopyOf == null) {
            String str = this.A04;
            if (str != null) {
                cArrCopyOf = str.toCharArray();
            } else {
                int i2 = this.A02;
                if (i2 >= 0) {
                    int i3 = this.A01;
                    if (i3 >= 1) {
                        A09(i3);
                        char[] cArr = this.A08;
                        cArrCopyOf = i2 == 0 ? Arrays.copyOf(cArr, i3) : Arrays.copyOfRange(cArr, i2, i3 + i2);
                    } else {
                        cArrCopyOf = A0B;
                    }
                } else {
                    int iA05 = A05();
                    if (iA05 < 1) {
                        if (iA05 < 0) {
                            A00(this.A03, this.A00);
                            throw F60.createAndThrow();
                        }
                        cArrCopyOf = A0B;
                    } else {
                        A09(iA05);
                        cArrCopyOf = new char[iA05];
                        ArrayList<char[]> arrayList = this.A05;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i4 = 0; i4 < size; i4++) {
                                char[] cArr2 = this.A05.get(i4);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArrCopyOf, i, length);
                                i += length;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.A07, 0, cArrCopyOf, i, this.A00);
                    }
                }
            }
            this.A09 = cArrCopyOf;
        }
        return cArrCopyOf;
    }

    public final char[] A0F() {
        ArrayList<char[]> arrayListA0h = this.A05;
        if (arrayListA0h == null) {
            arrayListA0h = C3cG.A0h();
            this.A05 = arrayListA0h;
        }
        this.A06 = true;
        char[] cArr = this.A07;
        arrayListA0h.add(cArr);
        int length = cArr.length;
        int i = this.A03 + length;
        this.A03 = i;
        if (i < 0) {
            A00(i - length, length);
            throw F60.createAndThrow();
        }
        this.A00 = 0;
        A09(i);
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        char[] cArr2 = new char[i2];
        this.A07 = cArr2;
        return cArr2;
    }

    public final char[] A0G() {
        if (this.A02 >= 0) {
            A03(this, 1);
        } else {
            char[] cArr = this.A07;
            if (cArr == null) {
                this.A07 = A04(this, 0);
            } else if (this.A00 >= cArr.length) {
                A02(this);
            }
        }
        return this.A07;
    }

    public final char[] A0H() {
        if (this.A02 >= 0) {
            return this.A08;
        }
        char[] cArr = this.A09;
        if (cArr != null) {
            return cArr;
        }
        String str = this.A04;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.A09 = charArray;
            return charArray;
        }
        if (this.A06) {
            return A0D();
        }
        char[] cArr2 = this.A07;
        return cArr2 == null ? A0B : cArr2;
    }

    public Gn2(HjR hjR) {
        this.A0A = hjR;
    }

    public final String toString() {
        try {
            return A07();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }
}
