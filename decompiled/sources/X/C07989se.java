package X;

import java.nio.charset.CharacterCodingException;

/* renamed from: X.9se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C07989se extends C9sS {
    public int A00 = 128;
    public final C08109st A01;
    public final char[] A02;
    public final C9t1 A03;

    public C07989se(C9t1 c9t1, char[] cArr) throws CharacterCodingException {
        this.A03 = c9t1;
        this.A02 = cArr;
        this.A01 = new C08109st(cArr);
        A00(0);
    }

    private final void A00(int i) throws CharacterCodingException {
        C08109st c08109st = this.A01;
        char[] cArr = c08109st.A01;
        if (i != 0) {
            int i2 = super.A00;
            AnonymousClass003.A0u(cArr, cArr);
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int length = c08109st.length();
        while (true) {
            if (i == length) {
                break;
            }
            int iA00 = this.A03.A00.A00(cArr, i, length - i);
            if (iA00 == -1) {
                c08109st.A00 = Math.min(cArr.length, i);
                this.A00 = -1;
                break;
            }
            i += iA00;
        }
        super.A00 = 0;
    }

    @Override // X.C9sS
    public int A07() {
        int iA08;
        char cCharAt;
        int i = super.A00;
        while (true) {
            iA08 = A08(i);
            if (iA08 == -1 || !((cCharAt = this.A01.charAt(iA08)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i = iA08 + 1;
        }
        super.A00 = iA08;
        return iA08;
    }

    @Override // X.C9sS
    public final int A08(int i) {
        C08109st c08109st = this.A01;
        if (i < c08109st.length()) {
            return i;
        }
        super.A00 = i;
        A0I();
        return (super.A00 != 0 || c08109st.length() == 0) ? -1 : 0;
    }

    @Override // X.C9sS
    public final /* bridge */ /* synthetic */ CharSequence A0A() {
        return this.A01;
    }

    @Override // X.C9sS
    public final String A0E() {
        A0L('\"');
        int i = super.A00;
        int i2 = i;
        C08109st c08109st = this.A01;
        int length = c08109st.length();
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (c08109st.charAt(i2) == '\"') {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            for (int i3 = i; i3 < i2; i3++) {
                if (c08109st.charAt(i3) == '\\') {
                    return A0G(c08109st, i, i3);
                }
            }
            super.A00 = i2 + 1;
            return A0F(i, i2);
        }
        int iA08 = A08(i);
        if (iA08 != -1) {
            return A0G(c08109st, super.A00, iA08);
        }
        int i4 = super.A00;
        int i5 = i4 - 1;
        CharSequence charSequenceA0A = A0A();
        A0N(FGI.A0h("Expected ", "quotation mark '\"'", ", but had '", (i4 == charSequenceA0A.length() || i5 < 0) ? "EOF" : String.valueOf(charSequenceA0A.charAt(i5)), "' instead"), "", i5);
        throw F60.createAndThrow();
    }

    @Override // X.C9sS
    public final String A0F(int i, int i2) {
        C08109st c08109st = this.A01;
        char[] cArr = c08109st.A01;
        int iMin = Math.min(i2, c08109st.length());
        AH7.A03(i, iMin, cArr.length);
        return new String(cArr, i, iMin - i);
    }

    @Override // X.C9sS
    public final void A0I() throws CharacterCodingException {
        int length = this.A01.length() - super.A00;
        if (length <= this.A00) {
            A00(length);
        }
    }

    @Override // X.C9sS
    public final void A0M(int i, int i2) {
        super.A02.append(this.A01.A01, i, i2 - i);
    }

    @Override // X.C9sS
    public byte A05() {
        byte bA00;
        A0I();
        C08109st c08109st = this.A01;
        int i = super.A00;
        do {
            int iA08 = A08(i);
            if (iA08 == -1) {
                super.A00 = iA08;
                return (byte) 10;
            }
            i = iA08 + 1;
            bA00 = C9t0.A00(c08109st.charAt(iA08));
        } while (bA00 == 3);
        super.A00 = i;
        return bA00;
    }

    @Override // X.C9sS
    public void A0L(char c) {
        A0I();
        C08109st c08109st = this.A01;
        int i = super.A00;
        while (true) {
            int iA08 = A08(i);
            if (iA08 == -1) {
                super.A00 = iA08;
                break;
            }
            i = iA08 + 1;
            char cCharAt = c08109st.charAt(iA08);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                super.A00 = i;
                if (cCharAt == c) {
                    return;
                }
            }
        }
        A0K(c);
        throw F60.createAndThrow();
    }

    @Override // X.C9sS
    public boolean A0P() {
        A0I();
        int i = super.A00;
        while (true) {
            int iA08 = A08(i);
            if (iA08 == -1) {
                super.A00 = iA08;
                return false;
            }
            char cCharAt = this.A01.charAt(iA08);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                super.A00 = iA08;
                return C9sS.A03(cCharAt);
            }
            i = iA08 + 1;
        }
    }
}
