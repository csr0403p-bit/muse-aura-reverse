package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.Gd3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9661Gd3 extends C06G {
    public final C10511HoF A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9661Gd3) {
                C9661Gd3 c9661Gd3 = (C9661Gd3) obj;
                if (!C7384Etj.areEqual(this.A05, c9661Gd3.A05) || !C7384Etj.areEqual(this.A07, c9661Gd3.A07) || !C7384Etj.areEqual(this.A04, c9661Gd3.A04) || this.A01 != c9661Gd3.A01 || !C7384Etj.areEqual(this.A03, c9661Gd3.A03) || !C7384Etj.areEqual(this.A06, c9661Gd3.A06) || !C7384Etj.areEqual(this.A02, c9661Gd3.A02) || !C7384Etj.areEqual(this.A00, c9661Gd3.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0I = (AnonymousClass005.A0I(this.A07, AnonymousClass001.A0G(this.A05)) + AnonymousClass006.A0G(this.A04)) * 31;
        Integer num = this.A01;
        return ((((((((iA0I + (num == null ? 0 : BV5.A03(num, G5z.A00(num)))) * 31) + AnonymousClass006.A0G(this.A03)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + C3cH.A02(this.A00);
    }

    public final String toString() {
        String str = this.A05;
        String str2 = this.A07;
        String str3 = this.A04;
        Integer num = this.A01;
        String str4 = this.A03;
        String str5 = this.A06;
        String str6 = this.A02;
        C10511HoF c10511HoF = this.A00;
        StringBuilder sbA0x = C3cI.A0x("DcpQuoteContext(itemSku=", str);
        sbA0x.append(", quoteID=");
        sbA0x.append(str2);
        sbA0x.append(", inUseSubscriptionSku=");
        sbA0x.append(str3);
        sbA0x.append(", xGradeStrategy=");
        sbA0x.append(num != null ? G5z.A00(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", externalOfferId=");
        sbA0x.append(str4);
        sbA0x.append(", obfuscatedAccountId=");
        sbA0x.append(str5);
        sbA0x.append(", activeInuseExternalPurchaseToken=");
        sbA0x.append(str6);
        return C3cJ.A0L(c10511HoF, ", externalSkuDetails=", sbA0x);
    }

    public C9661Gd3(C10511HoF c10511HoF, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A01 = num;
        this.A03 = str4;
        this.A06 = str5;
        this.A02 = str6;
        this.A00 = c10511HoF;
    }
}
