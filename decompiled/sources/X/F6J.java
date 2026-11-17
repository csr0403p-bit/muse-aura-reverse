package X;

/* loaded from: classes6.dex */
public final class F6J {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F6J) {
                F6J f6j = (F6J) obj;
                if (!this.A00.equals(f6j.A00) || !this.A02.equals(f6j.A02) || !this.A01.equals(f6j.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, AnonymousClass005.A0I(this.A02, AnonymousClass001.A0G(this.A00)));
    }

    public final String toString() {
        return FGI.A0k("GooglePayShippingOption(optionId=", this.A00, ", label=", this.A02, ", description=", this.A01, ")");
    }

    public F6J(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
