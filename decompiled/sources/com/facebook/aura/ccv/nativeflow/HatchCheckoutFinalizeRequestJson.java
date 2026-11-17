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
public final class HatchCheckoutFinalizeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String country_code;
    public final String credential_id;
    public final String credential_type;
    public final String currency_code;
    public final String order_id;
    public final String otc_session_id;
    public final String otc_type;
    public final String pay_button_click_id;
    public final String payment_container_mode;
    public final String payment_product_id;
    public final String payment_request_id;
    public final String platform_trust_token;
    public final String receiver_id;
    public final String upl_session_id;

    public final class Companion {
        public final C9hr<HatchCheckoutFinalizeRequestJson> serializer() {
            return HatchCheckoutFinalizeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutFinalizeRequestJson hatchCheckoutFinalizeRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.order_id, c9iZ, 0);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.upl_session_id, c9iZ, 1);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.credential_id, c9iZ, 2);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.credential_type, c9iZ, 3);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.platform_trust_token, c9iZ, 4);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.payment_product_id, c9iZ, 5);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.receiver_id, c9iZ, 6);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.amount, c9iZ, 7);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.currency_code, c9iZ, 8);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.country_code, c9iZ, 9);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.payment_container_mode, c9iZ, 10);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.pay_button_click_id, c9iZ, 11);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.payment_request_id, c9iZ, 12);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.otc_session_id, c9iZ, 13);
        c9j5.AAV(hatchCheckoutFinalizeRequestJson.otc_type, c9iZ, 14);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutFinalizeRequestJson) {
                HatchCheckoutFinalizeRequestJson hatchCheckoutFinalizeRequestJson = (HatchCheckoutFinalizeRequestJson) obj;
                if (!C7384Etj.areEqual(this.order_id, hatchCheckoutFinalizeRequestJson.order_id) || !C7384Etj.areEqual(this.upl_session_id, hatchCheckoutFinalizeRequestJson.upl_session_id) || !C7384Etj.areEqual(this.credential_id, hatchCheckoutFinalizeRequestJson.credential_id) || !C7384Etj.areEqual(this.credential_type, hatchCheckoutFinalizeRequestJson.credential_type) || !C7384Etj.areEqual(this.platform_trust_token, hatchCheckoutFinalizeRequestJson.platform_trust_token) || !C7384Etj.areEqual(this.payment_product_id, hatchCheckoutFinalizeRequestJson.payment_product_id) || !C7384Etj.areEqual(this.receiver_id, hatchCheckoutFinalizeRequestJson.receiver_id) || !C7384Etj.areEqual(this.amount, hatchCheckoutFinalizeRequestJson.amount) || !C7384Etj.areEqual(this.currency_code, hatchCheckoutFinalizeRequestJson.currency_code) || !C7384Etj.areEqual(this.country_code, hatchCheckoutFinalizeRequestJson.country_code) || !C7384Etj.areEqual(this.payment_container_mode, hatchCheckoutFinalizeRequestJson.payment_container_mode) || !C7384Etj.areEqual(this.pay_button_click_id, hatchCheckoutFinalizeRequestJson.pay_button_click_id) || !C7384Etj.areEqual(this.payment_request_id, hatchCheckoutFinalizeRequestJson.payment_request_id) || !C7384Etj.areEqual(this.otc_session_id, hatchCheckoutFinalizeRequestJson.otc_session_id) || !C7384Etj.areEqual(this.otc_type, hatchCheckoutFinalizeRequestJson.otc_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCheckoutFinalizeRequestJson copy$default(HatchCheckoutFinalizeRequestJson hatchCheckoutFinalizeRequestJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        String str27 = str14;
        String str28 = str15;
        if ((i & 1) != 0) {
            str = hatchCheckoutFinalizeRequestJson.order_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutFinalizeRequestJson.upl_session_id;
        }
        if ((i & 4) != 0) {
            str16 = hatchCheckoutFinalizeRequestJson.credential_id;
        }
        if ((i & 8) != 0) {
            str17 = hatchCheckoutFinalizeRequestJson.credential_type;
        }
        if ((i & 16) != 0) {
            str18 = hatchCheckoutFinalizeRequestJson.platform_trust_token;
        }
        if ((i & 32) != 0) {
            str19 = hatchCheckoutFinalizeRequestJson.payment_product_id;
        }
        if ((i & 64) != 0) {
            str20 = hatchCheckoutFinalizeRequestJson.receiver_id;
        }
        if ((i & 128) != 0) {
            str21 = hatchCheckoutFinalizeRequestJson.amount;
        }
        if ((i & 256) != 0) {
            str22 = hatchCheckoutFinalizeRequestJson.currency_code;
        }
        if ((i & 512) != 0) {
            str23 = hatchCheckoutFinalizeRequestJson.country_code;
        }
        if ((i & 1024) != 0) {
            str24 = hatchCheckoutFinalizeRequestJson.payment_container_mode;
        }
        if ((i & 2048) != 0) {
            str25 = hatchCheckoutFinalizeRequestJson.pay_button_click_id;
        }
        if ((i & 4096) != 0) {
            str26 = hatchCheckoutFinalizeRequestJson.payment_request_id;
        }
        if ((i & 8192) != 0) {
            str27 = hatchCheckoutFinalizeRequestJson.otc_session_id;
        }
        if ((i & 16384) != 0) {
            str28 = hatchCheckoutFinalizeRequestJson.otc_type;
        }
        return hatchCheckoutFinalizeRequestJson.copy(str, str2, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    public final String component1() {
        return this.order_id;
    }

    public final String component10() {
        return this.country_code;
    }

    public final String component11() {
        return this.payment_container_mode;
    }

    public final String component12() {
        return this.pay_button_click_id;
    }

    public final String component13() {
        return this.payment_request_id;
    }

    public final String component14() {
        return this.otc_session_id;
    }

    public final String component15() {
        return this.otc_type;
    }

    public final String component2() {
        return this.upl_session_id;
    }

    public final String component3() {
        return this.credential_id;
    }

    public final String component4() {
        return this.credential_type;
    }

    public final String component5() {
        return this.platform_trust_token;
    }

    public final String component6() {
        return this.payment_product_id;
    }

    public final String component7() {
        return this.receiver_id;
    }

    public final String component8() {
        return this.amount;
    }

    public final String component9() {
        return this.currency_code;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final String getCredential_id() {
        return this.credential_id;
    }

    public final String getCredential_type() {
        return this.credential_type;
    }

    public final String getCurrency_code() {
        return this.currency_code;
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

    public final String getPay_button_click_id() {
        return this.pay_button_click_id;
    }

    public final String getPayment_container_mode() {
        return this.payment_container_mode;
    }

    public final String getPayment_product_id() {
        return this.payment_product_id;
    }

    public final String getPayment_request_id() {
        return this.payment_request_id;
    }

    public final String getPlatform_trust_token() {
        return this.platform_trust_token;
    }

    public final String getReceiver_id() {
        return this.receiver_id;
    }

    public final String getUpl_session_id() {
        return this.upl_session_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.otc_type, AnonymousClass005.A0I(this.otc_session_id, AnonymousClass005.A0I(this.payment_request_id, AnonymousClass005.A0I(this.pay_button_click_id, AnonymousClass005.A0I(this.payment_container_mode, AnonymousClass005.A0I(this.country_code, AnonymousClass005.A0I(this.currency_code, AnonymousClass005.A0I(this.amount, AnonymousClass005.A0I(this.receiver_id, AnonymousClass005.A0I(this.payment_product_id, AnonymousClass005.A0I(this.platform_trust_token, AnonymousClass005.A0I(this.credential_type, AnonymousClass005.A0I(this.credential_id, AnonymousClass005.A0I(this.upl_session_id, AnonymousClass001.A0G(this.order_id)))))))))))))));
    }

    public HatchCheckoutFinalizeRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        AnonymousClass002.A1F(str9, 8, str10);
        AnonymousClass005.A18(str11, str12, str13, str14, str15);
        this.order_id = str;
        this.upl_session_id = str2;
        this.credential_id = str3;
        this.credential_type = str4;
        this.platform_trust_token = str5;
        this.payment_product_id = str6;
        this.receiver_id = str7;
        this.amount = str8;
        this.currency_code = str9;
        this.country_code = str10;
        this.payment_container_mode = str11;
        this.pay_button_click_id = str12;
        this.payment_request_id = str13;
        this.otc_session_id = str14;
        this.otc_type = str15;
    }

    public final HatchCheckoutFinalizeRequestJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        AnonymousClass002.A1F(str9, 8, str10);
        AnonymousClass005.A18(str11, str12, str13, str14, str15);
        return new HatchCheckoutFinalizeRequestJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutFinalizeRequestJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C2hx c2hx) {
        if (32767 != (i & 32767)) {
            C9iI.A00(HatchCheckoutFinalizeRequestJson$$serializer.descriptor, i, 32767);
            throw F60.createAndThrow();
        }
        this.order_id = str;
        this.upl_session_id = str2;
        this.credential_id = str3;
        this.credential_type = str4;
        this.platform_trust_token = str5;
        this.payment_product_id = str6;
        this.receiver_id = str7;
        this.amount = str8;
        this.currency_code = str9;
        this.country_code = str10;
        this.payment_container_mode = str11;
        this.pay_button_click_id = str12;
        this.payment_request_id = str13;
        this.otc_session_id = str14;
        this.otc_type = str15;
    }
}
