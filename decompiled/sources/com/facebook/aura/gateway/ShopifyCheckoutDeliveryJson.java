package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ShopifyCheckoutDeliveryJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String carrier;
    public final String currency;
    public final String estimated_delivery;
    public final String id;
    public final String label;

    public final class Companion {
        public final C9hr<ShopifyCheckoutDeliveryJson> serializer() {
            return ShopifyCheckoutDeliveryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShopifyCheckoutDeliveryJson() {
        this(null, null, null, null, null, null);
    }

    public static /* synthetic */ ShopifyCheckoutDeliveryJson copy$default(ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = shopifyCheckoutDeliveryJson.id;
        }
        if ((i & 2) != 0) {
            str8 = shopifyCheckoutDeliveryJson.label;
        }
        if ((i & 4) != 0) {
            str9 = shopifyCheckoutDeliveryJson.amount;
        }
        if ((i & 8) != 0) {
            str10 = shopifyCheckoutDeliveryJson.currency;
        }
        if ((i & 16) != 0) {
            str11 = shopifyCheckoutDeliveryJson.carrier;
        }
        if ((i & 32) != 0) {
            str12 = shopifyCheckoutDeliveryJson.estimated_delivery;
        }
        return new ShopifyCheckoutDeliveryJson(str7, str8, str9, str10, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || shopifyCheckoutDeliveryJson.id != null) {
            c9j5.AAP(shopifyCheckoutDeliveryJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || shopifyCheckoutDeliveryJson.label != null) {
            c9j5.AAP(shopifyCheckoutDeliveryJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shopifyCheckoutDeliveryJson.amount != null) {
            c9j5.AAP(shopifyCheckoutDeliveryJson.amount, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shopifyCheckoutDeliveryJson.currency != null) {
            c9j5.AAP(shopifyCheckoutDeliveryJson.currency, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shopifyCheckoutDeliveryJson.carrier != null) {
            c9j5.AAP(shopifyCheckoutDeliveryJson.carrier, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || shopifyCheckoutDeliveryJson.estimated_delivery != null) {
            c9j5.AAP(shopifyCheckoutDeliveryJson.estimated_delivery, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShopifyCheckoutDeliveryJson) {
                ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson = (ShopifyCheckoutDeliveryJson) obj;
                if (!C7384Etj.areEqual(this.id, shopifyCheckoutDeliveryJson.id) || !C7384Etj.areEqual(this.label, shopifyCheckoutDeliveryJson.label) || !C7384Etj.areEqual(this.amount, shopifyCheckoutDeliveryJson.amount) || !C7384Etj.areEqual(this.currency, shopifyCheckoutDeliveryJson.currency) || !C7384Etj.areEqual(this.carrier, shopifyCheckoutDeliveryJson.carrier) || !C7384Etj.areEqual(this.estimated_delivery, shopifyCheckoutDeliveryJson.estimated_delivery)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final String component5() {
        return this.carrier;
    }

    public final String component6() {
        return this.estimated_delivery;
    }

    public final ShopifyCheckoutDeliveryJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ShopifyCheckoutDeliveryJson(str, str2, str3, str4, str5, str6);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEstimated_delivery() {
        return this.estimated_delivery;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0G(this.carrier)) * 31) + AnonymousClass005.A0H(this.estimated_delivery);
    }

    public final HatchAgentPermissionsRepository.ShopifyCheckoutDelivery toDomain() {
        return new HatchAgentPermissionsRepository.ShopifyCheckoutDelivery(this.id, this.label, this.amount, this.currency, this.carrier, this.estimated_delivery);
    }

    public String toString() {
        return super.toString();
    }

    public ShopifyCheckoutDeliveryJson(String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.label = str2;
        this.amount = str3;
        this.currency = str4;
        this.carrier = str5;
        this.estimated_delivery = str6;
    }

    public /* synthetic */ ShopifyCheckoutDeliveryJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public /* synthetic */ ShopifyCheckoutDeliveryJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str3;
        }
        if ((i & 8) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i & 16) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str5;
        }
        if ((i & 32) == 0) {
            this.estimated_delivery = null;
        } else {
            this.estimated_delivery = str6;
        }
    }
}
