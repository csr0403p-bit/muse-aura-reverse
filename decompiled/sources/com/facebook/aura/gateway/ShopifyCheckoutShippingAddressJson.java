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
public final class ShopifyCheckoutShippingAddressJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String city;
    public final String country;
    public final String first_name;
    public final String last_name;
    public final String postal_code;
    public final String state;
    public final String street1;
    public final String street2;

    public final class Companion {
        public final C9hr<ShopifyCheckoutShippingAddressJson> serializer() {
            return ShopifyCheckoutShippingAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ShopifyCheckoutShippingAddressJson copy$default(ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        if ((i & 1) != 0) {
            str9 = shopifyCheckoutShippingAddressJson.first_name;
        }
        if ((i & 2) != 0) {
            str10 = shopifyCheckoutShippingAddressJson.last_name;
        }
        if ((i & 4) != 0) {
            str11 = shopifyCheckoutShippingAddressJson.street1;
        }
        if ((i & 8) != 0) {
            str12 = shopifyCheckoutShippingAddressJson.street2;
        }
        if ((i & 16) != 0) {
            str13 = shopifyCheckoutShippingAddressJson.city;
        }
        if ((i & 32) != 0) {
            str14 = shopifyCheckoutShippingAddressJson.state;
        }
        if ((i & 64) != 0) {
            str15 = shopifyCheckoutShippingAddressJson.postal_code;
        }
        if ((i & 128) != 0) {
            str16 = shopifyCheckoutShippingAddressJson.country;
        }
        return new ShopifyCheckoutShippingAddressJson(str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || shopifyCheckoutShippingAddressJson.first_name != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.first_name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || shopifyCheckoutShippingAddressJson.last_name != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.last_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shopifyCheckoutShippingAddressJson.street1 != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.street1, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shopifyCheckoutShippingAddressJson.street2 != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.street2, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shopifyCheckoutShippingAddressJson.city != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.city, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || shopifyCheckoutShippingAddressJson.state != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.state, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || shopifyCheckoutShippingAddressJson.postal_code != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.postal_code, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || shopifyCheckoutShippingAddressJson.country != null) {
            c9j5.AAP(shopifyCheckoutShippingAddressJson.country, C07779iq.A01, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShopifyCheckoutShippingAddressJson) {
                ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson = (ShopifyCheckoutShippingAddressJson) obj;
                if (!C7384Etj.areEqual(this.first_name, shopifyCheckoutShippingAddressJson.first_name) || !C7384Etj.areEqual(this.last_name, shopifyCheckoutShippingAddressJson.last_name) || !C7384Etj.areEqual(this.street1, shopifyCheckoutShippingAddressJson.street1) || !C7384Etj.areEqual(this.street2, shopifyCheckoutShippingAddressJson.street2) || !C7384Etj.areEqual(this.city, shopifyCheckoutShippingAddressJson.city) || !C7384Etj.areEqual(this.state, shopifyCheckoutShippingAddressJson.state) || !C7384Etj.areEqual(this.postal_code, shopifyCheckoutShippingAddressJson.postal_code) || !C7384Etj.areEqual(this.country, shopifyCheckoutShippingAddressJson.country)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.first_name;
    }

    public final String component2() {
        return this.last_name;
    }

    public final String component3() {
        return this.street1;
    }

    public final String component4() {
        return this.street2;
    }

    public final String component5() {
        return this.city;
    }

    public final String component6() {
        return this.state;
    }

    public final String component7() {
        return this.postal_code;
    }

    public final String component8() {
        return this.country;
    }

    public final ShopifyCheckoutShippingAddressJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new ShopifyCheckoutShippingAddressJson(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFirst_name() {
        return this.first_name;
    }

    public final String getLast_name() {
        return this.last_name;
    }

    public final String getPostal_code() {
        return this.postal_code;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet1() {
        return this.street1;
    }

    public final String getStreet2() {
        return this.street2;
    }

    public int hashCode() {
        return (((((((((((((AnonymousClass006.A0G(this.first_name) * 31) + AnonymousClass006.A0G(this.last_name)) * 31) + AnonymousClass006.A0G(this.street1)) * 31) + AnonymousClass006.A0G(this.street2)) * 31) + AnonymousClass006.A0G(this.city)) * 31) + AnonymousClass006.A0G(this.state)) * 31) + AnonymousClass006.A0G(this.postal_code)) * 31) + AnonymousClass005.A0H(this.country);
    }

    public final HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress toDomain() {
        return new HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress(this.first_name, this.last_name, this.street1, this.street2, this.city, this.state, this.postal_code, this.country);
    }

    public /* synthetic */ ShopifyCheckoutShippingAddressJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.first_name = null;
        } else {
            this.first_name = str;
        }
        if ((i & 2) == 0) {
            this.last_name = null;
        } else {
            this.last_name = str2;
        }
        if ((i & 4) == 0) {
            this.street1 = null;
        } else {
            this.street1 = str3;
        }
        if ((i & 8) == 0) {
            this.street2 = null;
        } else {
            this.street2 = str4;
        }
        if ((i & 16) == 0) {
            this.city = null;
        } else {
            this.city = str5;
        }
        if ((i & 32) == 0) {
            this.state = null;
        } else {
            this.state = str6;
        }
        if ((i & 64) == 0) {
            this.postal_code = null;
        } else {
            this.postal_code = str7;
        }
        if ((i & 128) == 0) {
            this.country = null;
        } else {
            this.country = str8;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShopifyCheckoutShippingAddressJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.first_name = str;
        this.last_name = str2;
        this.street1 = str3;
        this.street2 = str4;
        this.city = str5;
        this.state = str6;
        this.postal_code = str7;
        this.country = str8;
    }

    public /* synthetic */ ShopifyCheckoutShippingAddressJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }

    public ShopifyCheckoutShippingAddressJson() {
        this(null, null, null, null, null, null, null, null);
    }
}
