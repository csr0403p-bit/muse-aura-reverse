package X;

/* renamed from: X.9sW, reason: invalid class name */
/* loaded from: classes4.dex */
public class C9sW extends C9sS {
    public final String A00;

    public C9sW(String str) {
        C7384Etj.A0Y(str, 0);
        this.A00 = str;
    }

    @Override // X.C9sS
    public byte A05() {
        String str = this.A00;
        int i = super.A00;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                super.A00 = i2;
                return C9t0.A00(cCharAt);
            }
            i = i2;
        }
        super.A00 = str.length();
        return (byte) 10;
    }

    @Override // X.C9sS
    public int A07() {
        char cCharAt;
        int i = super.A00;
        if (i != -1) {
            String str = this.A00;
            while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                i++;
            }
            super.A00 = i;
        }
        return i;
    }

    @Override // X.C9sS
    public final int A08(int i) {
        if (i >= this.A00.length()) {
            return -1;
        }
        return i;
    }

    @Override // X.C9sS
    public final /* bridge */ /* synthetic */ CharSequence A0A() {
        return this.A00;
    }

    @Override // X.C9sS
    public final String A0E() {
        A0L('\"');
        int i = super.A00;
        String str = this.A00;
        int iA08 = C7BY.A08(str, '\"', i);
        if (iA08 == -1) {
            A0C();
            int i2 = super.A00;
            CharSequence charSequenceA0A = A0A();
            A0N(FGI.A0h("Expected ", "quotation mark '\"'", ", but had '", (i2 == charSequenceA0A.length() || i2 < 0) ? "EOF" : String.valueOf(charSequenceA0A.charAt(i2)), "' instead"), "", i2);
            throw F60.createAndThrow();
        }
        for (int i3 = i; i3 < iA08; i3++) {
            if (str.charAt(i3) == '\\') {
                return A0G(str, super.A00, i3);
            }
        }
        super.A00 = iA08 + 1;
        return str.substring(i, iA08);
    }

    @Override // X.C9sS
    public void A0L(char c) {
        int i = super.A00;
        if (i != -1) {
            String str = this.A00;
            while (true) {
                if (i >= str.length()) {
                    super.A00 = -1;
                    break;
                }
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                    i = i2;
                } else {
                    super.A00 = i2;
                    if (cCharAt == c) {
                        return;
                    }
                }
            }
        }
        A0K(c);
        throw F60.createAndThrow();
    }

    @Override // X.C9sS
    public boolean A0P() {
        int i = super.A00;
        if (i != -1) {
            String str = this.A00;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    super.A00 = i;
                    return C9sS.A03(cCharAt);
                }
                i++;
            }
            super.A00 = i;
        }
        return false;
    }
}
