package X;

/* loaded from: classes6.dex */
public final class Hm8 extends C06G {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hm8) {
                Hm8 hm8 = (Hm8) obj;
                if (!C7384Etj.areEqual(this.A00, hm8.A00) || !C7384Etj.areEqual(this.A01, hm8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0G(this.A00) * 31) + AnonymousClass005.A0H(this.A01);
    }

    public final String toString() {
        return FGI.A0c("IapProductDeveloperInfo(purchaseFunnelId=", this.A00, ", quoteUuid=", this.A01);
    }

    public Hm8(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
