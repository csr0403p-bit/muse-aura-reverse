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
public final class CheckoutLegalLinkJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String role;
    public final String url;

    public final class Companion {
        public final C9hr<CheckoutLegalLinkJson> serializer() {
            return CheckoutLegalLinkJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLegalLinkJson checkoutLegalLinkJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLegalLinkJson.role != null) {
            c9j5.AAP(checkoutLegalLinkJson.role, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || checkoutLegalLinkJson.label != null) {
            c9j5.AAP(checkoutLegalLinkJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || checkoutLegalLinkJson.url != null) {
            c9j5.AAP(checkoutLegalLinkJson.url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLegalLinkJson) {
                CheckoutLegalLinkJson checkoutLegalLinkJson = (CheckoutLegalLinkJson) obj;
                if (!C7384Etj.areEqual(this.role, checkoutLegalLinkJson.role) || !C7384Etj.areEqual(this.label, checkoutLegalLinkJson.label) || !C7384Etj.areEqual(this.url, checkoutLegalLinkJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLegalLinkJson copy$default(CheckoutLegalLinkJson checkoutLegalLinkJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLegalLinkJson.role;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLegalLinkJson.label;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLegalLinkJson.url;
        }
        return new CheckoutLegalLinkJson(str, str2, str3);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.url;
    }

    public final CheckoutLegalLinkJson copy(String str, String str2, String str3) {
        return new CheckoutLegalLinkJson(str, str2, str3);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.role) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.url);
    }

    public final HatchAgentPermissionsRepository.CheckoutLegalLink toDomain() {
        return new HatchAgentPermissionsRepository.CheckoutLegalLink(this.label, this.url, HatchAgentPermissionsRepository.CheckoutLegalLinkRole.Companion.fromWire(this.role));
    }

    public CheckoutLegalLinkJson(String str, String str2, String str3) {
        this.role = str;
        this.label = str2;
        this.url = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLegalLinkJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.role = null;
        } else {
            this.role = str;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public /* synthetic */ CheckoutLegalLinkJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public CheckoutLegalLinkJson() {
        this(null, null, null);
    }
}
