package X;

/* loaded from: classes6.dex */
public final class HmS extends C06G {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HmS) {
                HmS hmS = (HmS) obj;
                if (!C7384Etj.areEqual(this.A01, hmS.A01) || !C7384Etj.areEqual(this.A00, hmS.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public final String toString() {
        return FGI.A0c("GraphQLSubscriptionOffer(offerId=", this.A01, ", externalOfferId=", this.A00);
    }

    public HmS(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
