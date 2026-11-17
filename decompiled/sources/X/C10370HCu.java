package X;

/* renamed from: X.HCu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10370HCu {
    public final GQ1 A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10370HCu) {
                C10370HCu c10370HCu = (C10370HCu) obj;
                if (!C7384Etj.areEqual(this.A0B, c10370HCu.A0B) || !C7384Etj.areEqual(this.A0C, c10370HCu.A0C) || !C7384Etj.areEqual(this.A08, c10370HCu.A08) || !C7384Etj.areEqual(this.A06, c10370HCu.A06) || !C7384Etj.areEqual(this.A07, c10370HCu.A07) || !C7384Etj.areEqual(this.A02, c10370HCu.A02) || !C7384Etj.areEqual(this.A03, c10370HCu.A03) || !C7384Etj.areEqual(this.A09, c10370HCu.A09) || !C7384Etj.areEqual(this.A0A, c10370HCu.A0A) || !C7384Etj.areEqual(this.A00, c10370HCu.A00) || !C7384Etj.areEqual(this.A0D, c10370HCu.A0D) || !C7384Etj.areEqual(this.A0E, c10370HCu.A0E) || !C7384Etj.areEqual(this.A01, c10370HCu.A01) || !C7384Etj.areEqual(this.A04, c10370HCu.A04) || !C7384Etj.areEqual(this.A05, c10370HCu.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((AnonymousClass006.A0G(this.A0B) * 31) + AnonymousClass006.A0G(this.A0C)) * 31) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass006.A0G(this.A03)) * 31) + AnonymousClass006.A0G(this.A09)) * 31) + AnonymousClass006.A0G(this.A0A)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0G(this.A0D)) * 31) + AnonymousClass006.A0G(this.A0E)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0G(this.A05)) * 31;
    }

    public final String toString() {
        String str = this.A0B;
        String str2 = this.A0C;
        String str3 = this.A08;
        String str4 = this.A06;
        String str5 = this.A07;
        String str6 = this.A02;
        String str7 = this.A03;
        String str8 = this.A09;
        String str9 = this.A0A;
        GQ1 gq1 = this.A00;
        String str10 = this.A0D;
        String str11 = this.A0E;
        Integer num = this.A01;
        String str12 = this.A04;
        String str13 = this.A05;
        StringBuilder sbA0x = C3cI.A0x("NetworkHandlerBeginRegisterResponse(base64urlEncodedOpaqueR2=", str);
        sbA0x.append(", base64urlEncodedOpaqueR2Sig=");
        sbA0x.append(str2);
        sbA0x.append(", base64urlEncodedOpaqueChallenge=");
        sbA0x.append(str3);
        sbA0x.append(", base64urlEncodedIslandRsaPub=");
        sbA0x.append(str4);
        AbstractC7611F5y.A0w(str5, str6, str7, str8, sbA0x);
        sbA0x.append(str9);
        sbA0x.append(", vestaFleetKeyListBundle=");
        sbA0x.append(gq1);
        sbA0x.append(", fleetName=");
        sbA0x.append(str10);
        sbA0x.append(", islandName=");
        sbA0x.append(str11);
        sbA0x.append(", protocolVersion=");
        sbA0x.append(num);
        sbA0x.append(", base64urlEncodedIslandHpkeEncPub=");
        sbA0x.append(str12);
        sbA0x.append(", base64urlEncodedIslandHpkeEncPubSignature=");
        sbA0x.append(str13);
        return C3cJ.A0L(null, ", supportedPqWrapSchemes=", sbA0x);
    }

    public C10370HCu(GQ1 gq1, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.A0B = str;
        this.A0C = str2;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A02 = str6;
        this.A03 = str7;
        this.A09 = str8;
        this.A0A = str9;
        this.A00 = gq1;
        this.A0D = str10;
        this.A0E = str11;
        this.A01 = num;
        this.A04 = str12;
        this.A05 = str13;
    }
}
