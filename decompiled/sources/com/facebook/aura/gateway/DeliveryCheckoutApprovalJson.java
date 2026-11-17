package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06827l3;
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
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class DeliveryCheckoutApprovalJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final C06827l3 CARD_LAST4;
    public static final Companion Companion = new Companion();
    public static final int SUPPORTED_VERSION = 1;
    public final String card_last4;
    public final List<DeliveryCheckoutLegalLinkJson> legal_links;
    public final JsonElement legal_notice;
    public final String payment_method_label;
    public final String payment_source;
    public final List<DeliveryCheckoutPriceItemJson> price_breakdown;
    public final DeliveryCheckoutProviderJson provider;
    public final List<DeliveryCheckoutStopJson> stops;
    public final DeliveryCheckoutMoneyJson total;
    public final int version;

    public final class Companion {
        public final C06827l3 getCARD_LAST4() {
            return DeliveryCheckoutApprovalJson.CARD_LAST4;
        }

        public final C9hr<DeliveryCheckoutApprovalJson> serializer() {
            return DeliveryCheckoutApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, DeliveryCheckoutApprovalJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, DeliveryCheckoutApprovalJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, DeliveryCheckoutApprovalJson$Companion$$childSerializers$3.INSTANCE), null};
        CARD_LAST4 = new C06827l3("^[0-9]{4}$");
    }

    public DeliveryCheckoutApprovalJson(int i, DeliveryCheckoutProviderJson deliveryCheckoutProviderJson, List<DeliveryCheckoutStopJson> list, String str, String str2, String str3, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, List<DeliveryCheckoutPriceItemJson> list2, List<DeliveryCheckoutLegalLinkJson> list3, JsonElement jsonElement) {
        AnonymousClass005.A13(list, list2, list3, 2);
        this.version = i;
        this.provider = deliveryCheckoutProviderJson;
        this.stops = list;
        this.payment_method_label = str;
        this.payment_source = str2;
        this.card_last4 = str3;
        this.total = deliveryCheckoutMoneyJson;
        this.price_breakdown = list2;
        this.legal_links = list3;
        this.legal_notice = jsonElement;
    }

    public final DeliveryCheckoutApprovalJson copy(int i, DeliveryCheckoutProviderJson deliveryCheckoutProviderJson, List<DeliveryCheckoutStopJson> list, String str, String str2, String str3, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, List<DeliveryCheckoutPriceItemJson> list2, List<DeliveryCheckoutLegalLinkJson> list3, JsonElement jsonElement) {
        AnonymousClass005.A13(list, list2, list3, 2);
        return new DeliveryCheckoutApprovalJson(i, deliveryCheckoutProviderJson, list, str, str2, str3, deliveryCheckoutMoneyJson, list2, list3, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutApprovalJson) {
                DeliveryCheckoutApprovalJson deliveryCheckoutApprovalJson = (DeliveryCheckoutApprovalJson) obj;
                if (this.version != deliveryCheckoutApprovalJson.version || !C7384Etj.areEqual(this.provider, deliveryCheckoutApprovalJson.provider) || !C7384Etj.areEqual(this.stops, deliveryCheckoutApprovalJson.stops) || !C7384Etj.areEqual(this.payment_method_label, deliveryCheckoutApprovalJson.payment_method_label) || !C7384Etj.areEqual(this.payment_source, deliveryCheckoutApprovalJson.payment_source) || !C7384Etj.areEqual(this.card_last4, deliveryCheckoutApprovalJson.card_last4) || !C7384Etj.areEqual(this.total, deliveryCheckoutApprovalJson.total) || !C7384Etj.areEqual(this.price_breakdown, deliveryCheckoutApprovalJson.price_breakdown) || !C7384Etj.areEqual(this.legal_links, deliveryCheckoutApprovalJson.legal_links) || !C7384Etj.areEqual(this.legal_notice, deliveryCheckoutApprovalJson.legal_notice)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryCheckoutApprovalJson copy$default(DeliveryCheckoutApprovalJson deliveryCheckoutApprovalJson, int i, DeliveryCheckoutProviderJson deliveryCheckoutProviderJson, List list, String str, String str2, String str3, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, List list2, List list3, JsonElement jsonElement, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deliveryCheckoutApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            deliveryCheckoutProviderJson = deliveryCheckoutApprovalJson.provider;
        }
        if ((i2 & 4) != 0) {
            list = deliveryCheckoutApprovalJson.stops;
        }
        if ((i2 & 8) != 0) {
            str = deliveryCheckoutApprovalJson.payment_method_label;
        }
        if ((i2 & 16) != 0) {
            str2 = deliveryCheckoutApprovalJson.payment_source;
        }
        if ((i2 & 32) != 0) {
            str3 = deliveryCheckoutApprovalJson.card_last4;
        }
        if ((i2 & 64) != 0) {
            deliveryCheckoutMoneyJson = deliveryCheckoutApprovalJson.total;
        }
        if ((i2 & 128) != 0) {
            list2 = deliveryCheckoutApprovalJson.price_breakdown;
        }
        if ((i2 & 256) != 0) {
            list3 = deliveryCheckoutApprovalJson.legal_links;
        }
        if ((i2 & 512) != 0) {
            jsonElement = deliveryCheckoutApprovalJson.legal_notice;
        }
        return deliveryCheckoutApprovalJson.copy(i, deliveryCheckoutProviderJson, list, str, str2, str3, deliveryCheckoutMoneyJson, list2, list3, jsonElement);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutApprovalJson deliveryCheckoutApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || deliveryCheckoutApprovalJson.version != 0) {
            c9j5.AAK(c9iZ, 0, deliveryCheckoutApprovalJson.version);
        }
        if (zAfR || deliveryCheckoutApprovalJson.provider != null) {
            c9j5.AAP(deliveryCheckoutApprovalJson.provider, DeliveryCheckoutProviderJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(deliveryCheckoutApprovalJson.stops)) {
            c9j5.AAQ(deliveryCheckoutApprovalJson.stops, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || deliveryCheckoutApprovalJson.payment_method_label != null) {
            c9j5.AAP(deliveryCheckoutApprovalJson.payment_method_label, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || deliveryCheckoutApprovalJson.payment_source != null) {
            c9j5.AAP(deliveryCheckoutApprovalJson.payment_source, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || deliveryCheckoutApprovalJson.card_last4 != null) {
            c9j5.AAP(deliveryCheckoutApprovalJson.card_last4, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || deliveryCheckoutApprovalJson.total != null) {
            c9j5.AAP(deliveryCheckoutApprovalJson.total, DeliveryCheckoutMoneyJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || !C3cG.A1L(deliveryCheckoutApprovalJson.price_breakdown)) {
            c9j5.AAQ(deliveryCheckoutApprovalJson.price_breakdown, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(deliveryCheckoutApprovalJson.legal_links)) {
            c9j5.AAQ(deliveryCheckoutApprovalJson.legal_links, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
        if (zAfR || deliveryCheckoutApprovalJson.legal_notice != null) {
            c9j5.AAP(deliveryCheckoutApprovalJson.legal_notice, JsonElementSerializer.A00, c9iZ, 9);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final JsonElement component10() {
        return this.legal_notice;
    }

    public final DeliveryCheckoutProviderJson component2() {
        return this.provider;
    }

    public final List<DeliveryCheckoutStopJson> component3() {
        return this.stops;
    }

    public final String component4() {
        return this.payment_method_label;
    }

    public final String component5() {
        return this.payment_source;
    }

    public final String component6() {
        return this.card_last4;
    }

    public final DeliveryCheckoutMoneyJson component7() {
        return this.total;
    }

    public final List<DeliveryCheckoutPriceItemJson> component8() {
        return this.price_breakdown;
    }

    public final List<DeliveryCheckoutLegalLinkJson> component9() {
        return this.legal_links;
    }

    public final String getCard_last4() {
        return this.card_last4;
    }

    public final List<DeliveryCheckoutLegalLinkJson> getLegal_links() {
        return this.legal_links;
    }

    public final JsonElement getLegal_notice() {
        return this.legal_notice;
    }

    public final String getPayment_method_label() {
        return this.payment_method_label;
    }

    public final String getPayment_source() {
        return this.payment_source;
    }

    public final List<DeliveryCheckoutPriceItemJson> getPrice_breakdown() {
        return this.price_breakdown;
    }

    public final DeliveryCheckoutProviderJson getProvider() {
        return this.provider;
    }

    public final List<DeliveryCheckoutStopJson> getStops() {
        return this.stops;
    }

    public final DeliveryCheckoutMoneyJson getTotal() {
        return this.total;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.legal_links, AnonymousClass005.A0F(this.price_breakdown, (((((((AnonymousClass005.A0F(this.stops, ((this.version * 31) + AnonymousClass006.A0D(this.provider)) * 31) + AnonymousClass006.A0G(this.payment_method_label)) * 31) + AnonymousClass006.A0G(this.payment_source)) * 31) + AnonymousClass006.A0G(this.card_last4)) * 31) + AnonymousClass006.A0D(this.total)) * 31)) + C3cH.A02(this.legal_notice);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[EDGE_INSN: B:142:0x0153->B:89:0x0153 BREAK  A[LOOP:8: B:80:0x0137->B:143:?]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.DeliveryCheckoutApproval toDomainOrNull() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.DeliveryCheckoutApprovalJson.toDomainOrNull():com.facebook.aura.gateway.DeliveryCheckoutApproval");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutApprovalJson(int i, DeliveryCheckoutProviderJson deliveryCheckoutProviderJson, List list, String str, String str2, String str3, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, List list2, List list3, JsonElement jsonElement, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? null : deliveryCheckoutProviderJson, C3cI.A12(list, i2), (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : deliveryCheckoutMoneyJson, (i2 & 128) != 0 ? C0881AGi.A00 : list2, (i2 & 256) != 0 ? C0881AGi.A00 : list3, (i2 & 512) != 0 ? null : jsonElement);
    }

    public /* synthetic */ DeliveryCheckoutApprovalJson(int i, int i2, DeliveryCheckoutProviderJson deliveryCheckoutProviderJson, List list, String str, String str2, String str3, DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson, List list2, List list3, JsonElement jsonElement, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.provider = null;
        } else {
            this.provider = deliveryCheckoutProviderJson;
        }
        if ((i & 4) == 0) {
            this.stops = C0881AGi.A00;
        } else {
            this.stops = list;
        }
        if ((i & 8) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str;
        }
        if ((i & 16) == 0) {
            this.payment_source = null;
        } else {
            this.payment_source = str2;
        }
        if ((i & 32) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str3;
        }
        if ((i & 64) == 0) {
            this.total = null;
        } else {
            this.total = deliveryCheckoutMoneyJson;
        }
        if ((i & 128) == 0) {
            this.price_breakdown = C0881AGi.A00;
        } else {
            this.price_breakdown = list2;
        }
        if ((i & 256) == 0) {
            this.legal_links = C0881AGi.A00;
        } else {
            this.legal_links = list3;
        }
        if ((i & 512) == 0) {
            this.legal_notice = null;
        } else {
            this.legal_notice = jsonElement;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeliveryCheckoutApprovalJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(0, null, c0881AGi, null, null, null, null, c0881AGi, c0881AGi, null);
    }
}
