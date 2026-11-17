package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserCheckoutApprovalJson extends C06G {
    public static final int $stable = 8;
    public final String amount;
    public final String browser_task_id;
    public final String card_brand;
    public final Long card_expires_in_ms;
    public final String card_last4;
    public final String currency;
    public final String merchant_url;
    public final Boolean network_token_eligible;
    public final String payment_method_label;
    public final List<WalletPaymentOptionJson> payment_options;
    public final PaymentSelectionJson payment_selection;
    public final CheckoutScreenshotJson screenshot;
    public final CheckoutTabJson tab;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, BrowserCheckoutApprovalJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<BrowserCheckoutApprovalJson> serializer() {
            return BrowserCheckoutApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserCheckoutApprovalJson) {
                BrowserCheckoutApprovalJson browserCheckoutApprovalJson = (BrowserCheckoutApprovalJson) obj;
                if (this.version != browserCheckoutApprovalJson.version || !C7384Etj.areEqual(this.merchant_url, browserCheckoutApprovalJson.merchant_url) || !C7384Etj.areEqual(this.payment_method_label, browserCheckoutApprovalJson.payment_method_label) || !C7384Etj.areEqual(this.card_brand, browserCheckoutApprovalJson.card_brand) || !C7384Etj.areEqual(this.card_last4, browserCheckoutApprovalJson.card_last4) || !C7384Etj.areEqual(this.amount, browserCheckoutApprovalJson.amount) || !C7384Etj.areEqual(this.currency, browserCheckoutApprovalJson.currency) || !C7384Etj.areEqual(this.card_expires_in_ms, browserCheckoutApprovalJson.card_expires_in_ms) || !C7384Etj.areEqual(this.tab, browserCheckoutApprovalJson.tab) || !C7384Etj.areEqual(this.screenshot, browserCheckoutApprovalJson.screenshot) || !C7384Etj.areEqual(this.browser_task_id, browserCheckoutApprovalJson.browser_task_id) || !C7384Etj.areEqual(this.payment_selection, browserCheckoutApprovalJson.payment_selection) || !C7384Etj.areEqual(this.payment_options, browserCheckoutApprovalJson.payment_options) || !C7384Etj.areEqual(this.network_token_eligible, browserCheckoutApprovalJson.network_token_eligible)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ BrowserCheckoutApprovalJson(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTabJson checkoutTabJson, CheckoutScreenshotJson checkoutScreenshotJson, String str7, PaymentSelectionJson paymentSelectionJson, List list, Boolean bool, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : checkoutTabJson, (i2 & 512) != 0 ? null : checkoutScreenshotJson, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : paymentSelectionJson, (i2 & 4096) != 0 ? C0881AGi.A00 : list, (i2 & 8192) != 0 ? null : bool);
    }

    public static /* synthetic */ BrowserCheckoutApprovalJson copy$default(BrowserCheckoutApprovalJson browserCheckoutApprovalJson, int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTabJson checkoutTabJson, CheckoutScreenshotJson checkoutScreenshotJson, String str7, PaymentSelectionJson paymentSelectionJson, List list, Boolean bool, int i2, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        Long l2 = l;
        CheckoutTabJson checkoutTabJson2 = checkoutTabJson;
        CheckoutScreenshotJson checkoutScreenshotJson2 = checkoutScreenshotJson;
        String str14 = str7;
        PaymentSelectionJson paymentSelectionJson2 = paymentSelectionJson;
        List list2 = list;
        Boolean bool2 = bool;
        if ((i2 & 1) != 0) {
            i = browserCheckoutApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            str8 = browserCheckoutApprovalJson.merchant_url;
        }
        if ((i2 & 4) != 0) {
            str9 = browserCheckoutApprovalJson.payment_method_label;
        }
        if ((i2 & 8) != 0) {
            str10 = browserCheckoutApprovalJson.card_brand;
        }
        if ((i2 & 16) != 0) {
            str11 = browserCheckoutApprovalJson.card_last4;
        }
        if ((i2 & 32) != 0) {
            str12 = browserCheckoutApprovalJson.amount;
        }
        if ((i2 & 64) != 0) {
            str13 = browserCheckoutApprovalJson.currency;
        }
        if ((i2 & 128) != 0) {
            l2 = browserCheckoutApprovalJson.card_expires_in_ms;
        }
        if ((i2 & 256) != 0) {
            checkoutTabJson2 = browserCheckoutApprovalJson.tab;
        }
        if ((i2 & 512) != 0) {
            checkoutScreenshotJson2 = browserCheckoutApprovalJson.screenshot;
        }
        if ((i2 & 1024) != 0) {
            str14 = browserCheckoutApprovalJson.browser_task_id;
        }
        if ((i2 & 2048) != 0) {
            paymentSelectionJson2 = browserCheckoutApprovalJson.payment_selection;
        }
        if ((i2 & 4096) != 0) {
            list2 = browserCheckoutApprovalJson.payment_options;
        }
        if ((i2 & 8192) != 0) {
            bool2 = browserCheckoutApprovalJson.network_token_eligible;
        }
        return browserCheckoutApprovalJson.copy(i, str8, str9, str10, str11, str12, str13, l2, checkoutTabJson2, checkoutScreenshotJson2, str14, paymentSelectionJson2, list2, bool2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(BrowserCheckoutApprovalJson browserCheckoutApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || browserCheckoutApprovalJson.version != 0) {
            c9j5.AAK(c9iZ, 0, browserCheckoutApprovalJson.version);
        }
        if (zAfR || browserCheckoutApprovalJson.merchant_url != null) {
            c9j5.AAP(browserCheckoutApprovalJson.merchant_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || browserCheckoutApprovalJson.payment_method_label != null) {
            c9j5.AAP(browserCheckoutApprovalJson.payment_method_label, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || browserCheckoutApprovalJson.card_brand != null) {
            c9j5.AAP(browserCheckoutApprovalJson.card_brand, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || browserCheckoutApprovalJson.card_last4 != null) {
            c9j5.AAP(browserCheckoutApprovalJson.card_last4, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || browserCheckoutApprovalJson.amount != null) {
            c9j5.AAP(browserCheckoutApprovalJson.amount, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || browserCheckoutApprovalJson.currency != null) {
            c9j5.AAP(browserCheckoutApprovalJson.currency, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || browserCheckoutApprovalJson.card_expires_in_ms != null) {
            c9j5.AAP(browserCheckoutApprovalJson.card_expires_in_ms, C9j1.A00, c9iZ, 7);
        }
        if (zAfR || browserCheckoutApprovalJson.tab != null) {
            c9j5.AAP(browserCheckoutApprovalJson.tab, CheckoutTabJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || browserCheckoutApprovalJson.screenshot != null) {
            c9j5.AAP(browserCheckoutApprovalJson.screenshot, CheckoutScreenshotJson$$serializer.INSTANCE, c9iZ, 9);
        }
        if (zAfR || browserCheckoutApprovalJson.browser_task_id != null) {
            c9j5.AAP(browserCheckoutApprovalJson.browser_task_id, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || browserCheckoutApprovalJson.payment_selection != null) {
            c9j5.AAP(browserCheckoutApprovalJson.payment_selection, PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 11);
        }
        if (zAfR || !C3cG.A1L(browserCheckoutApprovalJson.payment_options)) {
            c9j5.AAQ(browserCheckoutApprovalJson.payment_options, C3cH.A15(f0cArr, 12), c9iZ, 12);
        }
        if (zAfR || browserCheckoutApprovalJson.network_token_eligible != null) {
            c9j5.AAP(browserCheckoutApprovalJson.network_token_eligible, C07839ix.A00, c9iZ, 13);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final CheckoutScreenshotJson component10() {
        return this.screenshot;
    }

    public final String component11() {
        return this.browser_task_id;
    }

    public final PaymentSelectionJson component12() {
        return this.payment_selection;
    }

    public final List<WalletPaymentOptionJson> component13() {
        return this.payment_options;
    }

    public final Boolean component14() {
        return this.network_token_eligible;
    }

    public final String component2() {
        return this.merchant_url;
    }

    public final String component3() {
        return this.payment_method_label;
    }

    public final String component4() {
        return this.card_brand;
    }

    public final String component5() {
        return this.card_last4;
    }

    public final String component6() {
        return this.amount;
    }

    public final String component7() {
        return this.currency;
    }

    public final Long component8() {
        return this.card_expires_in_ms;
    }

    public final CheckoutTabJson component9() {
        return this.tab;
    }

    public final BrowserCheckoutApprovalJson copy(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTabJson checkoutTabJson, CheckoutScreenshotJson checkoutScreenshotJson, String str7, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list, Boolean bool) {
        C7384Etj.A0Y(list, 12);
        return new BrowserCheckoutApprovalJson(i, str, str2, str3, str4, str5, str6, l, checkoutTabJson, checkoutScreenshotJson, str7, paymentSelectionJson, list, bool);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBrowser_task_id() {
        return this.browser_task_id;
    }

    public final String getCard_brand() {
        return this.card_brand;
    }

    public final Long getCard_expires_in_ms() {
        return this.card_expires_in_ms;
    }

    public final String getCard_last4() {
        return this.card_last4;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getMerchant_url() {
        return this.merchant_url;
    }

    public final Boolean getNetwork_token_eligible() {
        return this.network_token_eligible;
    }

    public final String getPayment_method_label() {
        return this.payment_method_label;
    }

    public final List<WalletPaymentOptionJson> getPayment_options() {
        return this.payment_options;
    }

    public final PaymentSelectionJson getPayment_selection() {
        return this.payment_selection;
    }

    public final CheckoutScreenshotJson getScreenshot() {
        return this.screenshot;
    }

    public final CheckoutTabJson getTab() {
        return this.tab;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.payment_options, ((((((((((((((((((((((this.version * 31) + AnonymousClass006.A0G(this.merchant_url)) * 31) + AnonymousClass006.A0G(this.payment_method_label)) * 31) + AnonymousClass006.A0G(this.card_brand)) * 31) + AnonymousClass006.A0G(this.card_last4)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0D(this.card_expires_in_ms)) * 31) + AnonymousClass006.A0D(this.tab)) * 31) + AnonymousClass006.A0D(this.screenshot)) * 31) + AnonymousClass006.A0G(this.browser_task_id)) * 31) + AnonymousClass006.A0D(this.payment_selection)) * 31) + C3cH.A02(this.network_token_eligible);
    }

    public final HatchAgentPermissionsRepository.BrowserCheckoutApproval toDomain() {
        int i = this.version;
        String str = this.merchant_url;
        String str2 = this.payment_method_label;
        String str3 = this.card_brand;
        String str4 = this.card_last4;
        String str5 = this.amount;
        String str6 = this.currency;
        Long l = this.card_expires_in_ms;
        CheckoutTabJson checkoutTabJson = this.tab;
        HatchAgentPermissionsRepository.CheckoutTab domain = checkoutTabJson != null ? checkoutTabJson.toDomain() : null;
        CheckoutScreenshotJson checkoutScreenshotJson = this.screenshot;
        HatchAgentPermissionsRepository.CheckoutScreenshot domain2 = checkoutScreenshotJson != null ? checkoutScreenshotJson.toDomain() : null;
        String strA0Z = C3cI.A0Z(this.browser_task_id);
        PaymentSelectionJson paymentSelectionJson = this.payment_selection;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection domainOrNull = paymentSelectionJson != null ? paymentSelectionJson.toDomainOrNull() : null;
        List<WalletPaymentOptionJson> list = this.payment_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<WalletPaymentOptionJson> it = list.iterator();
        while (it.hasNext()) {
            WalletPaymentOption domainOrNull2 = it.next().toDomainOrNull(null, null);
            if (domainOrNull2 != null) {
                arrayListA0h.add(domainOrNull2);
            }
        }
        return new HatchAgentPermissionsRepository.BrowserCheckoutApproval(i, str, str2, str3, str4, str5, str6, l, domain, domain2, strA0Z, domainOrNull, arrayListA0h, this.network_token_eligible);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BrowserCheckoutApprovalJson(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTabJson checkoutTabJson, CheckoutScreenshotJson checkoutScreenshotJson, String str7, PaymentSelectionJson paymentSelectionJson, List list, Boolean bool, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.merchant_url = null;
        } else {
            this.merchant_url = str;
        }
        if ((i & 4) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str2;
        }
        if ((i & 8) == 0) {
            this.card_brand = null;
        } else {
            this.card_brand = str3;
        }
        if ((i & 16) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str4;
        }
        if ((i & 32) == 0) {
            this.amount = null;
        } else {
            this.amount = str5;
        }
        if ((i & 64) == 0) {
            this.currency = null;
        } else {
            this.currency = str6;
        }
        if ((i & 128) == 0) {
            this.card_expires_in_ms = null;
        } else {
            this.card_expires_in_ms = l;
        }
        if ((i & 256) == 0) {
            this.tab = null;
        } else {
            this.tab = checkoutTabJson;
        }
        if ((i & 512) == 0) {
            this.screenshot = null;
        } else {
            this.screenshot = checkoutScreenshotJson;
        }
        if ((i & 1024) == 0) {
            this.browser_task_id = null;
        } else {
            this.browser_task_id = str7;
        }
        if ((i & 2048) == 0) {
            this.payment_selection = null;
        } else {
            this.payment_selection = paymentSelectionJson;
        }
        if ((i & 4096) == 0) {
            this.payment_options = C0881AGi.A00;
        } else {
            this.payment_options = list;
        }
        if ((i & 8192) == 0) {
            this.network_token_eligible = null;
        } else {
            this.network_token_eligible = bool;
        }
    }

    public BrowserCheckoutApprovalJson(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTabJson checkoutTabJson, CheckoutScreenshotJson checkoutScreenshotJson, String str7, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list, Boolean bool) {
        C7384Etj.A0Y(list, 12);
        this.version = i;
        this.merchant_url = str;
        this.payment_method_label = str2;
        this.card_brand = str3;
        this.card_last4 = str4;
        this.amount = str5;
        this.currency = str6;
        this.card_expires_in_ms = l;
        this.tab = checkoutTabJson;
        this.screenshot = checkoutScreenshotJson;
        this.browser_task_id = str7;
        this.payment_selection = paymentSelectionJson;
        this.payment_options = list;
        this.network_token_eligible = bool;
    }

    public BrowserCheckoutApprovalJson() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, C0881AGi.A00, null);
    }
}
