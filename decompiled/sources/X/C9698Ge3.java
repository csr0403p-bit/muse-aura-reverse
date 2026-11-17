package X;

/* renamed from: X.Ge3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9698Ge3 extends C06G {
    public Hoz A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final Hs8 A05;
    public final C10546Hrb A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9698Ge3) {
                C9698Ge3 c9698Ge3 = (C9698Ge3) obj;
                if (!C7384Etj.areEqual(this.A07, c9698Ge3.A07) || this.A05 != c9698Ge3.A05 || !C7384Etj.areEqual(this.A01, c9698Ge3.A01) || !C7384Etj.areEqual(this.A08, c9698Ge3.A08) || !C7384Etj.areEqual(this.A06, c9698Ge3.A06) || !C7384Etj.areEqual(this.A00, c9698Ge3.A00) || !C7384Etj.areEqual(this.A02, c9698Ge3.A02) || !C7384Etj.areEqual(this.A03, c9698Ge3.A03) || !C7384Etj.areEqual(this.A09, c9698Ge3.A09) || !C7384Etj.areEqual(this.A04, c9698Ge3.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0I(this.A09, (((((((((((((AnonymousClass005.A0F(this.A05, AnonymousClass001.A0G(this.A07)) + AnonymousClass006.A0G(this.A01)) * 31) + AnonymousClass006.A0G(this.A08)) * 31 * 31) + 1237) * 31 * 31) + AnonymousClass006.A0D(this.A06)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass006.A0G(this.A03)) * 31) + AnonymousClass005.A0H(this.A04);
    }

    public final String toString() {
        String str = this.A07;
        Hs8 hs8 = this.A05;
        String str2 = this.A01;
        String str3 = this.A08;
        C10546Hrb c10546Hrb = this.A06;
        Hoz hoz = this.A00;
        String str4 = this.A02;
        String str5 = this.A03;
        String str6 = this.A09;
        String str7 = this.A04;
        StringBuilder sbA0x = C3cI.A0x("DcpPurchaseParams(itemSku=", str);
        sbA0x.append(", purchaseType=");
        sbA0x.append(hs8);
        sbA0x.append(", developerPayload=");
        sbA0x.append(str2);
        sbA0x.append(", productID=");
        sbA0x.append(str3);
        sbA0x.append(", nullableMetadata=");
        sbA0x.append((Object) null);
        sbA0x.append(", testPaymentEnabled=");
        sbA0x.append(false);
        sbA0x.append(", surfaceID=");
        sbA0x.append((String) null);
        sbA0x.append(", dcpOfferParams=");
        sbA0x.append(c10546Hrb);
        sbA0x.append(BV3.A00(17));
        sbA0x.append(hoz);
        sbA0x.append(", purchaseFunnelId=");
        sbA0x.append(str4);
        sbA0x.append(", quoteUuid=");
        sbA0x.append(str5);
        sbA0x.append(C8j2.A00(40));
        sbA0x.append(str6);
        return C3cJ.A0N(", requestSessionId=", str7, sbA0x);
    }

    public C9698Ge3(Hs8 hs8, C10546Hrb c10546Hrb, Hoz hoz, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass003.A0u(str, hs8);
        C7384Etj.A0Y(str6, 11);
        this.A07 = str;
        this.A05 = hs8;
        this.A01 = str2;
        this.A08 = str3;
        this.A06 = c10546Hrb;
        this.A00 = hoz;
        this.A02 = str4;
        this.A03 = str5;
        this.A09 = str6;
        this.A04 = str7;
    }
}
