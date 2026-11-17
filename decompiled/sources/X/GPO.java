package X;

/* loaded from: classes6.dex */
public final class GPO extends C06G {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPO) {
                GPO gpo = (GPO) obj;
                if (!C7384Etj.areEqual(this.A05, gpo.A05) || this.A01 != gpo.A01 || this.A00 != gpo.A00 || this.A02 != gpo.A02 || !C7384Etj.areEqual(this.A03, gpo.A03) || !C7384Etj.areEqual(this.A04, gpo.A04) || !C7384Etj.areEqual(this.A06, gpo.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A06, (AnonymousClass005.A0I(this.A03, C60R.A00(this.A02, (((AnonymousClass001.A0G(this.A05) + this.A01) * 31) + this.A00) * 31)) + AnonymousClass006.A0G(this.A04)) * 31);
    }

    public final String toString() {
        String str = this.A05;
        int i = this.A01;
        int i2 = this.A00;
        long j = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        String str4 = this.A06;
        StringBuilder sbA0x = C3cI.A0x("DcpSubscriptionOffer(period=", str);
        sbA0x.append(", periodValue=");
        sbA0x.append(i);
        sbA0x.append(BV3.A00(19));
        sbA0x.append(i2);
        sbA0x.append(", price=");
        sbA0x.append(j);
        sbA0x.append(", formattedPrice=");
        sbA0x.append(str2);
        sbA0x.append(", offerId=");
        sbA0x.append(str3);
        return C3cJ.A0N(", offerToken=", str4, sbA0x);
    }

    public GPO(String str, String str2, String str3, String str4, int i, int i2, long j) {
        this.A05 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = str4;
    }
}
