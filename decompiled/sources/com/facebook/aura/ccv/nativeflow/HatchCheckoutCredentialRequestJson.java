package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCheckoutCredentialRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String card_first_6;
    public final String card_last_4;
    public final String country_code;
    public final String currency_code;
    public final String expiry_month;
    public final String expiry_year;
    public final String mutation_type;
    public final String order_id;
    public final String otc_session_id;
    public final String otc_type;
    public final String platform_trust_token;
    public final String product_id;
    public final String receiver_id;
    public final String session_id;
    public final String zip;

    public final class Companion {
        public final C9hr<HatchCheckoutCredentialRequestJson> serializer() {
            return HatchCheckoutCredentialRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutCredentialRequestJson hatchCheckoutCredentialRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchCheckoutCredentialRequestJson.session_id, c9iZ, 0);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.mutation_type, c9iZ, 1);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.platform_trust_token, c9iZ, 2);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.order_id, c9iZ, 3);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.amount, c9iZ, 4);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.currency_code, c9iZ, 5);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.product_id, c9iZ, 6);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.receiver_id, c9iZ, 7);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.card_first_6, c9iZ, 8);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.card_last_4, c9iZ, 9);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.expiry_month, c9iZ, 10);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.expiry_year, c9iZ, 11);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.zip, c9iZ, 12);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.country_code, c9iZ, 13);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.otc_session_id, c9iZ, 14);
        c9j5.AAV(hatchCheckoutCredentialRequestJson.otc_type, c9iZ, 15);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutCredentialRequestJson) {
                HatchCheckoutCredentialRequestJson hatchCheckoutCredentialRequestJson = (HatchCheckoutCredentialRequestJson) obj;
                if (!C7384Etj.areEqual(this.session_id, hatchCheckoutCredentialRequestJson.session_id) || !C7384Etj.areEqual(this.mutation_type, hatchCheckoutCredentialRequestJson.mutation_type) || !C7384Etj.areEqual(this.platform_trust_token, hatchCheckoutCredentialRequestJson.platform_trust_token) || !C7384Etj.areEqual(this.order_id, hatchCheckoutCredentialRequestJson.order_id) || !C7384Etj.areEqual(this.amount, hatchCheckoutCredentialRequestJson.amount) || !C7384Etj.areEqual(this.currency_code, hatchCheckoutCredentialRequestJson.currency_code) || !C7384Etj.areEqual(this.product_id, hatchCheckoutCredentialRequestJson.product_id) || !C7384Etj.areEqual(this.receiver_id, hatchCheckoutCredentialRequestJson.receiver_id) || !C7384Etj.areEqual(this.card_first_6, hatchCheckoutCredentialRequestJson.card_first_6) || !C7384Etj.areEqual(this.card_last_4, hatchCheckoutCredentialRequestJson.card_last_4) || !C7384Etj.areEqual(this.expiry_month, hatchCheckoutCredentialRequestJson.expiry_month) || !C7384Etj.areEqual(this.expiry_year, hatchCheckoutCredentialRequestJson.expiry_year) || !C7384Etj.areEqual(this.zip, hatchCheckoutCredentialRequestJson.zip) || !C7384Etj.areEqual(this.country_code, hatchCheckoutCredentialRequestJson.country_code) || !C7384Etj.areEqual(this.otc_session_id, hatchCheckoutCredentialRequestJson.otc_session_id) || !C7384Etj.areEqual(this.otc_type, hatchCheckoutCredentialRequestJson.otc_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.session_id;
    }

    public final String component10() {
        return this.card_last_4;
    }

    public final String component11() {
        return this.expiry_month;
    }

    public final String component12() {
        return this.expiry_year;
    }

    public final String component13() {
        return this.zip;
    }

    public final String component14() {
        return this.country_code;
    }

    public final String component15() {
        return this.otc_session_id;
    }

    public final String component16() {
        return this.otc_type;
    }

    public final String component2() {
        return this.mutation_type;
    }

    public final String component3() {
        return this.platform_trust_token;
    }

    public final String component4() {
        return this.order_id;
    }

    public final String component5() {
        return this.amount;
    }

    public final String component6() {
        return this.currency_code;
    }

    public final String component7() {
        return this.product_id;
    }

    public final String component8() {
        return this.receiver_id;
    }

    public final String component9() {
        return this.card_first_6;
    }

    public final HatchCheckoutCredentialRequestJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        AnonymousClass002.A1F(str9, 8, str10);
        AnonymousClass005.A18(str11, str12, str13, str14, str15);
        C7384Etj.A0Y(str16, 15);
        return new HatchCheckoutCredentialRequestJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCard_first_6() {
        return this.card_first_6;
    }

    public final String getCard_last_4() {
        return this.card_last_4;
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final String getCurrency_code() {
        return this.currency_code;
    }

    public final String getExpiry_month() {
        return this.expiry_month;
    }

    public final String getExpiry_year() {
        return this.expiry_year;
    }

    public final String getMutation_type() {
        return this.mutation_type;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getOtc_session_id() {
        return this.otc_session_id;
    }

    public final String getOtc_type() {
        return this.otc_type;
    }

    public final String getPlatform_trust_token() {
        return this.platform_trust_token;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getReceiver_id() {
        return this.receiver_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.otc_type, AnonymousClass005.A0I(this.otc_session_id, AnonymousClass005.A0I(this.country_code, AnonymousClass005.A0I(this.zip, AnonymousClass005.A0I(this.expiry_year, AnonymousClass005.A0I(this.expiry_month, AnonymousClass005.A0I(this.card_last_4, AnonymousClass005.A0I(this.card_first_6, AnonymousClass005.A0I(this.receiver_id, AnonymousClass005.A0I(this.product_id, AnonymousClass005.A0I(this.currency_code, AnonymousClass005.A0I(this.amount, AnonymousClass005.A0I(this.order_id, AnonymousClass005.A0I(this.platform_trust_token, AnonymousClass005.A0I(this.mutation_type, AnonymousClass001.A0G(this.session_id))))))))))))))));
    }

    public /* synthetic */ HatchCheckoutCredentialRequestJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, C2hx c2hx) {
        if (65535 != (i & 65535)) {
            C9iI.A00(HatchCheckoutCredentialRequestJson$$serializer.descriptor, i, 65535);
            throw F60.createAndThrow();
        }
        this.session_id = str;
        this.mutation_type = str2;
        this.platform_trust_token = str3;
        this.order_id = str4;
        this.amount = str5;
        this.currency_code = str6;
        this.product_id = str7;
        this.receiver_id = str8;
        this.card_first_6 = str9;
        this.card_last_4 = str10;
        this.expiry_month = str11;
        this.expiry_year = str12;
        this.zip = str13;
        this.country_code = str14;
        this.otc_session_id = str15;
        this.otc_type = str16;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ HatchCheckoutCredentialRequestJson copy$default(HatchCheckoutCredentialRequestJson hatchCheckoutCredentialRequestJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        String str31 = str15;
        String str32 = str16;
        if ((i & 1) != 0) {
            str17 = hatchCheckoutCredentialRequestJson.session_id;
        }
        if ((i & 2) != 0) {
            str18 = hatchCheckoutCredentialRequestJson.mutation_type;
        }
        if ((i & 4) != 0) {
            str19 = hatchCheckoutCredentialRequestJson.platform_trust_token;
        }
        if ((i & 8) != 0) {
            str20 = hatchCheckoutCredentialRequestJson.order_id;
        }
        if ((i & 16) != 0) {
            str21 = hatchCheckoutCredentialRequestJson.amount;
        }
        if ((i & 32) != 0) {
            str22 = hatchCheckoutCredentialRequestJson.currency_code;
        }
        if ((i & 64) != 0) {
            str23 = hatchCheckoutCredentialRequestJson.product_id;
        }
        if ((i & 128) != 0) {
            str24 = hatchCheckoutCredentialRequestJson.receiver_id;
        }
        if ((i & 256) != 0) {
            str25 = hatchCheckoutCredentialRequestJson.card_first_6;
        }
        if ((i & 512) != 0) {
            str26 = hatchCheckoutCredentialRequestJson.card_last_4;
        }
        if ((i & 1024) != 0) {
            str27 = hatchCheckoutCredentialRequestJson.expiry_month;
        }
        if ((i & 2048) != 0) {
            str28 = hatchCheckoutCredentialRequestJson.expiry_year;
        }
        if ((i & 4096) != 0) {
            str29 = hatchCheckoutCredentialRequestJson.zip;
        }
        if ((i & 8192) != 0) {
            str30 = hatchCheckoutCredentialRequestJson.country_code;
        }
        if ((i & 16384) != 0) {
            str31 = hatchCheckoutCredentialRequestJson.otc_session_id;
        }
        if ((i & 32768) != 0) {
            str32 = hatchCheckoutCredentialRequestJson.otc_type;
        }
        String str33 = str20;
        return hatchCheckoutCredentialRequestJson.copy(str17, str18, str19, str33, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32);
    }

    public HatchCheckoutCredentialRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        AnonymousClass002.A1F(str9, 8, str10);
        AnonymousClass005.A18(str11, str12, str13, str14, str15);
        C7384Etj.A0Y(str16, 15);
        this.session_id = str;
        this.mutation_type = str2;
        this.platform_trust_token = str3;
        this.order_id = str4;
        this.amount = str5;
        this.currency_code = str6;
        this.product_id = str7;
        this.receiver_id = str8;
        this.card_first_6 = str9;
        this.card_last_4 = str10;
        this.expiry_month = str11;
        this.expiry_year = str12;
        this.zip = str13;
        this.country_code = str14;
        this.otc_session_id = str15;
        this.otc_type = str16;
    }
}
