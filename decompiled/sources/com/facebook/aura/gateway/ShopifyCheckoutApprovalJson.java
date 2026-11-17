package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.CFK;
import X.F0C;
import X.HsJ;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class ShopifyCheckoutApprovalJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String card_brand;
    public final String card_last4;
    public final String checkout_id;
    public final ShopifyCheckoutContactJson contact;
    public final String currency;
    public final ShopifyCheckoutDeliveryJson delivery;
    public final String flow_id;
    public final List<ShopifyCheckoutItemJson> items;
    public final List<CheckoutLegalLinkJson> legal_links;
    public final JsonElement lodging;
    public final CheckoutMerchantJson merchant;
    public final String payment_method_label;
    public final List<WalletPaymentOptionJson> payment_options;
    public final PaymentSelectionJson payment_selection;
    public final ShopifyCheckoutShippingAddressJson shipping_address;
    public final List<CheckoutTotalJson> totals;
    public final int version;

    public final class Companion {
        public final C9hr<ShopifyCheckoutApprovalJson> serializer() {
            return ShopifyCheckoutApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, ShopifyCheckoutApprovalJson$Companion$$childSerializers$1.INSTANCE), null, null, AbstractC5321DgF.A02(num, ShopifyCheckoutApprovalJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, ShopifyCheckoutApprovalJson$Companion$$childSerializers$3.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, ShopifyCheckoutApprovalJson$Companion$$childSerializers$4.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShopifyCheckoutApprovalJson) {
                ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson = (ShopifyCheckoutApprovalJson) obj;
                if (this.version != shopifyCheckoutApprovalJson.version || !C7384Etj.areEqual(this.flow_id, shopifyCheckoutApprovalJson.flow_id) || !C7384Etj.areEqual(this.checkout_id, shopifyCheckoutApprovalJson.checkout_id) || !C7384Etj.areEqual(this.merchant, shopifyCheckoutApprovalJson.merchant) || !C7384Etj.areEqual(this.contact, shopifyCheckoutApprovalJson.contact) || !C7384Etj.areEqual(this.shipping_address, shopifyCheckoutApprovalJson.shipping_address) || !C7384Etj.areEqual(this.delivery, shopifyCheckoutApprovalJson.delivery) || !C7384Etj.areEqual(this.lodging, shopifyCheckoutApprovalJson.lodging) || !C7384Etj.areEqual(this.items, shopifyCheckoutApprovalJson.items) || !C7384Etj.areEqual(this.amount, shopifyCheckoutApprovalJson.amount) || !C7384Etj.areEqual(this.currency, shopifyCheckoutApprovalJson.currency) || !C7384Etj.areEqual(this.totals, shopifyCheckoutApprovalJson.totals) || !C7384Etj.areEqual(this.legal_links, shopifyCheckoutApprovalJson.legal_links) || !C7384Etj.areEqual(this.payment_method_label, shopifyCheckoutApprovalJson.payment_method_label) || !C7384Etj.areEqual(this.card_brand, shopifyCheckoutApprovalJson.card_brand) || !C7384Etj.areEqual(this.card_last4, shopifyCheckoutApprovalJson.card_last4) || !C7384Etj.areEqual(this.payment_selection, shopifyCheckoutApprovalJson.payment_selection) || !C7384Etj.areEqual(this.payment_options, shopifyCheckoutApprovalJson.payment_options)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || shopifyCheckoutApprovalJson.version != 0) {
            c9j5.AAK(c9iZ, 0, shopifyCheckoutApprovalJson.version);
        }
        if (zAfR || shopifyCheckoutApprovalJson.flow_id != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.flow_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shopifyCheckoutApprovalJson.checkout_id != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.checkout_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shopifyCheckoutApprovalJson.merchant != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.merchant, CheckoutMerchantJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || shopifyCheckoutApprovalJson.contact != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.contact, ShopifyCheckoutContactJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || shopifyCheckoutApprovalJson.shipping_address != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.shipping_address, ShopifyCheckoutShippingAddressJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || shopifyCheckoutApprovalJson.delivery != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.delivery, ShopifyCheckoutDeliveryJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || shopifyCheckoutApprovalJson.lodging != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.lodging, JsonElementSerializer.A00, c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(shopifyCheckoutApprovalJson.items)) {
            c9j5.AAQ(shopifyCheckoutApprovalJson.items, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
        if (zAfR || shopifyCheckoutApprovalJson.amount != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.amount, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || shopifyCheckoutApprovalJson.currency != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.currency, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || !C3cG.A1L(shopifyCheckoutApprovalJson.totals)) {
            c9j5.AAQ(shopifyCheckoutApprovalJson.totals, C3cH.A15(f0cArr, 11), c9iZ, 11);
        }
        if (zAfR || !C3cG.A1L(shopifyCheckoutApprovalJson.legal_links)) {
            c9j5.AAQ(shopifyCheckoutApprovalJson.legal_links, C3cH.A15(f0cArr, 12), c9iZ, 12);
        }
        if (zAfR || shopifyCheckoutApprovalJson.payment_method_label != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.payment_method_label, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || shopifyCheckoutApprovalJson.card_brand != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.card_brand, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || shopifyCheckoutApprovalJson.card_last4 != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.card_last4, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || shopifyCheckoutApprovalJson.payment_selection != null) {
            c9j5.AAP(shopifyCheckoutApprovalJson.payment_selection, PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 16);
        }
        if (zAfR || !C3cG.A1L(shopifyCheckoutApprovalJson.payment_options)) {
            c9j5.AAQ(shopifyCheckoutApprovalJson.payment_options, C3cH.A15(f0cArr, 17), c9iZ, 17);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final String component10() {
        return this.amount;
    }

    public final String component11() {
        return this.currency;
    }

    public final List<CheckoutTotalJson> component12() {
        return this.totals;
    }

    public final List<CheckoutLegalLinkJson> component13() {
        return this.legal_links;
    }

    public final String component14() {
        return this.payment_method_label;
    }

    public final String component15() {
        return this.card_brand;
    }

    public final String component16() {
        return this.card_last4;
    }

    public final PaymentSelectionJson component17() {
        return this.payment_selection;
    }

    public final List<WalletPaymentOptionJson> component18() {
        return this.payment_options;
    }

    public final String component2() {
        return this.flow_id;
    }

    public final String component3() {
        return this.checkout_id;
    }

    public final CheckoutMerchantJson component4() {
        return this.merchant;
    }

    public final ShopifyCheckoutContactJson component5() {
        return this.contact;
    }

    public final ShopifyCheckoutShippingAddressJson component6() {
        return this.shipping_address;
    }

    public final ShopifyCheckoutDeliveryJson component7() {
        return this.delivery;
    }

    public final JsonElement component8() {
        return this.lodging;
    }

    public final List<ShopifyCheckoutItemJson> component9() {
        return this.items;
    }

    public final ShopifyCheckoutApprovalJson copy(int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, ShopifyCheckoutContactJson shopifyCheckoutContactJson, ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson, ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson, JsonElement jsonElement, List<ShopifyCheckoutItemJson> list, String str3, String str4, List<CheckoutTotalJson> list2, List<CheckoutLegalLinkJson> list3, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list4) {
        AnonymousClass002.A1G(list, 8, list2);
        C3cI.A1I(list3, 12, list4);
        return new ShopifyCheckoutApprovalJson(i, str, str2, checkoutMerchantJson, shopifyCheckoutContactJson, shopifyCheckoutShippingAddressJson, shopifyCheckoutDeliveryJson, jsonElement, list, str3, str4, list2, list3, str5, str6, str7, paymentSelectionJson, list4);
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

    public final String getCheckout_id() {
        return this.checkout_id;
    }

    public final ShopifyCheckoutContactJson getContact() {
        return this.contact;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final ShopifyCheckoutDeliveryJson getDelivery() {
        return this.delivery;
    }

    public final String getFlow_id() {
        return this.flow_id;
    }

    public final List<ShopifyCheckoutItemJson> getItems() {
        return this.items;
    }

    public final List<CheckoutLegalLinkJson> getLegal_links() {
        return this.legal_links;
    }

    public final JsonElement getLodging() {
        return this.lodging;
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

    public final ShopifyCheckoutShippingAddressJson getShipping_address() {
        return this.shipping_address;
    }

    public final List<CheckoutTotalJson> getTotals() {
        return this.totals;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payment_options, (((((((AnonymousClass005.A0F(this.legal_links, AnonymousClass005.A0F(this.totals, (((AnonymousClass005.A0F(this.items, ((((((((((((((this.version * 31) + AnonymousClass006.A0G(this.flow_id)) * 31) + AnonymousClass006.A0G(this.checkout_id)) * 31) + AnonymousClass006.A0D(this.merchant)) * 31) + AnonymousClass006.A0D(this.contact)) * 31) + AnonymousClass006.A0D(this.shipping_address)) * 31) + AnonymousClass006.A0D(this.delivery)) * 31) + AnonymousClass006.A0D(this.lodging)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31)) + AnonymousClass006.A0G(this.payment_method_label)) * 31) + AnonymousClass006.A0G(this.card_brand)) * 31) + AnonymousClass006.A0G(this.card_last4)) * 31) + C3cH.A02(this.payment_selection)) * 31);
    }

    public final HatchAgentPermissionsRepository.ShopifyCheckoutApproval toDomain(String str) {
        Object objA0s;
        CheckoutLodging checkoutLodging;
        int i = this.version;
        String str2 = this.flow_id;
        String str3 = this.checkout_id;
        CheckoutMerchantJson checkoutMerchantJson = this.merchant;
        HatchAgentPermissionsRepository.CheckoutMerchant domain = checkoutMerchantJson != null ? checkoutMerchantJson.toDomain() : null;
        ShopifyCheckoutContactJson shopifyCheckoutContactJson = this.contact;
        HatchAgentPermissionsRepository.ShopifyCheckoutContact domain2 = shopifyCheckoutContactJson != null ? shopifyCheckoutContactJson.toDomain() : null;
        ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson = this.shipping_address;
        HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress domain3 = shopifyCheckoutShippingAddressJson != null ? shopifyCheckoutShippingAddressJson.toDomain() : null;
        ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson = this.delivery;
        HatchAgentPermissionsRepository.ShopifyCheckoutDelivery domain4 = shopifyCheckoutDeliveryJson != null ? shopifyCheckoutDeliveryJson.toDomain() : null;
        List<ShopifyCheckoutItemJson> list = this.items;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<ShopifyCheckoutItemJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().toDomain());
        }
        String str4 = this.amount;
        String str5 = this.currency;
        List<CheckoutTotalJson> list2 = this.totals;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<CheckoutTotalJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(it2.next().toDomain());
        }
        List<CheckoutLegalLinkJson> list3 = this.legal_links;
        ArrayList arrayListA0m3 = AnonymousClass002.A0m(list3);
        Iterator<CheckoutLegalLinkJson> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayListA0m3.add(it3.next().toDomain());
        }
        JsonElement jsonElement = this.lodging;
        if (jsonElement != null) {
            try {
                objA0s = ((CheckoutLodgingJson) C3cI.A0T(CheckoutLodgingJson$$serializer.INSTANCE, HatchJsonKt.HatchJson, jsonElement)).toDomain();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (HsJ.A00(objA0s) != null) {
                CFK.A06(HatchAgentPermissionsRepositoryJsonKt.TAG, "Ignoring malformed checkout lodging metadata");
            }
            boolean z = objA0s instanceof C10571Hud;
            if ((!z) && objA0s == null) {
                CFK.A06(HatchAgentPermissionsRepositoryJsonKt.TAG, "Checkout lodging metadata has no valid display sections");
            }
            if (z) {
                objA0s = null;
            }
            checkoutLodging = (CheckoutLodging) objA0s;
        } else {
            checkoutLodging = null;
        }
        String str6 = this.payment_method_label;
        String str7 = this.card_brand;
        String str8 = this.card_last4;
        PaymentSelectionJson paymentSelectionJson = this.payment_selection;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection domainOrNull = paymentSelectionJson != null ? paymentSelectionJson.toDomainOrNull() : null;
        List<WalletPaymentOptionJson> list4 = this.payment_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<WalletPaymentOptionJson> it4 = list4.iterator();
        while (it4.hasNext()) {
            WalletPaymentOption domainOrNull2 = it4.next().toDomainOrNull(null, null);
            if (domainOrNull2 != null) {
                arrayListA0h.add(domainOrNull2);
            }
        }
        return new HatchAgentPermissionsRepository.ShopifyCheckoutApproval(i, str2, str3, domain, domain2, domain3, domain4, arrayListA0m, str4, str5, arrayListA0m2, arrayListA0m3, str6, str7, str8, domainOrNull, arrayListA0h, str, checkoutLodging);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShopifyCheckoutApprovalJson(int i, int i2, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, ShopifyCheckoutContactJson shopifyCheckoutContactJson, ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson, ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson, JsonElement jsonElement, List list, String str3, String str4, List list2, List list3, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List list4, C2hx c2hx) {
        List list5 = list4;
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.flow_id = null;
        } else {
            this.flow_id = str;
        }
        if ((i & 4) == 0) {
            this.checkout_id = null;
        } else {
            this.checkout_id = str2;
        }
        if ((i & 8) == 0) {
            this.merchant = null;
        } else {
            this.merchant = checkoutMerchantJson;
        }
        if ((i & 16) == 0) {
            this.contact = null;
        } else {
            this.contact = shopifyCheckoutContactJson;
        }
        if ((i & 32) == 0) {
            this.shipping_address = null;
        } else {
            this.shipping_address = shopifyCheckoutShippingAddressJson;
        }
        if ((i & 64) == 0) {
            this.delivery = null;
        } else {
            this.delivery = shopifyCheckoutDeliveryJson;
        }
        if ((i & 128) == 0) {
            this.lodging = null;
        } else {
            this.lodging = jsonElement;
        }
        if ((i & 256) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
        if ((i & 512) == 0) {
            this.amount = null;
        } else {
            this.amount = str3;
        }
        if ((i & 1024) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i & 2048) == 0) {
            this.totals = C0881AGi.A00;
        } else {
            this.totals = list2;
        }
        if ((i & 4096) == 0) {
            this.legal_links = C0881AGi.A00;
        } else {
            this.legal_links = list3;
        }
        if ((i & 8192) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str5;
        }
        if ((i & 16384) == 0) {
            this.card_brand = null;
        } else {
            this.card_brand = str6;
        }
        if ((32768 & i) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str7;
        }
        if ((65536 & i) == 0) {
            this.payment_selection = null;
        } else {
            this.payment_selection = paymentSelectionJson;
        }
        this.payment_options = (i & 131072) == 0 ? C0881AGi.A00 : list5;
    }

    public static /* synthetic */ ShopifyCheckoutApprovalJson copy$default(ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson, int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, ShopifyCheckoutContactJson shopifyCheckoutContactJson, ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson, ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson, JsonElement jsonElement, List list, String str3, String str4, List list2, List list3, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List list4, int i2, Object obj) {
        int i3 = i;
        String str8 = str;
        String str9 = str2;
        CheckoutMerchantJson checkoutMerchantJson2 = checkoutMerchantJson;
        ShopifyCheckoutContactJson shopifyCheckoutContactJson2 = shopifyCheckoutContactJson;
        ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson2 = shopifyCheckoutShippingAddressJson;
        ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson2 = shopifyCheckoutDeliveryJson;
        JsonElement jsonElement2 = jsonElement;
        List list5 = list;
        String str10 = str3;
        String str11 = str4;
        List list6 = list2;
        List list7 = list3;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        PaymentSelectionJson paymentSelectionJson2 = paymentSelectionJson;
        List list8 = list4;
        if ((i2 & 1) != 0) {
            i3 = shopifyCheckoutApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            str8 = shopifyCheckoutApprovalJson.flow_id;
        }
        if ((i2 & 4) != 0) {
            str9 = shopifyCheckoutApprovalJson.checkout_id;
        }
        if ((i2 & 8) != 0) {
            checkoutMerchantJson2 = shopifyCheckoutApprovalJson.merchant;
        }
        if ((i2 & 16) != 0) {
            shopifyCheckoutContactJson2 = shopifyCheckoutApprovalJson.contact;
        }
        if ((i2 & 32) != 0) {
            shopifyCheckoutShippingAddressJson2 = shopifyCheckoutApprovalJson.shipping_address;
        }
        if ((i2 & 64) != 0) {
            shopifyCheckoutDeliveryJson2 = shopifyCheckoutApprovalJson.delivery;
        }
        if ((i2 & 128) != 0) {
            jsonElement2 = shopifyCheckoutApprovalJson.lodging;
        }
        if ((i2 & 256) != 0) {
            list5 = shopifyCheckoutApprovalJson.items;
        }
        if ((i2 & 512) != 0) {
            str10 = shopifyCheckoutApprovalJson.amount;
        }
        if ((i2 & 1024) != 0) {
            str11 = shopifyCheckoutApprovalJson.currency;
        }
        if ((i2 & 2048) != 0) {
            list6 = shopifyCheckoutApprovalJson.totals;
        }
        if ((i2 & 4096) != 0) {
            list7 = shopifyCheckoutApprovalJson.legal_links;
        }
        if ((i2 & 8192) != 0) {
            str12 = shopifyCheckoutApprovalJson.payment_method_label;
        }
        if ((i2 & 16384) != 0) {
            str13 = shopifyCheckoutApprovalJson.card_brand;
        }
        if ((i2 & 32768) != 0) {
            str14 = shopifyCheckoutApprovalJson.card_last4;
        }
        if ((i2 & 65536) != 0) {
            paymentSelectionJson2 = shopifyCheckoutApprovalJson.payment_selection;
        }
        if ((i2 & 131072) != 0) {
            list8 = shopifyCheckoutApprovalJson.payment_options;
        }
        ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson3 = shopifyCheckoutShippingAddressJson2;
        ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson3 = shopifyCheckoutDeliveryJson2;
        JsonElement jsonElement3 = jsonElement2;
        return shopifyCheckoutApprovalJson.copy(i3, str8, str9, checkoutMerchantJson2, shopifyCheckoutContactJson2, shopifyCheckoutShippingAddressJson3, shopifyCheckoutDeliveryJson3, jsonElement3, list5, str10, str11, list6, list7, str12, str13, str14, paymentSelectionJson2, list8);
    }

    public /* synthetic */ ShopifyCheckoutApprovalJson(int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, ShopifyCheckoutContactJson shopifyCheckoutContactJson, ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson, ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson, JsonElement jsonElement, List list, String str3, String str4, List list2, List list3, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List list4, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 0 : i, C3cG.A0e(str, i2 & 2), C3cG.A0e(str2, i2 & 4), (i2 & 8) != 0 ? null : checkoutMerchantJson, (i2 & 16) != 0 ? null : shopifyCheckoutContactJson, (i2 & 32) != 0 ? null : shopifyCheckoutShippingAddressJson, (i2 & 64) != 0 ? null : shopifyCheckoutDeliveryJson, (i2 & 128) != 0 ? null : jsonElement, (i2 & 256) != 0 ? C0881AGi.A00 : list, C3cG.A0e(str3, i2 & 512), C3cG.A0e(str4, i2 & 1024), (i2 & 2048) != 0 ? C0881AGi.A00 : list2, (i2 & 4096) != 0 ? C0881AGi.A00 : list3, C3cG.A0e(str5, i2 & 8192), C3cG.A0e(str6, i2 & 16384), C3cI.A0V(i2, 32768, str7), (i2 & 65536) != 0 ? null : paymentSelectionJson, (i2 & 131072) != 0 ? C0881AGi.A00 : list4);
    }

    public ShopifyCheckoutApprovalJson(int i, String str, String str2, CheckoutMerchantJson checkoutMerchantJson, ShopifyCheckoutContactJson shopifyCheckoutContactJson, ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson, ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson, JsonElement jsonElement, List<ShopifyCheckoutItemJson> list, String str3, String str4, List<CheckoutTotalJson> list2, List<CheckoutLegalLinkJson> list3, String str5, String str6, String str7, PaymentSelectionJson paymentSelectionJson, List<WalletPaymentOptionJson> list4) {
        AnonymousClass002.A1G(list, 8, list2);
        C3cI.A1I(list3, 12, list4);
        this.version = i;
        this.flow_id = str;
        this.checkout_id = str2;
        this.merchant = checkoutMerchantJson;
        this.contact = shopifyCheckoutContactJson;
        this.shipping_address = shopifyCheckoutShippingAddressJson;
        this.delivery = shopifyCheckoutDeliveryJson;
        this.lodging = jsonElement;
        this.items = list;
        this.amount = str3;
        this.currency = str4;
        this.totals = list2;
        this.legal_links = list3;
        this.payment_method_label = str5;
        this.card_brand = str6;
        this.card_last4 = str7;
        this.payment_selection = paymentSelectionJson;
        this.payment_options = list4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShopifyCheckoutApprovalJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(0, null, null, null, null, null, null, null, c0881AGi, null, null, c0881AGi, c0881AGi, null, null, null, null, c0881AGi);
    }
}
