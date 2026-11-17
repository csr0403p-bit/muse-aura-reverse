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
public final class CheckoutTabJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String domain;
    public final String title;
    public final String url;

    public final class Companion {
        public final C9hr<CheckoutTabJson> serializer() {
            return CheckoutTabJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutTabJson checkoutTabJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutTabJson.title != null) {
            c9j5.AAP(checkoutTabJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || checkoutTabJson.url != null) {
            c9j5.AAP(checkoutTabJson.url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || checkoutTabJson.domain != null) {
            c9j5.AAP(checkoutTabJson.domain, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutTabJson) {
                CheckoutTabJson checkoutTabJson = (CheckoutTabJson) obj;
                if (!C7384Etj.areEqual(this.title, checkoutTabJson.title) || !C7384Etj.areEqual(this.url, checkoutTabJson.url) || !C7384Etj.areEqual(this.domain, checkoutTabJson.domain)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutTabJson copy$default(CheckoutTabJson checkoutTabJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutTabJson.title;
        }
        if ((i & 2) != 0) {
            str2 = checkoutTabJson.url;
        }
        if ((i & 4) != 0) {
            str3 = checkoutTabJson.domain;
        }
        return new CheckoutTabJson(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.domain;
    }

    public final CheckoutTabJson copy(String str, String str2, String str3) {
        return new CheckoutTabJson(str, str2, str3);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass005.A0H(this.domain);
    }

    public final HatchAgentPermissionsRepository.CheckoutTab toDomain() {
        return new HatchAgentPermissionsRepository.CheckoutTab(this.title, this.url, this.domain);
    }

    public CheckoutTabJson(String str, String str2, String str3) {
        this.title = str;
        this.url = str2;
        this.domain = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutTabJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.domain = null;
        } else {
            this.domain = str3;
        }
    }

    public /* synthetic */ CheckoutTabJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public CheckoutTabJson() {
        this(null, null, null);
    }
}
