package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelTaxAndFeeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;
    public final String kind;
    public final String label;

    public final class Companion {
        public final C9hr<HotelTaxAndFeeJson> serializer() {
            return HotelTaxAndFeeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelTaxAndFeeJson hotelTaxAndFeeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hotelTaxAndFeeJson.kind)) {
            c9j5.AAV(hotelTaxAndFeeJson.kind, c9iZ, 0);
        }
        if (zAfR || hotelTaxAndFeeJson.label != null) {
            c9j5.AAP(hotelTaxAndFeeJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(hotelTaxAndFeeJson.amount)) {
            c9j5.AAV(hotelTaxAndFeeJson.amount, c9iZ, 2);
        }
        if (zAfR || !"".equals(hotelTaxAndFeeJson.currency)) {
            c9j5.AAV(hotelTaxAndFeeJson.currency, c9iZ, 3);
        }
    }

    public final HotelTaxAndFeeJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A11(str, str3, str4, 0);
        return new HotelTaxAndFeeJson(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelTaxAndFeeJson) {
                HotelTaxAndFeeJson hotelTaxAndFeeJson = (HotelTaxAndFeeJson) obj;
                if (!C7384Etj.areEqual(this.kind, hotelTaxAndFeeJson.kind) || !C7384Etj.areEqual(this.label, hotelTaxAndFeeJson.label) || !C7384Etj.areEqual(this.amount, hotelTaxAndFeeJson.amount) || !C7384Etj.areEqual(this.currency, hotelTaxAndFeeJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelTaxAndFeeJson copy$default(HotelTaxAndFeeJson hotelTaxAndFeeJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelTaxAndFeeJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = hotelTaxAndFeeJson.label;
        }
        if ((i & 4) != 0) {
            str3 = hotelTaxAndFeeJson.amount;
        }
        if ((i & 8) != 0) {
            str4 = hotelTaxAndFeeJson.currency;
        }
        return hotelTaxAndFeeJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, AnonymousClass005.A0I(this.amount, (AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.label)) * 31));
    }

    public final HotelFee toDomain() {
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(this.label);
        boolean zEquals = HotelBookingModelsJsonKt.MANDATORY_PROPERTY_FEES_KIND.equals(AnonymousClass002.A0l(this.kind));
        boolean zEquals2 = HotelBookingModelsJsonKt.TAXES_AND_FEES_KIND.equals(AnonymousClass002.A0l(this.kind));
        HotelMoney domain = new HotelMoneyJson(this.amount, this.currency).toDomain();
        if (domain == null) {
            return null;
        }
        return new HotelFee(strHotelNonBlank, zEquals, zEquals2, domain);
    }

    public /* synthetic */ HotelTaxAndFeeJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.amount = "";
        } else {
            this.amount = str3;
        }
        if ((i & 8) == 0) {
            this.currency = "";
        } else {
            this.currency = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HotelTaxAndFeeJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A11(str, str3, str4, 0);
        this.kind = str;
        this.label = str2;
        this.amount = str3;
        this.currency = str4;
    }

    public /* synthetic */ HotelTaxAndFeeJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass006.A0s(i, str2), (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public HotelTaxAndFeeJson() {
        this("", null, "", "");
    }
}
