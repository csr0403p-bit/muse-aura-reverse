package X;

/* loaded from: classes6.dex */
public final class GPR extends C06G {
    public final C10511HoF A00;
    public final C10490Hlu A01;
    public final HoX A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HoX A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPR) {
                GPR gpr = (GPR) obj;
                if (!C7384Etj.areEqual(this.A04, gpr.A04) || !C7384Etj.areEqual(this.A03, gpr.A03) || !C7384Etj.areEqual(this.A01, gpr.A01) || !C7384Etj.areEqual(this.A05, gpr.A05) || !C7384Etj.areEqual(this.A06, gpr.A06) || !C7384Etj.areEqual(this.A00, gpr.A00) || !C7384Etj.areEqual(this.A02, gpr.A02) || !C7384Etj.areEqual(this.A07, gpr.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0F(this.A00, (((((AnonymousClass005.A0I(this.A03, AnonymousClass001.A0G(this.A04)) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + C3cH.A02(this.A07);
    }

    public final String toString() {
        String str = this.A04;
        String str2 = this.A03;
        C10490Hlu c10490Hlu = this.A01;
        String str3 = this.A05;
        String str4 = this.A06;
        C10511HoF c10511HoF = this.A00;
        HoX hoX = this.A02;
        HoX hoX2 = this.A07;
        StringBuilder sbA0x = C3cI.A0x("GraphQLProductInfo(productId=", str);
        sbA0x.append(", externalProductId=");
        sbA0x.append(str2);
        sbA0x.append(", offers=");
        sbA0x.append(c10490Hlu);
        sbA0x.append(", purchaseFunnelId=");
        sbA0x.append(str3);
        sbA0x.append(", quoteUuid=");
        sbA0x.append(str4);
        sbA0x.append(", externalSkuDetails=");
        sbA0x.append(c10511HoF);
        sbA0x.append(", localItemPrice=");
        sbA0x.append(hoX);
        return C3cJ.A0L(hoX2, ", usdItemPrice=", sbA0x);
    }

    public GPR(C10511HoF c10511HoF, C10490Hlu c10490Hlu, HoX hoX, HoX hoX2, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A03 = str2;
        this.A01 = c10490Hlu;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = c10511HoF;
        this.A02 = hoX;
        this.A07 = hoX2;
    }
}
