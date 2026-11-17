package X;

/* loaded from: classes6.dex */
public final class HoX extends C06G {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public HoX() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HoX) {
                HoX hoX = (HoX) obj;
                if (!C7384Etj.areEqual(this.A03, hoX.A03) || !C7384Etj.areEqual(this.A00, hoX.A00) || !C7384Etj.areEqual(this.A01, hoX.A01) || !C7384Etj.areEqual(this.A02, hoX.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass006.A0G(this.A03) * 31) + AnonymousClass006.A0G(this.A00)) * 31) + AnonymousClass006.A0G(this.A01)) * 31) + AnonymousClass005.A0H(this.A02);
    }

    public final String toString() {
        return FGI.A0m("GraphQLItemPrice(amount=", this.A03, ", amountWithOffset=", this.A00, ", currency=", this.A01, ", formattedAmount=", this.A02, ")");
    }

    public HoX(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }
}
