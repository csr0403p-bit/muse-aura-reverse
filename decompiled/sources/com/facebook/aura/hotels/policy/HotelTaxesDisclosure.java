package com.facebook.aura.hotels.policy;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public final class HotelTaxesDisclosure {
    public static final int $stable = 0;
    public final String termsUrl;
    public final String text;
    public final String title;

    public HotelTaxesDisclosure(String str, String str2, String str3) {
        C7384Etj.A0Y(str2, 1);
        this.title = str;
        this.text = str2;
        this.termsUrl = str3;
    }

    public final HotelTaxesDisclosure copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str2, 1);
        return new HotelTaxesDisclosure(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelTaxesDisclosure) {
                HotelTaxesDisclosure hotelTaxesDisclosure = (HotelTaxesDisclosure) obj;
                if (!C7384Etj.areEqual(this.title, hotelTaxesDisclosure.title) || !C7384Etj.areEqual(this.text, hotelTaxesDisclosure.text) || !C7384Etj.areEqual(this.termsUrl, hotelTaxesDisclosure.termsUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelTaxesDisclosure copy$default(HotelTaxesDisclosure hotelTaxesDisclosure, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelTaxesDisclosure.title;
        }
        if ((i & 2) != 0) {
            str2 = hotelTaxesDisclosure.text;
        }
        if ((i & 4) != 0) {
            str3 = hotelTaxesDisclosure.termsUrl;
        }
        return hotelTaxesDisclosure.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.termsUrl;
    }

    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text, AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.termsUrl);
    }

    public String toString() {
        return FGI.A0k("HotelTaxesDisclosure(title=", this.title, ", text=", this.text, ", termsUrl=", this.termsUrl, ")");
    }
}
