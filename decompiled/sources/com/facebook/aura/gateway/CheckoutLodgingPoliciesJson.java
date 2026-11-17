package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingPoliciesJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String taxes_and_fees_disclosure;
    public final String taxes_and_fees_terms_url;
    public final String taxes_and_fees_title;

    public final class Companion {
        public final C9hr<CheckoutLodgingPoliciesJson> serializer() {
            return CheckoutLodgingPoliciesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingPoliciesJson checkoutLodgingPoliciesJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLodgingPoliciesJson.taxes_and_fees_title != null) {
            c9j5.AAP(checkoutLodgingPoliciesJson.taxes_and_fees_title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || checkoutLodgingPoliciesJson.taxes_and_fees_disclosure != null) {
            c9j5.AAP(checkoutLodgingPoliciesJson.taxes_and_fees_disclosure, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || checkoutLodgingPoliciesJson.taxes_and_fees_terms_url != null) {
            c9j5.AAP(checkoutLodgingPoliciesJson.taxes_and_fees_terms_url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingPoliciesJson) {
                CheckoutLodgingPoliciesJson checkoutLodgingPoliciesJson = (CheckoutLodgingPoliciesJson) obj;
                if (!C7384Etj.areEqual(this.taxes_and_fees_title, checkoutLodgingPoliciesJson.taxes_and_fees_title) || !C7384Etj.areEqual(this.taxes_and_fees_disclosure, checkoutLodgingPoliciesJson.taxes_and_fees_disclosure) || !C7384Etj.areEqual(this.taxes_and_fees_terms_url, checkoutLodgingPoliciesJson.taxes_and_fees_terms_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingPoliciesJson copy$default(CheckoutLodgingPoliciesJson checkoutLodgingPoliciesJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingPoliciesJson.taxes_and_fees_title;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingPoliciesJson.taxes_and_fees_disclosure;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLodgingPoliciesJson.taxes_and_fees_terms_url;
        }
        return new CheckoutLodgingPoliciesJson(str, str2, str3);
    }

    public final String component1() {
        return this.taxes_and_fees_title;
    }

    public final String component2() {
        return this.taxes_and_fees_disclosure;
    }

    public final String component3() {
        return this.taxes_and_fees_terms_url;
    }

    public final CheckoutLodgingPoliciesJson copy(String str, String str2, String str3) {
        return new CheckoutLodgingPoliciesJson(str, str2, str3);
    }

    public final String getTaxes_and_fees_disclosure() {
        return this.taxes_and_fees_disclosure;
    }

    public final String getTaxes_and_fees_terms_url() {
        return this.taxes_and_fees_terms_url;
    }

    public final String getTaxes_and_fees_title() {
        return this.taxes_and_fees_title;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.taxes_and_fees_title) * 31) + AnonymousClass006.A0G(this.taxes_and_fees_disclosure)) * 31) + AnonymousClass005.A0H(this.taxes_and_fees_terms_url);
    }

    public final CheckoutLodgingTaxesDisclosure taxesDisclosure() {
        String strTrimToNonEmpty;
        String str = this.taxes_and_fees_disclosure;
        if (str == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) == null) {
            return null;
        }
        String strA0Z = C3cI.A0Z(this.taxes_and_fees_title);
        String str2 = this.taxes_and_fees_terms_url;
        return new CheckoutLodgingTaxesDisclosure(strA0Z, strTrimToNonEmpty, str2 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2) : null);
    }

    public CheckoutLodgingPoliciesJson(String str, String str2, String str3) {
        this.taxes_and_fees_title = str;
        this.taxes_and_fees_disclosure = str2;
        this.taxes_and_fees_terms_url = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingPoliciesJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.taxes_and_fees_title = null;
        } else {
            this.taxes_and_fees_title = str;
        }
        if ((i & 2) == 0) {
            this.taxes_and_fees_disclosure = null;
        } else {
            this.taxes_and_fees_disclosure = str2;
        }
        if ((i & 4) == 0) {
            this.taxes_and_fees_terms_url = null;
        } else {
            this.taxes_and_fees_terms_url = str3;
        }
    }

    public /* synthetic */ CheckoutLodgingPoliciesJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public CheckoutLodgingPoliciesJson() {
        this(null, null, null);
    }
}
