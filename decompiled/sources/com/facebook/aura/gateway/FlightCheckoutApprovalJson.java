package com.facebook.aura.gateway;

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
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutApprovalJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String card_brand;
    public final String card_last4;
    public final String carrier_detail;
    public final String carrier_label;
    public final String currency;
    public final List<CheckoutLegalLinkJson> legal_links;
    public final CheckoutMerchantJson merchant;
    public final List<FlightCheckoutPassengerJson> passengers;
    public final String payment_method_label;
    public final List<WalletPaymentOptionJson> payment_options;
    public final PaymentSelectionJson payment_selection;
    public final List<FlightCheckoutSliceJson> slices;
    public final List<CheckoutTotalJson> totals;
    public final String trip_type_label;
    public final int version;

    public final class Companion {
        public final C9hr<FlightCheckoutApprovalJson> serializer() {
            return FlightCheckoutApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, AbstractC5321DgF.A02(num, FlightCheckoutApprovalJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, FlightCheckoutApprovalJson$Companion$$childSerializers$2.INSTANCE), null, null, AbstractC5321DgF.A02(num, FlightCheckoutApprovalJson$Companion$$childSerializers$3.INSTANCE), AbstractC5321DgF.A02(num, FlightCheckoutApprovalJson$Companion$$childSerializers$4.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, FlightCheckoutApprovalJson$Companion$$childSerializers$5.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutApprovalJson) {
                FlightCheckoutApprovalJson flightCheckoutApprovalJson = (FlightCheckoutApprovalJson) obj;
                if (this.version != flightCheckoutApprovalJson.version || !C7384Etj.areEqual(this.merchant, flightCheckoutApprovalJson.merchant) || !C7384Etj.areEqual(this.trip_type_label, flightCheckoutApprovalJson.trip_type_label) || !C7384Etj.areEqual(this.carrier_label, flightCheckoutApprovalJson.carrier_label) || !C7384Etj.areEqual(this.carrier_detail, flightCheckoutApprovalJson.carrier_detail) || !C7384Etj.areEqual(this.slices, flightCheckoutApprovalJson.slices) || !C7384Etj.areEqual(this.passengers, flightCheckoutApprovalJson.passengers) || !C7384Etj.areEqual(this.amount, flightCheckoutApprovalJson.amount) || !C7384Etj.areEqual(this.currency, flightCheckoutApprovalJson.currency) || !C7384Etj.areEqual(this.totals, flightCheckoutApprovalJson.totals) || !C7384Etj.areEqual(this.legal_links, flightCheckoutApprovalJson.legal_links) || !C7384Etj.areEqual(this.payment_method_label, flightCheckoutApprovalJson.payment_method_label) || !C7384Etj.areEqual(this.card_brand, flightCheckoutApprovalJson.card_brand) || !C7384Etj.areEqual(this.card_last4, flightCheckoutApprovalJson.card_last4) || !C7384Etj.areEqual(this.payment_selection, flightCheckoutApprovalJson.payment_selection) || !C7384Etj.areEqual(this.payment_options, flightCheckoutApprovalJson.payment_options)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutApprovalJson copy$default(FlightCheckoutApprovalJson flightCheckoutApprovalJson, int i, CheckoutMerchantJson checkoutMerchantJson, String str, String str2, String str3, List list, List list2, String str4, String str5, List list3, List list4, String str6, String str7, String str8, PaymentSelectionJson paymentSelectionJson, List list5, int i2, Object obj) {
        int i3 = i;
        CheckoutMerchantJson checkoutMerchantJson2 = checkoutMerchantJson;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        List list6 = list;
        List list7 = list2;
        String str12 = str4;
        String str13 = str5;
        List list8 = list3;
        List list9 = list4;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        PaymentSelectionJson paymentSelectionJson2 = paymentSelectionJson;
        List list10 = list5;
        if ((i2 & 1) != 0) {
            i3 = flightCheckoutApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            checkoutMerchantJson2 = flightCheckoutApprovalJson.merchant;
        }
        if ((i2 & 4) != 0) {
            str9 = flightCheckoutApprovalJson.trip_type_label;
        }
        if ((i2 & 8) != 0) {
            str10 = flightCheckoutApprovalJson.carrier_label;
        }
        if ((i2 & 16) != 0) {
            str11 = flightCheckoutApprovalJson.carrier_detail;
        }
        if ((i2 & 32) != 0) {
            list6 = flightCheckoutApprovalJson.slices;
        }
        if ((i2 & 64) != 0) {
            list7 = flightCheckoutApprovalJson.passengers;
        }
        if ((i2 & 128) != 0) {
            str12 = flightCheckoutApprovalJson.amount;
        }
        if ((i2 & 256) != 0) {
            str13 = flightCheckoutApprovalJson.currency;
        }
        if ((i2 & 512) != 0) {
            list8 = flightCheckoutApprovalJson.totals;
        }
        if ((i2 & 1024) != 0) {
            list9 = flightCheckoutApprovalJson.legal_links;
        }
        if ((i2 & 2048) != 0) {
            str14 = flightCheckoutApprovalJson.payment_method_label;
        }
        if ((i2 & 4096) != 0) {
            str15 = flightCheckoutApprovalJson.card_brand;
        }
        if ((i2 & 8192) != 0) {
            str16 = flightCheckoutApprovalJson.card_last4;
        }
        if ((i2 & 16384) != 0) {
            paymentSelectionJson2 = flightCheckoutApprovalJson.payment_selection;
        }
        if ((i2 & 32768) != 0) {
            list10 = flightCheckoutApprovalJson.payment_options;
        }
        String str17 = str10;
        return flightCheckoutApprovalJson.copy(i3, checkoutMerchantJson2, str9, str17, str11, list6, list7, str12, str13, list8, list9, str14, str15, str16, paymentSelectionJson2, list10);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutApprovalJson flightCheckoutApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutApprovalJson.version != 0) {
            c9j5.AAK(c9iZ, 0, flightCheckoutApprovalJson.version);
        }
        if (zAfR || flightCheckoutApprovalJson.merchant != null) {
            c9j5.AAP(flightCheckoutApprovalJson.merchant, CheckoutMerchantJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || flightCheckoutApprovalJson.trip_type_label != null) {
            c9j5.AAP(flightCheckoutApprovalJson.trip_type_label, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightCheckoutApprovalJson.carrier_label != null) {
            c9j5.AAP(flightCheckoutApprovalJson.carrier_label, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || flightCheckoutApprovalJson.carrier_detail != null) {
            c9j5.AAP(flightCheckoutApprovalJson.carrier_detail, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutApprovalJson.slices)) {
            c9j5.AAQ(flightCheckoutApprovalJson.slices, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutApprovalJson.passengers)) {
            c9j5.AAQ(flightCheckoutApprovalJson.passengers, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || flightCheckoutApprovalJson.amount != null) {
            c9j5.AAP(flightCheckoutApprovalJson.amount, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || flightCheckoutApprovalJson.currency != null) {
            c9j5.AAP(flightCheckoutApprovalJson.currency, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutApprovalJson.totals)) {
            c9j5.AAQ(flightCheckoutApprovalJson.totals, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutApprovalJson.legal_links)) {
            c9j5.AAQ(flightCheckoutApprovalJson.legal_links, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || flightCheckoutApprovalJson.payment_method_label != null) {
            c9j5.AAP(flightCheckoutApprovalJson.payment_method_label, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || flightCheckoutApprovalJson.card_brand != null) {
            c9j5.AAP(flightCheckoutApprovalJson.card_brand, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || flightCheckoutApprovalJson.card_last4 != null) {
            c9j5.AAP(flightCheckoutApprovalJson.card_last4, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || flightCheckoutApprovalJson.payment_selection != null) {
            c9j5.AAP(flightCheckoutApprovalJson.payment_selection, PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 14);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutApprovalJson.payment_options)) {
            c9j5.AAQ(flightCheckoutApprovalJson.payment_options, C3cH.A15(f0cArr, 15), c9iZ, 15);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final List<CheckoutTotalJson> component10() {
        return this.totals;
    }

    public final List<CheckoutLegalLinkJson> component11() {
        return this.legal_links;
    }

    public final String component12() {
        return this.payment_method_label;
    }

    public final String component13() {
        return this.card_brand;
    }

    public final String component14() {
        return this.card_last4;
    }

    public final PaymentSelectionJson component15() {
        return this.payment_selection;
    }

    public final List<WalletPaymentOptionJson> component16() {
        return this.payment_options;
    }

    public final CheckoutMerchantJson component2() {
        return this.merchant;
    }

    public final String component3() {
        return this.trip_type_label;
    }

    public final String component4() {
        return this.carrier_label;
    }

    public final String component5() {
        return this.carrier_detail;
    }

    public final List<FlightCheckoutSliceJson> component6() {
        return this.slices;
    }

    public final List<FlightCheckoutPassengerJson> component7() {
        return this.passengers;
    }

    public final String component8() {
        return this.amount;
    }

    public final String component9() {
        return this.currency;
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

    public final String getCarrier_detail() {
        return this.carrier_detail;
    }

    public final String getCarrier_label() {
        return this.carrier_label;
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

    public final List<FlightCheckoutPassengerJson> getPassengers() {
        return this.passengers;
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

    public final List<FlightCheckoutSliceJson> getSlices() {
        return this.slices;
    }

    public final List<CheckoutTotalJson> getTotals() {
        return this.totals;
    }

    public final String getTrip_type_label() {
        return this.trip_type_label;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payment_options, (((((((AnonymousClass005.A0F(this.legal_links, AnonymousClass005.A0F(this.totals, (((AnonymousClass005.A0F(this.passengers, AnonymousClass005.A0F(this.slices, ((((((((this.version * 31) + AnonymousClass006.A0D(this.merchant)) * 31) + AnonymousClass006.A0G(this.trip_type_label)) * 31) + AnonymousClass006.A0G(this.carrier_label)) * 31) + AnonymousClass006.A0G(this.carrier_detail)) * 31)) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31)) + AnonymousClass006.A0G(this.payment_method_label)) * 31) + AnonymousClass006.A0G(this.card_brand)) * 31) + AnonymousClass006.A0G(this.card_last4)) * 31) + C3cH.A02(this.payment_selection)) * 31);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutApproval toDomain() {
        int i = this.version;
        CheckoutMerchantJson checkoutMerchantJson = this.merchant;
        HatchAgentPermissionsRepository.CheckoutMerchant domain = checkoutMerchantJson != null ? checkoutMerchantJson.toDomain() : null;
        String str = this.trip_type_label;
        String str2 = this.carrier_label;
        String str3 = this.carrier_detail;
        List<FlightCheckoutSliceJson> list = this.slices;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<FlightCheckoutSliceJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().toDomain());
        }
        List<FlightCheckoutPassengerJson> list2 = this.passengers;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<FlightCheckoutPassengerJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(it2.next().toDomain());
        }
        String str4 = this.amount;
        String str5 = this.currency;
        List<CheckoutTotalJson> list3 = this.totals;
        ArrayList arrayListA0m3 = AnonymousClass002.A0m(list3);
        Iterator<CheckoutTotalJson> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayListA0m3.add(it3.next().toDomain());
        }
        List<CheckoutLegalLinkJson> list4 = this.legal_links;
        ArrayList arrayListA0m4 = AnonymousClass002.A0m(list4);
        Iterator<CheckoutLegalLinkJson> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayListA0m4.add(it4.next().toDomain());
        }
        String str6 = this.payment_method_label;
        String str7 = this.card_brand;
        String str8 = this.card_last4;
        PaymentSelectionJson paymentSelectionJson = this.payment_selection;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection domainOrNull = paymentSelectionJson != null ? paymentSelectionJson.toDomainOrNull() : null;
        List<WalletPaymentOptionJson> list5 = this.payment_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<WalletPaymentOptionJson> it5 = list5.iterator();
        while (it5.hasNext()) {
            WalletPaymentOption domainOrNull2 = it5.next().toDomainOrNull(null, null);
            if (domainOrNull2 != null) {
                arrayListA0h.add(domainOrNull2);
            }
        }
        return new HatchAgentPermissionsRepository.FlightCheckoutApproval(i, domain, str, str2, str3, arrayListA0m, arrayListA0m2, str4, str5, arrayListA0m3, arrayListA0m4, str6, str7, str8, domainOrNull, arrayListA0h);
    }

    public final FlightCheckoutApprovalJson copy(int i, CheckoutMerchantJson checkoutMerchantJson, String str, String str2, String str3, List<FlightCheckoutSliceJson> list, List<FlightCheckoutPassengerJson> list2, String str4, String str5, List<CheckoutTotalJson> list3, List<CheckoutLegalLinkJson> list4, String str6, String str7, String str8, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list5) {
        AnonymousClass003.A0z(list, list2);
        C3cH.A18(list3, list4);
        C7384Etj.A0Y(list5, 15);
        return new FlightCheckoutApprovalJson(i, checkoutMerchantJson, str, str2, str3, list, list2, str4, str5, list3, list4, str6, str7, str8, paymentSelectionJson, list5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutApprovalJson(int i, int i2, CheckoutMerchantJson checkoutMerchantJson, String str, String str2, String str3, List list, List list2, String str4, String str5, List list3, List list4, String str6, String str7, String str8, PaymentSelectionJson paymentSelectionJson, List list5, C2hx c2hx) {
        List list6 = list5;
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.merchant = null;
        } else {
            this.merchant = checkoutMerchantJson;
        }
        if ((i & 4) == 0) {
            this.trip_type_label = null;
        } else {
            this.trip_type_label = str;
        }
        if ((i & 8) == 0) {
            this.carrier_label = null;
        } else {
            this.carrier_label = str2;
        }
        if ((i & 16) == 0) {
            this.carrier_detail = null;
        } else {
            this.carrier_detail = str3;
        }
        if ((i & 32) == 0) {
            this.slices = C0881AGi.A00;
        } else {
            this.slices = list;
        }
        if ((i & 64) == 0) {
            this.passengers = C0881AGi.A00;
        } else {
            this.passengers = list2;
        }
        if ((i & 128) == 0) {
            this.amount = null;
        } else {
            this.amount = str4;
        }
        if ((i & 256) == 0) {
            this.currency = null;
        } else {
            this.currency = str5;
        }
        if ((i & 512) == 0) {
            this.totals = C0881AGi.A00;
        } else {
            this.totals = list3;
        }
        if ((i & 1024) == 0) {
            this.legal_links = C0881AGi.A00;
        } else {
            this.legal_links = list4;
        }
        if ((i & 2048) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str6;
        }
        if ((i & 4096) == 0) {
            this.card_brand = null;
        } else {
            this.card_brand = str7;
        }
        if ((i & 8192) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str8;
        }
        if ((i & 16384) == 0) {
            this.payment_selection = null;
        } else {
            this.payment_selection = paymentSelectionJson;
        }
        this.payment_options = (i & 32768) == 0 ? C0881AGi.A00 : list6;
    }

    public /* synthetic */ FlightCheckoutApprovalJson(int i, CheckoutMerchantJson checkoutMerchantJson, String str, String str2, String str3, List list, List list2, String str4, String str5, List list3, List list4, String str6, String str7, String str8, PaymentSelectionJson paymentSelectionJson, List list5, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : checkoutMerchantJson, C3cG.A0e(str, i2 & 4), C3cG.A0e(str2, i2 & 8), C3cG.A0e(str3, i2 & 16), (i2 & 32) != 0 ? C0881AGi.A00 : list, (i2 & 64) != 0 ? C0881AGi.A00 : list2, C3cG.A0e(str4, i2 & 128), C3cG.A0e(str5, i2 & 256), (i2 & 512) != 0 ? C0881AGi.A00 : list3, (i2 & 1024) != 0 ? C0881AGi.A00 : list4, C3cG.A0e(str6, i2 & 2048), C3cG.A0e(str7, i2 & 4096), C3cG.A0e(str8, i2 & 8192), (i2 & 16384) != 0 ? null : paymentSelectionJson, (i2 & 32768) != 0 ? C0881AGi.A00 : list5);
    }

    public FlightCheckoutApprovalJson(int i, CheckoutMerchantJson checkoutMerchantJson, String str, String str2, String str3, List<FlightCheckoutSliceJson> list, List<FlightCheckoutPassengerJson> list2, String str4, String str5, List<CheckoutTotalJson> list3, List<CheckoutLegalLinkJson> list4, String str6, String str7, String str8, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list5) {
        AnonymousClass003.A0z(list, list2);
        C3cH.A18(list3, list4);
        C7384Etj.A0Y(list5, 15);
        this.version = i;
        this.merchant = checkoutMerchantJson;
        this.trip_type_label = str;
        this.carrier_label = str2;
        this.carrier_detail = str3;
        this.slices = list;
        this.passengers = list2;
        this.amount = str4;
        this.currency = str5;
        this.totals = list3;
        this.legal_links = list4;
        this.payment_method_label = str6;
        this.card_brand = str7;
        this.card_last4 = str8;
        this.payment_selection = paymentSelectionJson;
        this.payment_options = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightCheckoutApprovalJson() {
        int i = 0;
        this(i, (CheckoutMerchantJson) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (PaymentSelectionJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 65535, (C06H) (0 == true ? 1 : 0));
    }
}
