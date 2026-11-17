package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
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
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import X.HxE;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ReservationCheckoutApprovalJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String card_brand;
    public final String card_last4;
    public final String currency;
    public final List<CheckoutLegalLinkJson> legal_links;
    public final CheckoutMerchantJson merchant;
    public final String payment_method_label;
    public final List<WalletPaymentOptionJson> payment_options;
    public final PaymentSelectionJson payment_selection;
    public final String subtitle;
    public final String title;
    public final List<CheckoutTotalJson> totals;
    public final int version;

    public final class Companion {
        public final C9hr<ReservationCheckoutApprovalJson> serializer() {
            return ReservationCheckoutApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, AbstractC5321DgF.A02(num, ReservationCheckoutApprovalJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ReservationCheckoutApprovalJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, ReservationCheckoutApprovalJson$Companion$$childSerializers$3.INSTANCE)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReservationCheckoutApprovalJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(0, null, null, null, null, null, c0881AGi, c0881AGi, null, null, null, null, c0881AGi);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReservationCheckoutApprovalJson) {
                ReservationCheckoutApprovalJson reservationCheckoutApprovalJson = (ReservationCheckoutApprovalJson) obj;
                if (this.version != reservationCheckoutApprovalJson.version || !C7384Etj.areEqual(this.title, reservationCheckoutApprovalJson.title) || !C7384Etj.areEqual(this.subtitle, reservationCheckoutApprovalJson.subtitle) || !C7384Etj.areEqual(this.merchant, reservationCheckoutApprovalJson.merchant) || !C7384Etj.areEqual(this.amount, reservationCheckoutApprovalJson.amount) || !C7384Etj.areEqual(this.currency, reservationCheckoutApprovalJson.currency) || !C7384Etj.areEqual(this.totals, reservationCheckoutApprovalJson.totals) || !C7384Etj.areEqual(this.legal_links, reservationCheckoutApprovalJson.legal_links) || !C7384Etj.areEqual(this.payment_method_label, reservationCheckoutApprovalJson.payment_method_label) || !C7384Etj.areEqual(this.card_brand, reservationCheckoutApprovalJson.card_brand) || !C7384Etj.areEqual(this.card_last4, reservationCheckoutApprovalJson.card_last4) || !C7384Etj.areEqual(this.payment_selection, reservationCheckoutApprovalJson.payment_selection) || !C7384Etj.areEqual(this.payment_options, reservationCheckoutApprovalJson.payment_options)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReservationCheckoutApprovalJson copy$default(ReservationCheckoutApprovalJson reservationCheckoutApprovalJson, int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, String str3, String str4, List list, List list2, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reservationCheckoutApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            str = reservationCheckoutApprovalJson.title;
        }
        if ((i2 & 4) != 0) {
            str2 = reservationCheckoutApprovalJson.subtitle;
        }
        if ((i2 & 8) != 0) {
            checkoutMerchantJson = reservationCheckoutApprovalJson.merchant;
        }
        if ((i2 & 16) != 0) {
            str3 = reservationCheckoutApprovalJson.amount;
        }
        if ((i2 & 32) != 0) {
            str4 = reservationCheckoutApprovalJson.currency;
        }
        if ((i2 & 64) != 0) {
            list = reservationCheckoutApprovalJson.totals;
        }
        if ((i2 & 128) != 0) {
            list2 = reservationCheckoutApprovalJson.legal_links;
        }
        if ((i2 & 256) != 0) {
            str5 = reservationCheckoutApprovalJson.payment_method_label;
        }
        if ((i2 & 512) != 0) {
            str6 = reservationCheckoutApprovalJson.card_brand;
        }
        if ((i2 & 1024) != 0) {
            str7 = reservationCheckoutApprovalJson.card_last4;
        }
        if ((i2 & 2048) != 0) {
            paymentSelectionJson = reservationCheckoutApprovalJson.payment_selection;
        }
        if ((i2 & 4096) != 0) {
            list3 = reservationCheckoutApprovalJson.payment_options;
        }
        return reservationCheckoutApprovalJson.copy(i, str, str2, checkoutMerchantJson, str3, str4, list, list2, str5, str6, str7, paymentSelectionJson, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ReservationCheckoutApprovalJson reservationCheckoutApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || reservationCheckoutApprovalJson.version != 0) {
            c9j5.AAK(c9iZ, 0, reservationCheckoutApprovalJson.version);
        }
        if (zAfR || reservationCheckoutApprovalJson.title != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || reservationCheckoutApprovalJson.subtitle != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.subtitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || reservationCheckoutApprovalJson.merchant != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.merchant, CheckoutMerchantJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || reservationCheckoutApprovalJson.amount != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.amount, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || reservationCheckoutApprovalJson.currency != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.currency, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(reservationCheckoutApprovalJson.totals)) {
            c9j5.AAQ(reservationCheckoutApprovalJson.totals, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || !C3cG.A1L(reservationCheckoutApprovalJson.legal_links)) {
            c9j5.AAQ(reservationCheckoutApprovalJson.legal_links, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || reservationCheckoutApprovalJson.payment_method_label != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.payment_method_label, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || reservationCheckoutApprovalJson.card_brand != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.card_brand, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || reservationCheckoutApprovalJson.card_last4 != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.card_last4, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || reservationCheckoutApprovalJson.payment_selection != null) {
            c9j5.AAP(reservationCheckoutApprovalJson.payment_selection, PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 11);
        }
        if (zAfR || !C3cG.A1L(reservationCheckoutApprovalJson.payment_options)) {
            c9j5.AAQ(reservationCheckoutApprovalJson.payment_options, C3cH.A15(f0cArr, 12), c9iZ, 12);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final String component10() {
        return this.card_brand;
    }

    public final String component11() {
        return this.card_last4;
    }

    public final PaymentSelectionJson component12() {
        return this.payment_selection;
    }

    public final List<WalletPaymentOptionJson> component13() {
        return this.payment_options;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final CheckoutMerchantJson component4() {
        return this.merchant;
    }

    public final String component5() {
        return this.amount;
    }

    public final String component6() {
        return this.currency;
    }

    public final List<CheckoutTotalJson> component7() {
        return this.totals;
    }

    public final List<CheckoutLegalLinkJson> component8() {
        return this.legal_links;
    }

    public final String component9() {
        return this.payment_method_label;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCard_brand() {
        return this.card_brand;
    }

    public final String getCard_last4() {
        return this.card_last4;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<CheckoutLegalLinkJson> getLegal_links() {
        return this.legal_links;
    }

    public final CheckoutMerchantJson getMerchant() {
        return this.merchant;
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

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<CheckoutTotalJson> getTotals() {
        return this.totals;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payment_options, (((((((AnonymousClass005.A0F(this.legal_links, AnonymousClass005.A0F(this.totals, ((((((((((this.version * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0D(this.merchant)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31)) + AnonymousClass006.A0G(this.payment_method_label)) * 31) + AnonymousClass006.A0G(this.card_brand)) * 31) + AnonymousClass006.A0G(this.card_last4)) * 31) + C3cH.A02(this.payment_selection)) * 31);
    }

    public final HatchAgentPermissionsRepository.ReservationCheckoutApproval toDomainOrNull(boolean z) {
        HxE<BigDecimal, Currency> hxECheckoutMoneyOrNull;
        String strTrimToNonEmpty;
        String str;
        String strTrimToNonEmpty2;
        if (this.version != 1 || (hxECheckoutMoneyOrNull = CheckoutMoneyKt.checkoutMoneyOrNull(this.amount, this.currency)) == null) {
            return null;
        }
        BigDecimal bigDecimal = hxECheckoutMoneyOrNull.first;
        Currency currency = hxECheckoutMoneyOrNull.second;
        List<CheckoutTotalJson> list = this.totals;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<CheckoutTotalJson> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if ("total".equals(it.next().type) && (i = i + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
            if (i == 1) {
                CheckoutTotalJson checkoutTotalJson = (CheckoutTotalJson) AbstractC0878AGe.A0I(this.totals);
                if ("total".equals(checkoutTotalJson != null ? checkoutTotalJson.type : null)) {
                    List<CheckoutTotalJson> list2 = this.totals;
                    ArrayList arrayListA0m = AnonymousClass002.A0m(list2);
                    for (CheckoutTotalJson checkoutTotalJson2 : list2) {
                        HxE<BigDecimal, Currency> hxECheckoutMoneyOrNull2 = CheckoutMoneyKt.checkoutMoneyOrNull(checkoutTotalJson2.amount, checkoutTotalJson2.currency);
                        if (hxECheckoutMoneyOrNull2 == null) {
                            return null;
                        }
                        BigDecimal bigDecimal2 = hxECheckoutMoneyOrNull2.first;
                        if (!C7384Etj.areEqual(hxECheckoutMoneyOrNull2.second, currency)) {
                            return null;
                        }
                        String str2 = checkoutTotalJson2.type;
                        String str3 = checkoutTotalJson2.display_text;
                        if (str3 == null || C7BY.A0j(str3)) {
                            return null;
                        }
                        arrayListA0m.add(new HatchAgentPermissionsRepository.ReservationCheckoutTotal(str2, str3, bigDecimal2));
                    }
                    if (bigDecimal.compareTo(((HatchAgentPermissionsRepository.ReservationCheckoutTotal) AbstractC0878AGe.A0H(arrayListA0m)).amount) != 0) {
                        return null;
                    }
                    int i2 = this.version;
                    String str4 = this.title;
                    if (str4 != null && (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str4)) != null && (str = this.subtitle) != null && (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) != null) {
                        CheckoutMerchantJson checkoutMerchantJson = this.merchant;
                        HatchAgentPermissionsRepository.CheckoutMerchant domain = checkoutMerchantJson != null ? checkoutMerchantJson.toDomain() : null;
                        boolean z2 = arrayListA0m.size() > 1;
                        List<CheckoutLegalLinkJson> list3 = this.legal_links;
                        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list3);
                        Iterator<CheckoutLegalLinkJson> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayListA0m2.add(it2.next().toDomain());
                        }
                        String str5 = this.payment_method_label;
                        String str6 = this.card_brand;
                        String str7 = this.card_last4;
                        PaymentSelectionJson paymentSelectionJson = this.payment_selection;
                        HatchAgentPermissionsRepository.CheckoutPaymentSelection domainOrNull = paymentSelectionJson != null ? paymentSelectionJson.toDomainOrNull() : null;
                        List<WalletPaymentOptionJson> list4 = this.payment_options;
                        ArrayList arrayListA0h = C3cG.A0h();
                        Iterator<WalletPaymentOptionJson> it3 = list4.iterator();
                        while (it3.hasNext()) {
                            WalletPaymentOption domainOrNull2 = it3.next().toDomainOrNull(null, null);
                            if (domainOrNull2 != null) {
                                arrayListA0h.add(domainOrNull2);
                            }
                        }
                        return new HatchAgentPermissionsRepository.ReservationCheckoutApproval(i2, strTrimToNonEmpty, strTrimToNonEmpty2, domain, bigDecimal, currency, arrayListA0m, z2, z, arrayListA0m2, str5, str6, str7, domainOrNull, arrayListA0h);
                    }
                }
            }
        }
        return null;
    }

    public final ReservationCheckoutApprovalJson copy(int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, String str3, String str4, List<CheckoutTotalJson> list, List<CheckoutLegalLinkJson> list2, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list3) {
        AnonymousClass003.A10(list, list2);
        C7384Etj.A0Y(list3, 12);
        return new ReservationCheckoutApprovalJson(i, str, str2, checkoutMerchantJson, str3, str4, list, list2, str5, str6, str7, paymentSelectionJson, list3);
    }

    public String toString() {
        return super.toString();
    }

    public ReservationCheckoutApprovalJson(int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, String str3, String str4, List<CheckoutTotalJson> list, List<CheckoutLegalLinkJson> list2, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list3) {
        AnonymousClass003.A10(list, list2);
        C7384Etj.A0Y(list3, 12);
        this.version = i;
        this.title = str;
        this.subtitle = str2;
        this.merchant = checkoutMerchantJson;
        this.amount = str3;
        this.currency = str4;
        this.totals = list;
        this.legal_links = list2;
        this.payment_method_label = str5;
        this.card_brand = str6;
        this.card_last4 = str7;
        this.payment_selection = paymentSelectionJson;
        this.payment_options = list3;
    }

    public /* synthetic */ ReservationCheckoutApprovalJson(int i, int i2, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, String str3, String str4, List list, List list2, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List list3, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 8) == 0) {
            this.merchant = null;
        } else {
            this.merchant = checkoutMerchantJson;
        }
        if ((i & 16) == 0) {
            this.amount = null;
        } else {
            this.amount = str3;
        }
        if ((i & 32) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i & 64) == 0) {
            this.totals = C0881AGi.A00;
        } else {
            this.totals = list;
        }
        if ((i & 128) == 0) {
            this.legal_links = C0881AGi.A00;
        } else {
            this.legal_links = list2;
        }
        if ((i & 256) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str5;
        }
        if ((i & 512) == 0) {
            this.card_brand = null;
        } else {
            this.card_brand = str6;
        }
        if ((i & 1024) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str7;
        }
        if ((i & 2048) == 0) {
            this.payment_selection = null;
        } else {
            this.payment_selection = paymentSelectionJson;
        }
        this.payment_options = (i & 4096) == 0 ? C0881AGi.A00 : list3;
    }

    public /* synthetic */ ReservationCheckoutApprovalJson(int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, String str3, String str4, List list, List list2, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List list3, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : checkoutMerchantJson, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? C0881AGi.A00 : list, (i2 & 128) != 0 ? C0881AGi.A00 : list2, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) == 0 ? paymentSelectionJson : null, (i2 & 4096) != 0 ? C0881AGi.A00 : list3);
    }
}
