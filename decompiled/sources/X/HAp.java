package X;

import java.util.Locale;

/* loaded from: classes6.dex */
public class HAp {
    public int A00;
    public int A01 = 0;
    public HAv A02 = new HAv();
    public String A03;

    public static final String A03(HAp hAp, char c, boolean z) {
        if (!AnonymousClass002.A1Q(hAp.A01, hAp.A00)) {
            String str = hAp.A03;
            char cCharAt = str.charAt(hAp.A01);
            if ((z || !A04(cCharAt)) && cCharAt != c) {
                int i = hAp.A01;
                while (true) {
                    int iA08 = hAp.A08();
                    if (iA08 == -1 || iA08 == c || (!z && A04(iA08))) {
                        break;
                    }
                }
                return str.substring(i, hAp.A01);
            }
        }
        return null;
    }

    public static final boolean A04(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final float A05() {
        HAv hAv = this.A02;
        float fA00 = hAv.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(fA00)) {
            this.A01 = hAv.A00;
        }
        return fA00;
    }

    public final int A08() {
        int i = this.A01;
        int i2 = this.A00;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.A01 = i3;
        if (i3 < i2) {
            return this.A03.charAt(i3);
        }
        return -1;
    }

    public final Boolean A0A(Object obj) {
        if (obj == null) {
            return null;
        }
        A0F();
        int i = this.A01;
        if (i == this.A00) {
            return null;
        }
        char cCharAt = this.A03.charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.A01++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public final Integer A0B() {
        int i = this.A01;
        if (i == this.A00) {
            return null;
        }
        String str = this.A03;
        this.A01 = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public final Integer A0C() {
        if (!AnonymousClass002.A1Q(this.A01, this.A00)) {
            String str = this.A03;
            char cCharAt = str.charAt(this.A01);
            int i = this.A01;
            if (cCharAt == '%') {
                this.A01 = i + 1;
                return C79.A0Z;
            }
            if (i <= this.A00 - 2) {
                try {
                    Integer numA00 = HiI.A00(str.substring(i, i + 2).toLowerCase(Locale.US));
                    this.A01 += 2;
                    return numA00;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String A0D() {
        int i;
        String str;
        char cCharAt;
        int iA08;
        if (AnonymousClass002.A1Q(this.A01, this.A00) || !((cCharAt = (str = this.A03).charAt((i = this.A01))) == '\'' || cCharAt == '\"')) {
            return null;
        }
        do {
            iA08 = A08();
            if (iA08 == -1) {
                this.A01 = i;
                return null;
            }
        } while (iA08 != cCharAt);
        int i2 = this.A01;
        this.A01 = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public final void A0E() {
        while (true) {
            int i = this.A01;
            if (i >= this.A00 || !A04(this.A03.charAt(i))) {
                return;
            } else {
                this.A01++;
            }
        }
    }

    public final boolean A0G(char c) {
        int i = this.A01;
        if (i >= this.A00 || this.A03.charAt(i) != c) {
            return false;
        }
        this.A01++;
        return true;
    }

    public HAp(String str) {
        String strTrim = str.trim();
        this.A03 = strTrim;
        this.A00 = strTrim.length();
    }

    public final float A06() {
        A0F();
        HAv hAv = this.A02;
        float fA00 = hAv.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(fA00)) {
            this.A01 = hAv.A00;
        }
        return fA00;
    }

    public final float A07(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        A0F();
        return A05();
    }

    public final HBD A09() {
        float fA05 = A05();
        if (Float.isNaN(fA05)) {
            return null;
        }
        Integer numA0C = A0C();
        if (numA0C == null) {
            numA0C = C79.A00;
        }
        return new HBD(numA0C, fA05);
    }

    public final boolean A0F() {
        A0E();
        int i = this.A01;
        if (i == this.A00 || this.A03.charAt(i) != ',') {
            return false;
        }
        this.A01++;
        A0E();
        return true;
    }

    public final boolean A0H(String str) {
        int length = str.length();
        int i = this.A01;
        if (i > this.A00 - length || !this.A03.substring(i, i + length).equals(str)) {
            return false;
        }
        this.A01 += length;
        return true;
    }
}
