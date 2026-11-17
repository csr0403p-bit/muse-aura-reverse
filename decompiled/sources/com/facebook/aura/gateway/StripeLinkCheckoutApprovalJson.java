package com.facebook.aura.gateway;

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
public final class StripeLinkCheckoutApprovalJson extends C06G {
    public static final int $stable = 8;
    public final String amount;
    public final String card_brand;
    public final Long card_expires_in_ms;
    public final String card_last4;
    public final String currency;
    public final String merchant_url;
    public final String payment_method_label;
    public final List<WalletPaymentOptionJson> payment_options;
    public final PaymentSelectionJson payment_selection;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, StripeLinkCheckoutApprovalJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<StripeLinkCheckoutApprovalJson> serializer() {
            return StripeLinkCheckoutApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StripeLinkCheckoutApprovalJson) {
                StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson = (StripeLinkCheckoutApprovalJson) obj;
                if (this.version != stripeLinkCheckoutApprovalJson.version || !C7384Etj.areEqual(this.merchant_url, stripeLinkCheckoutApprovalJson.merchant_url) || !C7384Etj.areEqual(this.amount, stripeLinkCheckoutApprovalJson.amount) || !C7384Etj.areEqual(this.currency, stripeLinkCheckoutApprovalJson.currency) || !C7384Etj.areEqual(this.payment_method_label, stripeLinkCheckoutApprovalJson.payment_method_label) || !C7384Etj.areEqual(this.card_brand, stripeLinkCheckoutApprovalJson.card_brand) || !C7384Etj.areEqual(this.card_last4, stripeLinkCheckoutApprovalJson.card_last4) || !C7384Etj.areEqual(this.card_expires_in_ms, stripeLinkCheckoutApprovalJson.card_expires_in_ms) || !C7384Etj.areEqual(this.payment_selection, stripeLinkCheckoutApprovalJson.payment_selection) || !C7384Etj.areEqual(this.payment_options, stripeLinkCheckoutApprovalJson.payment_options)) {
                }
            }
            return false;
        }
        return true;
    }

    public StripeLinkCheckoutApprovalJson(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list) {
        C7384Etj.A0Y(list, 9);
        this.version = i;
        this.merchant_url = str;
        this.amount = str2;
        this.currency = str3;
        this.payment_method_label = str4;
        this.card_brand = str5;
        this.card_last4 = str6;
        this.card_expires_in_ms = l;
        this.payment_selection = paymentSelectionJson;
        this.payment_options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StripeLinkCheckoutApprovalJson copy$default(StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson, int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, PaymentSelectionJson paymentSelectionJson, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stripeLinkCheckoutApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            str = stripeLinkCheckoutApprovalJson.merchant_url;
        }
        if ((i2 & 4) != 0) {
            str2 = stripeLinkCheckoutApprovalJson.amount;
        }
        if ((i2 & 8) != 0) {
            str3 = stripeLinkCheckoutApprovalJson.currency;
        }
        if ((i2 & 16) != 0) {
            str4 = stripeLinkCheckoutApprovalJson.payment_method_label;
        }
        if ((i2 & 32) != 0) {
            str5 = stripeLinkCheckoutApprovalJson.card_brand;
        }
        if ((i2 & 64) != 0) {
            str6 = stripeLinkCheckoutApprovalJson.card_last4;
        }
        if ((i2 & 128) != 0) {
            l = stripeLinkCheckoutApprovalJson.card_expires_in_ms;
        }
        if ((i2 & 256) != 0) {
            paymentSelectionJson = stripeLinkCheckoutApprovalJson.payment_selection;
        }
        if ((i2 & 512) != 0) {
            list = stripeLinkCheckoutApprovalJson.payment_options;
        }
        return stripeLinkCheckoutApprovalJson.copy(i, str, str2, str3, str4, str5, str6, l, paymentSelectionJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || stripeLinkCheckoutApprovalJson.version != 0) {
            c9j5.AAK(c9iZ, 0, stripeLinkCheckoutApprovalJson.version);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.merchant_url != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.merchant_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.amount != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.amount, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.currency != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.currency, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.payment_method_label != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.payment_method_label, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.card_brand != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.card_brand, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.card_last4 != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.card_last4, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.card_expires_in_ms != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.card_expires_in_ms, C9j1.A00, c9iZ, 7);
        }
        if (zAfR || stripeLinkCheckoutApprovalJson.payment_selection != null) {
            c9j5.AAP(stripeLinkCheckoutApprovalJson.payment_selection, PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(stripeLinkCheckoutApprovalJson.payment_options)) {
            c9j5.AAQ(stripeLinkCheckoutApprovalJson.payment_options, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final List<WalletPaymentOptionJson> component10() {
        return this.payment_options;
    }

    public final String component2() {
        return this.merchant_url;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final String component5() {
        return this.payment_method_label;
    }

    public final String component6() {
        return this.card_brand;
    }

    public final String component7() {
        return this.card_last4;
    }

    public final Long component8() {
        return this.card_expires_in_ms;
    }

    public final PaymentSelectionJson component9() {
        return this.payment_selection;
    }

    public final StripeLinkCheckoutApprovalJson copy(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list) {
        C7384Etj.A0Y(list, 9);
        return new StripeLinkCheckoutApprovalJson(i, str, str2, str3, str4, str5, str6, l, paymentSelectionJson, list);
    }

    public final String getAmount() {
        return this.amount;
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

    public final String getPayment_method_label() {
        return this.payment_method_label;
    }

    public final List<WalletPaymentOptionJson> getPayment_options() {
        return this.payment_options;
    }

    public final PaymentSelectionJson getPayment_selection() {
        return this.payment_selection;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payment_options, ((((((((((((((((this.version * 31) + AnonymousClass006.A0G(this.merchant_url)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0G(this.payment_method_label)) * 31) + AnonymousClass006.A0G(this.card_brand)) * 31) + AnonymousClass006.A0G(this.card_last4)) * 31) + AnonymousClass006.A0D(this.card_expires_in_ms)) * 31) + C3cH.A02(this.payment_selection)) * 31);
    }

    public final HatchAgentPermissionsRepository.StripeLinkCheckoutApproval toDomain() {
        int i = this.version;
        String str = this.merchant_url;
        String str2 = this.amount;
        String str3 = this.currency;
        String str4 = this.payment_method_label;
        String str5 = this.card_brand;
        String str6 = this.card_last4;
        Long l = this.card_expires_in_ms;
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
        return new HatchAgentPermissionsRepository.StripeLinkCheckoutApproval(i, str, str2, str3, str4, str5, str6, l, domainOrNull, arrayListA0h);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StripeLinkCheckoutApprovalJson(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, PaymentSelectionJson paymentSelectionJson, List list, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : paymentSelectionJson, (i2 & 512) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ StripeLinkCheckoutApprovalJson(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, Long l, PaymentSelectionJson paymentSelectionJson, List list, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.merchant_url = null;
        } else {
            this.merchant_url = str;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 8) == 0) {
            this.currency = null;
        } else {
            this.currency = str3;
        }
        if ((i & 16) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str4;
        }
        if ((i & 32) == 0) {
            this.card_brand = null;
        } else {
            this.card_brand = str5;
        }
        if ((i & 64) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str6;
        }
        if ((i & 128) == 0) {
            this.card_expires_in_ms = null;
        } else {
            this.card_expires_in_ms = l;
        }
        if ((i & 256) == 0) {
            this.payment_selection = null;
        } else {
            this.payment_selection = paymentSelectionJson;
        }
        if ((i & 512) == 0) {
            this.payment_options = C0881AGi.A00;
        } else {
            this.payment_options = list;
        }
    }

    public StripeLinkCheckoutApprovalJson() {
        this(0, null, null, null, null, null, null, null, null, C0881AGi.A00);
    }
}
