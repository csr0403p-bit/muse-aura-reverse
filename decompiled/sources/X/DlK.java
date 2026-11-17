package X;

/* loaded from: classes5.dex */
public final class DlK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DlK) {
                DlK dlK = (DlK) obj;
                if (!C6xC.A00(this.A04, dlK.A04) || !C6xC.A00(this.A03, dlK.A03) || !C6xC.A00(this.A00, dlK.A00) || !C6xC.A00(this.A02, dlK.A02) || !C6xC.A00(this.A01, dlK.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0I = (((((((527 + BV7.A0I(this.A04)) * 31) + BV7.A0I(this.A03)) * 31) + BV7.A0I(this.A00)) * 31) + BV7.A0I(this.A02)) * 31;
        String str = this.A01;
        return iA0I + (str != null ? str.hashCode() : 0);
    }

    public DlK(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A02 = str4;
        this.A01 = str5;
    }
}
