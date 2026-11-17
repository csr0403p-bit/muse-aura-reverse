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
public final class ShopifyCheckoutContactJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String country_code;
    public final String display_name;
    public final String email;
    public final String phone_number;

    public final class Companion {
        public final C9hr<ShopifyCheckoutContactJson> serializer() {
            return ShopifyCheckoutContactJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ShopifyCheckoutContactJson shopifyCheckoutContactJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || shopifyCheckoutContactJson.display_name != null) {
            c9j5.AAP(shopifyCheckoutContactJson.display_name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || shopifyCheckoutContactJson.email != null) {
            c9j5.AAP(shopifyCheckoutContactJson.email, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shopifyCheckoutContactJson.phone_number != null) {
            c9j5.AAP(shopifyCheckoutContactJson.phone_number, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shopifyCheckoutContactJson.country_code != null) {
            c9j5.AAP(shopifyCheckoutContactJson.country_code, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShopifyCheckoutContactJson) {
                ShopifyCheckoutContactJson shopifyCheckoutContactJson = (ShopifyCheckoutContactJson) obj;
                if (!C7384Etj.areEqual(this.display_name, shopifyCheckoutContactJson.display_name) || !C7384Etj.areEqual(this.email, shopifyCheckoutContactJson.email) || !C7384Etj.areEqual(this.phone_number, shopifyCheckoutContactJson.phone_number) || !C7384Etj.areEqual(this.country_code, shopifyCheckoutContactJson.country_code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShopifyCheckoutContactJson copy$default(ShopifyCheckoutContactJson shopifyCheckoutContactJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopifyCheckoutContactJson.display_name;
        }
        if ((i & 2) != 0) {
            str2 = shopifyCheckoutContactJson.email;
        }
        if ((i & 4) != 0) {
            str3 = shopifyCheckoutContactJson.phone_number;
        }
        if ((i & 8) != 0) {
            str4 = shopifyCheckoutContactJson.country_code;
        }
        return new ShopifyCheckoutContactJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.display_name;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.phone_number;
    }

    public final String component4() {
        return this.country_code;
    }

    public final ShopifyCheckoutContactJson copy(String str, String str2, String str3, String str4) {
        return new ShopifyCheckoutContactJson(str, str2, str3, str4);
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.display_name) * 31) + AnonymousClass006.A0G(this.email)) * 31) + AnonymousClass006.A0G(this.phone_number)) * 31) + AnonymousClass005.A0H(this.country_code);
    }

    public final HatchAgentPermissionsRepository.ShopifyCheckoutContact toDomain() {
        return new HatchAgentPermissionsRepository.ShopifyCheckoutContact(this.email, this.phone_number, this.country_code, this.display_name);
    }

    public ShopifyCheckoutContactJson(String str, String str2, String str3, String str4) {
        this.display_name = str;
        this.email = str2;
        this.phone_number = str3;
        this.country_code = str4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShopifyCheckoutContactJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str;
        }
        if ((i & 2) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i & 4) == 0) {
            this.phone_number = null;
        } else {
            this.phone_number = str3;
        }
        if ((i & 8) == 0) {
            this.country_code = null;
        } else {
            this.country_code = str4;
        }
    }

    public /* synthetic */ ShopifyCheckoutContactJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public ShopifyCheckoutContactJson() {
        this(null, null, null, null);
    }
}
