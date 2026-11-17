package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelInstallmentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;
    public final String label;

    public final class Companion {
        public final C9hr<HotelInstallmentJson> serializer() {
            return HotelInstallmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelInstallmentJson hotelInstallmentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hotelInstallmentJson.label)) {
            c9j5.AAV(hotelInstallmentJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(hotelInstallmentJson.amount)) {
            c9j5.AAV(hotelInstallmentJson.amount, c9iZ, 1);
        }
        if (zAfR || !"".equals(hotelInstallmentJson.currency)) {
            c9j5.AAV(hotelInstallmentJson.currency, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelInstallmentJson) {
                HotelInstallmentJson hotelInstallmentJson = (HotelInstallmentJson) obj;
                if (!C7384Etj.areEqual(this.label, hotelInstallmentJson.label) || !C7384Etj.areEqual(this.amount, hotelInstallmentJson.amount) || !C7384Etj.areEqual(this.currency, hotelInstallmentJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelInstallmentJson copy$default(HotelInstallmentJson hotelInstallmentJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelInstallmentJson.label;
        }
        if ((i & 2) != 0) {
            str2 = hotelInstallmentJson.amount;
        }
        if ((i & 4) != 0) {
            str3 = hotelInstallmentJson.currency;
        }
        return hotelInstallmentJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, AnonymousClass005.A0I(this.amount, AnonymousClass001.A0G(this.label)));
    }

    public final HotelInstallment toDomain() {
        HotelMoney domain;
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(this.label);
        if (strHotelNonBlank == null || (domain = new HotelMoneyJson(this.amount, this.currency).toDomain()) == null) {
            return null;
        }
        return new HotelInstallment(strHotelNonBlank, domain);
    }

    public HotelInstallmentJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.label = str;
        this.amount = str2;
        this.currency = str3;
    }

    public final HotelInstallmentJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HotelInstallmentJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelInstallmentJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.amount = "";
        } else {
            this.amount = str2;
        }
        if ((i & 4) == 0) {
            this.currency = "";
        } else {
            this.currency = str3;
        }
    }

    public /* synthetic */ HotelInstallmentJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public HotelInstallmentJson() {
        this("", "", "");
    }
}
