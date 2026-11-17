package X;

/* renamed from: X.HCt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10369HCt {
    public final int A00;
    public final int A01;
    public final GQ1 A02;
    public final Integer A03;
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
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10369HCt) {
                C10369HCt c10369HCt = (C10369HCt) obj;
                if (this.A00 != c10369HCt.A00 || this.A0G != c10369HCt.A0G || !C7384Etj.areEqual(this.A0A, c10369HCt.A0A) || !C7384Etj.areEqual(this.A0B, c10369HCt.A0B) || !C7384Etj.areEqual(this.A08, c10369HCt.A08) || !C7384Etj.areEqual(this.A09, c10369HCt.A09) || !C7384Etj.areEqual(this.A04, c10369HCt.A04) || !C7384Etj.areEqual(this.A05, c10369HCt.A05) || !C7384Etj.areEqual(this.A0C, c10369HCt.A0C) || !C7384Etj.areEqual(this.A0D, c10369HCt.A0D) || !C7384Etj.areEqual(this.A06, c10369HCt.A06) || !C7384Etj.areEqual(this.A07, c10369HCt.A07) || this.A01 != c10369HCt.A01 || this.A0H != c10369HCt.A0H || !C7384Etj.areEqual(this.A02, c10369HCt.A02) || !C7384Etj.areEqual(this.A0E, c10369HCt.A0E) || !C7384Etj.areEqual(this.A0F, c10369HCt.A0F) || !C7384Etj.areEqual(this.A03, c10369HCt.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C0KA.A01((((((((((((((((((((((C0KA.A01(this.A00 * 31, this.A0G) + AnonymousClass006.A0G(this.A0A)) * 31) + AnonymousClass006.A0G(this.A0B)) * 31) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass006.A0G(this.A09)) * 31) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0G(this.A0C)) * 31) + AnonymousClass006.A0G(this.A0D)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + this.A01) * 31, this.A0H) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0G(this.A0E)) * 31) + AnonymousClass006.A0G(this.A0F)) * 31) + AnonymousClass006.A0D(this.A03)) * 31;
    }

    public final String toString() {
        int i = this.A00;
        boolean z = this.A0G;
        String str = this.A0A;
        String str2 = this.A0B;
        String str3 = this.A08;
        String str4 = this.A09;
        String str5 = this.A04;
        String str6 = this.A05;
        String str7 = this.A0C;
        String str8 = this.A0D;
        String str9 = this.A06;
        String str10 = this.A07;
        int i2 = this.A01;
        boolean z2 = this.A0H;
        GQ1 gq1 = this.A02;
        String str11 = this.A0E;
        String str12 = this.A0F;
        Integer num = this.A03;
        StringBuilder sbA0y = C60O.A0y("NetworkHandlerBeginLoginResponse(attemptsRemainingValue=", i);
        sbA0y.append(", attemptsRemainingIsNonNull=");
        sbA0y.append(z);
        sbA0y.append(", base64urlEncodedOpaqueL2=");
        sbA0y.append(str);
        sbA0y.append(", base64urlEncodedOpaqueL2Sig=");
        sbA0y.append(str2);
        sbA0y.append(", base64urlEncodedIslandRsaPub=");
        sbA0y.append(str3);
        AbstractC7611F5y.A0w(str4, str5, str6, str7, sbA0y);
        sbA0y.append(str8);
        sbA0y.append(", base64urlEncodedIslandHpkeEncPub=");
        sbA0y.append(str9);
        sbA0y.append(", base64urlEncodedIslandHpkeEncPubSignature=");
        sbA0y.append(str10);
        sbA0y.append(", loginTimeoutRemainingSecsValue=");
        sbA0y.append(i2);
        sbA0y.append(", loginTimeoutRemainingSecsIsNonNull=");
        sbA0y.append(z2);
        sbA0y.append(", vestaFleetKeyListBundle=");
        sbA0y.append(gq1);
        sbA0y.append(", fleetName=");
        sbA0y.append(str11);
        sbA0y.append(", islandName=");
        sbA0y.append(str12);
        sbA0y.append(", protocolVersion=");
        sbA0y.append(num);
        return C3cJ.A0L(null, ", supportedPqWrapSchemes=", sbA0y);
    }

    public C10369HCt(GQ1 gq1, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A0G = z;
        this.A0A = str;
        this.A0B = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A06 = str9;
        this.A07 = str10;
        this.A01 = i2;
        this.A0H = z2;
        this.A02 = gq1;
        this.A0E = str11;
        this.A0F = str12;
        this.A03 = num;
    }
}
