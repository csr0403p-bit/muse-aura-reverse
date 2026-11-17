package com.facebook.aura.ccv.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCheckoutInitResponseJson extends C06G {
    public final HatchCcvScreenContentJson ccv_screen_content;
    public final List<HatchCheckoutComponentJson> components;
    public final HatchCheckoutCurrencyAmountJson currency_amount;
    public final String ecp_checkout_session_id;
    public final String order_id;
    public final String payment_container_mode;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, HatchCheckoutInitResponseJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<HatchCheckoutInitResponseJson> serializer() {
            return HatchCheckoutInitResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchCheckoutInitResponseJson copy(String str, String str2, String str3, List<HatchCheckoutComponentJson> list, HatchCcvScreenContentJson hatchCcvScreenContentJson, HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson) {
        C7384Etj.A0Y(list, 3);
        return new HatchCheckoutInitResponseJson(str, str2, str3, list, hatchCcvScreenContentJson, hatchCheckoutCurrencyAmountJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutInitResponseJson) {
                HatchCheckoutInitResponseJson hatchCheckoutInitResponseJson = (HatchCheckoutInitResponseJson) obj;
                if (!C7384Etj.areEqual(this.order_id, hatchCheckoutInitResponseJson.order_id) || !C7384Etj.areEqual(this.ecp_checkout_session_id, hatchCheckoutInitResponseJson.ecp_checkout_session_id) || !C7384Etj.areEqual(this.payment_container_mode, hatchCheckoutInitResponseJson.payment_container_mode) || !C7384Etj.areEqual(this.components, hatchCheckoutInitResponseJson.components) || !C7384Etj.areEqual(this.ccv_screen_content, hatchCheckoutInitResponseJson.ccv_screen_content) || !C7384Etj.areEqual(this.currency_amount, hatchCheckoutInitResponseJson.currency_amount)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchCheckoutInitResponseJson copy$default(HatchCheckoutInitResponseJson hatchCheckoutInitResponseJson, String str, String str2, String str3, List list, HatchCcvScreenContentJson hatchCcvScreenContentJson, HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutInitResponseJson.order_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutInitResponseJson.ecp_checkout_session_id;
        }
        if ((i & 4) != 0) {
            str3 = hatchCheckoutInitResponseJson.payment_container_mode;
        }
        if ((i & 8) != 0) {
            list = hatchCheckoutInitResponseJson.components;
        }
        if ((i & 16) != 0) {
            hatchCcvScreenContentJson = hatchCheckoutInitResponseJson.ccv_screen_content;
        }
        if ((i & 32) != 0) {
            hatchCheckoutCurrencyAmountJson = hatchCheckoutInitResponseJson.currency_amount;
        }
        return hatchCheckoutInitResponseJson.copy(str, str2, str3, list, hatchCcvScreenContentJson, hatchCheckoutCurrencyAmountJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutInitResponseJson hatchCheckoutInitResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCheckoutInitResponseJson.order_id != null) {
            c9j5.AAP(hatchCheckoutInitResponseJson.order_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchCheckoutInitResponseJson.ecp_checkout_session_id != null) {
            c9j5.AAP(hatchCheckoutInitResponseJson.ecp_checkout_session_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchCheckoutInitResponseJson.payment_container_mode != null) {
            c9j5.AAP(hatchCheckoutInitResponseJson.payment_container_mode, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(hatchCheckoutInitResponseJson.components)) {
            c9j5.AAQ(hatchCheckoutInitResponseJson.components, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || hatchCheckoutInitResponseJson.ccv_screen_content != null) {
            c9j5.AAP(hatchCheckoutInitResponseJson.ccv_screen_content, HatchCcvScreenContentJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || hatchCheckoutInitResponseJson.currency_amount != null) {
            c9j5.AAP(hatchCheckoutInitResponseJson.currency_amount, HatchCheckoutCurrencyAmountJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public final String component1() {
        return this.order_id;
    }

    public final String component2() {
        return this.ecp_checkout_session_id;
    }

    public final String component3() {
        return this.payment_container_mode;
    }

    public final List<HatchCheckoutComponentJson> component4() {
        return this.components;
    }

    public final HatchCcvScreenContentJson component5() {
        return this.ccv_screen_content;
    }

    public final HatchCheckoutCurrencyAmountJson component6() {
        return this.currency_amount;
    }

    public final HatchCcvScreenContentJson getCcv_screen_content() {
        return this.ccv_screen_content;
    }

    public final List<HatchCheckoutComponentJson> getComponents() {
        return this.components;
    }

    public final HatchCheckoutCurrencyAmountJson getCurrency_amount() {
        return this.currency_amount;
    }

    public final String getEcp_checkout_session_id() {
        return this.ecp_checkout_session_id;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getPayment_container_mode() {
        return this.payment_container_mode;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.components, ((((AnonymousClass006.A0G(this.order_id) * 31) + AnonymousClass006.A0G(this.ecp_checkout_session_id)) * 31) + AnonymousClass006.A0G(this.payment_container_mode)) * 31) + AnonymousClass006.A0D(this.ccv_screen_content)) * 31) + C3cH.A02(this.currency_amount);
    }

    public /* synthetic */ HatchCheckoutInitResponseJson(int i, String str, String str2, String str3, List list, HatchCcvScreenContentJson hatchCcvScreenContentJson, HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.order_id = null;
        } else {
            this.order_id = str;
        }
        if ((i & 2) == 0) {
            this.ecp_checkout_session_id = null;
        } else {
            this.ecp_checkout_session_id = str2;
        }
        if ((i & 4) == 0) {
            this.payment_container_mode = null;
        } else {
            this.payment_container_mode = str3;
        }
        if ((i & 8) == 0) {
            this.components = C0881AGi.A00;
        } else {
            this.components = list;
        }
        if ((i & 16) == 0) {
            this.ccv_screen_content = null;
        } else {
            this.ccv_screen_content = hatchCcvScreenContentJson;
        }
        if ((i & 32) == 0) {
            this.currency_amount = null;
        } else {
            this.currency_amount = hatchCheckoutCurrencyAmountJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchCheckoutInitResponseJson(String str, String str2, String str3, List<HatchCheckoutComponentJson> list, HatchCcvScreenContentJson hatchCcvScreenContentJson, HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson) {
        C7384Etj.A0Y(list, 3);
        this.order_id = str;
        this.ecp_checkout_session_id = str2;
        this.payment_container_mode = str3;
        this.components = list;
        this.ccv_screen_content = hatchCcvScreenContentJson;
        this.currency_amount = hatchCheckoutCurrencyAmountJson;
    }

    public /* synthetic */ HatchCheckoutInitResponseJson(String str, String str2, String str3, List list, HatchCcvScreenContentJson hatchCcvScreenContentJson, HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? null : hatchCcvScreenContentJson, (i & 32) != 0 ? null : hatchCheckoutCurrencyAmountJson);
    }

    public HatchCheckoutInitResponseJson() {
        this(null, null, null, C0881AGi.A00, null, null);
    }
}
