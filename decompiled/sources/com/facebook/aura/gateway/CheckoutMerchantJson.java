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
public final class CheckoutMerchantJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String icon_url;
    public final String name;
    public final String url;

    public final class Companion {
        public final C9hr<CheckoutMerchantJson> serializer() {
            return CheckoutMerchantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutMerchantJson checkoutMerchantJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutMerchantJson.name != null) {
            c9j5.AAP(checkoutMerchantJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || checkoutMerchantJson.url != null) {
            c9j5.AAP(checkoutMerchantJson.url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || checkoutMerchantJson.icon_url != null) {
            c9j5.AAP(checkoutMerchantJson.icon_url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutMerchantJson) {
                CheckoutMerchantJson checkoutMerchantJson = (CheckoutMerchantJson) obj;
                if (!C7384Etj.areEqual(this.name, checkoutMerchantJson.name) || !C7384Etj.areEqual(this.url, checkoutMerchantJson.url) || !C7384Etj.areEqual(this.icon_url, checkoutMerchantJson.icon_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutMerchantJson copy$default(CheckoutMerchantJson checkoutMerchantJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutMerchantJson.name;
        }
        if ((i & 2) != 0) {
            str2 = checkoutMerchantJson.url;
        }
        if ((i & 4) != 0) {
            str3 = checkoutMerchantJson.icon_url;
        }
        return new CheckoutMerchantJson(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.icon_url;
    }

    public final CheckoutMerchantJson copy(String str, String str2, String str3) {
        return new CheckoutMerchantJson(str, str2, str3);
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass005.A0H(this.icon_url);
    }

    public final HatchAgentPermissionsRepository.CheckoutMerchant toDomain() {
        return new HatchAgentPermissionsRepository.CheckoutMerchant(this.name, this.url, this.icon_url);
    }

    public CheckoutMerchantJson(String str, String str2, String str3) {
        this.name = str;
        this.url = str2;
        this.icon_url = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutMerchantJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str3;
        }
    }

    public /* synthetic */ CheckoutMerchantJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public CheckoutMerchantJson() {
        this(null, null, null);
    }
}
