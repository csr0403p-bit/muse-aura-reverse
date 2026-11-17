package com.facebook.aura.gateway;

import X.AnonymousClass002;
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
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeliveryCheckoutLegalLinkJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String role;
    public final String url;

    public final class Companion {
        public final C9hr<DeliveryCheckoutLegalLinkJson> serializer() {
            return DeliveryCheckoutLegalLinkJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutLegalLinkJson deliveryCheckoutLegalLinkJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || deliveryCheckoutLegalLinkJson.role != null) {
            c9j5.AAP(deliveryCheckoutLegalLinkJson.role, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || deliveryCheckoutLegalLinkJson.url != null) {
            c9j5.AAP(deliveryCheckoutLegalLinkJson.url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutLegalLinkJson) {
                DeliveryCheckoutLegalLinkJson deliveryCheckoutLegalLinkJson = (DeliveryCheckoutLegalLinkJson) obj;
                if (!C7384Etj.areEqual(this.role, deliveryCheckoutLegalLinkJson.role) || !C7384Etj.areEqual(this.url, deliveryCheckoutLegalLinkJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutLegalLinkJson copy$default(DeliveryCheckoutLegalLinkJson deliveryCheckoutLegalLinkJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutLegalLinkJson.role;
        }
        if ((i & 2) != 0) {
            str2 = deliveryCheckoutLegalLinkJson.url;
        }
        return new DeliveryCheckoutLegalLinkJson(str, str2);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.url;
    }

    public final DeliveryCheckoutLegalLinkJson copy(String str, String str2) {
        return new DeliveryCheckoutLegalLinkJson(str, str2);
    }

    public final String getRole() {
        return this.role;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.role) * 31) + AnonymousClass005.A0H(this.url);
    }

    public final DeliveryCheckoutLegalLink toDomainOrNull() {
        DeliveryCheckoutLegalRole deliveryCheckoutLegalRole;
        String strA0l;
        String str = this.role;
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2083367419) {
            if (iHashCode != -1729593992) {
                if (iHashCode != 743735278 || !str.equals("cancellation_policy")) {
                    return null;
                }
                deliveryCheckoutLegalRole = DeliveryCheckoutLegalRole.CANCELLATION_POLICY;
            } else {
                if (!str.equals("privacy_statement")) {
                    return null;
                }
                deliveryCheckoutLegalRole = DeliveryCheckoutLegalRole.PRIVACY_STATEMENT;
            }
        } else {
            if (!str.equals("terms_of_service")) {
                return null;
            }
            deliveryCheckoutLegalRole = DeliveryCheckoutLegalRole.TERMS_OF_SERVICE;
        }
        String str2 = this.url;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || !strA0l.startsWith("https://")) {
            return null;
        }
        return new DeliveryCheckoutLegalLink(deliveryCheckoutLegalRole, strA0l);
    }

    public DeliveryCheckoutLegalLinkJson(String str, String str2) {
        this.role = str;
        this.url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutLegalLinkJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.role = null;
        } else {
            this.role = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public /* synthetic */ DeliveryCheckoutLegalLinkJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public DeliveryCheckoutLegalLinkJson() {
        this(null, null);
    }
}
